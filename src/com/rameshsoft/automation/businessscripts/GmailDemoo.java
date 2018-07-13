package com.rameshsoft.automation.businessscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.rameshsoft.automation.base.ActionEngineOne;
import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.customisedexceptions.FrameworkException;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesUtility;
import com.rameshsoft.automation.utilities.LocMechUtility;
import com.rameshsoft.automation.utilities.PojoUtility;
import com.relevantcodes.extentreports.LogStatus;

public class GmailDemoo extends BaseTest
{
	@org.testng.annotations.Test
public void gmail() throws IOException, EncryptedDocumentException, InvalidFormatException, FrameworkException {
	//PropertiesUtility prConfig = new PropertiesUtility(PojoUtility.getConfFilePath());
	String url_gmail =getPrConfigInstance().getPropertValue("url_gmail");
		getWebDriver().get(url_gmail);
		getExtentTest().log(LogStatus.INFO, "URL is entered as : " +url_gmail);
		
		//PropertiesUtility prOr = new PropertiesUtility(PojoUtility.getOrFilePath());
		//ExcelReader er = new ExcelReader(PojoUtility.getExcelFilePath());
		
		DTA(LocMechUtility.id, getPrOrInstance().getPropertValue("gmail_un_id"), getExcelReaderInstance().getCellData("Sheet1", 0, 0));
		getExtentTest().log(LogStatus.INFO, "Data Typing Action is done on username with test data :" +getExcelReaderInstance().getCellData("Sheet1", 0, 0));
		
		CLICK(LocMechUtility.xpath, getPrOrInstance().getPropertValue("gmail_next_xpath"));
		
		getExtentTest().log(LogStatus.INFO, "Clickable action is done on next element");
		
		WebElement element = getWebElement(LocMechUtility.name, getPrOrInstance().getPropertValue("gmail_pwd"));
		
		Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
		
	
		
}
}









