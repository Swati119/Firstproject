package tr.findlaw.tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.framework.reports.TestNGCustomReporter;

import tr.findlaw.basetest.FindlawBaseTest;
import tr.findlaw.pages.Contact28Page;
import tr.findlaw.pages.GenerateDocumentPage;
import tr.findlaw.pages.SearchQuotePage;

public class TestPDFFile extends FindlawBaseTest {
	private Logger logger = LogManager.getLogger(this.getClass());
	
	@Test( enabled = true, description = "SOC-4102 Ability to bridge IM & Firmsites for only 30,60,90 days for 100 percent")
	public void SOC_4102() {
		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
		applicationLogin();
	String ContactName= "TEST TEST";
	String QuoteId= "Q-00046751";
	searchquotepage = new SearchQuotePage(driver);
	searchquotepage.SearchQuote(QuoteId);		
	contact28page = new Contact28Page(driver);
	contact28page.AddContact28(ContactName);
	//String ProposalName=ExcelUtils.getDataByColumnName("Quote", "Name");
	searchquotepage = new SearchQuotePage(driver);
	searchquotepage.SearchQuote(QuoteId);
	TestNGCustomReporter.log(logger,"======================== Generate Document page script execution started ========================");
	generateDocumentPage = new GenerateDocumentPage(driver);
	generateDocumentPage.Generate_Document_viewFile();
	
	}
}
