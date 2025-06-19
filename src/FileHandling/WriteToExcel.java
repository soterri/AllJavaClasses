package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
	
	public static void main(String[] args) throws IOException {
		
		//user dir will bring you location from where your java is being triggered
		//and it will give location starting from user/syntax/workspace
		String filePath = "C:\\Users\\JohnN\\eclipse-workspace\\JavaClasses\\testdata\\Book1.xlsx";
	
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook wbook = new XSSFWorkbook(fis);
		
		//writing into existing sheet
		Sheet sheet = wbook.getSheet("Sheet1");
		
		sheet.getRow(0).createCell(5).setCellValue("Country");
		
		sheet.createRow(3).createCell(0).setCellValue("Max");
		
		Sheet customSheet = wbook.createSheet("TestSheet");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		
		wbook.write(fos);
	
	}

}
