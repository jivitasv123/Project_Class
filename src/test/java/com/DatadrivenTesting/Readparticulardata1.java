package com.DatadrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readparticulardata1 {

	@Test
	private void readpartdata() throws IOException {

		File f = new File("C:\\Users\\Raviraj\\OneDrive\\Desktop\\AugIpt.xlsx");

		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sh = w.getSheet("sheet1");
		
		
		Row r = sh.getRow(1);
		Cell c = r.getCell(1);
		CellType ct = c.getCellType();
		if (ct.equals(CellType.STRING)) {
			String value = c.getStringCellValue();
			System.out.println(value);
		} else if (ct.equals(CellType.NUMERIC)) {
			double num = c.getNumericCellValue();
			int data = (int) num;
			System.out.println(data);

		}

	}

}
