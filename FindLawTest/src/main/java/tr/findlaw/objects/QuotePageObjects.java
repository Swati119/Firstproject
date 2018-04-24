package tr.findlaw.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotePageObjects {
 
	@FindBy(xpath="//input[@value='Create Quote/Proposal']/../../../../../../div[1]//td[2]/input[11]")
	public static WebElement btnCreateQuote;
	
	@FindBy(xpath="//input[@value='Create Quote/Proposal']/../../../../../../div[1]//td[2]/input[10]")
	public static WebElement btnCreateQuote1;
	
	@FindBy(id="00N1300000BSTag")
	public static WebElement textproposalname;
	
	@FindBy(xpath="//input[@title='Save']")
	public static WebElement btnsave;
	
	@FindBy(xpath="//div[@id='Owner_ileinner']/a[text()='[Change]']")
	public static WebElement linkChange;
	
	@FindBy(xpath="//h3[text()='Select New Owner']")
	public static WebElement lblSelectNewOwner;
	
	@FindBy(id="newOwn")
	public static WebElement txtOwner; 
	
	@FindBy(xpath="//div[@id='ep']/div[1]/table/tbody/tr/td[1]/h2")
	public static WebElement lblQuoteproposal;
	
	@FindBy(xpath="//div[@class='pbBody']/div[2]/table/tbody/tr[3]/td[2]")
	public static WebElement lblProposalId;
	
	@FindBy(xpath="//input[@title='Save']")
	public static WebElement btnSave; 
	
	@FindBy(xpath="//input[@title='Edit']/../../../../../../div[1]/table/tbody/tr/td[2]/input[3]")
	public static WebElement btnEdit; 
	
	@FindBy(xpath="//label[text()='Approval Segment']")
	public static WebElement lblApprovalSeg; 
	
	@FindBy(id="00N1300000BSUqd")
	public static WebElement drpdwnApprovalSegment;
	
	@FindBy(xpath="//h2[text()='Quote/Proposal Edit']")
	public static WebElement lblQuote;	
	
	@FindBy(xpath="//input[@title='Save']/../../../../../../div[1]/table/tbody/tr/td[2]/input[1]")
	public static WebElement btnSave1;
	
	@FindBy(xpath = "//div[@id='00N1300000BSUqm_ileinner']/a/img")
	public static WebElement btnAddProduct;
	
	@FindBy(xpath = "//td[text()='Add/Edit Products']")
	public static WebElement lblAddProducts;
	
	@FindBy(xpath = "//input[@id='CF00N1300000BSUr0']")
	public static WebElement txtContact28;
	
	@FindBy(xpath = "//td[@id='topButtonRow']/input[7]")
	public static WebElement btnPasswdHolders;
	
	@FindBy(xpath = "//img[@alt='Generate']")
	public static WebElement btnGenerate;
	
	@FindBy(xpath = "//img[@alt='Send For eSignatures']")
	public static WebElement btnEsignature;
	
	@FindBy(xpath = "//div[@id='Apttus_Proposal__Proposal__c_body']/table/tbody/tr[2]/th/a")
	public static WebElement lnkQuoteID;
	
	@FindBy(xpath = "//span[@id='01I13000000H0V2.00N1300000BSUbS-_help']")
	public static WebElement lblCheckeSgnStatus;
	
	@FindBy(xpath = "//img[@alt='Check eSignature Status']")
	public static WebElement btnValidateEsign;

	@FindBy(xpath = "//span[text()='Orders']")
	public static WebElement lnkOrders;
	
	@FindBy(xpath = "//div[@class='pbBody']//../../../../../../../div[12]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")
	public static WebElement lnkOrderNumber;
	
	@FindBy(xpath = "//div[@id='Name_ileinner']")
	public static WebElement lblOrderNo;
	
	@FindBy(xpath = "//div[@id='00N0m000000Qrx9_ileinner']/a/img")
	public static WebElement btnCOB;
	
	@FindBy(xpath = "//a[@id='globalHeaderNameMink']/b")
	public static WebElement navigationArrow;
	
	@FindBy(xpath = "//a[text()='Logout']")
	public static WebElement linkLogout;
	
	
	@FindBy(xpath = "//td[@id='bodyCell']/div[4]/div[2]/div[2]//tr[8]/td[4]/div")
	public static WebElement lblIncremental;
}
