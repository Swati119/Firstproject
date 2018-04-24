package com.framework.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.framework.config.PropertiesRepository;
import com.framework.driverfactory.DriverFactory;
import com.framework.reports.ReportBuilder;
import com.google.common.collect.ArrayListMultimap;

@Listeners({ com.framework.reports.ReportBuilder.class })
public class BaseTest {

	private static Logger logger = LogManager.getLogger(BaseTest.class);

	protected static WebDriver driver = null;

	protected static String environment;
	protected static String browserType;
	protected ExtentReports extent;

	static {
		try {
			PropertiesRepository.loadAllProperties();
		} catch (Exception e) {
			logger.error("Unable to load properties files", e);
		}
	}

	@Parameters({ "suitename", "environment", "browsertype" })
	@BeforeSuite(groups = "Sanity Test")
	public void beforeSuite(String suiteName, String env, String browser) {
		ReportBuilder.testMap = ArrayListMultimap.create();
		ReportBuilder.logMap = ArrayListMultimap.create();
		browserType = browser;
		environment = env;
		extent = ReportBuilder.init(suiteName, browserType);
	}

	@BeforeMethod(groups = "Sanity Test")
	public void setup() {
		driver = DriverFactory.getDriver(browserType);
		System.out.println(driver);
		ReportBuilder.setDriver(driver);
		manageDriver();
	}

	@AfterMethod(groups = "Sanity Test")
	public void tearDown(ITestResult result) {
		DriverFactory.removeDriver(driver);
	}

	@AfterSuite(groups = "Sanity Test")
	public void afterSuite(ITestContext context) {
		ReportBuilder.buildReports(extent, context);
		ReportBuilder.testMap.clear();
		ReportBuilder.logMap.clear();
	}

	private void manageDriver() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(PropertiesRepository.getInt("global.implicit.wait"),
				TimeUnit.SECONDS);

	}

}
