package com.automation.businessscripts;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.base.ActionEngine;
import com.automation.base.DriverEngine;
import com.automation.supporters.ExcelReader;
import com.automation.supporters.PropertiesUtility;
import com.automation.utilities.LocMechUtility;
import com.automation.utilities.PojoUtility;
import com.relevantcodes.extentreports.LogStatus;

public class GmailTest extends ActionEngine {
	@Test
	public void gmailTest() throws IOException, EncryptedDocumentException, InvalidFormatException {
PropertiesUtility prConf = new PropertiesUtility(PojoUtility.getConfFilePath());
PropertiesUtility prOr = new PropertiesUtility(PojoUtility.getOrFilePath());
ExcelReader excelReader = new ExcelReader(PojoUtility.getExcelFilePath());
getExtentTest().log(LogStatus.INFO, "Browser is launched succesfully");
		getWebDriver().get(prConf.getPropertValue("url_gmail"));
		getExtentTest().log(LogStatus.INFO, "URL is entered as : " + prConf.getPropertValue("url_gmail"));
		DTA(LocMechUtility.id, prOr.getPropertValue("gmail_un_id"), excelReader.getCellData("Sheet1", 0, 0));
getExtentTest().log(LogStatus.INFO, "Data Typing Action is done on USERNAME with test data : " +excelReader.getCellData("Sheet1", 0, 0));
		
		
		click(LocMechUtility.xpath, prOr.getPropertValue("gmail_next_xpath"));
		getExtentTest().log(LogStatus.INFO, "CLICKABLE Action is done on next element");
		
		
		
		Map<String, String> keysValues = prOr.getAllKeyValues();
		System.out.println(keysValues);
	}
}
