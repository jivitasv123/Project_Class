package com.DatadrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteData {
	
	
	@Test
	private void writeData() throws IOException {

		File f = new File("C:\\Users\\Raviraj\\OneDrive\\Desktop\\AugIpt.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("August").createRow(0).createCell(0).setCellValue("Course Name");
		wb.getSheet("August").getRow(0).createCell(1).setCellValue("Duration");
		wb.getSheet("August").createRow(11).createCell(0).setCellValue("Selenium");
		wb.getSheet("August").getRow(11).createCell(0).setCellValue("200000");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Write Success");
	}
	
	
	

}
