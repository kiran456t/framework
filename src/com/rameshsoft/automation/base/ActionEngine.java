package com.rameshsoft.automation.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionEngine extends DriverEngine
{
	private static WebElement element;
	private static List<WebElement> elements;
	private static Actions actions;
	public static WebElement element(String locMech,String locValue)
	{
		actions = new Actions(getWebDriver());
		switch(locMech)
		{
		case "id":
			element = getWebDriver().findElement(By.id(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
			}
		case "css":
			element = getWebDriver().findElement(By.cssSelector(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
			}
		case "xpath":
			element = getWebDriver().findElement(By.xpath(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
			}
		
		case "name":
			element = getWebDriver().findElement(By.name(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
			}
		case "linkText":
			element = getWebDriver().findElement(By.linkText(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				break;
			}
		}
		return element;
	}
	
	public static List<WebElement> elements(String locMech,String locValue)
	{
		WebDriverWait wait = new WebDriverWait(getWebDriver(), 99);
		actions = new Actions(getWebDriver());
		switch(locMech)
		{
		case "id":
			elements = getWebDriver().findElements(By.id(locValue));
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
			break;
		case "css":
			elements = getWebDriver().findElements(By.cssSelector(locValue));
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
			break;
		case "xpath":
			elements = getWebDriver().findElements(By.xpath(locValue));
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
			break;
		
		case "name":
			elements = getWebDriver().findElements(By.name(locValue));
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
			break;
		case "linkText":
			elements = getWebDriver().findElements(By.linkText(locValue));
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
			break;
		}
		return elements;
	}
	
	
	
	public static void click(String locMech,String locValue)
	{
		WebElement element = element(locMech, locValue);
		element.click();
	}
	
	public static void DTA(String locMech,String locValue,String testData)
	{
		WebElement element = element(locMech, locValue);
		element.sendKeys(testData);
	}
	
	public static void mouseHover(String locMech,String locValue)
	{
		actions.moveToElement(element(locMech, locValue)).build().perform();
	}
	
	public static void rightClick(String locMech,String locValue)
	{
		actions.contextClick(element(locMech, locValue)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	}
	
	public static void frameToSwitchIndex(int index)
	{
		getWebDriver().switchTo().frame(index);
	}
	public static void frameToSwitchIdName(String idOrName)
	{
		getWebDriver().switchTo().frame(idOrName);
	}
	public static void frameToSwitchElement(WebElement element)
	{
		getWebDriver().switchTo().frame(element);
	}
	
	public static List<WebElement> getAllElements(String locMech,String locValue)
	{
		List<WebElement> listOfElements = elements(locMech, locValue);
		return listOfElements;
	}
	
	public static void switchToWindowFromFrame()
	{
		getWebDriver().switchTo().defaultContent();
	}
	
	public static void doubleClick(String locMech,String locValue)
	{
		element = element(locMech, locValue);
		actions.doubleClick(element).build().perform();
	}
	
	
	public static void dragable(String locMech,String locValue)
	{
		element = element(locMech, locValue);
		actions.dragAndDropBy(element, 155, 155).build().perform();
	}
	
	/*public static void droppable(String locMech,String locValue)
	{
		element = element(locMech, locValue);
		actions.dragAndDrop(element, target)
	}*/
	
	public static void droppable(String locMech,String locValue)
	{
		element = element(locMech, locValue);
		actions.dragAndDropBy(element, 155, 155).build().perform();
	}
	
	
	
	
	
	
	
	/*public static void click(String locMech,String locValue)
	{
		switch(locMech)
		{
		case "id":
			element = getWebDriver().findElement(By.id(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
		case "css":
			element = getWebDriver().findElement(By.cssSelector(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
		case "xpath":
			element = getWebDriver().findElement(By.xpath(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
		
		case "name":
			element = getWebDriver().findElement(By.name(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
		case "linkText":
			element = getWebDriver().findElement(By.linkText(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}

		
		}
	}*/
	
	/*public static void DTA(String locMech,String locValue,String testData)
	{
		switch(locMech)
		{
		case "id":
			element = getWebDriver().findElement(By.id(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
				break;
			}
		case "css":
			element = getWebDriver().findElement(By.cssSelector(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
				break;
			}
		case "xpath":
			element = getWebDriver().findElement(By.xpath(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
				break;
			}
		
		case "name":
			element = getWebDriver().findElement(By.name(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
				break;
			}
		case "linkText":
			element = getWebDriver().findElement(By.linkText(locValue));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
				break;
			}
		}
	}*/
}
