package com.rameshsoft.automation.businessscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.rameshsoft.automation.customisedexceptions.FrameworkException;

public class AssertTest {
public static void main(String[] args) throws FrameworkException {
	
	WebDriver d = new FirefoxDriver();
	d.get("https://www.gmail.com");
	String av = d.getTitle(); //Gmail
	
	
List<WebElement> samsung = d.findElements(By.xpath("//*[conatisn(text(),'Samsung')]"));
	
	for(WebElement element : samsung)
	{
		if (element.getText().contains("samsung")) {
			;;;;
		}
		else
		{
			throw new FrameworkException("SAMSUNG is not there");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Assert.assertEquals(av, "Gmail");
	WebElement un = d.findElement(By.id("identifierId"));	
	Assert.assertTrue(un.isDisplayed()&&un.isEnabled());
	un.clear();
	un.sendKeys("...");
	
	
	d.findElement(By.id("identifierNext")).click();
	Assert.assertTrue(d.findElement(By.name("password")).isDisplayed());
	
	
	

	
	
	
	
	/*int a = 1001,b=100;
	Assert.assertEquals(a, b);
	System.out.println("a");
	System.out.println("b");
	*/
	/*if (a==b) {
		System.out.println("equal");
	}
	else
	{
		System.out.println("Not equal");
	}
	System.out.println("a");
	System.out.println("b");
}*/
}
}
