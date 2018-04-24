package tr.findlaw.pages;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;
import com.framework.utils.StringUtils;
import tr.findlaw.objects.OpportunityPageObjects;

public class OpptyPage extends BasePage {

	public OpptyPage(WebDriver webDriver) {
		super(webDriver);

	}

	public void createOpty() {
		elementHandler.waitForElementTobeClickable(OpportunityPageObjects.linkOpty);
		elementHandler.clickElement(OpportunityPageObjects.linkOpty);
		elementHandler.clickElement(OpportunityPageObjects.btnNewOpty);
		elementHandler.waitforElement(OpportunityPageObjects.btnContinue);
		elementHandler.clickElement(OpportunityPageObjects.btnContinue);
		elementHandler.waitforElement(OpportunityPageObjects.txtOpptyName);
		String OptyName = StringUtils.testDataModification(ExcelUtils.getDataByColumnName("Opty", "OptyName"));
		elementHandler.writeText(OpportunityPageObjects.txtOpptyName, OptyName);
		elementHandler.selectByValue(OpportunityPageObjects.dropdwnStage, "75%");
		nextDateDuedate2();
		javascripthandler.scrollIntoView(OpportunityPageObjects.lblPriceBook);
		String PriceBook = ExcelUtils.getDataByColumnName("Opty", "PriceBook");
		elementHandler.writeText(OpportunityPageObjects.txtPriceBook, PriceBook);
		javascripthandler.scrollIntoView(OpportunityPageObjects.lblOpptyInfo);
		elementHandler.clickElement(OpportunityPageObjects.btnSave);
		elementHandler.waitForXpathToLoad("//h2[text()='Opportunity Detail']");
		String OpptyName= elementHandler.getText(OpportunityPageObjects.lblOpptyName);
		TestNGCustomReporter.log(logger, "Opportunity got created: " +OpptyName+ " " +ReportBuilder.takesScreenshot());
			
	}

	public void nextDateDuedate2() {

		String CloseDate;
		Calendar cal = Calendar.getInstance();
		// adding seven days to current date
		cal.add(Calendar.DAY_OF_MONTH, 7);
		Date nextweek = cal.getTime();
		System.out.println(nextweek);
		System.out.println("Next week date will be " + toMMddyyyy(nextweek));
		CloseDate = toMMddyyyy(nextweek);
		elementHandler.writeText(OpportunityPageObjects.txtCloseDt, CloseDate);

	}

	public static String toMMddyyyy(Date day) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String date = formatter.format(day);
		return date;
	}

}
