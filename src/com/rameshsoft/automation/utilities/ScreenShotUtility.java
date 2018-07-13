package com.rameshsoft.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public interface ScreenShotUtility 
{
	public static String screenShot(WebDriver driver,String tcName) throws IOException
	{
	String imagePath = System.getProperty("user.dir")+"\\Screenshots\\"+tcName+".jpeg";
	TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
	File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File(imagePath));
	return imagePath;
	}
}
