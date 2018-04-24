package tr.findlaw.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EsignProcessPageObjects {
	
	@FindBy(xpath="//span[@id='spnUserTileTxt']")
	public static WebElement lblUserName;
	
	@FindBy(xpath="//div[@class='c3 ur']/..//div[text()='Request for eSignatures']")
	public static WebElement lblReqstForEsign;
	
	@FindBy(xpath="//span[@style='display:inline-block;']")
	public static WebElement lnkReviewDocument;
	
	@FindBy(xpath="//div[@id='welcome']/div/h1/span")
	public static WebElement lblReviewDoc;
	
	@FindBy(xpath="//button[text()='Continue']")
	public static WebElement btnContinue;
	
	@FindBy(xpath="//button[@id='navigate-btn']")
	public static WebElement btnStart;
	
	@FindBy(xpath="//div[@class='page-tabs']/div/button")
	public static WebElement btnSign;
	
	@FindBy(xpath="//div[@id='adopt-dialog']/div/div[3]/button[1]")
	public static List<WebElement> btnAdoptnSign;
	
	@FindBy(xpath="//button[@id='action-bar-btn-finish']")
	public static WebElement btnFinish;
	
	@FindBy(xpath="//button[text()='No Thanks']")
	public static WebElement btnNoThanks;
}
