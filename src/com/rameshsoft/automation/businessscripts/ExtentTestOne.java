package com.rameshsoft.automation.businessscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentTestOne {
public static void main(String[] args) {
	
	ExtentReports extentReports = new ExtentReports("D:\\onlinepb2\\pb2framework\\reports\\report.html");
	  
	ExtentTest extentTest = extentReports.startTest("main");
	
	WebDriver d = new FirefoxDriver();
	extentTest.log(LogStatus.INFO, "Browser is launched");
	
	d.get("https://www.gmail.com");
	extentTest.log(LogStatus.INFO, "url is entered as : https://www.gmail.com");
	
	extentReports.endTest(extentTest);
	extentReports.flush();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
