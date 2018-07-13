package com.rameshsoft.automation.base;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.automation.gmail.pageobjects.GmailHomePage;
import com.rameshsoft.automation.gmail.pageobjects.GmailPwdPage;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesUtility;
import com.rameshsoft.automation.utilities.PojoUtility;
import com.rameshsoft.automation.utilities.WorkBookValues;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest extends ActionEngineOne 
{

	
	public void loginToApplication(String url,String un,String pwd) {
		enterUrl(url);
		getExtentTest().log(LogStatus.INFO, "URL is entered as : " +url);
	
		GmailHomePage.enterUserName(un);;
		getExtentTest().log(LogStatus.INFO, "DTA is done on username: with test data: " + un);
		
		
		
		GmailHomePage.clickOnNxtBtn();
		getExtentTest().log(LogStatus.INFO, "Clicked on next in home page button");
		
		GmailPwdPage.enterPwd(pwd);
		getExtentTest().log(LogStatus.INFO, "DTA is done on PASSWORD: with test data: " + pwd);
		
		GmailPwdPage.clickOnNxtBtn();
		getExtentTest().log(LogStatus.INFO, "Clicked on next button in PWD Page");
		
		GmailPwdPage.validatePwdErrMsg("Wrong password. Try again or click Forgot password to reset it.");
			
	}
	
	
	public static  PropertiesUtility getPrConfigInstance() throws IOException {
		PropertiesUtility prConf = new PropertiesUtility(PojoUtility.getConfFilePath());
		return prConf;
	}
	
public static  PropertiesUtility getPrOrInstance() throws IOException {
	PropertiesUtility prOr = new PropertiesUtility(PojoUtility.getOrFilePath());
	return prOr;
	}

public static  ExcelReader getExcelReaderInstance() throws EncryptedDocumentException, InvalidFormatException, IOException {
	ExcelReader excelReader = new ExcelReader(PojoUtility.getExcelFilePath());
	return excelReader;
}
	;;;;;;;;;;;;;;;;;;;;;
}












