package tr.findlaw.pages;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.framework.asserts.AssertionHandler;
import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;
import com.framework.utils.ExcelUtils;
import com.framework.utils.StringUtils;
import tr.findlaw.objects.AddProductsPageObjects;
import tr.findlaw.objects.OpportunityPageObjects;
import tr.findlaw.objects.QuotePageObjects;

public class AddProductsPage extends BasePage{

	public AddProductsPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	public void AddProducts(int ctrl) {
		
		switch(ctrl)
		{
			case 1:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				String ProductId = (ExcelUtils.getDataByColumnName("AddProducts", "ProductId"));
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, ProductId);
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "5");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(20000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.drpdownBridge);
				elementHandler.clickElement(AddProductsPageObjects.drpdownBridge);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.txtBridgeValue);
				TestNGCustomReporter.log(logger, "Bridge applied successfully" +ReportBuilder.takesScreenshot());
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.btnReprice);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblNetAdjust);
				actionHandler.waitForSomeTime(2000);
				TestNGCustomReporter.log(logger, "Net Adjustment Amount displayed" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
			
			case 2:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				String ProductId1 = (ExcelUtils.getDataByColumnName("AddProducts", "ProductId"));
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, ProductId1);
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "5");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(20000);
				elementHandler.clickElement(AddProductsPageObjects.drpdwnAdjustType);
				actionHandler.waitForSomeTime(20000);
				elementHandler.clickElement(AddProductsPageObjects.drpdwnDiscount);
				actionHandler.waitForSomeTime(20000);
				String AdjustAmount= ExcelUtils.getDataByColumnName("AddProducts", "AdjustAmount");
				elementHandler.writeText(AddProductsPageObjects.txtAdjustAmount, AdjustAmount);
				actionHandler.waitForSomeTime(20000);
				elementHandler.clickElement(AddProductsPageObjects.btnReprice);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblNetAdjust);
				TestNGCustomReporter.log(logger, "Net Adjustment Amount displayed" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
			case 3:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				String ProductId2 = (ExcelUtils.getDataByColumnName("AddProducts", "ProductId1"));
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, ProductId2);
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "5");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(20000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.drpdwnContractTerm);
				elementHandler.clickElement(AddProductsPageObjects.drpdwnContractTerm);
				actionHandler.waitForSomeTime(2000);
				TestNGCustomReporter.log(logger, "Contract Term drop down values displayed" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.txtContract1yr);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.btnReprice);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblNetAdjust);
				TestNGCustomReporter.log(logger, "Net Adjustment Amount displayed" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
			case 4:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				List<String> listofproducts = ExcelUtils.getDataList("AddProducts", "Product_Id");
				
				for (int i=1; i<listofproducts.size(); i++)
				{
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, listofproducts.get(i));
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "5");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(20000);
				elementHandler.waitForXpathToLoad("//div[4]/div[2]/recommended-products/span/i");
				elementHandler.clickElement(AddProductsPageObjects.lblrecommendproduct, AddProductsPageObjects.lblWebchatConnect);
				actionHandler.waitForSomeTime(2000);
				TestNGCustomReporter.log(logger, "Recommended product of Web Chat option displayed for an IM Solution product" + listofproducts.get(i) +" " +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.btnAddMoreProducts, AddProductsPageObjects.txtboxSearch);
				}
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng, AddProductsPageObjects.btnFinalize);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
			case 5:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				String ProductId3 = (ExcelUtils.getDataByColumnName("AddProducts", "ProductId1"));
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, ProductId3);
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "5");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(20000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.drpdownBridge1);
				elementHandler.clickElement(AddProductsPageObjects.drpdownBridge1);
				TestNGCustomReporter.log(logger, "Bridge drop down values displayed" +ReportBuilder.takesScreenshot());
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.listBridgevalues.get(1));
				TestNGCustomReporter.log(logger, "Bridge applied successfully" +ReportBuilder.takesScreenshot());
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.btnReprice);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblNetAdjust);
				actionHandler.waitForSomeTime(2000);
				TestNGCustomReporter.log(logger, "Net Adjustment Amount displayed" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
				
			case 6:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				String ProductId6 = (ExcelUtils.getDataByColumnName("AddProducts", "ProductId"));
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, ProductId6);
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "5");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(20000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.drpdwnContractTerm);
				elementHandler.clickElement(AddProductsPageObjects.drpdwnContractTerm);
				actionHandler.waitForSomeTime(2000);
				TestNGCustomReporter.log(logger, "Contract Term drop down values displayed" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.txtContract1yr);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.btnReprice);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblNetAdjust);
				TestNGCustomReporter.log(logger, "Net Adjustment Amount displayed" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
			case 7:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				String products = ExcelUtils.getDataByColumnName("AddProducts", "ProductId");
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, products);
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "5");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate,AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng, AddProductsPageObjects.btnFinalize);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
				
			case 8:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				List<String> listofproducts1 = ExcelUtils.getDataList("AddProducts", "Product_Id1");
				
				for (int i=0; i<listofproducts1.size(); i++)
				{
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, listofproducts1.get(i));
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "6");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(25000);
				elementHandler.clickElement(AddProductsPageObjects.btnAddMoreProducts, AddProductsPageObjects.txtboxSearch);
				}
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng, AddProductsPageObjects.btnFinalize);
				actionHandler.waitForSomeTime(5000);
				elementHandler.waitForXpathToLoad("//div[4]/div[2]/recommended-products/span/i");
				elementHandler.clickElement(AddProductsPageObjects.lblrecommendproduct, AddProductsPageObjects.lblWebchatConnect);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.btnAddToCart);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
			case 9:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				List<String> listofproducts2 = ExcelUtils.getDataList("AddProducts", "Product_Id");
				
				for (int i=1; i<listofproducts2.size(); i++)
				{
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, listofproducts2.get(i));
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "5");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(20000);
				//elementHandler.waitForXpathToLoad("//div[3]/div[2]//display-actions//span[1]/button/span");
				if (AddProductsPageObjects.drpdwnBridge1.size()>0) {
				javascripthandler.scrollIntoView(AddProductsPageObjects.drpdwnBridge1.get(0));
				elementHandler.clickElement(AddProductsPageObjects.drpdwnBridge1.get(0));
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.drpdwnBridgevalues1.get(1), AddProductsPageObjects.btnAddMoreProducts);
				}
				
				if (AddProductsPageObjects.drpdwnBridge2.size()>0) {
					javascripthandler.scrollIntoView(AddProductsPageObjects.drpdwnBridge2.get(0));
					elementHandler.clickElement(AddProductsPageObjects.drpdwnBridge2.get(0));
					actionHandler.waitForSomeTime(2000);
					elementHandler.clickElement(AddProductsPageObjects.drpdwnBridgevalues1.get(1), AddProductsPageObjects.btnAddMoreProducts);
				}
				
				if (AddProductsPageObjects.drpdwnBridge3.size()>0) {
					javascripthandler.scrollIntoView(AddProductsPageObjects.drpdwnBridge3.get(0));
					elementHandler.clickElement(AddProductsPageObjects.drpdwnBridge3.get(0));
					actionHandler.waitForSomeTime(2000);
					elementHandler.clickElement(AddProductsPageObjects.drpdwnBridgevalues1.get(2), AddProductsPageObjects.btnAddMoreProducts);
				}
				
				elementHandler.clickElement(AddProductsPageObjects.btnAddMoreProducts, AddProductsPageObjects.txtboxSearch);
				}
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng, AddProductsPageObjects.btnFinalize);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
			case 10:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				List<String> listofproducts3 = ExcelUtils.getDataList("AddProducts", "Products");
				
				for (int i=0; i<listofproducts3.size(); i++)
				{
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, listofproducts3.get(i));
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				//elementHandler.waitForXpathToLoad("//catalog-product//button[1]/span[1]");
				elementHandler.clickElement(AddProductsPageObjects.btnAddToCart1);
				actionHandler.waitForSomeTime(10000);
				}
				
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(10000);
				//javascripthandler.scrollIntoView(AddProductsPageObjects.drpdwnContract1);
				elementHandler.clickElement(AddProductsPageObjects.drpdwnContract1);
				actionHandler.waitForSomeTime(2000);
				TestNGCustomReporter.log(logger, "Contract Terms displayed in the drop down list for Engagement products" +ReportBuilder.takesScreenshot());
				actionHandler.waitForSomeTime(1000);
				//javascripthandler.scrollIntoView(AddProductsPageObjects.drpdwnContract2);
				elementHandler.waitforElement(AddProductsPageObjects.drpdwnContract2);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.drpdwnContract2);
				actionHandler.waitForSomeTime(2000);
				TestNGCustomReporter.log(logger, "Contract Terms drop down list displayed as blank for OTC products" +ReportBuilder.takesScreenshot());
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//button[@class='button Finalize active-true']");
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
			case 11:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				String ProductId4 = (ExcelUtils.getDataByColumnName("AddProducts", "ProductId1"));
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, ProductId4);
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "5");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(20000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.drpdwnBridge11);
				elementHandler.clickElement(AddProductsPageObjects.drpdwnBridge11);
				TestNGCustomReporter.log(logger, "Bridge drop down values displayed" +ReportBuilder.takesScreenshot());
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.drpdwnBridgevalues1.get(0));
				TestNGCustomReporter.log(logger, "Bridge applied successfully" +ReportBuilder.takesScreenshot());
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.btnReprice);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblNetAdjust);
				actionHandler.waitForSomeTime(2000);
				TestNGCustomReporter.log(logger, "Net Adjustment Amount displayed" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
			case 12:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				List<String> IMProducts = ExcelUtils.getDataList("AddProducts", "IM_Products");
				
				for (int i=0; i<IMProducts.size(); i++)
				{
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, IMProducts.get(i));
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "2");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(25000);
				elementHandler.clickElement(AddProductsPageObjects.btnAddMoreProducts, AddProductsPageObjects.txtboxSearch);
				}
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(10000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price);
				String IMSuite= elementHandler.getText(AddProductsPageObjects.lblYear23Price);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price1);
				String FSEssential= elementHandler.getText(AddProductsPageObjects.lblYear23Price1);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price2);
				String FSCatalyst = elementHandler.getText(AddProductsPageObjects.lblYear23Price2);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price3);
				String IMPresence= elementHandler.getText(AddProductsPageObjects.lblYear23Price3);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				elementHandler.waitForXpathToLoad("//span[text()='Line Items']");
				elementHandler.clickElement(AddProductsPageObjects.lnkLineItems, AddProductsPageObjects.lnkIMS );
				elementHandler.clickElement(AddProductsPageObjects.lnkIMS, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem,AddProductsPageObjects.lnkMatrxpricing );
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrxpricing, AddProductsPageObjects.lnkMatrixId);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrixId,AddProductsPageObjects.lblEntries);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblEntries);
				String price1= elementHandler.getText(AddProductsPageObjects.lblAdjustmntAmt);
				ReportBuilder.takesScreenshot();
				String val_1= IMSuite.replace("USD", "").replace("\\s", "").replace(",", "").replaceAll("\\.0*$", "");
				String val_2=price1.replace(",", "").replaceAll("\\.0*$", "");
				AssertionHandler.verifyTrue(val_1.contains(val_2));
				TestNGCustomReporter.log(logger, "IMsuite Price2-3 value got matched sccessfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				
				elementHandler.clickElement(AddProductsPageObjects.lnkIME, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem,AddProductsPageObjects.lnkMatrxpricing );
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrxpricing, AddProductsPageObjects.lnkMatrixId);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrixId,AddProductsPageObjects.lblEntries);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblEntries);
				String price2= elementHandler.getText(AddProductsPageObjects.lblAdjustmntAmt);
				String val_3= FSEssential.replace("USD", "").replace("\\s", "").replace(",", "").replaceAll("\\.0*$", "");
				String val_4= price2.replace(",", "").replaceAll("\\.0*$", "");
				AssertionHandler.verifyTrue(val_3.contains(val_4));
				TestNGCustomReporter.log(logger, "FSEssential Price2-3 values matched properly");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				
				elementHandler.clickElement(AddProductsPageObjects.lnkIMC, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem,AddProductsPageObjects.lnkMatrxpricing );
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrxpricing, AddProductsPageObjects.lnkMatrixId);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrixId,AddProductsPageObjects.lblEntries);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblEntries);
				String price3= elementHandler.getText(AddProductsPageObjects.lblAdjustmntAmt);
				TestNGCustomReporter.log(logger, "FSCatalyst price2-3 values matched properly");
				String val_5= FSCatalyst.replace("USD", "").replace("\\s", "").replace(",", "").replaceAll("\\.0*$", "");
				String val_6= price3.replace(",", "").replaceAll("\\.0*$", "");
				AssertionHandler.verifyTrue(val_5.contains(val_6));
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				
				elementHandler.clickElement(AddProductsPageObjects.lnkIMP, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem,AddProductsPageObjects.lnkMatrxpricing );
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrxpricing, AddProductsPageObjects.lnkMatrixId);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrixId,AddProductsPageObjects.lblEntries);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblEntries);
				String price4= elementHandler.getText(AddProductsPageObjects.lblAdjustmntAmt);
				TestNGCustomReporter.log(logger, "IMPresence price2-3 values matched properly");
				String val_7= IMPresence.replace("USD", "").replace("\\s", "").replace(",", "").replaceAll("\\.0*$", "");
				String val_8= price4.replace(",", "").replaceAll("\\.0*$", "");
				AssertionHandler.verifyTrue(val_7.contains(val_8));		
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				break;
				
				
				
			case 13:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				List<String> FirmsiteProducts = ExcelUtils.getDataList("AddProducts", "Firmsite_Products");
				
				for (int i=0; i<FirmsiteProducts.size(); i++)
				{
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, FirmsiteProducts.get(i));
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "2");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(25000);
				elementHandler.clickElement(AddProductsPageObjects.btnAddMoreProducts, AddProductsPageObjects.txtboxSearch);
				}
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(10000);
				elementHandler.waitForXpathToLoad("//tr[1]/td[1]//ul[1]/li[2]/p/a");
				elementHandler.clickElement(AddProductsPageObjects.lblShowOptions);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price4);
				String FirmsiteI= elementHandler.getText(AddProductsPageObjects.lblYear23Price4);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price5);
				String CustContent= elementHandler.getText(AddProductsPageObjects.lblYear23Price5);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price6);
				String IntkForm= elementHandler.getText(AddProductsPageObjects.lblYear23Price6);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price7);
				String Search= elementHandler.getText(AddProductsPageObjects.lblYear23Price7);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price8);
				String Video= elementHandler.getText(AddProductsPageObjects.lblYear23Price8);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price9);
				String Starter= elementHandler.getText(AddProductsPageObjects.lblYear23Price9);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price0);
				String FirmsiteMbl= elementHandler.getText(AddProductsPageObjects.lblYear23Price0);
				elementHandler.clickElement(AddProductsPageObjects.lblShowOptions1);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price_1);
				String FirmsiteStart= elementHandler.getText(AddProductsPageObjects.lblYear23Price_1);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price_2);
				String IntForm= elementHandler.getText(AddProductsPageObjects.lblYear23Price_2);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price_3);
				String FirmsiteII= elementHandler.getText(AddProductsPageObjects.lblYear23Price_3);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price_4);
				String SearchII= elementHandler.getText(AddProductsPageObjects.lblYear23Price_4);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price_5);
				String CustCont = elementHandler.getText(AddProductsPageObjects.lblYear23Price_5);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price_6);
				String Video1= elementHandler.getText(AddProductsPageObjects.lblYear23Price_6);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price_7);
				String Starter2= elementHandler.getText(AddProductsPageObjects.lblYear23Price_7);
				elementHandler.clickElement(AddProductsPageObjects.lblShowOptions2);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price_8);
				String FirmsiteStart2= elementHandler.getText(AddProductsPageObjects.lblYear23Price_8);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Price_9);
				String Intkfom= elementHandler.getText(AddProductsPageObjects.lblYear23Price_9);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Prc);
				String Accelerate= elementHandler.getText(AddProductsPageObjects.lblYear23Prc);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Prc1);
				String FirmsiteIII= elementHandler.getText(AddProductsPageObjects.lblYear23Prc1);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Prc2);
				String SrchIII= elementHandler.getText(AddProductsPageObjects.lblYear23Prc2);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Prc3);
				String Cust1= elementHandler.getText(AddProductsPageObjects.lblYear23Prc3);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Prc4);
				String Video3= elementHandler.getText(AddProductsPageObjects.lblYear23Prc4);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Prc5);
				String Starter3= elementHandler.getText(AddProductsPageObjects.lblYear23Prc5);
				elementHandler.clickElement(AddProductsPageObjects.lblShowOptions3);
				actionHandler.waitForSomeTime(5000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Prc6);
				String Firmsite3= elementHandler.getText(AddProductsPageObjects.lblYear23Prc6);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Prc7);
				String Intk1= elementHandler.getText(AddProductsPageObjects.lblYear23Prc7);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Prc8);
				String Accelert= elementHandler.getText(AddProductsPageObjects.lblYear23Prc8);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYear23Prc9);
				String Firmsite4= elementHandler.getText(AddProductsPageObjects.lblYear23Prc9);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYr23Prc1);
				String Search3= elementHandler.getText(AddProductsPageObjects.lblYr23Prc1);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYr23Prc2);
				String Cust2= elementHandler.getText(AddProductsPageObjects.lblYr23Prc2);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYr23Prc3);
				String Video4= elementHandler.getText(AddProductsPageObjects.lblYr23Prc3);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblYr23Prc4);
				String Starter4= elementHandler.getText(AddProductsPageObjects.lblYr23Prc4);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				elementHandler.waitForXpathToLoad("//span[text()='Line Items']");
				elementHandler.clickElement(AddProductsPageObjects.lnkLineItems, AddProductsPageObjects.lnkGoToList);
				elementHandler.clickElement(AddProductsPageObjects.lnkGoToList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[3]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOption1, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String val1= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				System.out.println(val1);
				System.out.println(FirmsiteI  +"Firmsuite");
				AssertionHandler.verifyEquals(val1, FirmsiteI, "FirmSite I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Firmsite I option of Firmsite 111C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				actionHandler.waitForSomeTime(2000);
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOption2,AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String val2= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(val2, CustContent, "Cust Content I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Cust Content I option of Firmsite 111C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOption3, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String val3= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(val3, IntkForm, "Intk Form I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Intk Form option of Firmsite 111C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOption4, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String val4= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(val4,Search, "Search mkt I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Search Mkt option of Firmsite 111C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOption5, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String val5= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(val5,Video, "Video Host I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Video Host option of Firmsite 111C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOption6, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem,AddProductsPageObjects.lnkMatrxpricing );
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrxpricing, AddProductsPageObjects.lnkMatrixId);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrixId, AddProductsPageObjects.lblEntries);
				actionHandler.waitForSomeTime(2000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblEntries);
				//DecimalFormat df = new DecimalFormat("##.00");
			   // String val6 = df.format(elementHandler.getText(AddProductsPageObjects.lblAdjustAmt));
				actionHandler.waitForSomeTime(5000);
				//AssertionHandler.verifyTrue(Starter.contains(val6), "Video Host I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Starter profile option of Firmsite 111C product matched successfully" +ReportBuilder.takesScreenshot());
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOption7, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String val7= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(val7,FirmsiteMbl , "FirmSite Mobile Starter I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Firmsite Mobile option of Firmsite 111C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOption8, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String val8= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(val8,FirmsiteStart , "FirmSite Mobile Starter I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Firmsite Mobile option of Firmsite 222C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOption9, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String val9= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(val9, IntForm, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price forIntk Form option of Firmsite 222C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOptn, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String val12= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(val12,FirmsiteII , "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Firmsite II option of Firmsite 222C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOptn1, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String value1= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(value1,SearchII , "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Search Mkt II option of Firmsite 222C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOptn2, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String value2= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(value2, CustCont , "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Cust Content II option of Firmsite 222C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOptn3, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String value3= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(value3, Video1 , "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Video Host option of Firmsite 222C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOptn4, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem,AddProductsPageObjects.lnkMatrxpricing );
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrxpricing, AddProductsPageObjects.lnkMatrixId);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrixId, AddProductsPageObjects.lblEntries);
				actionHandler.waitForSomeTime(2000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblEntries);
				//DecimalFormat df1 = new DecimalFormat("##.00");
			    //String value4 = df1.format(elementHandler.getText(AddProductsPageObjects.lblAdjustAmt));
				actionHandler.waitForSomeTime(5000);
				//AssertionHandler.verifyTrue(Starter2.contains(value4), "Video Host I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Starter profile option of Firmsite 111C product matched successfully" +ReportBuilder.takesScreenshot());
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOptn5, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String value5= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(value5, FirmsiteStart2 , "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Firmsite Mobile option of Firmsite 333C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOptn6, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String value6= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(value6,Intkfom, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Intk Form option of Firmsite 333C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOptn7, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String value7= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(value7,Accelerate, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Accelerated Web option of Firmsite 333C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOptn8, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String value8= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(value8,FirmsiteIII, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for FirmsiteIII option of Firmsite 333C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOptn9, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String value9= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(value9,SrchIII, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Search MKT III option of Firmsite 333C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOpt1, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String lblvalue1= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(lblvalue1,Cust1, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Cust Content III option of Firmsite 333C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOpt2, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String lblvalue2= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(lblvalue2,Video3, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Video Host option of Firmsite 333C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOpt3, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem,AddProductsPageObjects.lnkMatrxpricing );
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrxpricing, AddProductsPageObjects.lnkMatrixId);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrixId, AddProductsPageObjects.lblEntries);
				actionHandler.waitForSomeTime(2000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblEntries);
				//DecimalFormat df2 = new DecimalFormat("##.00");
			   /// String lblvalue3 = df2.format(elementHandler.getText(AddProductsPageObjects.lblAdjustAmt));
				actionHandler.waitForSomeTime(5000);
				//AssertionHandler.verifyTrue(Starter3.contains(lblvalue3), "Video Host I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Starter profile option of Firmsite 111C product matched successfully" +ReportBuilder.takesScreenshot());
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOpt4, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String lblvalue4= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(lblvalue4,Firmsite3, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Firmsite Mobile option of Firmsite 444C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOpt5, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String lblvalue5= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(lblvalue5,Intk1, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Intk Form option of Firmsite 444C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOpt6, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String lblvalue6= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(lblvalue6,Accelert, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Accelerated Web option of Firmsite 444C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOpt7, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String lblvalue7= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(lblvalue7,Firmsite4, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Firmsite IV option of Firmsite 444C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOpt8, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String lblvalue8= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(lblvalue8,Search3, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Search Mkt IV option of Firmsite 444C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOpt9, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String lblvalue9= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(lblvalue9,Cust2, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Cust Content IV option of Firmsite 444C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.lnkOpt, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem, AddProductsPageObjects.lblpriceList);
				actionHandler.waitForSomeTime(2000);
				elementHandler.waitForXpathToLoad("//div[@id='ep']/div[1]//td[1]/h2");
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblvalue1);
				String lblvalue= elementHandler.getText(AddProductsPageObjects.lblvalue1);
				actionHandler.waitForSomeTime(5000);
				AssertionHandler.verifyEquals(lblvalue,Video4, "FirmSite Mobile Starter II Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Firmsite Video Host of Firmsite 444C product matched successfully");
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				
				elementHandler.clickElement(AddProductsPageObjects.linkOptn, AddProductsPageObjects.lnkPriceList);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkPriceList, AddProductsPageObjects.lnkItem);
				elementHandler.clickElement(AddProductsPageObjects.lnkItem,AddProductsPageObjects.lnkMatrxpricing );
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrxpricing, AddProductsPageObjects.lnkMatrixId);
				elementHandler.clickElement(AddProductsPageObjects.lnkMatrixId, AddProductsPageObjects.lblEntries);
				actionHandler.waitForSomeTime(2000);
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblEntries);
				//DecimalFormat df3 = new DecimalFormat("##.00");
			    //String lblval = df3.format(elementHandler.getText(AddProductsPageObjects.lblAdjustAmt));
				actionHandler.waitForSomeTime(5000);
				//AssertionHandler.verifyTrue(Starter4.contains(lblval), "Video Host I Year 2-3 Price not matched properly");
				TestNGCustomReporter.log(logger, "Year 2-3 price for Starter profile option of Firmsite 111C product matched successfully" +ReportBuilder.takesScreenshot());
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				actionHandler.waitForSomeTime(2000);
				driver.navigate().back();
				elementHandler.waitForXpathToLoad("//table[@class='list']//tr[4]/td[3]/a");
				TestNGCustomReporter.log(logger, "Validation of Year 2-3 price for all products is completed" +ReportBuilder.takesScreenshot());
				break;
				
			case 14:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				List<String> FirmsiteProd = ExcelUtils.getDataList("AddProducts", "Firmsite_Products");
				
				for (int i=0; i<FirmsiteProd.size(); i++)
				{
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, FirmsiteProd.get(i));
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "2");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//div[3]/div[2]//display-actions//span[1]/button/span");
				TestNGCustomReporter.log(logger, "After adding Firmsite product" +FirmsiteProd.get(i) +"Error Message displayed" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.Checkbox, AddProductsPageObjects.btnRemove);
				elementHandler.clickElement(AddProductsPageObjects.btnRemove);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnAddMoreProducts, AddProductsPageObjects.txtboxSearch);
				actionHandler.waitForSomeTime(10000);
				}
				
				
				TestNGCustomReporter.log(logger, "Validated the Error messages for all products" +ReportBuilder.takesScreenshot());
				break;
				
			case 15:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				List<String> FirmsiteProds = ExcelUtils.getDataList("AddProducts", "Firmsite_Products");
				
				for (int i=0; i<FirmsiteProds.size(); i++)
				{
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, FirmsiteProds.get(i));
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "2");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//div[3]/div[2]//display-actions//span[1]/button/span");
				String error_msg= elementHandler.getText(AddProductsPageObjects.lblErrorMessage);
				TestNGCustomReporter.log(logger, "Error Message displayed as: " +error_msg +"contains Product description instead of Id" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.Checkbox, AddProductsPageObjects.btnRemove);
				elementHandler.clickElement(AddProductsPageObjects.btnRemove);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnAddMoreProducts, AddProductsPageObjects.txtboxSearch);
				actionHandler.waitForSomeTime(10000);
				}
				
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
			case 16:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				String product = ExcelUtils.getDataByColumnNameWithRowIndex("AddProducts", "ProductId", 3);
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, product);
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//button[@ng-click='catalogProduct.configure()']");
				elementHandler.clickElement(AddProductsPageObjects.btnConfigure);
				elementHandler.waitForXpathToLoad("//span[text()='Product Attributes']");
				elementHandler.writeText(AddProductsPageObjects.txtboxNumbAttrys, "2");
				elementHandler.clickElement(AddProductsPageObjects.tabSecondaries);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnValidate);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(25000);
				/*elementHandler.waitForXpathToLoad("//div[3]/div[2]//display-actions//span[1]/button/span");
				elementHandler.clickElement(AddProductsPageObjects.btnAddMoreProducts, AddProductsPageObjects.txtboxSearch);
				String prod1= ExcelUtils.getDataByColumnNameWithRowIndex("AddProducts", "ProductId", 5);
				elementHandler.writeText(AddProductsPageObjects.txtboxSearch, prod1);
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(25000);
				elementHandler.waitForXpathToLoad("//catalog-product//button[1]/span[1]");
				elementHandler.clickElement(AddProductsPageObjects.btnAddToCart1, AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng);
				actionHandler.waitForSomeTime(25000);*/
				javascripthandler.scrollIntoView(AddProductsPageObjects.lblNetAdjust);
				actionHandler.waitForSomeTime(2000);
				TestNGCustomReporter.log(logger, "Net Adjustment Amount displayed" +ReportBuilder.takesScreenshot());
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				actionHandler.waitForSomeTime(5000);
				elementHandler.waitForXpathToLoad("//img[@src='/resource/Proposal_Chevron_Draft']");
				TestNGCustomReporter.log(logger, "products are added to the cart" +ReportBuilder.takesScreenshot());
				break;
				
			case 17:
				javascripthandler.scrollIntoView(QuotePageObjects.lblAddProducts);
				elementHandler.clickElement(QuotePageObjects.btnAddProduct);
				elementHandler.waitForXpathToLoad(" //div[@apt-dropdown='category-selection']");
				String prod2 = ExcelUtils.getDataByColumnNameWithRowIndex("AddProducts", "ProductId", 4);
				elementHandler.clickElement(AddProductsPageObjects.btnInstalledProduct);
				actionHandler.waitForSomeTime(10000);
				elementHandler.waitForXpathToLoad("//search-assets/div/input");
				//name need to give instead id
				elementHandler.writeText(AddProductsPageObjects.txtInstalledProduct, prod2);
				actionHandler.keyboardAction(Keys.ENTER);
				actionHandler.waitForSomeTime(10000);
				elementHandler.clickElement(AddProductsPageObjects.checkbox, AddProductsPageObjects.btnRenew);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.btnRenew);
				actionHandler.waitForSomeTime(5000);
				elementHandler.clickElement(AddProductsPageObjects.radiobtnoptn, AddProductsPageObjects.btnConfirm);
				actionHandler.waitForSomeTime(2000);
				elementHandler.clickElement(AddProductsPageObjects.btnConfirm);
				actionHandler.waitForSomeTime(10000);
				elementHandler.waitForXpathToLoad("//span[text()='Go to Pricing']");
				elementHandler.clickElement(AddProductsPageObjects.btnGoToPricng, AddProductsPageObjects.btnFinalize);
				actionHandler.waitForSomeTime(20000);
				elementHandler.clickElement(AddProductsPageObjects.btnFinalize);
				break;
				
				
				default:
				TestNGCustomReporter.log(logger, "Cart page not displayed" +ReportBuilder.takesScreenshot());	
				
		}		
			
	}
	
	
}
