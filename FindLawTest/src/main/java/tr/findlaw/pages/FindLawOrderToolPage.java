package tr.findlaw.pages;

import org.openqa.selenium.WebDriver;

import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;

import tr.findlaw.objects.FindLawOrderToolPageObjects;
import tr.findlaw.objects.QuotePageObjects;
import tr.findlaw.objects.SafeLoginpageObjects;

public class FindLawOrderToolPage extends BasePage {

	public FindLawOrderToolPage(WebDriver webDriver) {
		super(webDriver);
		
	}

	public void loginWithSafeuserId(String QuoteId) {
		String userName = ExcelUtils.getDataByColumnName("Login", "Safe_UserId");
		String password = ExcelUtils.getDataByColumnName("Login", "Safe_Password");
		
		windowHandler.switchToFrame(SafeLoginpageObjects.iframe, SafeLoginpageObjects.txtSAFEUserId);
		elementHandler.writeText(SafeLoginpageObjects.txtSAFEUserId, userName, SafeLoginpageObjects.txtSAFEPassword);
		TestNGCustomReporter.log(logger, "Entered Safe User Name");
		elementHandler.writeText(SafeLoginpageObjects.txtSAFEPassword, password, SafeLoginpageObjects.btnLogin);
		TestNGCustomReporter.log(logger, "Entered safe Password");
		elementHandler.clickElement(SafeLoginpageObjects.btnLogin);
		actionHandler.waitForSomeTime(10000);
		TestNGCustomReporter.log(logger, "Clicked on Sign In button");
		windowHandler.refereshWebPage();
		windowHandler.switchToParentFrame(FindLawOrderToolPageObjects.txtOrderId);
		actionHandler.waitForSomeTime(5000);
		elementHandler.waitForIdToLoad(FindLawOrderToolPageObjects.txtOrderId);
		elementHandler.writeText(FindLawOrderToolPageObjects.txtOrderId, QuoteId,FindLawOrderToolPageObjects.btnGO);
		elementHandler.clickElement(FindLawOrderToolPageObjects.btnGO);
		actionHandler.waitForSomeTime(15000);
		
		
	}
	
