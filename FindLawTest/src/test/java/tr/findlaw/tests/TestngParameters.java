package tr.findlaw.tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.framework.config.PropertiesRepository;
import com.framework.reports.TestNGCustomReporter;

import tr.findlaw.basetest.FindlawBaseTest;
import tr.findlaw.objects.BasePageObjects;
import tr.findlaw.objects.LoginPageObjects;

public class TestngParameters extends FindlawBaseTest {

	private Logger logger = LogManager.getLogger(this.getClass());
	
	@Test( enabled = true, description = "Scenario 1 for TestNG Parameters")
	@Parameters({ "sUsername", "sPassword" })
	public void scenario1(String sUsername, String sPassword) {
		
		driver.get(PropertiesRepository.getString("com.findlaw.url"));
		elementHandler.setWebDriverWait(LoginPageObjects.txtBoxUsername);
		elementHandler.writeText(LoginPageObjects.txtBoxUsername, sUsername);
		TestNGCustomReporter.log(logger, "Entered User Name");
		elementHandler.writeText(LoginPageObjects.txtBoxPassword, sPassword);
		TestNGCustomReporter.log(logger, "Entered Password");
		elementHandler.clickElement(LoginPageObjects.btnLogin, BasePageObjects.userNavigationLbl);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestNGCustomReporter.log(logger, "Clicked on Login button");
	}
	
}
