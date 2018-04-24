package tr.findlaw.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageObjects {
	
	@FindBy(xpath ="//div[@id='User_body']//tr[2]//div/a")
	public static WebElement linkUser;
	
	@FindBy(id ="moderatorMutton")
	public static WebElement drpdwnarrow;
	
	@FindBy(xpath ="//a[@id='USER_DETAIL']/span")
	public static WebElement linkUserDetail;

	@FindBy(xpath ="//td[@id='topButtonRow']/input[4]")
	public static WebElement btnLogin1;
	
	@FindBy(xpath ="//li/a[text()='Proposals']")
	public static WebElement btnproposals;
	
	@FindBy(xpath ="//h1[text()='Proposals']")
	public static WebElement lblproposals;
	
	@FindBy(xpath ="//div[contains(@id,'l_listBody')]")
	public static WebElement tableproposals;
	
	@FindBy(xpath ="//div[contains(@id,'_NAME')]/a/span")
	public static WebElement linksQuote;
	
	@FindBy(xpath ="//div[contains(@id,'Qrx9')]/a/img")
	public static WebElement btnCOB;
	
	@FindBy(xpath ="//input[@class='btn' and @name='go']")
	public static WebElement btnGo;
	
}
