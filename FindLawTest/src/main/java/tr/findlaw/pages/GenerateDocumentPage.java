package tr.findlaw.pages;

import java.io.BufferedInputStream;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.framework.reports.ReportBuilder;
import com.framework.reports.TestNGCustomReporter;

import tr.findlaw.objects.GenerateDocumentPageObjects;
import tr.findlaw.objects.QuotePageObjects;

public class GenerateDocumentPage extends BasePage {

	public GenerateDocumentPage(WebDriver webDriver) {
		super(webDriver);

	}

public void Generate_Document() {
	
	javascripthandler.scrollIntoView(QuotePageObjects.btnGenerate);
	elementHandler.clickElement(QuotePageObjects.btnGenerate, GenerateDocumentPageObjects.lblGenrtPrpsl);
	TestNGCustomReporter.log(logger, "clicked on generate button");	
	elementHandler.clickElement(GenerateDocumentPageObjects.radiobtnFindLaw);
	actionHandler.waitForSomeTime(5000);
	elementHandler.clickElement(GenerateDocumentPageObjects.btnGenerate, GenerateDocumentPageObjects.btnReturn);
	actionHandler.waitForSomeTime(10000);
	elementHandler.clickElement(GenerateDocumentPageObjects.btnReturn, QuotePageObjects.btnEdit);
	TestNGCustomReporter.log(logger, "Document Generated" +ReportBuilder.takesScreenshot());	
	
}

public String Generate_Document_viewFile() {
	
	javascripthandler.scrollIntoView(QuotePageObjects.btnGenerate);
	elementHandler.clickElement(QuotePageObjects.btnGenerate, GenerateDocumentPageObjects.lblGenrtPrpsl);
	TestNGCustomReporter.log(logger, "clicked on generate button");	
	elementHandler.clickElement(GenerateDocumentPageObjects.radiobtnFindLaw);
	actionHandler.waitForSomeTime(5000);
	elementHandler.clickElement(GenerateDocumentPageObjects.btnGenerate, GenerateDocumentPageObjects.btnReturn);
	actionHandler.waitForSomeTime(10000);
	elementHandler.clickElement(GenerateDocumentPageObjects.lnkClickHere);
	actionHandler.waitForSomeTime(5000);
	String URL= driver.getCurrentUrl();
	windowHandler.switchToLatestWindow(GenerateDocumentPageObjects.lblShiiping);
	TestNGCustomReporter.log(logger, "Document Generated" +ReportBuilder.takesScreenshot());	
	return URL;
	
}
/*public boolean verifyPDFContent(String URL) {

    String output ="";
    boolean flag = false;
    try{
        URL url = new URL(URL);
        String TestText = new PDFTextStripper().getText(TestPDF.getPDDocument());
        BufferedInputStream file = new BufferedInputStream(url.openStream());
        PDDocument document = null;
        try {
            document = PDDocument.load(file);
            output = new PDFTextStripper().getText(document);
            System.out.println(output);
        } finally {
            if (document != null) {
                document.close();
            }
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    if(output.contains(text)){
        flag =  true;
    }
    return flag;
}*/

}