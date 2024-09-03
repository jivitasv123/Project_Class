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
import org.junit.Test;

public class ReadParticularData {
	
	@Test
	public void readParticularData() throws IOException {

		File f = new File("C:\\Users\\Raviraj\\OneDrive\\Desktop\\AugIpt.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		Row row = sheet.getRow(8);
		
		Cell cell = row.getCell(1);
		
		CellType type = cell.getCellType();
		
		if (type.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
			
		}else if (type.equals(CellType.NUMERIC)) {
			double num = cell.getNumericCellValue();
			int data = (int) num;			
			System.out.println(data);

		}
		wb.close();
	}
	
	
	
	
	
	
	

}
