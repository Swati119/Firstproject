package tr.findlaw.pages;

import org.openqa.selenium.WebDriver;

import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;

import tr.findlaw.objects.BasePageObjects;

public class Accountpage extends BasePage {

	public Accountpage(WebDriver webDriver) {
		super(webDriver);
		
	}

	public void SearchExistAccount() {
		String AccountNo = ExcelUtils.getDataByColumnName("Account", "Id");
		elementHandler.writeText(BasePageObjects.txtBoxSearch, AccountNo, BasePageObjects.btnSearch);
		TestNGCustomReporter.log(logger, "Entered Account Number");
		elementHandler.clickElement(BasePageObjects.btnSearch);
		TestNGCustomReporter.log(logger, "Account Searched Successfully: Account No:" +AccountNo+ " "+ReportBuilder.takesScreenshot());
	}
	
	public void SearchExistAccountfordiffprofile() {
		String AccountNo = ExcelUtils.getDataByColumnName("Account", "Id3");
		elementHandler.writeText(BasePageObjects.txtBoxSearch, AccountNo, BasePageObjects.btnSearch);
		TestNGCustomReporter.log(logger, "Entered Account Number");
		elementHandler.clickElement(BasePageObjects.btnSearch);
		TestNGCustomReporter.log(logger, "Account Searched Successfully: Account No:" +AccountNo+ " "+ReportBuilder.takesScreenshot());
	}
	
	public void SearchAccount(int ctrl1) {
		switch(ctrl1)
		{
	
		case 1:
		String AccountNo = ExcelUtils.getDataByColumnNameWithRowIndex("Account", "Id", 3);
		elementHandler.writeText(BasePageObjects.txtBoxSearch, AccountNo, BasePageObjects.btnSearch);
		TestNGCustomReporter.log(logger, "Entered Account Number");
		elementHandler.clickElement(BasePageObjects.btnSearch);
		TestNGCustomReporter.log(logger, "Account Searched Successfully: Account No:" +AccountNo+ " "+ReportBuilder.takesScreenshot());
	
		
		}
		}
	
} 
  