 package tr.findlaw.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.framework.handlers.JavaScriptHandler;
import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;

import tr.findlaw.objects.EsignProcessPageObjects;

public class EsignProcessPage extends BasePage {

	public EsignProcessPage(WebDriver webDriver) {
		super(webDriver);
		
	}

	public void EsignProcess() {
		
		actionHandler.waitForSomeTime(5000);
		elementHandler.waitforElement(EsignProcessPageObjects.lblUserName);
		String window= windowHandler.getParentWindow();
		elementHandler.clickElement(EsignProcessPageObjects.lblReqstForEsign, EsignProcessPageObjects.lnkReviewDocument);
		elementHandler.clickElement(EsignProcessPageObjects.lnkReviewDocument);
		actionHandler.waitForSomeTime(5000);
		windowHandler.switchToLatestWindow(EsignProcessPageObjects.lblReviewDoc);
		elementHandler.clickElement(EsignProcessPageObjects.lblReviewDoc);
		actionHandler.waitForSomeTime(2000);
		elementHandler.waitforElement(EsignProcessPageObjects.btnContinue);
		elementHandler.clickElement(EsignProcessPageObjects.btnContinue);
		actionHandler.waitForSomeTime(2000);
		elementHandler.clickElement(EsignProcessPageObjects.btnStart);
		actionHandler.waitForSomeTime(5000);
		javascripthandler.highlightElement(EsignProcessPageObjects.btnSign);
		elementHandler.waitForXpathToLoad("//div[@class='page-tabs']/div/button");
		elementHandler.clickElement(EsignProcessPageObjects.btnSign);
		if(EsignProcessPageObjects.btnAdoptnSign.size()>0)	
		elementHandler.clickElement(EsignProcessPageObjects.btnAdoptnSign.get(0));
		TestNGCustomReporter.log(logger, "Clicked on Adopt n sign button");
		actionHandler.waitForSomeTime(5000);
		elementHandler.waitForXpathToLoad("//button[@id='action-bar-btn-finish']");
		elementHandler.clickElement(EsignProcessPageObjects.btnFinish);
		TestNGCustomReporter.log(logger, "Clicked on Finalize button");
		actionHandler.waitForSomeTime(5000);
		elementHandler.clickElement(EsignProcessPageObjects.btnNoThanks);
		TestNGCustomReporter.log(logger,"Esign Process Completed" +ReportBuilder.takesScreenshot());
		actionHandler.waitForSomeTime(2000);
		windowHandler.closeWindow(window);
		windowHandler.switchToLatestWindow();
		
		}
	

}
