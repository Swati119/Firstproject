package tr.findlaw.tests;

import java.text.DecimalFormat;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.framework.asserts.AssertionHandler;
import com.framework.handlers.ActionHandler;
import com.framework.reports.TestNGCustomReporter;

import tr.findlaw.basetest.FindlawBaseTest;
import tr.findlaw.pages.Accountpage;
import tr.findlaw.pages.AddProductsPage;
import tr.findlaw.pages.Contact28Page;
import tr.findlaw.pages.ContactsPage;
import tr.findlaw.pages.EsignProcessPage;
import tr.findlaw.pages.FindLawOrderToolPage;
import tr.findlaw.pages.GenerateDocumentPage;
import tr.findlaw.pages.OpptyPage;
import tr.findlaw.pages.QuotePage;
import tr.findlaw.pages.SearchPage;
import tr.findlaw.pages.SearchQuotePage;
import tr.findlaw.pages.SendEsignPage;
import tr.findlaw.pages.ValidateEsignPage;

public class Sprint_9 extends FindlawBaseTest {

	
	 private Logger logger = LogManager.getLogger(this.getClass());
     
     @Test(enabled = false, description = "SOC-4108 Ability to determine the price for year 2 & 3 for new of IM Solution & FirmsitesAs a sales rep, I should be see the price for year 2 & 3 for new of IM Solution & Firmsites")
     public void SOC_4108_IMProducts() {
                     TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
                     applicationLogin();
                     TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
                     accountpage = new Accountpage(driver);
                     accountpage.SearchExistAccountfordiffprofile();
                     TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
                     contactsPage = new ContactsPage(driver);
                     contactsPage.createNewContact();
                     TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
                     OpptyPage optypage = new OpptyPage(driver);
                     optypage.createOpty(); 
                     TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
                     quotepage = new QuotePage(driver);
                     quotepage.createQuote();
                     TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
                     addproductspage = new AddProductsPage(driver);
                     int ctrl = 12; //If ctrl = 12 then execute the Validaion of Price for all products
                     addproductspage.AddProducts(ctrl);                      
                              
     }
    
     
     @Test(enabled = false, description = "SOC-4108 Ability to determine the price for year 2 & 3 for new of IM Solution & FirmsitesAs a sales rep, I should be see the price for year 2 & 3 for new of IM Solution & Firmsites")
     public void SOC_4108_FirmsiteProducts() {
                     TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
                     applicationLogin();
                     TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
                     accountpage = new Accountpage(driver);
                     accountpage.SearchExistAccountfordiffprofile();
                     TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
                     contactsPage = new ContactsPage(driver);
                     contactsPage.createNewContact();
                     TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
                     OpptyPage optypage = new OpptyPage(driver);
                     optypage.createOpty(); 
                     TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
                     quotepage = new QuotePage(driver);
                     quotepage.createQuote();
                     TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
                     addproductspage = new AddProductsPage(driver);
                     int ctrl = 13; //If ctrl = 1 then execute the Add bridge for the product in cart page
                     addproductspage.AddProducts(ctrl);                      
                              
     }
     
