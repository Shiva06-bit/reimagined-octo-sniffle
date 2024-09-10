package Exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDrivern {
	
	static String excelpath = System.getProperty("user.dir")+"\\src\\test\\resources\\EXCEL\\tEST.xlsx";

	
	public static  String Readdata(int row,int col) throws IOException {
		
		
				
		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		return wb.getSheet("Testdataproduct").getRow(row).getCell(col).getStringCellValue();
		
	}
	
	public  static void writedata(int row,int col,String value) throws IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Testdataproduct").getRow(row).createCell(col).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		fos.close();
		
	}
}
