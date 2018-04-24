package tr.findlaw.pages;

import org.openqa.selenium.WebDriver;

import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;

import tr.findlaw.objects.OrderDetailPageObjects;
import tr.findlaw.objects.QuotePageObjects;

public class ValidateEsignPage extends BasePage {

	public ValidateEsignPage(WebDriver webDriver) {
		super(webDriver);
	
	}
	
	public void ValidateEsign() {
		
		elementHandler.clickElement(QuotePageObjects.btnValidateEsign, QuotePageObjects.lblCheckeSgnStatus);
		actionHandler.waitForSomeTime(15000);
		windowHandler.refereshWebPage();
		windowHandler.refereshWebPage();
		windowHandler.refereshWebPage();
		windowHandler.refereshWebPage();
		elementHandler.waitForXpathToLoad("//span[text()='Orders']");
		elementHandler.clickElement(QuotePageObjects.lnkOrders);
		elementHandler.clickElement(QuotePageObjects.lnkOrderNumber);
		TestNGCustomReporter.log(logger, "Order Detail page displayed");
		elementHandler.waitForXpathToLoad("//div[@id='Name_ileinner']");
		String OrderNo= elementHandler.getText(QuotePageObjects.lblOrderNo);
		//ExcelUtils.writeData("/src/test/resources/testdata/TestData.xlsx", "Method_Name", "OrderNo");
		TestNGCustomReporter.log(logger, "Order No has been generated : " +OrderNo+ " "+ ReportBuilder.takesScreenshot());
		elementHandler.waitForXpathToLoad("//div[@class='pbBody']/div[2]/table/tbody/tr[10]/td[4]/div/a");
		elementHandler.clickElement(OrderDetailPageObjects.lnkQuoteId, QuotePageObjects.lblQuoteproposal);
		actionHandler.waitForSomeTime(2000);
	}
	
public void ValidateOrder() {
		
		windowHandler.refereshWebPage();
		elementHandler.waitForXpathToLoad("//span[text()='Orders']");
		elementHandler.clickElement(QuotePageObjects.lnkOrders);
		elementHandler.clickElement(QuotePageObjects.lnkOrderNumber);
		TestNGCustomReporter.log(logger, "Order Detail page displayed");
		elementHandler.waitForXpathToLoad("//div[@id='Name_ileinner']");
		String OrderNo= elementHandler.getText(QuotePageObjects.lblOrderNo);
		//ExcelUtils.writeData("/src/test/resources/testdata/TestData.xlsx", "Method_Name", "OrderNo");
		TestNGCustomReporter.log(logger, "Order COB Process has Completed : " +OrderNo+ " "+ ReportBuilder.takesScreenshot());

	}
}
