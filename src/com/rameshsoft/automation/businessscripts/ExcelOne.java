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

public class ExcelOne {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	FileInputStream fip = new FileInputStream("D:\\onlinepb2\\pb2framework\\src\\com\\rameshsoft\\automation\\testdata\\TestData.xls");
	Workbook workbook = WorkbookFactory.create(fip);
	Sheet sheet1 = workbook.getSheet("Sheet1");
	
	 for(int i=0;i<sheet1.getLastRowNum()+1;i++)
	 {
		 Row row = sheet1.getRow(i);
		 
		 for(int j=0;j<row.getLastCellNum();j++)
		 {
			Cell cell = row.getCell(j);
			if (cell.getCellType()==cell.CELL_TYPE_STRING) {
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}
			else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
				double cellValue = cell.getNumericCellValue();
				System.out.println(cellValue);
			}
			
		 }
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
