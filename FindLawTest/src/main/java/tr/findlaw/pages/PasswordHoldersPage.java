package tr.findlaw.pages;

import org.openqa.selenium.WebDriver;

import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;
import com.framework.utils.StringUtils;

import tr.findlaw.objects.PasswordHoldersPageObjects;
import tr.findlaw.objects.QuotePageObjects;

public class PasswordHoldersPage extends BasePage{

	public PasswordHoldersPage(WebDriver webDriver) {
		super(webDriver);
		
	}

	public void AddPasswordHolders(int ctrl1) {
		elementHandler.waitForXpathToLoad("//td[@id='topButtonRow']/input[7]");
		elementHandler.clickElement(QuotePageObjects.btnPasswdHolders, PasswordHoldersPageObjects.lblOnlineContacts);
		actionHandler.waitForSomeTime(5000);
		
		switch(ctrl1)
		{
			case 1:
			elementHandler.clickElement(PasswordHoldersPageObjects.btnPerSeatProducts,PasswordHoldersPageObjects.checkbox1);	
			actionHandler.waitForSomeTime(2000);
			elementHandler.clickElement(PasswordHoldersPageObjects.checkbox1,PasswordHoldersPageObjects.txtFirstName);
			actionHandler.waitForSomeTime(1000);
			String Firstname= StringUtils.testDataModification(ExcelUtils.getDataByColumnName("PassWordHolders", "First_Name"));
			elementHandler.writeText(PasswordHoldersPageObjects.txtFirstName, Firstname, PasswordHoldersPageObjects.txtLastName);
			actionHandler.waitForSomeTime(1000);
			String LastName= StringUtils.testDataModification(ExcelUtils.getDataByColumnName("PassWordHolders", "Last_Name"));
			elementHandler.writeText(PasswordHoldersPageObjects.txtLastName, LastName, PasswordHoldersPageObjects.drpdwnPosition);
			actionHandler.waitForSomeTime(1000);
			String Position= ExcelUtils.getDataByColumnName("PassWordHolders", "Position");
			elementHandler.selectByValue(PasswordHoldersPageObjects.drpdwnPosition, Position, PasswordHoldersPageObjects.drpdwnType);
			actionHandler.waitForSomeTime(1000);
			String Type= ExcelUtils.getDataByColumnName("PassWordHolders", "Type");
			elementHandler.selectByValue(PasswordHoldersPageObjects.drpdwnType, Type, PasswordHoldersPageObjects.drpdwnJuris);
			actionHandler.waitForSomeTime(1000);
			String Juris= ExcelUtils.getDataByColumnName("PassWordHolders", "Juris");
			elementHandler.selectByValue(PasswordHoldersPageObjects.drpdwnJuris, Juris, PasswordHoldersPageObjects.txtEmail1);
			actionHandler.waitForSomeTime(1000);
			String Email= ExcelUtils.getDataByColumnName("PassWordHolders", "Email");
			elementHandler.writeText(PasswordHoldersPageObjects.txtEmail1, Email, PasswordHoldersPageObjects.btnSave);
			actionHandler.waitForSomeTime(1000);
			elementHandler.clickElement(PasswordHoldersPageObjects.btnSave,QuotePageObjects.lblQuoteproposal);
			actionHandler.waitForSomeTime(5000);
			TestNGCustomReporter.log(logger, "Password Holders saved successfully");
			
	}
	
	
	}
}
