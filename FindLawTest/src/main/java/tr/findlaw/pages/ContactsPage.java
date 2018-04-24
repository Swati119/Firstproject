package tr.findlaw.pages;

import org.openqa.selenium.WebDriver;

import com.framework.asserts.AssertionHandler;
import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;
import com.framework.utils.StringUtils;

import tr.findlaw.objects.BasePageObjects;
import tr.findlaw.objects.ContactsPageObjects;
import tr.findlaw.objects.AccountPageObjects;

public class ContactsPage extends BasePage{
	
	public ContactsPage(WebDriver webDriver) {
		super(webDriver);
		
	}
	
	public String createNewContact(){
		String record = ExcelUtils.getDataByColumnName("Contacts", "Record");
		String salutation = ExcelUtils.getDataByColumnName("Contacts", "Salutation");
		String firstname= StringUtils.testDataModification(ExcelUtils.getDataByColumnName("Contacts", "FirstName"));
		String lastName= StringUtils.testDataModification(ExcelUtils.getDataByColumnName("Contacts", "LastName"));
		String eMail = ExcelUtils.getDataByColumnName("Contacts", "Email");
		elementHandler.clickElement(AccountPageObjects.linkAccountName);
		TestNGCustomReporter.log(logger, "Account Detail page displayed" +ReportBuilder.takesScreenshot());
		elementHandler.waitForXpathToLoad("//div[contains(@id,'DetailRD')]/div[2]/a[6]/span");
		elementHandler.clickElement(ContactsPageObjects.linkContacts);
		elementHandler.clickElement(ContactsPageObjects.btnNewContact);
		if (ContactsPageObjects.dropdnNewRecord.size()>0) {
		elementHandler.selectByVisibleText(ContactsPageObjects.dropdnNewRecord.get(0), record);
		elementHandler.waitForElementTobeClickable(ContactsPageObjects.btnContinue);
		elementHandler.clickElement(ContactsPageObjects.btnContinue);
		}
		TestNGCustomReporter.log(logger, "New Contact Page displayed");
		elementHandler.waitforElement(ContactsPageObjects.dropdnSalutation);
		elementHandler.selectByVisibleText(ContactsPageObjects.dropdnSalutation, salutation);
		elementHandler.writeText(ContactsPageObjects.txtboxFirstName, firstname);
		elementHandler.writeText(ContactsPageObjects.txtboxLastName, lastName);
		elementHandler.writeText(ContactsPageObjects.txtboxEmail, eMail);
		elementHandler.waitForElementTobeClickable(ContactsPageObjects.btnSave);
		elementHandler.clickElement(ContactsPageObjects.btnSave);
		actionHandler.waitForSomeTime(5000);
		elementHandler.waitForXpathToLoad("//span[text()='Opportunities']");
		String ContactName= elementHandler.getText(ContactsPageObjects.lblContactName);
		TestNGCustomReporter.log(logger, "New Contact created:" +ContactName+ " " +ReportBuilder.takesScreenshot());
		return firstname +" "+ lastName;
	}
	
	public void SearchExistContact() {
		String ContactNo = ExcelUtils.getDataByColumnName("Contacts", "Id");
		elementHandler.writeText(BasePageObjects.txtBoxSearch, ContactNo);
		TestNGCustomReporter.log(logger, "Entered Contact Number");
		elementHandler.clickElement(BasePageObjects.btnSearch);
		TestNGCustomReporter.log(logger, "Contact Page displayed");
		elementHandler.clickElement(ContactsPageObjects.lnkContact);
		elementHandler.waitForXpathToLoad("//span[text()='Opportunities']");
	}
 
	public String createCnctfordiffuser(){
		String record = ExcelUtils.getDataByColumnName("Contacts", "Record");
		String salutation = ExcelUtils.getDataByColumnName("Contacts", "Salutation");
		String firstname= StringUtils.testDataModification(ExcelUtils.getDataByColumnName("Contacts", "FirstName"));
		String lastName= StringUtils.testDataModification(ExcelUtils.getDataByColumnName("Contacts", "LastName"));
		String eMail = ExcelUtils.getDataByColumnName("Contacts", "Email");
		elementHandler.clickElement(AccountPageObjects.linkAccountName);
		TestNGCustomReporter.log(logger, "Account Detail page displayed" +ReportBuilder.takesScreenshot());
		elementHandler.waitForXpathToLoad("//span[text()='Contacts']");
		elementHandler.clickElement(ContactsPageObjects.linkContacts1);
		elementHandler.clickElement(ContactsPageObjects.btnNewContact);
		if (ContactsPageObjects.dropdnNewRecord.size()>0) {
		elementHandler.selectByVisibleText(ContactsPageObjects.dropdnNewRecord.get(0), record);
		elementHandler.waitForElementTobeClickable(ContactsPageObjects.btnContinue);
		elementHandler.clickElement(ContactsPageObjects.btnContinue);
		}
		TestNGCustomReporter.log(logger, "New Contact Page displayed");
		elementHandler.waitforElement(ContactsPageObjects.dropdnSalutation);
		elementHandler.selectByVisibleText(ContactsPageObjects.dropdnSalutation, salutation);
		elementHandler.writeText(ContactsPageObjects.txtboxFirstName, firstname);
		elementHandler.writeText(ContactsPageObjects.txtboxLastName, lastName);
		elementHandler.writeText(ContactsPageObjects.txtboxEmail, eMail);
		elementHandler.waitForElementTobeClickable(ContactsPageObjects.btnSave);
		elementHandler.clickElement(ContactsPageObjects.btnSave);
		actionHandler.waitForSomeTime(5000);
		elementHandler.waitForXpathToLoad("//span[text()='Opportunities']");
		String ContactName= elementHandler.getText(ContactsPageObjects.lblContactName);
		TestNGCustomReporter.log(logger, "New Contact created:" +ContactName+ " " +ReportBuilder.takesScreenshot());
		return firstname +" "+ lastName;
	}
	

}
