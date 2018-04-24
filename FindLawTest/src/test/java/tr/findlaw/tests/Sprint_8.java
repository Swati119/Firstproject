package tr.findlaw.tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

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
import tr.findlaw.pages.PasswordHoldersPage;
import tr.findlaw.pages.QuotePage;
import tr.findlaw.pages.SearchQuotePage;
import tr.findlaw.pages.SendEsignPage;
import tr.findlaw.pages.ValidateEsignPage;

public class Sprint_8 extends FindlawBaseTest{
	
	   private Logger logger = LogManager.getLogger(this.getClass());
       
       @Test(enabled = false, description = "SOC-4103 Tech Only Mapping SFDC to ESI for free service days and discount for bridging")
       public void SOC_4103() {
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
                       int ctrl = 11; //If ctrl = 1 then execute the Add bridge for the product in cart page
                       addproductspage.AddProducts(ctrl);                      
                       TestNGCustomReporter.log(logger,"======================== Contact28 page script execution started ========================");
                       contact28page = new Contact28Page(driver);
                       contact28page.AddContact28(ContactName);
                       //String ProposalName=ExcelUtils.getDataByColumnName("Quote", "Name");
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
       
       
       @Test(enabled = false, description = "SOC-4470 Ability to chose contract terms available 1,2, 3, for some Engagement product model products (CPQ)")
       public void SOC_4470() {
    	   
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
                       int ctrl = 10; //If ctrl = 1 then execute the Add bridge for the product in cart page
                       addproductspage.AddProducts(ctrl);                      
                       TestNGCustomReporter.log(logger,"======================== Contact28 page script execution started ========================");
                       contact28page = new Contact28Page(driver);
                       contact28page.AddContact28(ContactName);
                       //String ProposalName=ExcelUtils.getDataByColumnName("Quote", "Name");
                       passwordholderspage = new PasswordHoldersPage(driver);
                       int ctrl1=1;
                       passwordholderspage.AddPasswordHolders(ctrl1);
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
                       int ctrlval= 4;
                       findlawordertoolpage.COBProcess(ctrlval);
                       applicationLogin();
                       TestNGCustomReporter.log(logger,"========================  Search for Quote script execution started ========================");
                       searchquotepage = new SearchQuotePage(driver);
                       searchquotepage.SearchQuote(QuoteId);
                       validateesignpage = new ValidateEsignPage(driver);
                       TestNGCustomReporter.log(logger,"========================  Validate Order Script Execution started ========================");
                       validateesignpage.ValidateOrder();         
       }

       
       @Test(enabled = false, description = "SOC-4993 CPQ Order sent to Findlaw to contain the “Net Annual Value”")
       public void SOC_4993() {
    	   
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
                       int ctrl = 7; //If ctrl = 1 then execute the Add bridge for the product in cart page
                       addproductspage.AddProducts(ctrl);                      
                       TestNGCustomReporter.log(logger,"======================== Contact28 page script execution started ========================");
                       contact28page = new Contact28Page(driver);
                       contact28page.AddContact28(ContactName);
                       //String ProposalName=ExcelUtils.getDataByColumnName("Quote", "Name");
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
                       TestNGCustomReporter.log(logger,"======================== Validate Net Value Script Execution started ========================");
                       quotepage.ValidateNetValue();
                       
                               
       }

}
