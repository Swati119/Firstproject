package tr.findlaw.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SafeLoginpageObjects {
	
	
	@FindBy(xpath = "//form[@id='safeLogin']/fieldset/div[1]/h2")
	public static WebElement lblsafelogin;
	
	@FindBy(xpath ="//input[@id='USER']")
	public static WebElement txtSAFEUserId;
	
	@FindBy(id ="authenticationFrame")
	public static WebElement iframe;
	
	@FindBy(id = "PASSWORD")
	public static WebElement txtSAFEPassword;
	
	@FindBy(xpath= "//button[@id='safeLoginbtn']/../../../../..//fieldset/dl[2]/dd[1]/button")
	public static WebElement btnLogin;
	
	
}
