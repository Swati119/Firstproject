package com.framework.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.framework.config.PropertiesRepository;
import com.framework.driverfactory.DriverFactory;
import com.framework.utils.ExcelUtils;

import cucumber.api.Scenario;

public class CucumberSetup {
	protected static WebDriver driver = null;
	private static Logger logger = LogManager.getLogger(CucumberSetup.class);
	List<String> CucumberOpts = new ArrayList<String>();

	static {
		/*try {
			PropertiesRepository.loadAllProperties();
			ExcelUtils.setExcel(System.getProperty("user.dir") + PropertiesRepository.getString("testdata.excel.file"));
		} catch (Exception e) {
			logger.error("Unable to load properties files", e);
		}*/
	}

	public static String browserType;

	//@Before
	public void setUp() {
		browserType = PropertiesRepository.getString("global.browser.name");
		driver = DriverFactory.getDriver(browserType);
		manageDriver(driver);
	}

	//@After
	public void tearDown(Scenario scenario) throws IOException {

		File screenshot = takeScreenShots("screenshot");
		InputStream screenshotStream = new FileInputStream(screenshot);
		scenario.embed(IOUtils.toByteArray(screenshotStream), "image/jpeg");
		if (driver != null) {
			DriverFactory.removeDriver(driver);
		}
	}

	private File takeScreenShots(String picture) throws IOException {
		File temp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(temp, new File(System.getProperty("user.dir")
				+ PropertiesRepository.getString("screenshot.path") + File.separator + picture));
		return temp;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	private void manageDriver(WebDriver webDriver) {
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().implicitlyWait(PropertiesRepository.getInt("global.implicit.wait"),
				TimeUnit.SECONDS);
	}

}