     @Test(enabled = false, description = "SOC-4449 Implement the business rules associated to Firmsite product model products")
     public void SOC_4449() {
		TestNGCustomReporter.log(logger,
				"======================== Login Page script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,
				"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		//Use Account No:1000786395 for this scenario or as mentioned in the QC
		accountpage.SearchExistAccountfordiffprofile();
		TestNGCustomReporter.log(logger,
				"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,
				"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty();
		TestNGCustomReporter.log(logger,
				"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		quotepage.createQuote();
		TestNGCustomReporter.log(logger,
				"======================== Add Product page script execution started ========================");
		
		addproductspage = new AddProductsPage(driver);
		int ctrl = 14; // If ctrl = 14 then execute the Add bridge for the product in cart page
		addproductspage.AddProducts(ctrl); 
                  
            		   
     }
     
     @Test(enabled = false, description = "SOC-5388 Testing Only of Story SOC-5179 (For assets when mutual exclusive business rule fires update the error message)")
     public void SOC_5388() {
		TestNGCustomReporter.log(logger,
				"======================== Login Page script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,
				"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		//Use Account No:1000786395 for this scenario or as mentioned in the QC
		accountpage.SearchExistAccountfordiffprofile();
		TestNGCustomReporter.log(logger,
				"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,
				"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty();
		TestNGCustomReporter.log(logger,
				"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		quotepage.createQuote();
		TestNGCustomReporter.log(logger,
				"======================== Add Product page script execution started ========================");
		
		addproductspage = new AddProductsPage(driver);
		int ctrl = 15; // If ctrl = 14 then execute the Add bridge for the product in cart page
		addproductspage.AddProducts(ctrl); 
                  
            		   
     }
     
     
     @Test(enabled = true, description = "SOC-5390 Testing Only of Story SOC-4775 Configure and Validate IM Solution ( IMR) & pricing in US)")
     public void SOC_5390() {
		TestNGCustomReporter.log(logger,
				"======================== Login Page script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,
				"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		
		accountpage.SearchExistAccount();
		TestNGCustomReporter.log(logger,
				"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		String ContactName= contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,
				"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty();
		TestNGCustomReporter.log(logger,
				"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		String QuoteId= quotepage.createQuote();
		TestNGCustomReporter.log(logger,
				"======================== Add Product page script execution started ========================");
		
		addproductspage = new AddProductsPage(driver);
		int ctrl = 16; // If ctrl = 14 then execute the Add bridge for the product in cart page
		addproductspage.AddProducts(ctrl); 
		
		TestNGCustomReporter.log(logger,
				"======================== Contact28 page script execution started ========================");
		contact28page = new Contact28Page(driver);
		contact28page.AddContact28(ContactName);
		// String ProposalName=ExcelUtils.getDataByColumnName("Quote", "Name");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,
				"======================== Generate Document page script execution started ========================");
		generateDocumentPage = new GenerateDocumentPage(driver);
		generateDocumentPage.Generate_Document();
		TestNGCustomReporter.log(logger,
				"======================== Send For Esign page script execution started ========================");
		sendesignPage = new SendEsignPage(driver);
		sendesignPage.Send_For_Esign();
		webmailLogin();
		TestNGCustomReporter.log(logger,
				"========================  Esign Process page script execution started ========================");
		esignprocesspage = new EsignProcessPage(driver);
		esignprocesspage.EsignProcess();
		TestNGCustomReporter.log(logger,
				"======================== SFDC Login script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,
				"========================  Esign Process page script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,
				"========================  Esign Process page script execution started ========================");
		validateesignpage = new ValidateEsignPage(driver);
		validateesignpage.ValidateEsign();
		TestNGCustomReporter.log(logger,
				"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
		TestNGCustomReporter.log(logger,
				"========================  Login to Safe Page execution started ========================");
		findlawordertoolpage.loginWithSafeuserId(QuoteId);
		TestNGCustomReporter.log(logger,
				"========================  COB process page script executution started ========================");
		int ctrlval = 1;
		findlawordertoolpage.COBProcess(ctrlval);
		applicationLogin();
		TestNGCustomReporter.log(logger,
				"========================  Search for Quote script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		validateesignpage = new ValidateEsignPage(driver);
		TestNGCustomReporter.log(logger,
				"========================  Validate Order Script Execution started ========================");
		validateesignpage.ValidateOrder();          
            		   
     }
     
     
     @Test(enabled = false, description = "SOC-5391 Testing Only of Story SOC-4496 Configure assets for the existing customers with EB product model products")
     public void SOC_5391() {
		TestNGCustomReporter.log(logger,
				"======================== Login Page script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,
				"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		int ctrl1=1;
		accountpage.SearchAccount(ctrl1);
		TestNGCustomReporter.log(logger,
				"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		String ContactName= contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,
				"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty();
		TestNGCustomReporter.log(logger,
				"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		String QuoteId= quotepage.createQuote();
		TestNGCustomReporter.log(logger,
				"======================== Add Product page script execution started ========================");
		
		addproductspage = new AddProductsPage(driver);
		int ctrl = 15; // If ctrl = 14 then execute the Add bridge for the product in cart page
		addproductspage.AddProducts(ctrl); 
         
		TestNGCustomReporter.log(logger,
				"======================== Contact28 page script execution started ========================");
		contact28page = new Contact28Page(driver);
		contact28page.AddContact28(ContactName);
		// String ProposalName=ExcelUtils.getDataByColumnName("Quote", "Name");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,
				"======================== Generate Document page script execution started ========================");
		generateDocumentPage = new GenerateDocumentPage(driver);
		generateDocumentPage.Generate_Document();
		TestNGCustomReporter.log(logger,
				"======================== Send For Esign page script execution started ========================");
		sendesignPage = new SendEsignPage(driver);
		sendesignPage.Send_For_Esign();
		webmailLogin();
		TestNGCustomReporter.log(logger,
				"========================  Esign Process page script execution started ========================");
		esignprocesspage = new EsignProcessPage(driver);
		esignprocesspage.EsignProcess();
		TestNGCustomReporter.log(logger,
				"======================== SFDC Login script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,
				"========================  Esign Process page script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,
				"========================  Esign Process page script execution started ========================");
		validateesignpage = new ValidateEsignPage(driver);
		validateesignpage.ValidateEsign();
		TestNGCustomReporter.log(logger,
				"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
		TestNGCustomReporter.log(logger,
				"========================  Login to Safe Page execution started ========================");
		findlawordertoolpage.loginWithSafeuserId(QuoteId);
		TestNGCustomReporter.log(logger,
				"========================  COB process page script executution started ========================");
		int ctrlval = 1;
		findlawordertoolpage.COBProcess(ctrlval);
		applicationLogin();
		TestNGCustomReporter.log(logger,
				"========================  Search for Quote script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		validateesignpage = new ValidateEsignPage(driver);
		TestNGCustomReporter.log(logger,
				"========================  Validate Order Script Execution started ========================");
		validateesignpage.ValidateOrder();
            		   
     }
     
     @Test(enabled = false, description = "SOC-5392 Testing Only of Story SOC-814 As a FindLaw user, I should be able to launch the COB link or button  within the CPQ system.")
 	public void SOC_5392() {
 		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
 		applicationLogin();
 		TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
 		accountpage = new Accountpage(driver);
 		accountpage.SearchExistAccount();
 		TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
 		contactsPage = new ContactsPage(driver);
 		String ContactName=contactsPage.createNewContact();
 		//String ContactName= ExcelUtils.getDataByColumnName("Contacts", "Id");
 		//contactsPage.SearchExistContact();
 		TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
 		OpptyPage optypage = new OpptyPage(driver);
 		optypage.createOpty(); 
 		TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
 		quotepage = new QuotePage(driver);
 		String QuoteId=quotepage.createQuote();
 		TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
 		addproductspage = new AddProductsPage(driver);
 		int ctrl = 1; //If ctrl = 1 then execute the Add bridge for the product in cart page
 		addproductspage.AddProducts(ctrl);		
 		TestNGCustomReporter.log(logger,"======================== Contact28 page script execution started ========================");
 		contact28page = new Contact28Page(driver);
 		contact28page.AddContact28(ContactName);
 		//String ProposalName=ExcelUtils.getDataByColumnName("Quote", "Name");
 		searchquotepage = new SearchQuotePage(driver);
 		searchquotepage.SearchQuote(QuoteId);
 		TestNGCustomReporter.log(logger,"======================== Generate Document page script execution started ========================");
 		generateDocumentPage = new GenerateDocumentPage(driver);
 		generateDocumentPage.Generate_Document();
 		TestNGCustomReporter.log(logger,"======================== Send For Esign page script execution started ========================");
 		sendesignPage = new SendEsignPage(driver);
 		sendesignPage.Send_For_Esign();
 		webmailLogin();
 		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
 		esignprocesspage = new EsignProcessPage(driver);
 		esignprocesspage.EsignProcess();
 		TestNGCustomReporter.log(logger,"======================== SFDC Login script execution started ========================");
 		applicationLogin();
 		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
 		searchquotepage = new SearchQuotePage(driver);
 		searchquotepage.SearchQuote(QuoteId);
 		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
 		validateesignpage = new ValidateEsignPage(driver);
 		validateesignpage.ValidateEsign();
 		
 		
 		
 		TestNGCustomReporter.log(logger,"========================  Login to Safe Page execution started ========================");
 		findlawordertoolpage.loginWithSafeuserId(QuoteId);
 		TestNGCustomReporter.log(logger,"========================  COB process page script executution started ========================");
 		int ctrlval=1;
 		findlawordertoolpage.COBProcess(ctrlval);
 		applicationLogin();
 		TestNGCustomReporter.log(logger,"========================  Search for Quote script execution started ========================");
 		searchquotepage = new SearchQuotePage(driver);
 		searchquotepage.SearchQuote(QuoteId);
 		validateesignpage = new ValidateEsignPage(driver);
 		TestNGCustomReporter.log(logger,"========================  Validate Order Script Execution started ========================");
 		validateesignpage.ValidateOrder();	
 	}
     
     @Test(enabled = false, description = "SOC-5392 Testing Only of Story SOC-814 As a FindLaw user, I should be able to launch the COB link or button  within the CPQ system.")
  	public void SOC_532() {
    	 String QuoteId= "Q-00045916";
    	 applicationLogin();
    	 searchpage = new SearchPage(driver);
    	 searchpage.ClickCOBfromProposals(QuoteId);
    	 findlawordertoolpage= new FindLawOrderToolPage(driver);
    	 findlawordertoolpage.loginWithSafeuserId(QuoteId);
    	 
     }
     
     
}
