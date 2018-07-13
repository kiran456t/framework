package com.rameshsoft.automation.businessscripts;

import org.openqa.selenium.By;

import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.ActionEngineOne;
import com.rameshsoft.automation.base.DriverEngine;
import com.rameshsoft.automation.customisedexceptions.FrameworkException;
import com.rameshsoft.automation.utilities.LocMechUtility;

public class Demoo extends ActionEngineOne{
	@org.testng.annotations.Test
public void test() throws FrameworkException {
getWebDriver().get("");
ActionEngineOne.DTA(LocMechUtility.id, "identifierId", "rameshatmtech@gmail.com");
CLICK(LocMechUtility.xpath, "//*[@id='identifierNext']");
System.out.println(switchToWindows(3));;
}
}















