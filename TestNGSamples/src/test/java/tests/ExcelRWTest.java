package tests;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelRWTest {
@Test
public void ReadExcel() throws Exception {
		FileInputStream fis = new FileInputStream("./TestData/ExcelData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("LoginPageData");
		
		for(int i=0; i<=sh.getLastRowNum(); i++) {
			Row row = sh.getRow(i);
			for(int j=0; j<=row.getLastCellNum()-1; j++) {
				System.out.println(row.getCell(j).getStringCellValue() + "||");
			}
			System.out.println("");
		}
	}

@Test
public void WriteExcel() throws Exception{
	FileInputStream fis = new FileInputStream("./TestData/ExcelData.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	Sheet sh = wb.getSheet("LoginPageData");
	sh.getRow(3).createCell(0).setCellValue("Maverick");
	sh.getRow(3).createCell(1).setCellValue("Password123");
	
	FileOutputStream fout = new FileOutputStream(new File("./TestData/ExcelData.xlsx"));
	wb.write(fout);
	
	fout.close();
	
}
	
}
