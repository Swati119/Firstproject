package tr.findlaw.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;
import com.framework.utils.StringUtils;

import tr.findlaw.objects.OpportunityPageObjects;
import tr.findlaw.objects.QuotePageObjects;

public class QuotePage extends BasePage{

	public QuotePage(WebDriver webDriver) {
		super(webDriver);
		
	}
	
	public String createQuote() { 
		
		elementHandler.waitforElement(QuotePageObjects.btnCreateQuote);
		actionHandler.waitForSomeTime(2000);
		elementHandler.clickElement(QuotePageObjects.btnCreateQuote,QuotePageObjects.textproposalname);
		String ProposalName = StringUtils.testDataModification(ExcelUtils.getDataByColumnName("Quote", "ProposalName"));
		elementHandler.writeText(QuotePageObjects.textproposalname, ProposalName);
		elementHandler.clickElement(QuotePageObjects.btnsave,QuotePageObjects.linkChange);
		elementHandler.waitForXpathToLoad("//div[@id='Owner_ileinner']/a[text()='[Change]']");
		elementHandler.clickElement(QuotePageObjects.linkChange);
		elementHandler.waitForXpathToLoad("//h3[text()='Select New Owner']");
		String OwnerName= ExcelUtils.getDataByColumnName("Quote", "OwnerName");
		elementHandler.writeText(QuotePageObjects.txtOwner, OwnerName);
		elementHandler.clickElement(QuotePageObjects.btnSave);
		elementHandler.waitForXpathToLoad("//input[@title='Edit']/../../../../../../div[1]/table/tbody/tr/td[2]/input[3]");
		elementHandler.clickElement(QuotePageObjects.btnEdit);
		javascripthandler.scrollIntoView(QuotePageObjects.lblApprovalSeg);
		//String ApprovalSeg=  ExcelUtils.getDataByColumnName("Quote", "ApprovalSeg");
		elementHandler.selectByVisibleText(QuotePageObjects.drpdwnApprovalSegment, "FindLaw");
		javascripthandler.scrollIntoView(QuotePageObjects.lblQuote);
		elementHandler.clickElement(QuotePageObjects.btnSave1);
		elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]/table/tbody/tr/td[1]/h2");
		String QuoteId= elementHandler.getText(QuotePageObjects.lblProposalId);
		TestNGCustomReporter.log(logger, "Quote is successfully created: " +QuoteId+ " " +ReportBuilder.takesScreenshot());
		return QuoteId;
	
		
	}
	
	public String createQuotewoOwnerchange() {
		elementHandler.waitforElement(QuotePageObjects.btnCreateQuote);
		elementHandler.clickElement(QuotePageObjects.btnCreateQuote,QuotePageObjects.textproposalname);
		String ProposalName = StringUtils.testDataModification(ExcelUtils.getDataByColumnName("Quote", "ProposalName"));
		elementHandler.writeText(QuotePageObjects.textproposalname, ProposalName);
		elementHandler.clickElement(QuotePageObjects.btnsave);
		String QuoteId= elementHandler.getText(QuotePageObjects.lblProposalId);
		TestNGCustomReporter.log(logger, "Quote is successfully created: " +QuoteId+ " " +ReportBuilder.takesScreenshot());
		return QuoteId;
		
	}
	
	public void logoutUser() {
		
		elementHandler.waitForXpathToLoad("//a[@id='globalHeaderNameMink']/b");
		elementHandler.clickElement(QuotePageObjects.navigationArrow, QuotePageObjects.linkLogout);
		actionHandler.waitForSomeTime(2000);
		elementHandler.clickElement(QuotePageObjects.linkLogout);
		TestNGCustomReporter.log(logger, "Logout successfully for the user");
	}
	
public String createQuotefrSpecificuser() { 
		
		elementHandler.waitforElement(QuotePageObjects.btnCreateQuote1);
		actionHandler.waitForSomeTime(2000);
		elementHandler.clickElement(QuotePageObjects.btnCreateQuote1,QuotePageObjects.textproposalname);
		String ProposalName = StringUtils.testDataModification(ExcelUtils.getDataByColumnName("Quote", "ProposalName"));
		elementHandler.writeText(QuotePageObjects.textproposalname, ProposalName);
		elementHandler.clickElement(QuotePageObjects.btnsave,QuotePageObjects.linkChange);
		elementHandler.waitForXpathToLoad("//div[@id='Owner_ileinner']/a[text()='[Change]']");
		elementHandler.clickElement(QuotePageObjects.linkChange);
		elementHandler.waitForXpathToLoad("//h3[text()='Select New Owner']");
		String OwnerName= ExcelUtils.getDataByColumnName("Quote", "OwnerName");
		elementHandler.writeText(QuotePageObjects.txtOwner, OwnerName);
		elementHandler.clickElement(QuotePageObjects.btnSave);
		elementHandler.waitForXpathToLoad("//input[@title='Edit']/../../../../../../div[1]/table/tbody/tr/td[2]/input[3]");
		elementHandler.clickElement(QuotePageObjects.btnEdit);
		javascripthandler.scrollIntoView(QuotePageObjects.lblApprovalSeg);
		//String ApprovalSeg=  ExcelUtils.getDataByColumnName("Quote", "ApprovalSeg");
		elementHandler.selectByVisibleText(QuotePageObjects.drpdwnApprovalSegment, "FindLaw");
		javascripthandler.scrollIntoView(QuotePageObjects.lblQuote);
		elementHandler.clickElement(QuotePageObjects.btnSave1);
		elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]/table/tbody/tr/td[1]/h2");
		String QuoteId= elementHandler.getText(QuotePageObjects.lblProposalId);
		TestNGCustomReporter.log(logger, "Quote is successfully created: " +QuoteId+ " " +ReportBuilder.takesScreenshot());
		return QuoteId;
	
		
	}

	public void ValidateNetValue() {
		windowHandler.refereshWebPage();
		elementHandler.waitForXpathToLoad("//td[@id='bodyCell']/div[4]/div[2]/div[2]//tr[8]/td[4]/div");
		String NetValue= elementHandler.getText(QuotePageObjects.lblIncremental);
		TestNGCustomReporter.log(logger, "Net Annual Value is displayed as  : " +NetValue+ " "+ ReportBuilder.takesScreenshot());
	}

}
