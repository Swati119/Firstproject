package com.framework.reports;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.collect.Multimap;

public class ReportBuilder implements ITestListener {

	private static ExtentReports extent;
	public static ExtentTest test;
	public static Multimap<String, String> testMap;
	public static Multimap<String, String> logMap;
	private static WebDriver driver;

	public static ExtentReports init(String suiteName, String browserType) {
		String filepath = "Reports/" + suiteName + "_Test_Results.html";
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filepath);

		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setReportName(suiteName);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Browser", browserType);
		extent.setSystemInfo("Java Version", System.getProperty("java.version").toUpperCase());
		extent.setSystemInfo("OS", System.getProperty("os.name").toUpperCase());
		extent.setSystemInfo("Host Name", System.getenv("COMPUTERNAME").toUpperCase());

		extent.setReportUsesManualConfiguration(true);
		return extent;
	}

	public static void buildReports(ExtentReports extent, ITestContext context) {
		try {
			buildTestNodes(context.getFailedTests(), Status.FAIL);
			buildTestNodes(context.getSkippedTests(), Status.SKIP);
			buildTestNodes(context.getPassedTests(), Status.PASS);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String s : Reporter.getOutput()) {
			extent.setTestRunnerOutput(s);
		}
		extent.flush();
	}

	private static String getTestName(String testname, ITestResult result) {
		String test;
		Object[] params = result.getParameters();
		if (params.length > 0) {
			test = testname + "_" + params[0];
			if (params.length > 1) {
				test = test + "_" + params[1];
			}
		} else {
			test = testname;

		}
		return test;
	}

	private static void buildTestNodes(IResultMap tests, Status status) throws IOException {

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {

				String testname = result.getMethod().getMethodName();
				System.out.println("testname=" + testname);

				testname = getTestName(testname, result);

				test = extent.createTest(testname);

				for (String log : logMap.get(testname)) {
					test.pass(log);
				}

				// test.assignCategory(result.getTestClass().getRealClass().getSimpleName());

				for (String screenshot : testMap.get(testname)) {
					switch (status.toString().toLowerCase()) {
					case "pass":
						test.assignCategory(result.getTestClass().getRealClass().getSimpleName());
						test.pass("<b>Screenshot : <b>" + screenshot);
						// test.addScreenCaptureFromPath(screenshot);
						break;
					case "fail":
						test.assignCategory(result.getTestClass().getRealClass().getSimpleName());
						test.fail("<b>Screenshot : <b>" + screenshot);
						// test.addScreenCaptureFromPath(screenshot);
						break;
					case "skip":
						test.assignCategory(result.getTestClass().getRealClass().getSimpleName());
						test.skip("<b>Screenshot : <b>" + screenshot);
						// test.addScreenCaptureFromPath(screenshot);
						break;
					default:
						test.assignCategory(result.getTestClass().getRealClass().getSimpleName());
						break;
					}
				}

				if (result.getThrowable() != null) {
					test.createNode("Failed Reason").fail(result.getThrowable().fillInStackTrace());
				}

				test.getModel().setStartTime(getTime(result.getStartMillis()));
				test.getModel().setEndTime(getTime(result.getEndMillis()));
			}
		}
	}

	public String takeScreenShot(String screenShotName) {

		Date now = new Date();
		DateFormat shortDf = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

		String currentDate = shortDf.format(now).toString().replace("/", "_");
		currentDate = currentDate.toString().replace(" ", "_");
		currentDate = currentDate.toString().replace(":", "_");

		System.out.println("current Date " + currentDate);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String dest = System.getProperty("user.dir") + "/Screenshots/" + screenShotName + "_" + currentDate + ".jpeg";

		File destination = new File(dest);

		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dest;

	}

	private static Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}

	public static void log(String method, String logSteps) {
		logMap.put(method, logSteps);
	}

	public static void setDriver(WebDriver webDriver) {
		driver = webDriver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static String takesScreenshot() {

		String encodedImage = "";
		try {
			encodedImage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return String.format("<a href='data:image/png;base64,%s' target='_blank'>Click here</a></br>", encodedImage);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname = getTestName(result.getMethod().getMethodName(), result);
		testMap.put(testname, takesScreenshot());
		// testMap.put(result.getMethod().getMethodName(),
		// takeScreenShot(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname = getTestName(result.getMethod().getMethodName(), result);
		testMap.put(testname, takesScreenshot());
		// testMap.put(result.getMethod().getMethodName(),
		// takeScreenShot(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname = getTestName(result.getMethod().getMethodName(), result);
		testMap.put(testname, takesScreenshot());
		// testMap.put(result.getMethod().getMethodName(),
		// takeScreenShot(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
}
