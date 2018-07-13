package com.rameshsoft.automation.businessscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.DriverEngine;

public class FbTest extends DriverEngine{
	@Test
	public void fbTest() {
		getWebDriver().get("https://www.facebook.com");
		getWebDriver().findElement(By.id("1")).sendKeys("abc123");
	}
}
