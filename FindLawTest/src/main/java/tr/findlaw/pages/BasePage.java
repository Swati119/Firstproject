package tr.findlaw.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.framework.asserts.SoftAssertionHandler;
import com.framework.config.PropertiesRepository;
import com.framework.handlers.ActionHandler;
import com.framework.handlers.BaseHandler;
import com.framework.handlers.ElementHandler;
import com.framework.handlers.JavaScriptHandler;
import com.framework.handlers.PopUpHandler;
import com.framework.handlers.WindowHandler;
import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;
import com.framework.utils.StringUtils;

import tr.findlaw.objects.BasePageObjects;
import tr.findlaw.objects.ContactsPageObjects;
import tr.findlaw.objects.GenerateDocumentPageObjects;
import tr.findlaw.objects.LoginPageObjects;
import tr.findlaw.objects.OpportunityPageObjects;
import tr.findlaw.objects.OrderDetailPageObjects;
import tr.findlaw.objects.PasswordHoldersPageObjects;
import tr.findlaw.objects.QuotePageObjects;
import tr.findlaw.objects.SafeLoginpageObjects;
import tr.findlaw.objects.SearchPageObjects;
import tr.findlaw.objects.SendForEsignObjects;
import tr.findlaw.objects.EsignProcessPageObjects;
import tr.findlaw.objects.FindLawOrderToolPageObjects;
import tr.findlaw.objects.AccountPageObjects;
import tr.findlaw.objects.AddProductsPageObjects;


public class BasePage {

	WebDriver driver;
	protected Logger logger = LogManager.getLogger(this.getClass());
	protected ElementHandler elementHandler;
	protected ActionHandler actionHandler;
	protected WindowHandler windowHandler;
	protected PopUpHandler popUpHandler;
	protected StringUtils stringutils ;
	protected JavaScriptHandler javascripthandler;
	protected BaseHandler basehandler;

	public BasePage(WebDriver webDriver) { 

		 PageFactory.initElements(webDriver, LoginPageObjects.class);
		 PageFactory.initElements(webDriver, BasePageObjects.class);
		 PageFactory.initElements(webDriver, AccountPageObjects.class);
		 PageFactory.initElements(webDriver, ContactsPageObjects.class);
		 PageFactory.initElements(webDriver, OpportunityPageObjects.class);
		 PageFactory.initElements(webDriver, QuotePageObjects.class);
		 PageFactory.initElements(webDriver, AddProductsPageObjects.class); 
		 PageFactory.initElements(webDriver, GenerateDocumentPageObjects.class);
		 PageFactory.initElements(webDriver, SendForEsignObjects.class);
		 PageFactory.initElements(webDriver, EsignProcessPageObjects.class);
		 PageFactory.initElements(webDriver, OrderDetailPageObjects.class);
		 PageFactory.initElements(webDriver,SafeLoginpageObjects.class);
		 PageFactory.initElements(webDriver,FindLawOrderToolPageObjects.class);
		 PageFactory.initElements(webDriver,SearchPageObjects.class);
		 PageFactory.initElements(webDriver,PasswordHoldersPageObjects.class);
		 
		this.driver = webDriver;
		elementHandler = new ElementHandler(driver);
		actionHandler = new ActionHandler(driver);
		windowHandler = new WindowHandler(driver);
		popUpHandler = new PopUpHandler(driver);
		javascripthandler = new JavaScriptHandler(driver); 	
		
	}
	
	public void loginWithValidUser() {
		String userName = ExcelUtils.getDataByColumnName("Login", "Username");
		String password = ExcelUtils.getDataByColumnName("Login", "Password");
		elementHandler.setWebDriverWait(LoginPageObjects.txtBoxUsername);
		elementHandler.writeText(LoginPageObjects.txtBoxUsername, userName);
		TestNGCustomReporter.log(logger, "Entered User Name");
		elementHandler.writeText(LoginPageObjects.txtBoxPassword, password);
		TestNGCustomReporter.log(logger, "Entered Password");
		elementHandler.clickElement(LoginPageObjects.btnLogin, BasePageObjects.userNavigationLbl);
		actionHandler.waitForSomeTime(5000);
		TestNGCustomReporter.log(logger, "Clicked on Login button");
		
	}
	
	public void Logout() {
		
		elementHandler.clickElement(BasePageObjects.userNavigationLbl, BasePageObjects.lnkLogout);
		elementHandler.clickElement(BasePageObjects.lnkLogout);
		actionHandler.waitForSomeTime(5000);
		
	}
	
	public void loginWithValidUserWebmail() {
		String userName = ExcelUtils.getDataByColumnName("Login", "Webmail_Username");
		String password = ExcelUtils.getDataByColumnName("Login", "Webmail_Password");
		elementHandler.setWebDriverWait(LoginPageObjects.txtWebmailUserName);
		elementHandler.writeText(LoginPageObjects.txtWebmailUserName, userName);
		TestNGCustomReporter.log(logger, "Entered Webmail User Name");
		elementHandler.writeText(LoginPageObjects.txtWebmailPaswd, password);
		TestNGCustomReporter.log(logger, "Entered Webmail Password");
		elementHandler.clickElement(LoginPageObjects.btnSigIn, EsignProcessPageObjects.lblUserName);
		actionHandler.waitForSomeTime(5000);
		TestNGCustomReporter.log(logger, "Clicked on Sign In button");
		
	}
	
	
	
	
}
