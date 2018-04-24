package tr.findlaw.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.framework.reports.TestNGCustomReporter;

import tr.findlaw.objects.AddProductsPageObjects;
import tr.findlaw.objects.BasePageObjects;
import tr.findlaw.objects.SearchPageObjects;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver webDriver) {
		super(webDriver);
		
	}
	
	public void SearchDiffProfile(String user) {
		
		elementHandler.waitForIdToLoad(BasePageObjects.txtBoxSearch);
		elementHandler.writeText(BasePageObjects.txtBoxSearch, user, BasePageObjects.btnSearch);
		actionHandler.waitForSomeTime(2000);
		elementHandler.clickElement( BasePageObjects.btnSearch, SearchPageObjects.linkUser);
		actionHandler.waitForSomeTime(2000);
		elementHandler.clickElement(SearchPageObjects.linkUser);
		actionHandler.waitForSomeTime(5000);
		elementHandler.waitForIdToLoad(SearchPageObjects.drpdwnarrow);
		elementHandler.clickElement(SearchPageObjects.drpdwnarrow, SearchPageObjects.linkUserDetail);
		actionHandler.waitForSomeTime(2000);
		elementHandler.clickElement(SearchPageObjects.linkUserDetail,SearchPageObjects.btnLogin1);
		actionHandler.waitForSomeTime(5000);
		elementHandler.clickElement(SearchPageObjects.btnLogin1,BasePageObjects.userNavigationLbl);
		TestNGCustomReporter.log(logger, "User logged in successfully");
	}
	
	public void ClickCOBfromProposals(String QuoteId) {
		//elementHandler.waitForXpathToLoad("//li/a[text()='Proposals']");
		actionHandler.waitForSomeTime(5000);
		elementHandler.clickElement(SearchPageObjects.btnproposals, SearchPageObjects.lblproposals);
		actionHandler.waitForSomeTime(5000);
		elementHandler.clickElement(SearchPageObjects.btnGo);
		
		WebElement table = driver.findElement(By.xpath("//div[contains(@id,'l_listBody')]"));
	    List<WebElement> allrows = table.findElements(By.tagName("tr"));
	    //List<WebElement> allcols = table.findElements(By.tagName("td"));
	    //System.out.println(allrows +"all rows");
	    for(WebElement row: allrows){
	        List<WebElement> Cells = row.findElements(By.xpath("//div[contains(@id,'_NAME')]/a/span"));
	       // System.out.println(Cells +"cells");
	        for(WebElement Cell:Cells){
	          String value= Cell.getText();
	          //System.out.println(value +" quote value");
	          if(value == QuoteId) {
	        	 WebElement cob= row.findElement(By.xpath("//div[contains(@id,'Qrx9')]/a/img"));
	        	// System.out.println(cob +"cob ");
	        	// Integer.toString(row);
	        	 actionHandler.waitForSomeTime(2000);
	        	 cob.click();
	        	 System.out.println("clicked on cob button");
	          }
	        }
	          
	          
	        }
	       
	    }
	    
	    
		/*List<WebElement> Quoteslist= driver.findElements(By.xpath("//div[contains(@id,'_NAME')]/a/span"));
		for(int i=0;i<Quoteslist.size();i++){
	        if(Quoteslist.get(i).getText().equals(QuoteId)){ 
	        	Quoteslist.get(i).click();
	        }
		*/
		
		
	

}
