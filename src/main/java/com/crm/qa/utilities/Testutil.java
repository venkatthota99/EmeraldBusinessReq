package com.crm.qa.utilities;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.crm.qa.base.TestBase;

public class Testutil extends TestBase {
	
	
	public static long Page_Load_Timeout = 40;
	public static long Implicit_wait = 30;
	
	
public static  void WriteExcelData(int x, int y, String s) throws IOException{
		
		FileInputStream Fis = new FileInputStream("C:\\Users\\vethota\\Desktop\\Selenium\\Test Data\\Product Price\\ProductPriceComparision.xlsx");
		FileOutputStream Fos = null;
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet("ProductPrice");
		XSSFRow row = null;
		XSSFCell cell = null;
		
		row = sheet.getRow(x);
		if(row==null)
			row=sheet.createRow(x);
		
		cell = row.getCell(y);
		if(cell==null)
			cell=row.createCell(y);
		
		cell.setCellValue(s);
		
		Fos= new FileOutputStream("C:\\Users\\vethota\\Desktop\\Selenium\\Test Data\\Product Price\\ProductPriceComparision.xlsx");
		workbook.write(Fos);
		Fos.close();
		
	}
	
	
}


	