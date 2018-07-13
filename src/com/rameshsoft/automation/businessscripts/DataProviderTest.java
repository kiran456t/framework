package com.rameshsoft.automation.businessscripts;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

	@org.testng.annotations.Test(dataProvider="loginFormDataProvider")
public void loginForm(String un,String pwd) 
{
	System.out.println(un+"...."+pwd);
}
	@DataProvider
	public Object[][] loginFormDataProvider()
	{
		Object[][] a = new Object[0][2];
		//a[0][0] = "java";
		//a[0][1] = "selenium";
		//a[1][0] = "123456";
		//a[1][1] = "practice";
		return a;
	}
	
	
}
