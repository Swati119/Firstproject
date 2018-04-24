package tr.findlaw.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.framework.handlers.ActionHandler;
import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;

import tr.findlaw.objects.QuotePageObjects;
import tr.findlaw.objects.SendForEsignObjects;

public class SendEsignPage extends BasePage {

	public SendEsignPage(WebDriver webDriver) {
		super(webDriver);
	}	
		
		
	public void Send_For_Esign() {
	
		javascripthandler.scrollIntoView(QuotePageObjects.btnEsignature);
		elementHandler.clickElement(QuotePageObjects.btnEsignature, SendForEsignObjects.chckboxOrderForm);
		elementHandler.clickElement(SendForEsignObjects.chckboxOrderForm);
		TestNGCustomReporter.log(logger, "Findlaw Order Form Checked");
		//jse.executeScript("arguments[0].scrollIntoView(true)", SendForEsignObjects.btnAddRecpnts);
		elementHandler.clickElement(SendForEsignObjects.btnAddRecpnts);
		actionHandler.waitForSomeTime(5000);
		elementHandler.clickElement(SendForEsignObjects.btnSendForEsign, QuotePageObjects.lblQuoteproposal);
		TestNGCustomReporter.log(logger, "Send for Esign successfully completed" +ReportBuilder.takesScreenshot());
		actionHandler.waitForSomeTime(10000);
		elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]/table/tbody/tr/td[1]/h2");
		
	}

}
