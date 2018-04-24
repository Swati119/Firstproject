package tr.findlaw.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPageObjects { 

	@FindBy(xpath = "//div[@id='Account_body']/table/tbody/tr[2]/th/a")
	public static WebElement linkAccountName;
	
}



