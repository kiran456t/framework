package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.rameshsoft.automation.utilities.PojoUtility;

public class ExcelReader {
private String filePath;
private Workbook workbook;
private FileInputStream fip;
private Sheet sheet;
private Row row;

public ExcelReader(String filePath) throws EncryptedDocumentException, InvalidFormatException, IOException{
	this.filePath = filePath;
	fip = new FileInputStream(PojoUtility.getExcelFilePath());
	workbook = WorkbookFactory.create(fip);
}

public Sheet getSheet(String sheetName)
{
	if (workbook!=null)
		sheet = workbook.getSheet(sheetName);
	return sheet;
}

public int totalNoOfRows(String sheetName) {
	if (workbook!=null)
		sheet = workbook.getSheet(sheetName);
	return sheet.getLastRowNum();
}
public int totalNoOfCells(String sheetName,int rowNum) {
	if (workbook!=null)
		sheet = workbook.getSheet(sheetName);
	row = sheet.getRow(rowNum);
	return row.getLastCellNum();
}

public String getCellData(String sheetName,int rowNum,int cellNum)
{
	String cellValue=null;
	if (workbook!=null)
		sheet = workbook.getSheet(sheetName);
	row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
	cellValue = cell.getNumericCellValue()+"";	
	}
	else if (cell.getCellType()==cell.CELL_TYPE_STRING) {
		cellValue = cell.getStringCellValue();
	}
	return cellValue;
}

public List getTotalSheetData(){
	List list = new ArrayList();
	 for(int i=0;i<sheet.getLastRowNum()+1;i++)
	 {
		  row = sheet.getRow(i);
		 for(int j=0;j<row.getLastCellNum();j++)
		 {
			Cell cell = row.getCell(j);
			if (cell.getCellType()==cell.CELL_TYPE_STRING) {
				String cellValue = cell.getStringCellValue();
				list.add(cellValue);
				System.out.println(cellValue);
			}
			else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
				double cellValue = cell.getNumericCellValue();
				list.add(cellValue);
				System.out.println(cellValue);
			}
		}
	 }
	 return list;
}

public void writeCellData(String sheetName,int rowNum,int cellNum,String cellValue) throws FileNotFoundException, IOException {
	
	getSheet(sheetName).createRow(rowNum).createCell(cellNum).setCellValue(cellValue);
	workbook.write(new FileOutputStream(filePath));
}

public void writeCellData(String sheetName,int rowNum,int cellNum,double cellValue) throws FileNotFoundException, IOException {
	
	getSheet(sheetName).createRow(rowNum).createCell(cellNum).setCellValue(cellValue);
	workbook.write(new FileOutputStream(filePath));
}


public List getOneRowData(String sheetName,int rowNum) {
	List rowData = new ArrayList();
	Row row = getSheet(sheetName).getRow(rowNum);
	for(int i = 0;i<row.getLastCellNum();i++) {
		Cell cell = row.getCell(i);
		if (cell.getCellType()==cell.CELL_TYPE_STRING) {
			String cellValue = cell.getStringCellValue();
			rowData.add(cellValue);
			System.out.println(cellValue);
		}
		else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
			double cellValue = cell.getNumericCellValue();
			rowData.add(cellValue);
			System.out.println(cellValue);
		}
	}
	return rowData;
}
}



