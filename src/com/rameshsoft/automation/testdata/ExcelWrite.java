package com.rameshsoft.automation.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.rameshsoft.automation.utilities.PojoUtility;

public class ExcelWrite {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fip = new FileInputStream(PojoUtility.getExcelFilePath());
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet1 = workbook.getSheet("Sheet1");
		Row row2 = sheet1.createRow(2);
		Cell cell20 = row2.createCell(0);
		cell20.setCellValue("practice");
		
		row2.createCell(1).setCellValue("java");
		
		FileOutputStream fop = new FileOutputStream(PojoUtility.getExcelFilePath());
		workbook.write(fop);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
