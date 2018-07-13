package com.rameshsoft.automation.businessscripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	@org.testng.annotations.Test
	public void popup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chinni\\Desktop\\DAY\\DAY\\pb2framework\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/chinni/Desktop/alerts4/WindowUploadfile.html");
		
		d.findElement(By.id("1")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\chinni\\Desktop\\alerts4\\uploadinvoice.exe");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
