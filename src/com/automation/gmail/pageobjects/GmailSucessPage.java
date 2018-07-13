package com.automation.gmail.pageobjects;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseTest;

public class GmailSucessPage extends BasePage{

	static
	{
		PageFactory.initElements(getWebDriver(), GmailSucessPage.class);
	}
	
}
