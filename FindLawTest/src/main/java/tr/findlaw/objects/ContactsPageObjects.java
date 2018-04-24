package tr.findlaw.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPageObjects {

	@FindBy(xpath = "")
	public static WebElement hdrContacts;

	@FindBy(xpath="//div[contains(@id,'DetailRD')]/div[2]/a[6]/span")
	public static WebElement linkContacts;
	
	@FindBy(xpath="//span[text()='Contacts']")
	public static WebElement linkContacts1;
	
	@FindBy(xpath="//input[@value='New Contact']")
	public static WebElement btnNewContact;
	
	@FindBy(xpath="//select[@id='p3']")
	public static List<WebElement> dropdnNewRecord;
	
	@FindBy(xpath="//input[@title='Continue']")
	public static WebElement btnContinue;
	
	@FindBy(id="j_id0:formEdit:j_id39:j_id42:j_id43:j_id47")
	public static WebElement dropdnSalutation;
	
	@FindBy(id="j_id0:formEdit:j_id39:j_id42:j_id43:frstName")
	public static WebElement txtboxFirstName;
	
	@FindBy(id="j_id0:formEdit:j_id39:j_id42:lstName")
	public static WebElement txtboxLastName;
	
	@FindBy(id="j_id0:formEdit:j_id39:j_id42:j_id48")
	public static WebElement txtboxEmail;	
	
	@FindBy(xpath="//input[@id='btnSave']")
	public static WebElement btnSave;
	
	
	@FindBy(xpath="//div[@id='head_01B1300000EIbbs_ep']/h3")
	public static WebElement lblContactInfo;
	
	@FindBy(xpath="//div[@class='pbBody']/div[6]/table/tbody/tr[1]/td[2]")
	public static WebElement lblContactName;
	
	@FindBy(xpath="//div[@id='Contact_body']/table/tbody/tr[2]/th/a")
	public static WebElement lnkContact;
	
}
