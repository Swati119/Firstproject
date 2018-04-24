package tr.findlaw.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	@FindBy(id="username")
	public static WebElement txtBoxUsername;
	
	@FindBy(id="password")
	public static WebElement txtBoxPassword;
	
	@FindBy(id="Login")
	public static WebElement btnLogin;
	
	@FindBy(xpath = "//input[@id='username']")
	public static WebElement txtWebmailUserName;
	
	@FindBy(xpath = "//input[@id='password']")
	public static WebElement txtWebmailPaswd;
	
	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement btnSigIn;
	
	@FindBy(id="username")
	public static List <WebElement> txtBoxUsrname;
}

/*@FindBy(xpath="")
public static WebElement ;*/