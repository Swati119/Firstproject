package tr.findlaw.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductsPageObjects {

	@FindBy(xpath =" //div[@apt-dropdown='category-selection']")
	public static WebElement drpdwnAllProd;
	
	@FindBy(xpath =" //input[@type='search']")
	public static WebElement txtboxSearch;
	
	@FindBy(xpath ="//button[@ng-click='catalogProduct.configure()']")
	public static WebElement btnConfigure;
	
	@FindBy(xpath ="//span[text()='Product Attributes']")
	public static WebElement lblProdAttr;
	
	@FindBy(xpath ="//div[contains(@id,'A_body')]/table/tbody/tr[2]/td[2]/a")
	public static WebElement lnkMatrixId;
	
	@FindBy(xpath ="//tbody/tr/td[1]//div[3]/label")
	public static WebElement Checkbox;
	
	@FindBy(xpath ="//cart-header//div[2]/button[2]/span")
	public static WebElement btnRemove;
	
	@FindBy(xpath ="//h3[text()='Entries']")
	public static WebElement lblEntries;
	
	@FindBy(xpath ="//div[5]/div/div/display-actions//button/span")
	public static WebElement btnSave;
	
	@FindBy(xpath ="//tbody/tr[11]/td[7]")
	public static WebElement lblAdjustmntAmt;
	
	@FindBy(xpath ="//input[@id='']")
	public static WebElement txtboxNumbAttrys;
	
	@FindBy(xpath ="//li[@ng-click='nav.showGroup(optionGroup)']/../li[2]")
	public static WebElement tabSecondaries;
	
	@FindBy(xpath ="//table/tbody/tr[5]/td[3]/a")
	public static WebElement lnkIME;
	
	@FindBy(xpath ="//table/tbody/tr[7]/td[3]/a")
	public static WebElement lnkIMC;
	
	@FindBy(xpath ="//table/tbody/tr[9]/td[3]/a")
	public static WebElement lnkIMP;
	
	@FindBy(xpath ="//span[text()='Validate']")
	public static WebElement btnValidate;
	
	@FindBy(xpath ="//span[text()='Go to Pricing']")
	public static WebElement btnGoToPricng;
	
	@FindBy(xpath ="//div[@class='system-notification']/div[1]//p[contains(@class,'no-wrap')]")
	public static WebElement lblErrorMessage;
	
	@FindBy(xpath ="//td[11]//a//span[3]")
	public static WebElement drpdownBridge;
	
	@FindBy(xpath ="//td[11]//a/span[1]")
	public static WebElement drpdownBridge1;
	
	@FindBy(xpath ="//ul[@id='ui-select-choices-2']//li[1]")
	public static WebElement txtBridgeValue;
	
	@FindBy(xpath ="//div[6]/div//ul//ul")
	public static List <WebElement> listBridgevalues;
	
	@FindBy(xpath ="//div/display-actions[2]/div/span/button")
	public static WebElement btnReprice;
	
	@FindBy(xpath ="//img[@src='/resource/Proposal_Chevron_Draft']")
	public static WebElement tabDraft;
	
	@FindBy(xpath ="//button[@class='button Finalize active-true']")
	public static WebElement btnFinalize;
	
	@FindBy(xpath ="//main-asset//td[1]//div/label")
	public static WebElement checkbox;
	
	@FindBy(xpath ="//div[contains(@id,'AssetDate')]/input")
	public static WebElement radiobtnoptn;
	
	@FindBy(xpath ="//span[text()='Confirm']")
	public static WebElement btnConfirm;
	
	@FindBy(xpath ="//button/span[text()='Renew']")
	public static WebElement btnRenew;
	
	@FindBy(xpath ="//span[text()='Installed Products']")
	public static WebElement btnInstalledProduct;
	
	@FindBy(xpath ="//search-assets/div/input")
	public static WebElement txtInstalledProduct;
	
	@FindBy(xpath ="//tr[@class='line-item-row is--open ng-scope']/td[5]/ul[1]/li//dynamic-field//a/span[3]/b")
	public static WebElement drpdwnAdjustType;
	
	@FindBy(xpath ="//tr[@class='line-item-row is--open ng-scope']/td[6]/ul[1]/li/div/div/div/div/dynamic-field/div/p[1]/input")
	public static WebElement txtAdjustAmount;
	
	@FindBy(xpath ="//div[6]/div/ul/li/ul/li[1]")
	public static WebElement drpdwnDiscount;
	
	@FindBy(xpath ="//label[text()='Net Adjustment (%)']")
	public static WebElement lblNetAdjust;
	
	@FindBy(xpath ="//td[13]//a//span[3]")
	public static WebElement drpdwnContractTerm;
	
	@FindBy(xpath ="//li[@class='ui-select-choices-group']/ul/li[1]")
	public static WebElement txtContract1yr;
	
	@FindBy(xpath ="//div[4]/div[2]/recommended-products/span/i")
	public static WebElement lblrecommendproduct;
	
	@FindBy(xpath ="//div[4]/div[2]/recommended-products//li/div[1]")
	public static WebElement lblWebchatConnect;
	
	@FindBy(xpath ="//div[3]/div[2]//display-actions//span[1]/button/span")
	public static WebElement btnAddMoreProducts;
	
	@FindBy(xpath ="//div[4]/div[2]/recommended-products//li/div[3]/button[1]")
	public static WebElement btnAddToCart;
	
	@FindBy(xpath ="//td[15]//dynamic-field//a/span[3]/b")
	public static List<WebElement> drpdwnBridge1;
	
	@FindBy(xpath ="//td[15]//dynamic-field//a/span[3]/b")
	public static WebElement drpdwnBridge11;
	
	@FindBy(xpath ="//div[6]/div/ul/li/ul/li[2]/div")
	public static List<WebElement> drpdwnBridgevalues1;
	
	@FindBy(xpath ="//tr[2]/td[15]//dynamic-field//a/span[3]/b")
	public static List<WebElement> drpdwnBridge2;
	
	@FindBy(xpath ="//tr[3]/td[15]//dynamic-field//a/span[3]/b")
	public static List<WebElement> drpdwnBridge3;
	
	@FindBy(xpath ="//catalog-product//button[1]/span[1]")
	public static WebElement btnAddToCart1;
	
	/*@FindBy(xpath ="//tr[1]//td[12]//dynamic-field//a/span[3]")
	public static WebElement drpdwnContract1;*/
	
	/*@FindBy(xpath ="//tr[2]//td[12]//dynamic-field//a/span[3]")
	public static WebElement drpdwnContract2;*/
	
	@FindBy(xpath ="//tr[1]//td[5]//dynamic-field//a/span[3]")
	public static WebElement drpdwnContract1;
	
	@FindBy(xpath ="//tr[2]//td[5]//dynamic-field//a/span[3]")
	public static WebElement drpdwnContract2;
	
	@FindBy(xpath ="//tr[1]/td[12]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price;
	
	@FindBy(xpath ="//tr[2]/td[12]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price1;
	
	@FindBy(xpath ="//tr[3]/td[12]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price2;
	
	@FindBy(xpath ="//tr[4]/td[12]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price3;
	
	@FindBy(xpath ="//span[text()='Line Items']")
	public static WebElement lnkLineItems;
	
	@FindBy(xpath ="//div[contains(@id,'V_body')]//tr[3]/td[3]/a")
	public static WebElement lnkIMS;
	
	@FindBy(xpath ="//div[@class='pShowMore']/a[2]")
	public static WebElement lnkGoToList;
	
	@FindBy(xpath ="//div[@class='listHoverLinks']/a[1]/span")
	public static WebElement lnkPriceList;
	
	@FindBy(xpath ="//div[contains(@id,'T_body')]/table/tbody/tr[2]/th/a")
	public static WebElement lnkItem;
	
	@FindBy(xpath ="//a[contains(@id,'kA_link')]/span")
	public static WebElement lnkMatrxpricing;
	
	@FindBy(xpath ="//div[@id='ep']/div[1]//td[1]/h2")
	public static WebElement lblpriceList;
	
	@FindBy(xpath ="//div[@id='ep']/div[1]//td[1]/h2")
	public static WebElement lblProductDetail;
	
	@FindBy(xpath ="//div[@id='ep']/div[2]/div[2]//tr[18]/td[2]")
	public static WebElement lblvalue1;
	
	@FindBy(xpath ="//table[@class='list']//tr[3]/td[3]/a")
	public static WebElement lnkOption1;
	
	@FindBy(xpath ="//table[@class='list']//tr[4]/td[3]/a")
	public static WebElement lnkOption2;
	
	@FindBy(xpath ="//table[@class='list']//tr[5]/td[3]/a")
	public static WebElement lnkOption3;
	
	@FindBy(xpath ="//table[@class='list']//tr[6]/td[3]/a")
	public static WebElement lnkOption4;
	
	@FindBy(xpath ="//table[@class='list']//tr[7]/td[3]/a")
	public static WebElement lnkOption5;
	
	@FindBy(xpath ="//table[@class='list']//tr[8]/td[3]/a")
	public static WebElement lnkOption6;
	
	@FindBy(xpath ="//table[@class='list']//tr[9]/td[3]/a")
	public static WebElement lnkOption7;
	
	@FindBy(xpath ="//table[@class='list']//tr[11]/td[3]/a")
	public static WebElement lnkOption8;
	
	@FindBy(xpath ="//table[@class='list']//tr[12]/td[3]/a")
	public static WebElement lnkOption9;
	
	@FindBy(xpath ="//table[@class='list']//tr[13]/td[3]/a")
	public static WebElement lnkOptn;
	
	@FindBy(xpath ="//table[@class='list']//tr[14]/td[3]/a")
	public static WebElement lnkOptn1;
	
	@FindBy(xpath ="//table[@class='list']//tr[15]/td[3]/a")
	public static WebElement lnkOptn2;
	
	@FindBy(xpath ="//table[@class='list']//tr[16]/td[3]/a")
	public static WebElement lnkOptn3;
	
	@FindBy(xpath ="//table[@class='list']//tr[17]/td[3]/a")
	public static WebElement lnkOptn4;
	
	@FindBy(xpath ="//table[@class='list']//tr[19]/td[3]/a")
	public static WebElement lnkOptn5;
	
	@FindBy(xpath ="//table[@class='list']//tr[20]/td[3]/a")
	public static WebElement lnkOptn6;
	
	@FindBy(xpath ="//table[@class='list']//tr[21]/td[3]/a")
	public static WebElement lnkOptn7;
	
	@FindBy(xpath ="//table[@class='list']//tr[22]/td[3]/a")
	public static WebElement lnkOptn8;
	
	@FindBy(xpath ="//table[@class='list']//tr[23]/td[3]/a")
	public static WebElement lnkOptn9;
	
	@FindBy(xpath ="//tbody/tr[2]/td[7]")
	public static WebElement lblAdjustAmt;
	
	@FindBy(xpath ="//table[@class='list']//tr[24]/td[3]/a")
	public static WebElement lnkOpt1;
	
	@FindBy(xpath ="//table[@class='list']//tr[25]/td[3]/a")
	public static WebElement lnkOpt2;
	
	@FindBy(xpath ="//table[@class='list']//tr[26]/td[3]/a")
	public static WebElement lnkOpt3;
	
	@FindBy(xpath ="//table[@class='list']//tr[28]/td[3]/a")
	public static WebElement lnkOpt4;
	
	@FindBy(xpath ="//table[@class='list']//tr[29]/td[3]/a")
	public static WebElement lnkOpt5;
	
	@FindBy(xpath ="//table[@class='list']//tr[30]/td[3]/a")
	public static WebElement lnkOpt6;
	
	@FindBy(xpath ="//table[@class='list']//tr[31]/td[3]/a")
	public static WebElement lnkOpt7;
	
	@FindBy(xpath ="//table[@class='list']//tr[32]/td[3]/a")
	public static WebElement lnkOpt8;
	
	@FindBy(xpath ="//table[@class='list']//tr[33]/td[3]/a")
	public static WebElement lnkOpt9;
	
	@FindBy(xpath ="//table[@class='list']//tr[34]/td[3]/a")
	public static WebElement lnkOpt;
	
	@FindBy(xpath ="//table[@class='list']//tr[35]/td[3]/a")
	public static WebElement linkOptn;
	
	@FindBy(xpath ="//tr[1]/td[1]//ul[1]/li[2]/p/a")
	public static WebElement lblShowOptions;
	
	@FindBy(xpath ="//tr[2]/td[1]//ul[1]/li[2]/p/a")
	public static WebElement lblShowOptions1;
	
	@FindBy(xpath ="//tr[3]/td[1]//ul[1]/li[2]/p/a")
	public static WebElement lblShowOptions2;
	
	@FindBy(xpath ="//tr[4]/td[1]//ul[1]/li[2]/p/a")
	public static WebElement lblShowOptions3;
	
	@FindBy(xpath ="//tr[1]/td[12]/ul[2]/li[2]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price4;
	
	@FindBy(xpath ="//tr[1]/td[12]/ul[2]/li[3]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price5;
	
	@FindBy(xpath ="//tr[1]/td[12]/ul[2]/li[4]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price6;
	
	@FindBy(xpath ="//tr[1]/td[12]/ul[2]/li[5]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price7;
	
	@FindBy(xpath ="//tr[1]/td[12]/ul[2]/li[6]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price8;
	
	@FindBy(xpath ="//tr[1]/td[12]/ul[2]/li[7]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price9;
	
	@FindBy(xpath ="//tr[1]/td[12]/ul[2]/li[8]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price0;
	
	@FindBy(xpath ="//tr[2]/td[12]/ul[2]/li[2]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price_1;
	
	@FindBy(xpath ="//tr[2]/td[12]/ul[2]/li[3]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price_2;
	
	@FindBy(xpath ="//tr[2]/td[12]/ul[2]/li[4]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price_3;
	
	@FindBy(xpath ="//tr[2]/td[12]/ul[2]/li[5]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price_4;
	
	@FindBy(xpath ="//tr[2]/td[12]/ul[2]/li[6]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price_5;
	
	@FindBy(xpath ="//tr[2]/td[12]/ul[2]/li[7]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price_6;
	
	@FindBy(xpath ="//tr[2]/td[12]/ul[2]/li[8]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price_7;
	
	@FindBy(xpath ="//tr[3]/td[12]/ul[2]/li[2]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price_8;
	
	@FindBy(xpath ="//tr[3]/td[12]/ul[2]/li[3]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Price_9;
	
	@FindBy(xpath ="//tr[3]/td[12]/ul[2]/li[4]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Prc;
	
	@FindBy(xpath ="//tr[3]/td[12]/ul[2]/li[5]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Prc1;
	
	@FindBy(xpath ="//tr[3]/td[12]/ul[2]/li[6]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Prc2;
	
	@FindBy(xpath ="//tr[3]/td[12]/ul[2]/li[7]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Prc3;
	
	@FindBy(xpath ="//tr[3]/td[12]/ul[2]/li[8]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Prc4;
	
	@FindBy(xpath ="//tr[3]/td[12]/ul[2]/li[9]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Prc5;
	
	@FindBy(xpath ="//tr[4]/td[12]/ul[2]/li[2]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Prc6;
	
	@FindBy(xpath ="//tr[4]/td[12]/ul[2]/li[3]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Prc7;
	
	@FindBy(xpath ="//tr[4]/td[12]/ul[2]/li[4]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Prc8;
	
	@FindBy(xpath ="//tr[4]/td[12]/ul[2]/li[5]/ul[1]//dynamic-field/div")
	public static WebElement lblYear23Prc9;
	
	@FindBy(xpath ="//tr[4]/td[12]/ul[2]/li[6]/ul[1]//dynamic-field/div")
	public static WebElement lblYr23Prc1;
	
	@FindBy(xpath ="//tr[4]/td[12]/ul[2]/li[7]/ul[1]//dynamic-field/div")
	public static WebElement lblYr23Prc2;
	
	@FindBy(xpath ="//tr[4]/td[12]/ul[2]/li[8]/ul[1]//dynamic-field/div")
	public static WebElement lblYr23Prc3;
	
	@FindBy(xpath ="//tr[4]/td[12]/ul[2]/li[9]/ul[1]//dynamic-field/div")
	public static WebElement lblYr23Prc4;
	
	
}
