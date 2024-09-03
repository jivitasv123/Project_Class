package com.DatadrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadAllData {

	@Test
	private void readpartdata() throws IOException {

		File f = new File("C:\\Users\\Raviraj\\OneDrive\\Desktop\\AugIpt.xlsx");

		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sh = w.getSheet("sheet1");
		
		int count = sh.getLastRowNum()-sh.getFirstRowNum();
		for (int i = 0; i < count+1; i++) {
			Row row = sh.getRow(i);
		for (int j = 0; j < row.getLastCellNum(); j++) {
			System.out.println(row.getCell(j).getStringCellValue());
			
		}
		System.out.println();
		}
		
}

}