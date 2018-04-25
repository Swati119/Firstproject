package tr.findlaw.tests;

import java.util.List;

import org.apache.log4j.*;
import org.apache.xalan.templates.ElemElement;
import org.testng.annotations.Test;

import com.framework.handlers.ElementHandler;
import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;
import tr.findlaw.basetest.FindlawBaseTest;
import tr.findlaw.objects.LoginPageObjects;
import tr.findlaw.pages.Accountpage;
import tr.findlaw.pages.AddProductsPage;
import tr.findlaw.pages.BasePage;
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


public class Sprint_6 extends FindlawBaseTest{
	private Logger logger = LogManager.getLogger(this.getClass());
	
	
	
	@Test( enabled = false, description = "SOC-4102 Ability to bridge IM & Firmsites for only 30,60,90 days for 100 percent")
	public void SOC_4102() {
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
		TestNGCustomReporter.log(logger,"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
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
	
 
	@Test(enabled = false, description = "SOC-4105_As CDC, I should have the ability to discount for IM Solutions and Firmsites")
	public void SOC_4105()  {
		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		accountpage.SearchExistAccount();
		TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		String ContactName=contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty(); 
		TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		String QuoteId=quotepage.createQuote();
		TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
		addproductspage = new AddProductsPage(driver);
		int ctrl = 2; //If ctrl = 2 then execute the Add Discount for the product in cart page
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
		TestNGCustomReporter.log(logger,"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
		TestNGCustomReporter.log(logger,"========================  Login to Safe Page execution started ========================");
		findlawordertoolpage.loginWithSafeuserId(QuoteId);
		TestNGCustomReporter.log(logger,"========================  COB process page script executution started ========================");
		int ctrlval= 1;
		findlawordertoolpage.COBProcess(ctrlval);
		applicationLogin();
		TestNGCustomReporter.log(logger,"========================  Search for Quote script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		validateesignpage = new ValidateEsignPage(driver);
		TestNGCustomReporter.log(logger,"========================  Validate Order Script Execution started ========================");
		validateesignpage.ValidateOrder();
		
	}
	

	@Test(enabled = false, description = "SOC-4106_As a CDC, I have the ability to chose contract terms available 1,2, 3 for Firmsite and IM solutions")
	public void SOC_4106()  {
		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		accountpage.SearchExistAccount();
		TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		//contactsPage.SearchExistContact();
		//String ContactName=ExcelUtils.getDataByColumnName("Contacts", "Id");
		String ContactName=contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty(); 
		TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		String QuoteId=quotepage.createQuote();
		TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
		addproductspage = new AddProductsPage(driver);
		int ctrl = 3; //If ctrl = 3 then execute the Add Contract for the product in cart page
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
		//String QuoteId=ExcelUtils.getDataByColumnName("Quote", "Name");
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		validateesignpage = new ValidateEsignPage(driver);
		validateesignpage.ValidateEsign();	
		TestNGCustomReporter.log(logger,"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
		TestNGCustomReporter.log(logger,"========================  Login to Safe Page execution started ========================");
		findlawordertoolpage.loginWithSafeuserId(QuoteId);
		TestNGCustomReporter.log(logger,"========================  COB process page script executution started ========================");
		int ctrlval= 2;
		findlawordertoolpage.COBProcess(ctrlval);
		applicationLogin();
		TestNGCustomReporter.log(logger,"========================  Search for Quote script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		validateesignpage = new ValidateEsignPage(driver);
		TestNGCustomReporter.log(logger,"========================  Validate Order Script Execution started ========================");
		validateesignpage.ValidateOrder();
	
	}
	
	@Test(enabled = false, description = "SOC-4218 Set Up recommended product to be set up for the IM solution products")
	public void SOC_4218()  {
		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		accountpage.SearchExistAccount();
		TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		//contactsPage.SearchExistContact();
		//String ContactName=ExcelUtils.getDataByColumnName("Contacts", "Id");
		contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty(); 
		TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		quotepage.createQuote();
		TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
		addproductspage = new AddProductsPage(driver);
		int ctrl = 4; //If ctrl = 3 then execute the Add Contract for the product in cart page
		addproductspage.AddProducts(ctrl);	
	
	}
	
	@Test(enabled = false, description = "SOC-4482 Ability to bridge IM  for only 30,60,90 days at 100 percent")
	public void SOC_4482() {
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
		int ctrl = 5; //If ctrl = 1 then execute the Add bridge for the product in cart page
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
		TestNGCustomReporter.log(logger,"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
		TestNGCustomReporter.log(logger,"========================  Login to Safe Page execution started ========================");
		findlawordertoolpage.loginWithSafeuserId(QuoteId);
		TestNGCustomReporter.log(logger,"========================  COB process page script executution started ========================");
		int ctrlval=2;
		findlawordertoolpage.COBProcess(ctrlval);
		applicationLogin();
		TestNGCustomReporter.log(logger,"========================  Search for Quote script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		validateesignpage = new ValidateEsignPage(driver);
		TestNGCustomReporter.log(logger,"========================  Validate Order Script Execution started ========================");
		validateesignpage.ValidateOrder();	
	}
	
	

	@Test(enabled = false, description = "SOC-4484 As a CDC, I have the ability to chose contract terms available 1,2, 3 for IM solutions")
	public void SOC_4484()  {
		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		accountpage.SearchExistAccount();
		TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		//contactsPage.SearchExistContact();
		//String ContactName=ExcelUtils.getDataByColumnName("Contacts", "Id");
		String ContactName=contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty(); 
		TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		String QuoteId=quotepage.createQuote();
		TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
		addproductspage = new AddProductsPage(driver);
		int ctrl = 6; //If ctrl = 3 then execute the Add Contract for the product in cart page
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
		//String QuoteId=ExcelUtils.getDataByColumnName("Quote", "Name");
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		validateesignpage = new ValidateEsignPage(driver);
		validateesignpage.ValidateEsign();	
		TestNGCustomReporter.log(logger,"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
		TestNGCustomReporter.log(logger,"========================  Login to Safe Page execution started ========================");
		findlawordertoolpage.loginWithSafeuserId(QuoteId);
		TestNGCustomReporter.log(logger,"========================  COB process page script executution started ========================");
		int ctrlval= 3;
		findlawordertoolpage.COBProcess(ctrlval);
		applicationLogin();
		TestNGCustomReporter.log(logger,"========================  Search for Quote script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		validateesignpage = new ValidateEsignPage(driver);
		TestNGCustomReporter.log(logger,"========================  Validate Order Script Execution started ========================");
		validateesignpage.ValidateOrder();
	
	}
	
	
	@Test(enabled = false, description = "SOC-4698 FindLaw rep types will need to be mapped in SFDC to have a revenue channel assigned to the order")
	public void SOC_4698_Super_Law()  {
		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
		applicationLogin();
		String Super_Law= ExcelUtils.getDataByColumnName("Login", "Super_Law");
		TestNGCustomReporter.log(logger,"======================== Login to Different profile script Execution started ========================");
		searchpage= new SearchPage(driver);
		searchpage.SearchDiffProfile(Super_Law);	
		TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		accountpage.SearchExistAccount();
		TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		String ContactName=contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty(); 
		TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		String QuoteId=quotepage.createQuotefrSpecificuser();
		TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
		addproductspage = new AddProductsPage(driver);
		int ctrl = 7; //If ctrl = 7 then execute the add product in cart page
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
		quotepage.logoutUser();
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,"======================== Send For Esign page script execution started ========================");
		sendesignPage = new SendEsignPage(driver);
		sendesignPage.Send_For_Esign();
		webmailLogin();
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		esignprocesspage = new EsignProcessPage(driver);
		esignprocesspage.EsignProcess();
		TestNGCustomReporter.log(logger,"======================== SFDC Login script execution started ========================");
		applicationLogin();
		searchpage.SearchDiffProfile(Super_Law);
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		validateesignpage = new ValidateEsignPage(driver);
		validateesignpage.ValidateEsign();	
		TestNGCustomReporter.log(logger,"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
		TestNGCustomReporter.log(logger,"========================  Login to Safe Page execution started ========================");
		findlawordertoolpage.loginWithSafeuserId(QuoteId);
		TestNGCustomReporter.log(logger,"========================  COB process page script executution started ========================");
		int ctrlval= 3;
		findlawordertoolpage.COBProcess(ctrlval);
		applicationLogin();
		searchpage.SearchDiffProfile(Super_Law);
		TestNGCustomReporter.log(logger,"========================  Search for Quote script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		validateesignpage = new ValidateEsignPage(driver);
		TestNGCustomReporter.log(logger,"========================  Validate Order Script Execution started ========================");
		validateesignpage.ValidateOrder();
		
		
	}
	
	@Test(enabled = false, description = "SOC-4698 FindLaw rep types will need to be mapped in SFDC to have a revenue channel assigned to the order")
	public void SOC_4698_Lead_Sales()  {
		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
		applicationLogin();
		String Lead_Sales_Rep= ExcelUtils.getDataByColumnName("Login", "Lead_Sales_Rep");
		TestNGCustomReporter.log(logger,"======================== Login to Different profile script Execution started ========================");
		searchpage= new SearchPage(driver);
		searchpage.SearchDiffProfile(Lead_Sales_Rep);	
		TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		accountpage.SearchExistAccount();
		TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		String ContactName=contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty(); 
		TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		String QuoteId=quotepage.createQuotefrSpecificuser();
		TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
		addproductspage = new AddProductsPage(driver);
		int ctrl = 7; //If ctrl = 7 then execute the add product in cart page
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
		quotepage.logoutUser();
		/*boolean input= elementHandler.isElementDisplayed(LoginPageObjects.txtBoxUsername);
		System.out.println(input +"input");
		if(input == true) {
		basePage.loginWithValidUser();
		}*/
		if (LoginPageObjects.txtBoxUsrname.size()>0) {
			basePage.loginWithValidUser();
	     }
		
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,"======================== Send For Esign page script execution started ========================");
		sendesignPage = new SendEsignPage(driver);
		sendesignPage.Send_For_Esign();
		webmailLogin();
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		esignprocesspage = new EsignProcessPage(driver);
		esignprocesspage.EsignProcess();
		TestNGCustomReporter.log(logger,"======================== SFDC Login script execution started ========================");
		applicationLogin();
		searchpage.SearchDiffProfile(Lead_Sales_Rep);
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		validateesignpage = new ValidateEsignPage(driver);
		validateesignpage.ValidateEsign();	
		TestNGCustomReporter.log(logger,"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
		TestNGCustomReporter.log(logger,"========================  Login to Safe Page execution started ========================");
		findlawordertoolpage.loginWithSafeuserId(QuoteId);
		TestNGCustomReporter.log(logger,"========================  COB process page script executution started ========================");
		int ctrlval= 3;
		findlawordertoolpage.COBProcess(ctrlval);
		applicationLogin();
		searchpage.SearchDiffProfile(Lead_Sales_Rep);
		TestNGCustomReporter.log(logger,"========================  Search for Quote script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		validateesignpage = new ValidateEsignPage(driver);
		TestNGCustomReporter.log(logger,"========================  Validate Order Script Execution started ========================");
		validateesignpage.ValidateOrder();
		
		
	}
	
	@Test(enabled = false, description = "SOC-4698 FindLaw rep types will need to be mapped in SFDC to have a revenue channel assigned to the order")
	public void SOC_4698_Acc_Mgmt()  {
		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
		applicationLogin();
		String FindLaw_Acc_Mgmt= ExcelUtils.getDataByColumnName("Login", "FindLaw_Acc_Mgmt");
		TestNGCustomReporter.log(logger,"======================== Login to Different profile script Execution started ========================");
		searchpage= new SearchPage(driver);
		searchpage.SearchDiffProfile(FindLaw_Acc_Mgmt);	
		TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		accountpage.SearchExistAccount();
		TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		String ContactName=contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty(); 
		TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		String QuoteId=quotepage.createQuotefrSpecificuser();
		TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
		addproductspage = new AddProductsPage(driver);
		int ctrl = 7; //If ctrl = 7 then execute the add product in cart page
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
		quotepage.logoutUser();
		if (LoginPageObjects.txtBoxUsrname.size()>0) {
			basePage.loginWithValidUser();
	     }
		
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,"======================== Send For Esign page script execution started ========================");
		sendesignPage = new SendEsignPage(driver);
		sendesignPage.Send_For_Esign();
		webmailLogin();
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		esignprocesspage = new EsignProcessPage(driver);
		esignprocesspage.EsignProcess();
		TestNGCustomReporter.log(logger,"======================== SFDC Login script execution started ========================");
		applicationLogin();
		searchpage.SearchDiffProfile(FindLaw_Acc_Mgmt);
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		validateesignpage = new ValidateEsignPage(driver);
		validateesignpage.ValidateEsign();	
		TestNGCustomReporter.log(logger,"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
		TestNGCustomReporter.log(logger,"========================  Login to Safe Page execution started ========================");
		findlawordertoolpage.loginWithSafeuserId(QuoteId);
		TestNGCustomReporter.log(logger,"========================  COB process page script executution started ========================");
		int ctrlval= 3;
		findlawordertoolpage.COBProcess(ctrlval);
		applicationLogin();
		searchpage.SearchDiffProfile(FindLaw_Acc_Mgmt);
		TestNGCustomReporter.log(logger,"========================  Search for Quote script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		validateesignpage = new ValidateEsignPage(driver);
		TestNGCustomReporter.log(logger,"========================  Validate Order Script Execution started ========================");
		validateesignpage.ValidateOrder();
		
		
	}
	
	@Test(enabled = false, description = "SOC-4698 FindLaw rep types will need to be mapped in SFDC to have a revenue channel assigned to the order")
	public void SOC_4698_Sales_Rep()  {
		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
		applicationLogin();
		String Sales_Rep= ExcelUtils.getDataByColumnName("Login", "Sales_Rep");
		TestNGCustomReporter.log(logger,"======================== Login to Different profile script Execution started ========================");
		searchpage= new SearchPage(driver);
		searchpage.SearchDiffProfile(Sales_Rep);	
		TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		accountpage.SearchExistAccount();
		TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		String ContactName=contactsPage.createNewContact();
		TestNGCustomReporter.log(logger,"======================== Create New Oppty script execution started ========================");
		OpptyPage optypage = new OpptyPage(driver);
		optypage.createOpty(); 
		TestNGCustomReporter.log(logger,"======================== Create Quote page script execution started ========================");
		quotepage = new QuotePage(driver);
		String QuoteId=quotepage.createQuotefrSpecificuser();
		TestNGCustomReporter.log(logger,"======================== Add Product page script execution started ========================");
		addproductspage = new AddProductsPage(driver);
		int ctrl = 7; //If ctrl = 7 then execute the add product in cart page
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
		quotepage.logoutUser();
		if (LoginPageObjects.txtBoxUsrname.size()>0) {
			basePage.loginWithValidUser();
	     }
		
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,"======================== Send For Esign page script execution started ========================");
		sendesignPage = new SendEsignPage(driver);
		sendesignPage.Send_For_Esign();
		webmailLogin();
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		esignprocesspage = new EsignProcessPage(driver);
		esignprocesspage.EsignProcess();
		TestNGCustomReporter.log(logger,"======================== SFDC Login script execution started ========================");
		applicationLogin();
		searchpage.SearchDiffProfile(Sales_Rep);
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		TestNGCustomReporter.log(logger,"========================  Esign Process page script execution started ========================");
		validateesignpage = new ValidateEsignPage(driver);
		validateesignpage.ValidateEsign();	
		TestNGCustomReporter.log(logger,"========================  Click COB page script executution started ========================");
		findlawordertoolpage = new FindLawOrderToolPage(driver);
		findlawordertoolpage.clickCOB();
		TestNGCustomReporter.log(logger,"========================  Login to Safe Page execution started ========================");
		findlawordertoolpage.loginWithSafeuserId(QuoteId);
		TestNGCustomReporter.log(logger,"========================  COB process page script executution started ========================");
		int ctrlval= 3;
		findlawordertoolpage.COBProcess(ctrlval);
		applicationLogin();
		searchpage.SearchDiffProfile(Sales_Rep);
		TestNGCustomReporter.log(logger,"========================  Search for Quote script execution started ========================");
		searchquotepage = new SearchQuotePage(driver);
		searchquotepage.SearchQuote(QuoteId);
		validateesignpage = new ValidateEsignPage(driver);
		TestNGCustomReporter.log(logger,"========================  Validate Order Script Execution started ========================");
		validateesignpage.ValidateOrder();
		
		
	}
	
	@Test(enabled = true, description = "SOC-4482 Ability to bridge IM  for only 30,60,90 days at 100 percent")
	public void test1() {
		TestNGCustomReporter.log(logger,"======================== Login Page script execution started ========================");
		applicationLogin();
		TestNGCustomReporter.log(logger,"======================== Accountpage script execution started ========================");
		accountpage = new Accountpage(driver);
		accountpage.SearchExistAccount();
		TestNGCustomReporter.log(logger,"======================== Create New Contact script execution started ========================");
		contactsPage = new ContactsPage(driver);
		String ContactName=contactsPage.createNewContact();
	}
	
}
