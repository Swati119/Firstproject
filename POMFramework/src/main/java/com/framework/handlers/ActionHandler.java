package com.framework.handlers;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.framework.reports.LogHandler;

public class ActionHandler extends BaseHandler {

	public ActionHandler(WebDriver driver) {
		super(driver);
	}

	/***
	 * Method is usedd to performs double click on the specified element
	 * 
	 * @param selector
	 *            Element to be double click
	 * @param waitFor
	 *            Element to be waiting for after the double click
	 */
	public void doubleClick(WebElement element, WebElement... waitForElement) {
		try {
			Actions actions = new Actions(driver);
			if (element != null) {
				actions.doubleClick(element).build().perform();
			}
		} catch (WebDriverException e) {
			LogHandler.getLogger(this.getClass())
					.error("Unable to double click on the element: " + element + "\n" + e.getMessage());
			throw new WebDriverException("Unable to double click on the element: " + element + "\n" + e);
		}
		if (waitForElement != null && waitForElement.length > 0) {
			setWebDriverWait(waitForElement[0]);
		}
	}

	/***
	 * Method is used to perform
	 * 
	 * @param selector
	 * @param waitFor
	 */
	public void moveToElementsAndClick(List<WebElement> elements, WebElement... waitForElement) {
		try {
			if (elements.size() > 0) {
				for (WebElement element : elements) {
					Actions actions = new Actions(driver);
					if (element != null) {
						actions.moveToElement(element).build().perform();
						element.click();
					}
				}
			}
		} catch (WebDriverException e) {
			LogHandler.getLogger(this.getClass())
					.error("Unable to double click on the elements: " + elements + "\n" + e.getMessage());
			throw new WebDriverException("Unable to double click on the elements: " + elements + "\n" + e);
		}
		if (waitForElement != null && waitForElement.length > 0) {
			setWebDriverWait(waitForElement[0]);
		}
	}

	public void moveToElementAndClick(WebElement element, WebElement... waitForElement) {
		try {
			if (element != null) {
				Actions actions = new Actions(driver);
				actions.moveToElement(element).build().perform();
				element.click();
			}
		} catch (WebDriverException e) {
			LogHandler.getLogger(this.getClass())
					.error("Unable to move to element and click on the element: " + element + "\n" + e.getMessage());
			throw new WebDriverException("Unable to move to element and click on the element: " + element + "\n" + e);
		}
		if (waitForElement != null && waitForElement.length > 0) {
			setWebDriverWait(waitForElement[0]);
		}
	}

	public void moveToElement(WebElement element, WebElement... waitForElement) {
		try {
			if (element != null) {
				Actions actions = new Actions(driver);
				actions.moveToElement(element).build().perform();
			}
		} catch (WebDriverException e) {
			LogHandler.getLogger(this.getClass())
					.error("Unable to move to element: " + element + "\n" + e.getMessage());

			throw new WebDriverException("Unable to move to element: " + element + "\n" + e);
		}
		if (waitForElement != null && waitForElement.length > 0) {
			setWebDriverWait(waitForElement[0]);
		}
	}

	public void keyboardAction(Keys key, WebElement... waitForElement) {
		try {
			Actions actions = new Actions(driver);
			actions.sendKeys(key).build().perform();
		} catch (WebDriverException e) {
			LogHandler.getLogger(this.getClass()).error("Unable do the " + key + " key actions \n" + e.getMessage());
			throw new WebDriverException("Unable do the " + key + " key actions \n" + e);
		}
		if (waitForElement != null && waitForElement.length > 0) {
			setWebDriverWait(waitForElement[0]);
		}
	}
 
	public void waitForSomeTime(int timeOut) {
		try {
			Thread.sleep(timeOut);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void rightClick(WebElement element, WebElement... waitForElement) {
		try {
			Actions actions = new Actions(driver);
			if (element != null) {
				actions.contextClick(element).build().perform();
			}
		} catch (WebDriverException e) {
			LogHandler.getLogger(this.getClass())
					.error("Unable to right click on the element: " + element + "\n" + e.getMessage());
			throw new WebDriverException("Unable to right click on the element: " + element + "\n" + e);
		}
		if (waitForElement != null && waitForElement.length > 0) {
			setWebDriverWait(waitForElement[0]);
		}
		
	}

}
