package tr.findlaw.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordHoldersPageObjects {
	
	@FindBy(xpath ="//table[@id='bodyTable']//h2")
	public static WebElement lblOnlineContacts;

	
	@FindBy(xpath ="//td[text()='Per Seat Products']")
	public static WebElement btnPerSeatProducts;
	
	
	@FindBy(xpath ="//table[@class='detailList']//tr[2]//tbody//td[1]")
	public static WebElement checkbox1;
	
	
	@FindBy(xpath ="//table[@class='detailList']//tr[2]//tbody//td[2]/input")
	public static WebElement txtFirstName;
	
	
	@FindBy(xpath ="//table[@class='detailList']//tr[2]//tbody//td[3]/input")
	public static WebElement txtLastName;
	
	
	@FindBy(xpath ="//table[@class='detailList']//tr[2]//tbody//td[4]/select")
	public static WebElement drpdwnPosition;
	
	@FindBy(xpath ="//table[@class='detailList']//tr[2]//tbody//td[5]/select")
	public static WebElement drpdwnType;		
			
			
	@FindBy(xpath ="//table[@class='detailList']//tr[2]//tbody//td[6]/select")
	public static WebElement drpdwnJuris;	
					
	@FindBy(xpath ="//table[@class='detailList']//tr[2]//tbody//td[7]/input")
	public static WebElement txtEmail1;
	
			
	@FindBy(xpath ="//input[@value='Save']")
	public static WebElement btnSave;
}
