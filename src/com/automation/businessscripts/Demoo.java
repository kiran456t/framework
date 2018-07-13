package com.automation.businessscripts;

import org.openqa.selenium.By;

import com.automation.base.ActionEngine;
import com.automation.base.ActionEngineOne;
import com.automation.base.DriverEngine;
import com.automation.customisedexceptions.FrameworkException;
import com.automation.utilities.LocMechUtility;

public class Demoo extends ActionEngineOne{
	@org.testng.annotations.Test
public void test() throws FrameworkException {
getWebDriver().get("");
ActionEngineOne.DTA(LocMechUtility.id, "identifierId", "rameshatmtech@gmail.com");
CLICK(LocMechUtility.xpath, "//*[@id='identifierNext']");
System.out.println(switchToWindows(3));;
}
}















