package com.framework.driverfactory;

import java.net.URL;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.framework.config.GlobalProperties;
import com.framework.config.PropertiesRepository;

public final class DriverFactory {
	private static Logger logger = LogManager.getLogger(DriverFactory.class);
	private static String browserType = null;
	private static WebDriver driver;

	public static WebDriver getDriver(String browser) {

		browserType = browser;
		/*DesiredCapabilities dc = CapabilityGenerator.getCapabilities(browserType);
		logger.info("Desired Capabilities : " + dc);*/

		if (PropertiesRepository.getBoolean("global.grid.mode")) {
			try {
				URL hubURL = new URL(PropertiesRepository.getString("global.grid.hub"));
				logger.info("Hub URL : " + hubURL);
				// driver = new RemoteWebDriver(hubURL, dc);
			} catch (Exception e) {
				throw new RuntimeException("Error something went wrong!\n" + e.getMessage());
			}
		} else {
			try {
				switch (browserType.toLowerCase()) {
				case GlobalProperties.FIREFOX:
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
							+ PropertiesRepository.getString("global.browser.firefox.gecko.driver.executable"));
					driver = new FirefoxDriver();
					break;
				case GlobalProperties.IE:
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")
							+ PropertiesRepository.getString("global.browser.ie.driver.executable"));
					driver = new InternetExplorerDriver();
					break;
				case GlobalProperties.CHROME:
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
							+ PropertiesRepository.getString("global.browser.chrome.driver.executable"));
					driver = new ChromeDriver();
					break;
				case GlobalProperties.MicrosoftEdge:
					System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")
							+ PropertiesRepository.getString("global.browser.edge.driver.executable"));
					driver = new EdgeDriver();
					break;
				default:
					throw new RuntimeException("Unsupported webdriver: " + browserType);
				}
			} catch (Exception e) {
				throw new RuntimeException("Error something went wrong!\n" + e.getMessage());
			}
		}
		return driver;
	}

	/***
	 * call this method to get the threadDriver object and launch the browser
	 * 
	 * @return currentWebDriver object
	 */
	public static WebDriver getDriver() {
		return driver;
	}

	/***
	 * Quits the threadDriver and closes the browser
	 */
	public static void removeDriver(WebDriver driver) {

		try {
			switch (browserType.toLowerCase()) {
			case GlobalProperties.FIREFOX:
				driver.close();
				//driver.quit();
				break;
			case GlobalProperties.IE:
				driver.close();
				driver.quit();
				break;
			case GlobalProperties.CHROME:
				driver.close();
				driver.quit();
				break;
			default:
				throw new RuntimeException("Unsupported webdriver: " + browserType);
			}
		} catch (Exception e) {
			throw new RuntimeException("Error something went wrong!\n" + e.getMessage());
		}

	}
}
