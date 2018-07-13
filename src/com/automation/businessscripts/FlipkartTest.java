package com.automation.businessscripts;

import java.io.IOException;

import org.testng.Assert;

import com.automation.base.ActionEngineOne;
import com.automation.base.BaseTest;
import com.automation.customisedexceptions.FrameworkException;
import com.automation.supporters.PropertiesUtility;
import com.automation.utilities.LocMechUtility;
import com.automation.utilities.PojoUtility;
import com.relevantcodes.extentreports.LogStatus;

public class FlipkartTest extends BaseTest {

	@org.testng.annotations.Test
	public void flipKart() throws IOException, FrameworkException {
		//PropertiesUtility prConfig = new PropertiesUtility(PojoUtility.getConfFilePath());
		getWebDriver().get(getPrConfigInstance().getPropertValue("url_flipkart"));
		getExtentTest().log(LogStatus.INFO, "URL is entered as : " +getPrConfigInstance().getPropertValue("url_flipkart"));
		
		//PropertiesUtility prOr = new PropertiesUtility(PojoUtility.getOrFilePath());
		
		mouseHover(LocMechUtility.xpath, getPrOrInstance().getPropertValue("electronics_xpath"));
		
		getExtentTest().log(LogStatus.INFO, "Mouse hover action is done on ELECTRONICS");
		Assert.assertEquals("", "");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
