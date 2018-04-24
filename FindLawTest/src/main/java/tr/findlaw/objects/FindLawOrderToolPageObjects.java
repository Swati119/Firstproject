package tr.findlaw.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindLawOrderToolPageObjects {
	

	@FindBy(id="orderId")
	public static WebElement txtOrderId;
	
	@FindBy(xpath="//div[1]/form/button")
	public static WebElement btnGO;
	
	@FindBy(xpath="//div/div[1]/h2")
	public static WebElement lblCOB;
	
	@FindBy(xpath="//a[text()='Customer Information']")
	public static WebElement lnkCustomer_Info;
	
	@FindBy(xpath="//ul/li[3]/a")
	public static WebElement tabgeneralQues;
	
	@FindBy(xpath="//input[@id='textAnswer']/../../../../../../../../div[2]/div/question/div/answer/ul/li/input")
	public static WebElement txtFmCnctEmail;
	
	@FindBy(xpath="//input[@id='textAnswer']/../../../../../../../../div[3]/div/question/div/answer/ul/li/input")
	public static WebElement txtFmCnctPhone;
	
	@FindBy(xpath="//input[@id='textAnswer']/../../../../../../../../div[5]/div/question/div/answer/ul/li/select")
	public static WebElement drpdwnPractiseArea;
	
	@FindBy(xpath="//input[@id='textAnswer']/../../../../../../../../div[6]/div/question/div/answer/ul/li/select")
	public static WebElement drpdwnLegalContent;
	
	@FindBy(xpath="//ul[@id='notSubmitted']/li/select")
	public static WebElement drpdwnLegalContent1;
	
	@FindBy(xpath="//ul[@id='notSubmitted']/li/textarea")
	public static List <WebElement> txtinputs;
	
	@FindBy(xpath="//span[text()='First Name']/../../..//li/input")
	public static WebElement txtFirstName;
	
	@FindBy(xpath="//span[text()='Last Name']/../../..//li/input")
	public static WebElement txtLastName;
	
	@FindBy(xpath="//span[text()='Email address']/../../..//li/input")
	public static WebElement txtEmailaddr;
	
	@FindBy(xpath="//input[@id='textAnswer']/../../../../../../../../div[11]/div/question/div/answer/ul/li/textarea")
	public static WebElement txtURL;
	
	@FindBy(xpath="//div[16]//li/input")
	public static WebElement txtApproved;
	
	@FindBy(xpath="//ul[@id='notSubmitted']/li[2]/textarea")
	public static WebElement txtURL2;
	
	@FindBy(xpath="//div[6]//ul[@id='notSubmitted']/li/textarea")
	public static WebElement txtadditionalinfo1;
	
	@FindBy(xpath="//input[@id='textAnswer']/../../../../../../../../div[12]/div/question/div/answer/ul/li/textarea")
	public static WebElement txtadditionalinfo;
	
	@FindBy(xpath="//input[@id='textAnswer']/../../../../../../../../div[13]//div/div[1]/span")
	public static WebElement drpdwnCustomerGoal;
	
	@FindBy(xpath="//ul[@id='notSubmitted']/li//div[1]/span")
	public static WebElement drpdwnCustomerGoal2;
	
	@FindBy(xpath="//table[@id='dropdown']/tbody/tr[3]/td")
	public static WebElement drpdwnCustomerGoal1;
	
	@FindBy(xpath="//tab[3]//div[8]//li/input")
	public static WebElement txtaddnlgeographic;
	
	@FindBy(xpath="//input[@id='textAnswer']/../../../../../../../../div[14]//li/input")
	public static WebElement txtGeographic;
	
	@FindBy(xpath="//input[@id='textAnswer']/../../../../../../../../div[15]//li/textarea")
	public static WebElement txtClient;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[7]//div/ul/li[10]//li/input")
	public static WebElement txteml1;
	
	@FindBy(xpath="//ul[@id='notSubmitted']/li/textarea")
	public static WebElement txtinputs1;
	
	@FindBy(xpath="//input[@id='textAnswer']")
	public static WebElement txtinputs2;
	
	@FindBy(xpath="//div[9]//ul[@id='notSubmitted']/li/textarea")
	public static WebElement txtClient1;
	
	@FindBy(xpath="//div/div[2]/cob/div/div[4]//li[4]/a")
	public static WebElement tabproductQuestion;
	
	@FindBy(xpath="//product/expandable/div/button")
	public static WebElement btnExpand;
	
	@FindBy(xpath="//li[@class='list-no-bullet']/product/expandable[1]/div/button/span")
	public static WebElement btnExpand1;
	
	@FindBy(xpath="//li[@class='list-no-bullet']/product/expandable[2]/div/button/span")
	public static WebElement btnExpand2;
	
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//div/button/span")
	public static WebElement btnsubExpand1;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[1]//li/textarea")
	public static WebElement txtAttorney;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[4]//li/input")
	public static WebElement txtPriarea;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[5]//div/span")
	public static WebElement drpdwnpracarea;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[6]//li/input")
	public static WebElement txtpracarea1;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[1]//expandable[1]//div/ul[2]/li[1]//li/select")
	public static WebElement drpdwnNewDomain;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[8]//li/select")
	public static WebElement drpdwnCustomer;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[10]//li/select")
	public static WebElement drpdwnFirmAccept;
	
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[11]//li/select")
	public static WebElement drpdwnFirmOffer1;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[12]//li/input")
	public static WebElement txtEmail;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[2]//ul[2]/li[1]//li/select")
	public static WebElement drpdwnNewDomain2;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[1]//expandable[1]//div/ul[2]//li[3]//li/select")
	public static WebElement drpdwnStrategy;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//div//li[4]//li/textarea")
	public static WebElement txtThoughtsCustomer;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[2]//ul[2]/li[1]//li/textarea")
	public static WebElement txtAttorneyName;
	
	
	@FindBy(xpath="//div[4]//tab[4]//ul[1]//ul[2]/li[7]//div/ul/li[1]//div//li/textarea")
	public static WebElement txtAttorneyName1;
	
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable//expandable[1]//ul[2]/li[1]//li/textarea")
	public static List<WebElement> txtAttorneyName2;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable//expandable[1]//ul[2]/li[1]//li/textarea")
	public static WebElement txtAttorneyName3;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[2]//ul[2]/li[4]//li/input")
	public static WebElement txtPrimaryArea;
	
	@FindBy(xpath="//tab[4]//ul[1]//ul[2]/li[7]//div/ul/li[4]//li/input")
	public static WebElement txtPrimaryArea1;
	
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable//expandable[1]//li[4]//li/input")
	public static WebElement txtPrimaryArea2;
	
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable//expandable[1]//ul[2]/li[5]//div/span")
	public static WebElement drpdwnPractisearea;
	
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable//expandable[1]//ul[2]//li[6]//li/input")
	public static WebElement txtPractisearea2;
	
	@FindBy(xpath="//table[@id='dropdown']/tbody/tr")
	public static List<WebElement> drpdwnPractisevalues;
	
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable//expandable[1]//ul[2]//li[8]//li/select")
	public static WebElement drpdwnFirmAccepts1;
	
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable//expandable[1]//ul[2]//li[9]//li/select")
	public static WebElement drpdwnFirmOffers1;
	
	
	@FindBy(xpath="//tab[4]//li[10]//li/select")
	public static WebElement drpdwnFirmAccepts2;
	
	@FindBy(xpath="//tab[4]//li[11]//li/select")
	public static WebElement drpdwnFirmOffers2;
	
	
	@FindBy(xpath="//span[text()='PPC']/../button/span")
	public static WebElement btnPPC;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[14]//button")
	public static WebElement btnPPC1;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[14]//div/ul/li[1]//li/select")
	public static WebElement drpdwnCampaign1;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[14]//div/ul/li[3]//li/textarea")
	public static WebElement txtpracarea2;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[14]//div/ul/li[4]//li/select")
	public static WebElement drpdwnClient2;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[2]/li[16]//div/ul/li[1]//li/select")
	public static WebElement drpdwnState2;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[2]/li[17]//div/ul/li[5]//li/textarea")
	public static WebElement txtGeoStart2;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[2]/li[16]//div/ul/li[3]//li/select")
	public static WebElement drpdwnBlogFucs;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[2]/li[17]//div/ul/li[4]//li/input")
	public static WebElement txtCustmarkt1;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[2]/li[17]//button")
	public static WebElement btnCusInp2;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[2]/li[17]//div/ul/li[3]//li/textarea")
	public static WebElement txtCust2;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[2]/li[17]//div/ul/li[2]//li/textarea")
	public static WebElement txtClient4;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[2]/li[16]//div/ul/li[2]//li/select")
	public static WebElement drpdwnCountry2;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[14]//div/ul/li[6]//li/select")
	public static WebElement drpdwnTolFree1;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[14]//div/ul/li[8]//li/input")
	public static WebElement txtDestPh;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[15]//button")
	public static WebElement btnBlog2;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[15]//div/ul/li[1]//li/select")
	public static WebElement drpdwnBlogFocus2;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[2]/li[16]//button")
	public static WebElement btnLocal2;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[15]//div/ul/li[2]//li/input")
	public static WebElement txturl3;
	
	@FindBy(xpath="//tab[4]//product[2]//ul[1]//ul[2]/li[14]//div/ul/li[9]//li/input")
	public static WebElement txtsplInst;
	
	@FindBy(xpath="//tab[4]//li[14]//div/ul/li[1]//li/select")
	public static WebElement drpdwnCampaign;
	
	@FindBy(xpath="//tab[4]//li[14]//div/ul/li[3]//li/textarea")
	public static WebElement txtpracarea;
	
	@FindBy(xpath="//tab[4]//li[14]//div/ul/li[4]//li/select")
	public static WebElement drpdwnClient;
	
	@FindBy(xpath="//tab[4]//li[14]//div/ul/li[6]//li/select")
	public static WebElement drpdwnTollFree;
	
	@FindBy(xpath="//tab[4]//li[14]//div/ul/li[8]//li/input")
	public static WebElement txtdestPhone;
	
	@FindBy(xpath="//tab[4]//li[16]//div/ul/li[1]//li/select")
	public static WebElement drpdwnState1;
	
	@FindBy(xpath="//tab[4]//li[16]//div/ul/li[2]//li/select")
	public static WebElement drpdwnCountry1;
	
	@FindBy(xpath="//tab[4]//li[16]//div/ul/li[3]//li/select")
	public static WebElement drpdwnBlogFocus1;
	
	@FindBy(xpath="//tab[4]//li[17]//div/ul/li[2]//li/textarea")
	public static WebElement txtShownClient;
	
	@FindBy(xpath="//tab[4]//li[17]//div/ul/li[3]//li/textarea")
	public static WebElement txtCustomer;
	
	@FindBy(xpath="//tab[4]//li[17]//div/ul/li[4]//li/input")
	public static WebElement txtCustmarkt;
	
	@FindBy(xpath="//tab[4]//li[17]//div/ul/li[5]//li/textarea")
	public static WebElement txtGeoStart;
	
	@FindBy(xpath="//tab[4]//li[12]//li/input")
	public static WebElement txtEmail2;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable//expandable[1]//ul[2]//li[10]//li/input")
	public static WebElement txtEmailadd;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[2]//ul[2]//li[5]//li//div/span")
	public static WebElement drpdwnFndlwpractiseArea;
	
	@FindBy(xpath="//table[@id='dropdown']/tbody/tr[3]/td")
	public static WebElement drpdwnpractiseAreavalue;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[2]//ul[2]//li[6]//li/input")
	public static WebElement txtFndlwpractiseArea1;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[2]//ul[2]//li[8]//li/select")
	public static WebElement drpdwnfirmAccept;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[2]//ul[2]//li[9]//li/select")
	public static WebElement drpdwnfirmOffers;
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[2]//ul[2]//li[10]//li/input")
	public static WebElement txtEmailAddress;
	
	@FindBy(xpath="//span[text()='Blog']/..//button")
	public static WebElement btnBlog;
	
	@FindBy(xpath="//span[text()='Local']/..//button")
	public static WebElement btnLocal;
	
	@FindBy(xpath="//span[text()='Customer Input']/..//button")
	public static WebElement btnCusInpt;
	
	@FindBy(xpath="//span[text()='Firmsite']/..//button")
	public static WebElement btnFirmsite;
	
	@FindBy(xpath="//span[text()='Starter Profile']/..//button")
	public static WebElement btnStarteProfile;
	
	@FindBy(xpath="//tab[4]//ul[1]//ul[2]/li[3]//div/ul/li[2]//li/input")
	public static WebElement txtURLCustomer;
	
	@FindBy(xpath="//span[text()='Please select a state']/../../..//li/select")
	public static WebElement drpdwnState;
	
	@FindBy(xpath="//span[text()='Please select a county']/../../..//li/select")
	public static WebElement drpdwnCountry;
	
	@FindBy(xpath="//div[4]//tab[4]//ul[2]/li[5]//li[2]//li/textarea")
	public static WebElement txtCustomerprac;
	
	@FindBy(xpath="//div[4]//tab[4]//ul[2]/li[5]//li[3]//li/input")
	public static WebElement txtCustomermkt;
	
	@FindBy(xpath="//div[4]//tab[4]//ul[2]/li[5]//li[4]//li/textarea")
	public static WebElement txtGeoStratgy;
	
	
	@FindBy(xpath="//div[@class='tab-panel']//tab[4]//expandable[2]//ul[2]/li[3]//li/select")
	public static WebElement drpdownGeoStratgy1;
	
	@FindBy(xpath="//div[4]//tab[4]//ul[1]//ul[2]/li[6]//div/ul//li[5]//li/select")
	public static WebElement drpdwnCustOperatn;
	
	@FindBy(xpath="//div[4]//tab[4]//ul[2]/li[6]//div/ul/li[1]//li/select")
	public static WebElement drpdwnNewDomain1;
	
	@FindBy(xpath="//div/tab[4]//expandable//ul[2]/li[4]//li[3]//li/select")
	public static WebElement drpdwnblog;
	
	@FindBy(xpath="//span[@class='pull-right']/button[1]")
	public static WebElement btnSave;

	@FindBy(xpath="//span[@class='pull-right']/confirm-button")
	public static WebElement btnSubmitOrder;
	
	@FindBy(xpath="//button[@id='confirmBtn']")
	public static WebElement btnConfirm;
	
	@FindBy(xpath="//ul[@id='notSubmitted']/li//div/div[1]/span")
	public static WebElement drpdwnFLPractiseArea;
	
	
	@FindBy(xpath="//table[@id='dropdown']/tbody/tr[3]/td")
	public static WebElement drpdwnFLPractiseArea1;
	
	@FindBy(xpath="//tab[4]//ul[1]//ul[2]/li[7]/expandable/div/div/ul//li[8]//li/select")
	public static WebElement drpdwnFirmAccepts;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//button")
	public static WebElement btnsub1;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[4]//div/ul/li[2]//li/select")
	public static WebElement drpdwnCountry3;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[7]//button")
	public static WebElement btnStrProfile;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[7]//div/ul/li[6]//li/input")
	public static WebElement txtFndLwPracarea;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[7]//div/ul/li[9]//li/select")
	public static WebElement drpdwnFirmOffr;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[7]//div/ul/li[8]//li/select")
	public static WebElement drpdwnFirmAccept1;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[7]//div/ul/li[1]//li/textarea")
	public static WebElement txtAttrName2;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[7]//div/ul/li[5]//li//div/div[1]/span")
	public static WebElement drpdwnPracarea;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[7]//div/ul/li[4]//li/input")
	public static WebElement txtPriPracarea;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[6]//div/ul/li[5]//li/select")
	public static WebElement drpdwnCustOpe;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[5]//div/ul/li[3]//li/input")
	public static WebElement txtCustMarkt;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[6]//button")
	public static WebElement btnFirmsite1;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[6]//div/ul/li[1]//li/select")
	public static WebElement drpdwnNewDomain3;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[5]//div/ul/li[4]//li/textarea")
	public static WebElement txtgeostrat;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[4]//div/ul/li[3]//li/select")
	public static WebElement drpdwnBlogFcs;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[5]//div/ul/li[2]//li/textarea")
	public static WebElement txtCust3;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[5]//button")
	public static WebElement btnCusInp3;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[3]//button")
	public static WebElement btnBlog3;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[4]//button")
	public static WebElement btnLocal4;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[4]//div/ul/li[1]//li/select")
	public static WebElement drpdwnState3;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[1]//li/select")
	public static WebElement drpdwnCustomer1;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[3]//div/ul/li[1]//li/select")
	public static WebElement drpdwnBlogFocus3;
	
	@FindBy(xpath="//tab[4]//product[3]//ul[1]//ul[2]/li[3]//div/ul/li[2]//li/input")
	public static WebElement txtURLCust;
	
	@FindBy(xpath="//tab[4]//ul[1]//ul[2]/li[7]/expandable/div/div/ul//li[9]//li/select")
	public static WebElement drpdwnFirmOffer;
	
	@FindBy(xpath="//tab[4]//ul[1]//ul[2]/li[7]/expandable/div/div/ul//li[10]//li/input")
	public static WebElement txtEmail1;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[1]/li/product/expandable/div/button")
	public static WebElement btnsubexpand;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[12]//li//div/span")
	public static WebElement drpdwnPracarea3;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[14]//li/select")
	public static WebElement drpdwnFrmAccept;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[25]//li/select")
	public static WebElement drpdwnPA;
	
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[16]//li/input")
	public static WebElement txtEmail6;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[24]//li/select")
	public static WebElement drpdwnStateMetro;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[19]//li/select")
	public static WebElement drpdwnContentFrm;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[20]//li/select")
	public static WebElement drpdwnContentFrm1;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[15]//li/select")
	public static WebElement drpdwnFrmoffr;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[1]//ul[2]/li[5]//button")
	public static WebElement btnFirmsite3;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[4]//li/select")
	public static WebElement drpdwnHablaEs;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[11]//li/input")
	public static WebElement txtPriarea5;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[7]//li/select")
	public static WebElement drpdwnFrmAttorney;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[2]/li[6]//ul/li[5]//li/textarea")
	public static WebElement txtAttorney5;
	
	@FindBy(xpath="//tab[4]//product[4]/expandable/div/div/ul[1]/li//ul[2]/li[6]//button")
	public static WebElement btnStrtprofile;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[1]//ul[2]/li[5]//div/ul/li[4]//li/select")
	public static WebElement drpdwnproMang;
	
	@FindBy(xpath="//tab[4]//product[4]//ul[1]//ul[2]/li[5]//div/ul/li[1]//li/select")
	public static WebElement drpdwnDomain;
	
	@FindBy(xpath="//tab[4]//product[4]/expandable//ul[1]//ul[2]/li[1]//li/select")
	public static WebElement drpdwnCustElect;
	
	@FindBy(xpath="//tab[4]//product[4]/expandable//ul[1]//ul[2]/li[4]//div/ul/li[4]//li/textarea")
	public static WebElement txtGeoStrat;
	
	@FindBy(xpath="//tab[4]//product[4]/expandable//ul[1]//ul[2]/li[4]//div/ul/li[3]//li/input")
	public static WebElement txtCustmkt;
	
	@FindBy(xpath="//tab[4]//product[4]/expandable//ul[1]//ul[2]/li[4]//div/ul/li[2]//li/textarea")
	public static WebElement txtCust5;
	
	@FindBy(xpath="//tab[4]//product[4]/expandable//ul[1]//ul[2]/li[4]//button")
	public static WebElement btnCusInp4;
	
	@FindBy(xpath="//tab[4]//product[4]/expandable//ul[1]//ul[2]/li[3]//button")
	public static WebElement btnPPC3;
	
	@FindBy(xpath="//tab[4]//product[4]/expandable//ul[1]//ul[2]/li[3]//div/ul/li[2]//li/select")
	public static WebElement drpdwnClient4;
	
	@FindBy(xpath="//tab[4]//ul[1]//ul[2]/li[7]//li[6]//div//li/input")
	public static WebElement txtPracArea1;
	
	@FindBy(xpath="//tab[4]//li[15]//div/ul/li[1]//li/select")
	public static WebElement drpdwnBlogFocus;
	
	@FindBy(xpath="//div[4]/div/question/div/answer/ul/li/textarea")
	public static WebElement txturl1;
	
	@FindBy(xpath="//tab[4]//li[15]//div/ul/li[2]//li/input")
	public static WebElement txturl4;
	
	@FindBy(xpath="//tab[4]//product[5]/expandable//ul[2]/li[1]//li/select")
	public static WebElement drpdwnSpanish;
	
	@FindBy(xpath="//tab[4]//product[5]/expandable//ul[2]/li[3]//li//div/span")
	public static WebElement drpdwnDesiredPrac;
	
	@FindBy(xpath="//tab[4]//product[5]/expandable//ul[2]/li[14]//li/select")
	public static WebElement drpdwnCustChat;
	
	@FindBy(xpath="//tab[4]//product[5]/expandable//ul[2]/li[4]//li/input")
	public static WebElement txtChatTrans;
	
	@FindBy(xpath="//tab[4]//product[5]/expandable//ul[2]/li[8]//li/select")
	public static WebElement drpdwnLawFirm;
	
	@FindBy(xpath="//div[5]/div/question/div/answer/ul/li/textarea")
	public static WebElement txtspecialinst;
	
	@FindBy(xpath="//tab[4]//li[14]//div/ul/li[9]//li/input")
	public static WebElement txtspecialinst1;
	
	@FindBy(xpath="//product[1]/expandable/div/button")
	public static WebElement buttonExpand1;
	
	@FindBy(xpath="//product[2]/expandable/div/button")
	public static WebElement buttonExpand2;
	
	@FindBy(xpath="//product[3]/expandable/div/button")
	public static WebElement buttonExpand3;
	
	@FindBy(xpath="//product[4]/expandable/div/button")
	public static WebElement buttonExpand4;
	
	@FindBy(xpath="//product[5]/expandable/div/button")
	public static WebElement buttonExpand5;
}
