package com.rameshsoft.automation.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.internal.IResultListener2;

import com.rameshsoft.automation.base.DriverEngine;


public class ScrennShotFailure extends TestListenerAdapter
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		String tcName = result.getName();
		TakesScreenshot takesScreenshot = (TakesScreenshot)DriverEngine.getWebDriver();
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
FileUtils.copyFile
(file, new File(System.getProperty("user.dir")+"\\Screenshots\\"+tcName+".jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//e.getMessage();
			//e.toString();
			
		}
	}
}
