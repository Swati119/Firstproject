package tr.findlaw.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GenerateDocumentPageObjects {
	
	@FindBy(xpath = "//h1[text()='Generate Proposal']")
	public static WebElement lblGenrtPrpsl;
	
	@FindBy(xpath = "//input[@onclick=\"onSelectTemplate('a3F0m0000004OjXEAU')\"]")
	public static WebElement radiobtnFindLaw;
	
	@FindBy(xpath = "//input[@id='j_id0:idGenerateProposal:j_id53:j_id58:j_id59']")
	public static WebElement btnGenerate;
	
	@FindBy(xpath = "//input[@value='Return']")
	public static WebElement btnReturn;
	
	@FindBy(partialLinkText = "Click here to")
	public static WebElement lnkClickHere;
	
	@FindBy(xpath = "//div[text()='Shipping Address']")
	public static WebElement lblShiiping;
}

