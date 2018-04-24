package tr.findlaw.pages;

import org.openqa.selenium.WebDriver;

import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;

import tr.findlaw.objects.BasePageObjects;
import tr.findlaw.objects.QuotePageObjects;

public class SearchQuotePage  extends BasePage {

	public SearchQuotePage(WebDriver webDriver) {
		super(webDriver);
	
	}
	
	public void SearchQuote(String ProposalName) {
		
		elementHandler.writeText(BasePageObjects.txtBoxSearch, ProposalName);
		elementHandler.clickElement(BasePageObjects.btnSearch, QuotePageObjects.lnkQuoteID);
		elementHandler.clickElement(QuotePageObjects.lnkQuoteID);
		elementHandler.waitForXpathToLoad("//input[@title='Edit']/../../../../../../div[1]/table/tbody/tr/td[2]/input[3]");
		TestNGCustomReporter.log(logger, "Quote ID Searched" +ReportBuilder.takesScreenshot());
	}
}
