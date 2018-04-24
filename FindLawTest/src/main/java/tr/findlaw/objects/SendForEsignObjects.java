package tr.findlaw.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendForEsignObjects {

	@FindBy(xpath="//input[@id='j_id0:idDocuSignManageEnvelopeComponent:j_id2:j_id8:attachmentTable:0:attachment_check']")
	public static WebElement chckboxOrderForm;
	
	@FindBy(xpath="//input[@id='goto_recipients']")
	public static WebElement btnAddRecpnts;
	
	@FindBy(xpath="//input[@id='recipient_send']")
	public static WebElement btnSendForEsign;
	
}
