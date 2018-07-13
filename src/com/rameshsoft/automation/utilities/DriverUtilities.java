package com.rameshsoft.automation.utilities;

public interface DriverUtilities 
{
String fireKey = "webdriver.gecko.driver";
String chromeKey = "webdriver.chrome.driver";
String ieKey = "webdriver.ie.driver";
String fireValue = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
String chromeValue = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
String ieValue = System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe";
String chrome ="chrome";
String ie ="ie";
String firefox ="firefox";
}
