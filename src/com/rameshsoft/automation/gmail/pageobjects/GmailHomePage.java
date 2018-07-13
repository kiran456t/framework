package com.rameshsoft.automation.gmail.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.BaseTest;

public class GmailHomePage extends BaseTest{

	static
	{
		PageFactory.initElements(getWebDriver(), GmailHomePage.class);
	}
	
	@FindBy(id="identifierId")
	private static WebElement userName;
	
	@FindBy(id="identifierNext")
	private static WebElement next;
	
	@FindBy(xpath="//*[text()='Forgot email?']")
	private static WebElement frgtEmail;
	
	@FindBy(id="headingText")
	private static WebElement signInTxt;
	
	public static void verifySignInTxt(String testData) {
		Assert.assertTrue(signInTxt.isDisplayed()&&signInTxt.isEnabled());
		Assert.assertEquals(signInTxt.getText(),testData);
	}
	
	public static void enterUserName(String testData) {
	Assert.assertTrue(userName.isDisplayed()&&userName.isEnabled());	
	userName.clear();
	userName.sendKeys(testData);
	}
	
	public static void clickOnNxtBtn() {
		Assert.assertTrue(next.isDisplayed()&&next.isEnabled());
		next.click();
	}
	
	
	
	
}
