package tr.findlaw.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;
import com.framework.utils.StringUtils;

import tr.findlaw.objects.QuotePageObjects;

public class Contact28Page extends BasePage {
	

	public Contact28Page(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	public void AddContact28(String ContactName){
		
		elementHandler.clickElement(QuotePageObjects.btnEdit);
		javascripthandler.scrollIntoView(QuotePageObjects.txtContact28);
		elementHandler.writeText(QuotePageObjects.txtContact28, ContactName);
		javascripthandler.scrollIntoView(QuotePageObjects.lblQuote);
		elementHandler.clickElement(QuotePageObjects.btnSave1);
		TestNGCustomReporter.log(logger, "Order Confirmation Contact Added" +ReportBuilder.takesScreenshot());	
	}

}
