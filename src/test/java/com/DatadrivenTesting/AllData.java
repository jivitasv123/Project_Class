package com.DatadrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class AllData {

	@Test
	private void ReadAllData() throws IOException {
		File f = new File("C:\\Users\\Raviraj\\OneDrive\\Desktop\\AugIpt.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		for(int i = 0; i < physicalNumberOfRows; i++) {
			
			 Row row = sheet.getRow(i);
			
			  int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			  
			  for(int j =0 ; j< physicalNumberOfCells; j++) {
				  
				  Cell cell = row.getCell(j);
				  
				  CellType type = cell.getCellType();
				  
				  
				  if (type.equals(CellType.STRING)) {
					 String value = cell.getStringCellValue();
					 System.out.println(value);
					  
				}else if (type.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int data = (int) numericCellValue;
					System.out.println(data);
				}
				  
			  }
		}
		wb.close();

	}

}