	public void clickCOB() {
		javascripthandler.scrollIntoView(QuotePageObjects.btnCOB);
		elementHandler.clickElement(QuotePageObjects.btnCOB);
		actionHandler.waitForSomeTime(25000);
		//elementHandler.waitForXpathToLoad("//form[@id='safeLogin']/fieldset/div[1]/h2");	
	}
	
	
	public void COBProcess(int ctrlval) {
		switch(ctrlval)
		{
			
		case 1:
			elementHandler.waitForXpathToLoad("//a[text()='Customer Information']");
			actionHandler.waitForSomeTime(20000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.tabgeneralQues);
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctEmail);
			String Email = ExcelUtils.getDataByColumnName("COB", "Contact_Email");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctEmail, Email,
					FindLawOrderToolPageObjects.txtFmCnctPhone);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctPhone);
			String Phone = ExcelUtils.getDataByColumnName("COB", "Contact_Phone");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctPhone, Phone,
					FindLawOrderToolPageObjects.drpdwnPractiseArea);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnPractiseArea);
			actionHandler.waitForSomeTime(2000);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnPractiseArea, 2,
					FindLawOrderToolPageObjects.drpdwnLegalContent);
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnLegalContent);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnLegalContent, 2,
					FindLawOrderToolPageObjects.txtURL);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtURL);
			String URL = ExcelUtils.getDataByColumnName("COB", "URL");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtURL, URL,
					FindLawOrderToolPageObjects.txtadditionalinfo);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtadditionalinfo);
			String Additional = ExcelUtils.getDataByColumnName("COB", "Additional_Info");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtadditionalinfo, Additional,
					FindLawOrderToolPageObjects.drpdwnCustomerGoal);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCustomerGoal);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnCustomerGoal,
					FindLawOrderToolPageObjects.drpdwnCustomerGoal1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnCustomerGoal1,
					FindLawOrderToolPageObjects.txtGeographic);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtGeographic);
			String Geographic = ExcelUtils.getDataByColumnName("COB", "Geographic");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtGeographic, Geographic,
					FindLawOrderToolPageObjects.txtClient);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtClient);
			String Client = ExcelUtils.getDataByColumnName("COB", "Client");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtClient, Client,
					FindLawOrderToolPageObjects.tabproductQuestion);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.tabproductQuestion);
			elementHandler.clickElement(FindLawOrderToolPageObjects.tabproductQuestion,
					FindLawOrderToolPageObjects.btnExpand);

			elementHandler.waitForXpathToLoad("//product/expandable/div/button");
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnExpand, FindLawOrderToolPageObjects.btnExpand1);
			actionHandler.waitForSomeTime(1000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnExpand1,
					FindLawOrderToolPageObjects.drpdwnNewDomain);
			actionHandler.waitForSomeTime(2000);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnNewDomain);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnNewDomain, 1,
					FindLawOrderToolPageObjects.drpdwnStrategy);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnStrategy);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnStrategy, 1,
					FindLawOrderToolPageObjects.txtThoughtsCustomer);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtThoughtsCustomer);
			String Customer = ExcelUtils.getDataByColumnName("COB", "Customer");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtThoughtsCustomer, Customer,
					FindLawOrderToolPageObjects.btnExpand2);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnExpand2,
					FindLawOrderToolPageObjects.txtAttorneyName);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtAttorneyName);
			String Attorney_Name = ExcelUtils.getDataByColumnName("COB", "Attorney_Name");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtAttorneyName, Attorney_Name,
					FindLawOrderToolPageObjects.txtPrimaryArea);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPrimaryArea);
			String Primary_area = ExcelUtils.getDataByColumnName("COB", "Primary_area");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtPrimaryArea, Primary_area,
					FindLawOrderToolPageObjects.drpdwnFndlwpractiseArea);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFndlwpractiseArea);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnFndlwpractiseArea,
					FindLawOrderToolPageObjects.drpdwnpractiseAreavalue);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnpractiseAreavalue,
					FindLawOrderToolPageObjects.txtFndlwpractiseArea1);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFndlwpractiseArea1);
			String Prac_Area1 = ExcelUtils.getDataByColumnName("COB", "Prac_Area1");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFndlwpractiseArea1, Prac_Area1,
					FindLawOrderToolPageObjects.drpdwnfirmAccept);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnfirmAccept);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnfirmAccept, 1,
					FindLawOrderToolPageObjects.drpdwnfirmOffers);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnfirmOffers);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnfirmOffers, 1,
					FindLawOrderToolPageObjects.txtEmailAddress);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtEmailAddress);
			String Email_Add = ExcelUtils.getDataByColumnName("COB", "Email_Add");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtEmailAddress, Email_Add,
					FindLawOrderToolPageObjects.btnSave);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnSave);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnSave);
			actionHandler.waitForSomeTime(5000);

			elementHandler.clickElement(FindLawOrderToolPageObjects.btnSubmitOrder);
			actionHandler.waitForSomeTime(5000);

			windowHandler.switchToLatestWindow(FindLawOrderToolPageObjects.btnConfirm);
			actionHandler.waitForSomeTime(2000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnConfirm);
			actionHandler.waitForSomeTime(2000);
			TestNGCustomReporter.log(logger, "COB Process completed" +ReportBuilder.takesScreenshot());
			actionHandler.waitForSomeTime(2000);
			break;
			
		case 2:
			
			elementHandler.waitForXpathToLoad("//a[text()='Customer Information']");
			actionHandler.waitForSomeTime(20000);
			elementHandler.waitForXpathToLoad("//ul/li[3]/a");
			elementHandler.clickElement(FindLawOrderToolPageObjects.tabgeneralQues);
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctEmail);
			String Cont_Email = ExcelUtils.getDataByColumnName("COB", "Contact_Email");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctEmail, Cont_Email,
					FindLawOrderToolPageObjects.txtFmCnctPhone);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctPhone);
			String Phone1 = ExcelUtils.getDataByColumnName("COB", "Contact_Phone");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctPhone, Phone1,
					FindLawOrderToolPageObjects.drpdwnLegalContent1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnLegalContent1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnLegalContent1, 1,
					FindLawOrderToolPageObjects.txtFirstName);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFirstName);
			String FirstName = ExcelUtils.getDataByColumnName("COB", "First_Name");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFirstName, FirstName,
					FindLawOrderToolPageObjects.txtLastName);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtLastName);
			String LastName = ExcelUtils.getDataByColumnName("COB", "Last_Name");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtLastName, LastName,
					FindLawOrderToolPageObjects.txtEmailaddr);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtEmailaddr);
			String Email2 = ExcelUtils.getDataByColumnName("COB", "Contact_Email");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtEmailaddr, Email2,
					FindLawOrderToolPageObjects.tabproductQuestion);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.tabproductQuestion);
			elementHandler.clickElement(FindLawOrderToolPageObjects.tabproductQuestion,
					FindLawOrderToolPageObjects.btnExpand);
			
			elementHandler.waitForXpathToLoad("//product/expandable/div/button");
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnExpand, FindLawOrderToolPageObjects.btnExpand1);
			actionHandler.waitForSomeTime(1000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnExpand1,
					FindLawOrderToolPageObjects.drpdwnNewDomain);
			actionHandler.waitForSomeTime(2000);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnNewDomain);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnNewDomain, 1,
					FindLawOrderToolPageObjects.btnBlog);
					
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnBlog);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnBlog,
					FindLawOrderToolPageObjects.drpdwnStrategy);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnStrategy);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnStrategy, 1,
					FindLawOrderToolPageObjects.txtURLCustomer);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtURLCustomer);
			String url = ExcelUtils.getDataByColumnName("COB", "URL");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtURLCustomer, url,
					FindLawOrderToolPageObjects.btnLocal);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnLocal);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnLocal,
					FindLawOrderToolPageObjects.drpdwnState);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnState);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnState, 1,
					FindLawOrderToolPageObjects.drpdwnCountry);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCountry);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCountry, 1,
					FindLawOrderToolPageObjects.drpdwnblog);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnblog);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnblog, 1,
					FindLawOrderToolPageObjects.btnCusInpt);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnCusInpt);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnCusInpt,
					FindLawOrderToolPageObjects.txtCustomerprac);
			
			actionHandler.waitForSomeTime(2000);
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtCustomerprac);
			String Cusprac = ExcelUtils.getDataByColumnName("COB", "URL");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtCustomerprac, Cusprac,
					FindLawOrderToolPageObjects.txtCustomermkt);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtCustomermkt);
			String Cusmarkt = ExcelUtils.getDataByColumnName("COB", "URL");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtCustomermkt, Cusmarkt,
					FindLawOrderToolPageObjects.txtGeoStratgy);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtGeoStratgy);
			String GeoStrat = ExcelUtils.getDataByColumnName("COB", "Geographic");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtGeoStratgy, GeoStrat,
					FindLawOrderToolPageObjects.btnFirmsite);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnFirmsite);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnFirmsite,
					FindLawOrderToolPageObjects.drpdwnNewDomain1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnNewDomain1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnNewDomain1, 1,
					FindLawOrderToolPageObjects.drpdwnCustOperatn);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCustOperatn);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCustOperatn, 1,
					FindLawOrderToolPageObjects.btnStarteProfile);	
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnStarteProfile);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnStarteProfile,
					FindLawOrderToolPageObjects.txtAttorneyName1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtAttorneyName1);
			String Attr = ExcelUtils.getDataByColumnName("COB", "Geographic");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtAttorneyName1, Attr,
					FindLawOrderToolPageObjects.txtPrimaryArea1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPrimaryArea1);
			String PracArea = ExcelUtils.getDataByColumnName("COB", "Geographic");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtPrimaryArea1, PracArea,
					FindLawOrderToolPageObjects.drpdwnFLPractiseArea);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFLPractiseArea);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnFLPractiseArea,FindLawOrderToolPageObjects.drpdwnFLPractiseArea1);
			actionHandler.waitForSomeTime(2000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnFLPractiseArea1, FindLawOrderToolPageObjects.txtPracArea1);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPracArea1);
			String PracArea1 = ExcelUtils.getDataByColumnName("COB", "Additional_Info");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtPracArea1, PracArea1,
					FindLawOrderToolPageObjects.drpdwnFirmAccepts);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmAccepts);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmAccepts, 1,
					FindLawOrderToolPageObjects.drpdwnFirmOffer);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmOffer);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmOffer, 1,
					FindLawOrderToolPageObjects.txtEmail1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtEmail1);
			String Email4 = ExcelUtils.getDataByColumnName("COB", "Email_Add");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtEmail1, Email4,
					FindLawOrderToolPageObjects.btnSave);
			
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnSave);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnSave);
			actionHandler.waitForSomeTime(5000);

			elementHandler.clickElement(FindLawOrderToolPageObjects.btnSubmitOrder);
			actionHandler.waitForSomeTime(5000);

			windowHandler.switchToLatestWindow(FindLawOrderToolPageObjects.btnConfirm);
			actionHandler.waitForSomeTime(2000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnConfirm);
			actionHandler.waitForSomeTime(2000);
			TestNGCustomReporter.log(logger, "COB Process completed +ReportBuilder.takesScreenshot()");
			actionHandler.waitForSomeTime(2000);
			break;
			
		case 3:
			
			elementHandler.waitForXpathToLoad("//a[text()='Customer Information']");
			actionHandler.waitForSomeTime(20000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.tabgeneralQues);
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctEmail);
			String Email1 = ExcelUtils.getDataByColumnName("COB", "Contact_Email");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctEmail, Email1,
					FindLawOrderToolPageObjects.txtFmCnctPhone);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctPhone);
			String Phone2 = ExcelUtils.getDataByColumnName("COB", "Contact_Phone");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctPhone, Phone2,
					FindLawOrderToolPageObjects.drpdwnPractiseArea);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnPractiseArea);
			actionHandler.waitForSomeTime(2000);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnPractiseArea, 2,
					FindLawOrderToolPageObjects.drpdwnLegalContent);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnLegalContent);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnLegalContent, 2,
					FindLawOrderToolPageObjects.txtURL);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtURL);
			String URL1 = ExcelUtils.getDataByColumnName("COB", "URL");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtURL, URL1,
					FindLawOrderToolPageObjects.txtadditionalinfo);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtadditionalinfo);
			String Additional1 = ExcelUtils.getDataByColumnName("COB", "Additional_Info");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtadditionalinfo, Additional1,
					FindLawOrderToolPageObjects.drpdwnCustomerGoal);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCustomerGoal);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnCustomerGoal,
					FindLawOrderToolPageObjects.drpdwnCustomerGoal1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnCustomerGoal1,
					FindLawOrderToolPageObjects.txtGeographic);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtGeographic);
			String Geographic1 = ExcelUtils.getDataByColumnName("COB", "Geographic");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtGeographic, Geographic1,
					FindLawOrderToolPageObjects.txtClient);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtClient);
			String Client1 = ExcelUtils.getDataByColumnName("COB", "Client");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtClient, Client1,
					FindLawOrderToolPageObjects.tabproductQuestion);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.tabproductQuestion);
			elementHandler.clickElement(FindLawOrderToolPageObjects.tabproductQuestion,
					FindLawOrderToolPageObjects.btnExpand);

			elementHandler.waitForXpathToLoad("//product/expandable/div/button");
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnExpand, FindLawOrderToolPageObjects.btnExpand1);
			actionHandler.waitForSomeTime(1000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnExpand1);
			actionHandler.waitForSomeTime(2000);
			
			
			if (FindLawOrderToolPageObjects.txtAttorneyName2.size()>0) {
			elementHandler.writeText(FindLawOrderToolPageObjects.txtAttorneyName2.get(0), "Testing Test",
					FindLawOrderToolPageObjects.txtPrimaryArea2);
			
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPrimaryArea2);
			String Pri_area = ExcelUtils.getDataByColumnName("COB", "Primary_area");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtPrimaryArea2, Pri_area,
					FindLawOrderToolPageObjects.drpdwnPractisearea);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnPractisearea);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnPractisearea);
			actionHandler.waitForSomeTime(2000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnPractisevalues.get(2),FindLawOrderToolPageObjects.txtPractisearea2);
			actionHandler.waitForSomeTime(2000);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPractisearea2);
			String Prac_area = ExcelUtils.getDataByColumnName("COB", "Prac_Area1");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtPractisearea2, Prac_area,
					FindLawOrderToolPageObjects.drpdwnFirmAccepts1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmAccepts1);
			actionHandler.waitForSomeTime(2000);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmAccepts1, 1,
					FindLawOrderToolPageObjects.drpdwnFirmOffers1);
			
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmOffers1);
			actionHandler.waitForSomeTime(2000);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmOffers1, 1,
					FindLawOrderToolPageObjects.txtEmailadd);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtEmailadd);
			String txt_Email = ExcelUtils.getDataByColumnName("COB", "Contact_Email");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtEmailadd, txt_Email,
					FindLawOrderToolPageObjects.btnExpand2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnExpand2);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnExpand2,FindLawOrderToolPageObjects.drpdwnNewDomain2);
			
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnNewDomain2);
			actionHandler.waitForSomeTime(2000);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnNewDomain2, 1,
					FindLawOrderToolPageObjects.drpdownGeoStratgy1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdownGeoStratgy1);
			actionHandler.waitForSomeTime(2000);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdownGeoStratgy1, 1,
					FindLawOrderToolPageObjects.txtThoughtsCustomer);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtThoughtsCustomer);
			String cust = ExcelUtils.getDataByColumnName("COB", "Client");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtThoughtsCustomer, cust,
					FindLawOrderToolPageObjects.btnSave);
			
			
			
			}
			else{
			
				javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnNewDomain);
				elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnNewDomain, 1,
						FindLawOrderToolPageObjects.drpdwnStrategy);

				javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnStrategy);
				elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnStrategy, 1,
						FindLawOrderToolPageObjects.txtThoughtsCustomer);

				javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtThoughtsCustomer);
				String Customer1 = ExcelUtils.getDataByColumnName("COB", "Customer");
				elementHandler.writeText(FindLawOrderToolPageObjects.txtThoughtsCustomer, Customer1,
						FindLawOrderToolPageObjects.btnExpand2);
				elementHandler.clickElement(FindLawOrderToolPageObjects.btnExpand2,
						FindLawOrderToolPageObjects.txtAttorneyName);

				javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtAttorneyName);
				String Attorney_Name1 = ExcelUtils.getDataByColumnName("COB", "Attorney_Name");
				elementHandler.writeText(FindLawOrderToolPageObjects.txtAttorneyName, Attorney_Name1,
						FindLawOrderToolPageObjects.txtPrimaryArea);

				javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPrimaryArea);
				String Primary_area1 = ExcelUtils.getDataByColumnName("COB", "Primary_area");
				elementHandler.writeText(FindLawOrderToolPageObjects.txtPrimaryArea, Primary_area1,
						FindLawOrderToolPageObjects.drpdwnFndlwpractiseArea);

				javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFndlwpractiseArea);
				elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnFndlwpractiseArea,
						FindLawOrderToolPageObjects.drpdwnpractiseAreavalue);
				elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnpractiseAreavalue,
						FindLawOrderToolPageObjects.txtFndlwpractiseArea1);

				javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFndlwpractiseArea1);
				String Prac_Area2 = ExcelUtils.getDataByColumnName("COB", "Prac_Area1");
				elementHandler.writeText(FindLawOrderToolPageObjects.txtFndlwpractiseArea1, Prac_Area2,
						FindLawOrderToolPageObjects.drpdwnfirmAccept);

				javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnfirmAccept);
				elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnfirmAccept, 1,
						FindLawOrderToolPageObjects.drpdwnfirmOffers);

				javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnfirmOffers);
				elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnfirmOffers, 1,
						FindLawOrderToolPageObjects.txtEmailAddress);

				javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtEmailAddress);
				String Email_Add1 = ExcelUtils.getDataByColumnName("COB", "Email_Add");
				elementHandler.writeText(FindLawOrderToolPageObjects.txtEmailAddress, Email_Add1,
						FindLawOrderToolPageObjects.btnSave);	
				
			}
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnSave);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnSave,FindLawOrderToolPageObjects.btnSubmitOrder);
			actionHandler.waitForSomeTime(2000);
			
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnSubmitOrder);
			actionHandler.waitForSomeTime(5000);

			windowHandler.switchToLatestWindow(FindLawOrderToolPageObjects.btnConfirm);
			actionHandler.waitForSomeTime(2000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnConfirm);
			actionHandler.waitForSomeTime(2000);
			TestNGCustomReporter.log(logger, "COB Process completed +ReportBuilder.takesScreenshot()");
			actionHandler.waitForSomeTime(2000);
			break;
			
		case 4:
			elementHandler.waitForXpathToLoad("//a[text()='Customer Information']");
			actionHandler.waitForSomeTime(20000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.tabgeneralQues);
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctEmail);
			String email = ExcelUtils.getDataByColumnName("COB", "Contact_Email");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctEmail, email,
					FindLawOrderToolPageObjects.txtFmCnctPhone);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctPhone);
			String phone = ExcelUtils.getDataByColumnName("COB", "Contact_Phone");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctPhone, phone,
					FindLawOrderToolPageObjects.txturl1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txturl1);
			String url1= ExcelUtils.getDataByColumnName("COB", "URL");
			elementHandler.writeText(FindLawOrderToolPageObjects.txturl1, url1,
					FindLawOrderToolPageObjects.txtspecialinst);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtspecialinst);
			String special= ExcelUtils.getDataByColumnName("COB", "special_Inst");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtspecialinst, special,
					FindLawOrderToolPageObjects.btnSave);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnSave);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnSave,FindLawOrderToolPageObjects.btnSubmitOrder);
			actionHandler.waitForSomeTime(2000);
			
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnSubmitOrder);
			actionHandler.waitForSomeTime(5000);

			windowHandler.switchToLatestWindow(FindLawOrderToolPageObjects.btnConfirm);
			actionHandler.waitForSomeTime(2000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnConfirm);
			actionHandler.waitForSomeTime(2000);
			TestNGCustomReporter.log(logger, "COB Process completed +ReportBuilder.takesScreenshot()");
			actionHandler.waitForSomeTime(2000);
			break;
			
		case 5:
			elementHandler.waitForXpathToLoad("//a[text()='Customer Information']");
			actionHandler.waitForSomeTime(20000);
			elementHandler.waitForXpathToLoad("//ul/li[3]/a");
			elementHandler.clickElement(FindLawOrderToolPageObjects.tabgeneralQues);
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctEmail);
			String Cont_Email1 = ExcelUtils.getDataByColumnName("COB", "Contact_Email");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctEmail, Cont_Email1,
					FindLawOrderToolPageObjects.txtFmCnctPhone);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctPhone);
			String Phone3 = ExcelUtils.getDataByColumnName("COB", "Contact_Phone");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctPhone, Phone3,
					FindLawOrderToolPageObjects.drpdwnLegalContent1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnLegalContent1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnLegalContent1, 1,
					FindLawOrderToolPageObjects.txtURL2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtURL2);
			String url2 = ExcelUtils.getDataByColumnName("COB", "URL");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtURL2, url2,
					FindLawOrderToolPageObjects.txtadditionalinfo1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtadditionalinfo1);
			String add_info = ExcelUtils.getDataByColumnName("COB", "Additional_Info");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtadditionalinfo1, add_info,
					FindLawOrderToolPageObjects.drpdwnCustomerGoal2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCustomerGoal2);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnCustomerGoal2,
					FindLawOrderToolPageObjects.drpdwnCustomerGoal1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCustomerGoal1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnCustomerGoal1,
					FindLawOrderToolPageObjects.txtaddnlgeographic);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtaddnlgeographic);
			String add_geo = ExcelUtils.getDataByColumnName("COB", "Additional_Info");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtaddnlgeographic, add_geo,
					FindLawOrderToolPageObjects.txtClient1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtClient1);
			String Client2 = ExcelUtils.getDataByColumnName("COB", "Client");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtClient1, Client2,
					FindLawOrderToolPageObjects.txtFirstName);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFirstName);
			String First_Name = ExcelUtils.getDataByColumnName("COB", "First_Name");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFirstName, First_Name,
					FindLawOrderToolPageObjects.txtLastName);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtLastName);
			String Last_Name = ExcelUtils.getDataByColumnName("COB", "Last_Name");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtLastName, Last_Name,
					FindLawOrderToolPageObjects.txtEmailaddr);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtEmailaddr);
			String Email3 = ExcelUtils.getDataByColumnName("COB", "Email_Add");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtEmailaddr, Email3,
					FindLawOrderToolPageObjects.txtApproved);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtApproved);
			String Approved = ExcelUtils.getDataByColumnName("COB", "Approved");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtApproved, Approved,
					FindLawOrderToolPageObjects.tabproductQuestion);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.tabproductQuestion);
			elementHandler.clickElement(FindLawOrderToolPageObjects.tabproductQuestion,
					FindLawOrderToolPageObjects.buttonExpand1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.buttonExpand1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.buttonExpand1,
					FindLawOrderToolPageObjects.txtAttorneyName3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtAttorneyName3);
			String Attr_Name = ExcelUtils.getDataByColumnName("COB", "Attorney_Name");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtAttorneyName3, Attr_Name,
					FindLawOrderToolPageObjects.txtPrimaryArea2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPrimaryArea2);
			String Pri_Area = ExcelUtils.getDataByColumnName("COB", "Primary_area");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtPrimaryArea2, Pri_Area,
					FindLawOrderToolPageObjects.drpdwnPractisearea);
			
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnPractisearea);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnPractisearea,
					FindLawOrderToolPageObjects.drpdwnpractiseAreavalue);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnpractiseAreavalue);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnpractiseAreavalue,
					FindLawOrderToolPageObjects.txtPractisearea2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPractisearea2);
			String Pri_Area1 = ExcelUtils.getDataByColumnName("COB", "Primary_area");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtPractisearea2, Pri_Area1,
					FindLawOrderToolPageObjects.drpdwnFirmAccepts1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmAccepts1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmAccepts1, 1,
					FindLawOrderToolPageObjects.drpdwnFirmAccepts2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmAccepts2);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmAccepts2, 1,
					FindLawOrderToolPageObjects.drpdwnFirmOffers2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmOffers2);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmOffers2, 1,
					FindLawOrderToolPageObjects.txtEmail2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtEmail2);
			String email1 = ExcelUtils.getDataByColumnName("COB", "Primary_area");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtEmail2, email1,
					FindLawOrderToolPageObjects.btnPPC);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnPPC);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnPPC,
					FindLawOrderToolPageObjects.drpdwnCampaign);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCampaign);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCampaign, 1,
					FindLawOrderToolPageObjects.txtpracarea);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtpracarea);
			String prac_area = ExcelUtils.getDataByColumnName("COB", "Primary_area");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtpracarea, prac_area,
					FindLawOrderToolPageObjects.drpdwnClient);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnClient);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnClient, 1,
					FindLawOrderToolPageObjects.drpdwnTollFree);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnTollFree);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnTollFree, 2,
					FindLawOrderToolPageObjects.txtdestPhone);
			
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtdestPhone);
			String Dest_Phone = ExcelUtils.getDataByColumnName("COB", "Contact_Phone");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtdestPhone, Dest_Phone,
					FindLawOrderToolPageObjects.txtspecialinst1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtspecialinst1);
			String Spe_Inst = ExcelUtils.getDataByColumnName("COB", "Additional_Info");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtspecialinst1, Spe_Inst,
					FindLawOrderToolPageObjects.btnBlog);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnBlog);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnBlog,
					FindLawOrderToolPageObjects.drpdwnBlogFocus);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnBlogFocus);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnBlogFocus, 3,
					FindLawOrderToolPageObjects.txturl4);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txturl4);
			String url4 = ExcelUtils.getDataByColumnName("COB", "URL");
			elementHandler.writeText(FindLawOrderToolPageObjects.txturl4, url4,
					FindLawOrderToolPageObjects.btnLocal);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnLocal);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnLocal,
					FindLawOrderToolPageObjects.drpdwnState1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnState1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnState1, 3,
					FindLawOrderToolPageObjects.drpdwnCountry1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCountry1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCountry1, 2,
					FindLawOrderToolPageObjects.drpdwnBlogFocus1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnBlogFocus1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnBlogFocus1, 2,
					FindLawOrderToolPageObjects.btnCusInpt);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnCusInpt);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnCusInpt,
					FindLawOrderToolPageObjects.txtShownClient);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtShownClient);
			String Client3 = ExcelUtils.getDataByColumnName("COB", "Client");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtShownClient, Client3,
					FindLawOrderToolPageObjects.txtCustomer);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtCustomer);
			String Customer2 = ExcelUtils.getDataByColumnName("COB", "Customer");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtCustomer, Customer2,
					FindLawOrderToolPageObjects.txtCustmarkt);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtCustmarkt);
			String Customer3 = ExcelUtils.getDataByColumnName("COB", "Customer");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtCustmarkt, Customer3,
					FindLawOrderToolPageObjects.txtGeoStart);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtGeoStart);
			String Geo_Start = ExcelUtils.getDataByColumnName("COB", "Strategy");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtGeoStart, Geo_Start,
					FindLawOrderToolPageObjects.buttonExpand2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.buttonExpand2);
			elementHandler.clickElement(FindLawOrderToolPageObjects.buttonExpand2,
					FindLawOrderToolPageObjects.btnsubExpand1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnsubExpand1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnsubExpand1,
					FindLawOrderToolPageObjects.txtAttorney);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtAttorney);
			String Attorney = ExcelUtils.getDataByColumnName("COB", "Attorney_Name");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtAttorney, Attorney,
					FindLawOrderToolPageObjects.txtPriarea);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPriarea);
			String area1 = ExcelUtils.getDataByColumnName("COB", "Primary_area");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtPriarea, area1,
					FindLawOrderToolPageObjects.drpdwnpracarea);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnpracarea);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnpracarea,
					FindLawOrderToolPageObjects.drpdwnpractiseAreavalue);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnpractiseAreavalue);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnpractiseAreavalue,
					FindLawOrderToolPageObjects.txtpracarea1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtpracarea1);
			String area2 = ExcelUtils.getDataByColumnName("COB", "Primary_area");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtpracarea1, area2,
					FindLawOrderToolPageObjects.drpdwnCustomer);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCustomer);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCustomer, 1,
					FindLawOrderToolPageObjects.drpdwnFirmAccept);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmAccept);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmAccept, 1,
					FindLawOrderToolPageObjects.drpdwnFirmOffer1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmOffer1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmOffer1, 1,
					FindLawOrderToolPageObjects.txtEmail);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtEmail);
			String email2 = ExcelUtils.getDataByColumnName("COB", "Email_Add");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtEmail, email2,
					FindLawOrderToolPageObjects.btnPPC1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnPPC1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnPPC1,
					FindLawOrderToolPageObjects.drpdwnCampaign1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCampaign1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCampaign1, 1,
					FindLawOrderToolPageObjects.txtpracarea2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtpracarea2);
			String area3 = ExcelUtils.getDataByColumnName("COB", "Prac_Area1");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtpracarea2, area3,
					FindLawOrderToolPageObjects.drpdwnClient2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnClient2);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnClient2, 1,
					FindLawOrderToolPageObjects.drpdwnTolFree1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnTolFree1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnTolFree1, 1,
					FindLawOrderToolPageObjects.txtDestPh);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtDestPh);
			String phone4 = ExcelUtils.getDataByColumnName("COB", "Contact_Phone");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtDestPh, phone4,
					FindLawOrderToolPageObjects.txtsplInst);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtsplInst);
			String inst = ExcelUtils.getDataByColumnName("COB", "special_Inst");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtsplInst, inst,
					FindLawOrderToolPageObjects.btnBlog2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnBlog2);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnBlog2,
					FindLawOrderToolPageObjects.drpdwnBlogFocus2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnBlogFocus2);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnBlogFocus2, 2,
					FindLawOrderToolPageObjects.txturl3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txturl3);
			String url5 = ExcelUtils.getDataByColumnName("COB", "URL");
			elementHandler.writeText(FindLawOrderToolPageObjects.txturl3, url5,
					FindLawOrderToolPageObjects.btnLocal2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnLocal2);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnLocal2,
					FindLawOrderToolPageObjects.drpdwnState2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnState2);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnState2, 1,
					FindLawOrderToolPageObjects.drpdwnCountry2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCountry2);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCountry2, 1,
					FindLawOrderToolPageObjects.drpdwnBlogFucs);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnBlogFucs);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnBlogFucs, 1,
					FindLawOrderToolPageObjects.btnCusInp2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnCusInp2);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnCusInp2,
					FindLawOrderToolPageObjects.txtClient4);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtClient4);
			String Client5 = ExcelUtils.getDataByColumnName("COB", "Client");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtClient4, Client5,
					FindLawOrderToolPageObjects.txtCust2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtCust2);
			String cust = ExcelUtils.getDataByColumnName("COB", "Client");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtCust2, cust,
					FindLawOrderToolPageObjects.txtCustmarkt1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtCustmarkt1);
			String cust1 = ExcelUtils.getDataByColumnName("COB", "special_Inst");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtCustmarkt1, cust1,
					FindLawOrderToolPageObjects.txtGeoStart2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtGeoStart2);
			String geo = ExcelUtils.getDataByColumnName("COB", "Strategy");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtGeoStart2, geo,
					FindLawOrderToolPageObjects.buttonExpand3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.buttonExpand3);
			elementHandler.clickElement(FindLawOrderToolPageObjects.buttonExpand3,
					FindLawOrderToolPageObjects.btnsub1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnsub1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnsub1,
					FindLawOrderToolPageObjects.drpdwnCustomer1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCustomer1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCustomer1, 1,
					FindLawOrderToolPageObjects.btnBlog3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnBlog3);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnBlog3,
					FindLawOrderToolPageObjects.drpdwnBlogFocus3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnBlogFocus3);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnBlogFocus3, 3,
					FindLawOrderToolPageObjects.txtURLCust);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtURLCust);
			String url_cust = ExcelUtils.getDataByColumnName("COB", "URL");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtURLCust, url_cust,
					FindLawOrderToolPageObjects.btnLocal4);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnLocal4);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnLocal4,
					FindLawOrderToolPageObjects.drpdwnState3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnState3);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnState3, 1,
					FindLawOrderToolPageObjects.drpdwnCountry3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCountry3);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCountry3, 1,
					FindLawOrderToolPageObjects.drpdwnBlogFcs);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnBlogFcs);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnBlogFcs, 1,
					FindLawOrderToolPageObjects.btnCusInp3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnCusInp3);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnCusInp3,
					FindLawOrderToolPageObjects.txtCust3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtCust3);
			String cust2 = ExcelUtils.getDataByColumnName("COB", "Customer");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtCust3, cust2,
					FindLawOrderToolPageObjects.txtCustMarkt);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtCustMarkt);
			String mrkt = ExcelUtils.getDataByColumnName("COB", "Customer");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtCustMarkt, mrkt,
					FindLawOrderToolPageObjects.txtgeostrat);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtgeostrat);
			String strat = ExcelUtils.getDataByColumnName("COB", "Strategy");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtgeostrat, strat,
					FindLawOrderToolPageObjects.btnFirmsite1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnFirmsite1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnFirmsite1,
					FindLawOrderToolPageObjects.drpdwnNewDomain3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnNewDomain3);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnNewDomain3, 1,
					FindLawOrderToolPageObjects.drpdwnCustOpe);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCustOpe);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCustOpe, 1,
					FindLawOrderToolPageObjects.btnStrProfile);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnStrProfile);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnStrProfile,
					FindLawOrderToolPageObjects.txtAttrName2);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtAttrName2);
			String Attrname = ExcelUtils.getDataByColumnName("COB", "Attorney_Name");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtAttrName2, Attrname,
					FindLawOrderToolPageObjects.txtPriPracarea);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPriPracarea);
			String Prac_area = ExcelUtils.getDataByColumnName("COB", "Prac_Area1");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtPriPracarea, Prac_area,
					FindLawOrderToolPageObjects.drpdwnPracarea);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnPracarea);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnPracarea,
					FindLawOrderToolPageObjects.drpdwnFLPractiseArea1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFLPractiseArea1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnFLPractiseArea1,
					FindLawOrderToolPageObjects.txtFndLwPracarea);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFndLwPracarea);
			String Prac_area1 = ExcelUtils.getDataByColumnName("COB", "Prac_Area1");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFndLwPracarea, Prac_area1,
					FindLawOrderToolPageObjects.drpdwnFirmAccept1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmAccept1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmAccept1, 1,
					FindLawOrderToolPageObjects.drpdwnFirmOffr);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFirmOffr);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFirmOffr, 1,
					FindLawOrderToolPageObjects.txteml1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txteml1);
			String eml = ExcelUtils.getDataByColumnName("COB", "Contact_Email");
			elementHandler.writeText(FindLawOrderToolPageObjects.txteml1, eml,
					FindLawOrderToolPageObjects.buttonExpand4);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.buttonExpand4);
			elementHandler.clickElement(FindLawOrderToolPageObjects.buttonExpand4,
					FindLawOrderToolPageObjects.btnsubexpand);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnsubexpand);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnsubexpand,
					FindLawOrderToolPageObjects.drpdwnCustElect);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCustElect);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCustElect, 1,
					FindLawOrderToolPageObjects.btnPPC3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnPPC3);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnPPC3,
					FindLawOrderToolPageObjects.drpdwnClient4);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnClient4);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnClient4, 1,
					FindLawOrderToolPageObjects.btnCusInp4);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnCusInp4);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnCusInp4,
					FindLawOrderToolPageObjects.txtCust5);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtCust5);
			elementHandler.clickElement(FindLawOrderToolPageObjects.txtCust5,
					FindLawOrderToolPageObjects.txtCustmkt);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtCustmkt);
			String mrkt1 = ExcelUtils.getDataByColumnName("COB", "Primary_area");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtCustmkt, mrkt1,
					FindLawOrderToolPageObjects.txtGeoStrat);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtGeoStrat);
			String geo_stat = ExcelUtils.getDataByColumnName("COB", "Strategy");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtGeoStrat, geo_stat,
					FindLawOrderToolPageObjects.btnFirmsite3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnFirmsite3);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnFirmsite3,
					FindLawOrderToolPageObjects.drpdwnDomain);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnDomain);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnDomain, 1,
					FindLawOrderToolPageObjects.drpdwnproMang);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnproMang);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnproMang, 1,
					FindLawOrderToolPageObjects.btnStrtprofile);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnStrtprofile);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnStrtprofile,
					FindLawOrderToolPageObjects.drpdwnHablaEs);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnHablaEs);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnHablaEs, 1,
					FindLawOrderToolPageObjects.txtAttorney5);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtAttorney5);
			String attrn = ExcelUtils.getDataByColumnName("COB", "Attorney_Name");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtAttorney5, attrn,
					FindLawOrderToolPageObjects.drpdwnFrmAttorney);
			
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFrmAttorney);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFrmAttorney, 1,
					FindLawOrderToolPageObjects.txtPriarea5);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtPriarea5);
			String area4 = ExcelUtils.getDataByColumnName("COB", "Primary_area");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtPriarea5, area4,
					FindLawOrderToolPageObjects.drpdwnPracarea3);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnPracarea3);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnPracarea3,
					FindLawOrderToolPageObjects.drpdwnFLPractiseArea1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFLPractiseArea1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnFLPractiseArea1,
					FindLawOrderToolPageObjects.drpdwnFrmAccept);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFrmAccept);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFrmAccept, 1,
					FindLawOrderToolPageObjects.drpdwnFrmoffr);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFrmoffr);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnFrmoffr, 1,
					FindLawOrderToolPageObjects.txtEmail6);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtEmail6);
			String Email6 = ExcelUtils.getDataByColumnName("COB", "Contact_Email");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtEmail6, Email6,
					FindLawOrderToolPageObjects.drpdwnContentFrm);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnContentFrm);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnContentFrm, 1,
					FindLawOrderToolPageObjects.drpdwnContentFrm1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnContentFrm1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnContentFrm1, 1,
					FindLawOrderToolPageObjects.drpdwnStateMetro);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnStateMetro);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnStateMetro, 1,
					FindLawOrderToolPageObjects.drpdwnPA);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnPA);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnPA, 1,
					FindLawOrderToolPageObjects.buttonExpand5);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.buttonExpand5);
			elementHandler.clickElement(FindLawOrderToolPageObjects.buttonExpand5,
					FindLawOrderToolPageObjects.drpdwnSpanish);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnSpanish);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnSpanish, 1,
					FindLawOrderToolPageObjects.drpdwnDesiredPrac);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnDesiredPrac);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnDesiredPrac,
					FindLawOrderToolPageObjects.drpdwnFLPractiseArea1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnFLPractiseArea1);
			elementHandler.clickElement(FindLawOrderToolPageObjects.drpdwnFLPractiseArea1,
					FindLawOrderToolPageObjects.txtChatTrans);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtChatTrans);
			String Chat = ExcelUtils.getDataByColumnName("COB", "Chat_Trans");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtChatTrans, Chat,
					FindLawOrderToolPageObjects.drpdwnLawFirm);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnLawFirm);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnLawFirm, 1,
					FindLawOrderToolPageObjects.drpdwnCustChat);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnCustChat);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnCustChat, 1,
					FindLawOrderToolPageObjects.btnSave);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.btnSave);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnSave);
			actionHandler.waitForSomeTime(5000);

			elementHandler.clickElement(FindLawOrderToolPageObjects.btnSubmitOrder);
			actionHandler.waitForSomeTime(5000);

			windowHandler.switchToLatestWindow(FindLawOrderToolPageObjects.btnConfirm);
			actionHandler.waitForSomeTime(2000);
			elementHandler.clickElement(FindLawOrderToolPageObjects.btnConfirm);
			actionHandler.waitForSomeTime(2000);
			TestNGCustomReporter.log(logger, "COB Process completed" +ReportBuilder.takesScreenshot());
			actionHandler.waitForSomeTime(2000);
			break;
			
		case 6:
			elementHandler.waitForXpathToLoad("//a[text()='Customer Information']");
			actionHandler.waitForSomeTime(20000);
			elementHandler.waitForXpathToLoad("//ul/li[3]/a");
			elementHandler.clickElement(FindLawOrderToolPageObjects.tabgeneralQues);
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctEmail);
			String emailo = ExcelUtils.getDataByColumnName("COB", "Contact_Email");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctEmail, emailo,
					FindLawOrderToolPageObjects.txtFmCnctPhone);

			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.txtFmCnctPhone);
			String phonet = ExcelUtils.getDataByColumnName("COB", "Contact_Phone");
			elementHandler.writeText(FindLawOrderToolPageObjects.txtFmCnctPhone, phonet,
					FindLawOrderToolPageObjects.drpdwnLegalContent1);
			
			javascripthandler.scrollIntoView(FindLawOrderToolPageObjects.drpdwnLegalContent1);
			elementHandler.selectByIndex(FindLawOrderToolPageObjects.drpdwnLegalContent1, 1);
			break;
			
			
			
			default:
			TestNGCustomReporter.log(logger, "COB Page not displayed for this scenario");
			
		}
		
		

		
	}
}
