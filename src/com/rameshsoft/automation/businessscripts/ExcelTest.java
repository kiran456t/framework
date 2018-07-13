package com.rameshsoft.automation.businessscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	FileInputStream fip = new FileInputStream("D:\\onlinepb2\\pb2framework\\src\\com\\rameshsoft\\automation\\testdata\\TestData.xls");
	Workbook workbook = WorkbookFactory.create(fip);
	Sheet sheet1 = workbook.getSheet("Sheet1");
	Row row0 = sheet1.getRow(0);
	Cell cell00 = row0.getCell(0);
	String cellValue00 = cell00.getStringCellValue();
	System.out.println(cellValue00);
	
	String cellValue01 = row0.getCell(1).getStringCellValue();
	System.out.println(cellValue01);
	
	String cellValue10 = sheet1.getRow(1).getCell(0).getStringCellValue();
	String cellValue11 = sheet1.getRow(1).getCell(1).getStringCellValue();
	
	
	System.out.println(cellValue10+"...."+cellValue11);
	
	
	
	
}
}
