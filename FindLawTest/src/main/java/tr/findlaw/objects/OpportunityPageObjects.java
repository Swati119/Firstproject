package tr.findlaw.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunityPageObjects {

	@FindBy(xpath="//span[text()='Opportunities']")
	public static WebElement linkOpty;
	
	@FindBy(xpath="//input[@value='New Opportunity']")
	public static WebElement btnNewOpty;
	
	@FindBy(xpath="//input[@title='Continue']")
	public static WebElement btnContinue;
	
	@FindBy(id="opp3")
	public static WebElement txtOpptyName;
	
	@FindBy(id="opp11")
	public static WebElement dropdwnStage;
	
	@FindBy(id="opp9")
	public static WebElement txtCloseDt;
	
	@FindBy(id="Pricebook2")
	public static WebElement txtPriceBook;
		
	@FindBy(xpath="//label[text()='Price Book']")
	public static WebElement lblPriceBook;
		
	@FindBy(xpath="//h3[text()='Opportunity Information']")
	public static WebElement lblOpptyInfo;
	
	@FindBy(xpath="//input[@title='Save']/../../../../../../div[1]/table/tbody/tr/td[2]/input[1]")
	public static WebElement btnSave;
	
	@FindBy(xpath="//h2[text()='Opportunity Detail']")
	public static WebElement lblOpptyDetail;
	
	@FindBy(xpath="//div[@class='pbBody']/div[2]/table/tbody/tr[1]/td[2]")
	public static WebElement lblOpptyName;
}
