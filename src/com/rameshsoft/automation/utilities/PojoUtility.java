package com.rameshsoft.automation.utilities;

import org.apache.commons.io.filefilter.OrFileFilter;

public class PojoUtility 
{
private static String orFilePath = System.getProperty("user.dir")+"\\src\\com\\rameshsoft\\automation\\objectrepository\\OR.properties";
private static String confFilePath = System.getProperty("user.dir")+"\\config.properties";
private static String excelFilePath = System.getProperty("user.dir")+"\\src\\com\\rameshsoft\\automation\\testdata\\TestData.xls";


public static String getOrFilePath(){
	return orFilePath;
}

public static String getConfFilePath(){
	return confFilePath;
}

public static String getExcelFilePath(){
	return excelFilePath;
}


}
