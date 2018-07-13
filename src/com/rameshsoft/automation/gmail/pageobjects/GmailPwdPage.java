package com.rameshsoft.automation.gmail.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.BaseTest;

public class GmailPwdPage extends BaseTest{
	static
	{
		PageFactory.initElements(getWebDriver(), GmailPwdPage.class);
	}
	
	@FindBy(name="password")
	private static WebElement password;
	
	@FindBy(id="passwordNext")
	private static WebElement next;
	
	@FindBy(xpath="//*[text()='Forgot password?']")
	private static WebElement frgtPwd;
	
	@FindBy(xpath="//*[text()='Wrong password. Try again or click Forgot password to reset it.']")
	private static WebElement pwdErrMsg;
	
	public static void enterPwd(String testData) {
	Assert.assertTrue(password.isDisplayed()&&password.isEnabled());	
	password.clear();
	password.sendKeys(testData);
	}
	
	public static void clickOnNxtBtn() {
		Assert.assertTrue(next.isDisplayed()&&next.isEnabled());
		next.click();
	}

	public static void validatePwdErrMsg(String ev) {
		String av = pwdErrMsg.getText();
		Assert.assertEquals(av, ev);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
