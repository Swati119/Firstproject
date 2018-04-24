package tr.findlaw.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePageObjects {
	@FindBy(xpath = "//a[@id='globalHeaderNameMink']/span")
	public static WebElement userNavigationLbl;
	
	@FindBy(xpath = "//a[@id='globalHeaderNameMink']/span")
	public static WebElement txtLoginUserName;
	
	@FindBy(id = "phSearchInput")
	public static WebElement txtBoxSearch;
	
	@FindBy(id = "phSearchButton")
	public static WebElement btnSearch;
	
	@FindBy(id="Contact_Tab")
	public static WebElement lnkContacts;
	
	@FindBy(xpath = "//a[@title='Logout']")
	public static WebElement lnkLogout;
	
	

}
