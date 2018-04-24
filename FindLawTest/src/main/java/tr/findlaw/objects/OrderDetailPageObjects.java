package tr.findlaw.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailPageObjects {

	@FindBy(xpath = "//div[@class='pbBody']/div[2]/table/tbody/tr[10]/td[4]/div/a")
	public static WebElement lnkQuoteId;
	
}
