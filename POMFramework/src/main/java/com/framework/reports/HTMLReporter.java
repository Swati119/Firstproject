package com.framework.reports;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.framework.config.GlobalProperties;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class HTMLReporter implements ITestListener, IReporter {

	
	 /** private static final String OUTPUT_FOLDER = "test-output/"; private
	 * static final String FILE_NAME = "Extent.html";
	 */

	private ExtentReports extent;
	ExtentTest test;
	private static WebDriver driver;
	static Multimap<String, String> testMap = ArrayListMultimap.create();
	static Multimap<String, String> logMap = ArrayListMultimap.create();

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

		for (ISuite suite : suites) {
			init(suite.getName());
		}

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();
			// init(suite.getName());
			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				try {

					buildTestNodes(context.getFailedTests(), Status.FAIL);
					buildTestNodes(context.getSkippedTests(), Status.SKIP);
					buildTestNodes(context.getPassedTests(), Status.PASS);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		for (String s : Reporter.getOutput()) {
			extent.setTestRunnerOutput(s);
		}
		extent.flush();

	}

	private void init(String suiteName) {

		String filepath = "Reports/" + suiteName + "_Test_Results.html";

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filepath);
		htmlReporter.loadXMLConfig(new File(GlobalProperties.EXTENT_REPORT_CONFIG));
		
		/* * htmlReporter.config().
		 * setDocumentTitle("ExtentReports - Created by TestNG Listener");
		 * htmlReporter.config().
		 * setReportName("ExtentReports - Created by TestNG Listener");*/
		 
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setReportName("Page Object Model Report");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();

		extent.setSystemInfo("Browser", capabilities.getBrowserName().toUpperCase());
		extent.setSystemInfo("Browser Version", capabilities.getVersion().toUpperCase());
		extent.setSystemInfo("Java Version", System.getProperty("java.version").toUpperCase());
		extent.setSystemInfo("OS", System.getProperty("os.name").toUpperCase());
		extent.setSystemInfo("Host Name", System.getenv("COMPUTERNAME").toUpperCase());

		extent.setReportUsesManualConfiguration(true);
	}

	private void buildTestNodes(IResultMap tests, Status status) throws IOException {

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				String testname = result.getMethod().getMethodName();
				test = extent.createTest(testname);

				
				 /** for (String group : result.getMethod().getGroups())
				 * test.assignCategory(group);*/
				 

				for (String log : logMap.get((result.getMethod().getMethodName()))) {
					test.pass(log);
				}

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
					/* * else { Markup markUp = MarkupHelper.createLabel(testname
					 * + " is " + status.toString().toLowerCase() + "ed",
					 * ExtentColor.GREEN); test.pass(markUp); }*/
					 

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

	private Date getTime(long millis) {
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

	public String takesScreenshot() {

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
		testMap.put(result.getMethod().getMethodName(), takesScreenshot());
		// testMap.put(result.getMethod().getMethodName(),
		// takeScreenShot(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		testMap.put(result.getMethod().getMethodName(), takesScreenshot());
		// testMap.put(result.getMethod().getMethodName(),
		// takeScreenShot(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		testMap.put(result.getMethod().getMethodName(), takesScreenshot());
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