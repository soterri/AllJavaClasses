package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "C:\\Users\\JohnN\\OneDrive\\Desktop\\XLSX\\Book1.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		//accessing workbook
		Workbook wbook = new XSSFWorkbook(fis);
		
		//accessing sheet
		Sheet sheet = wbook.getSheet("Sheet1");
		
		//accessing row
		Row row1 = sheet.getRow(0);
		
		//accessing cell
		Cell cell=row1.getCell(1);
		
		//get value from cell
		String r1cell2=cell.toString();
		System.out.println(r1cell2);
		
		//to get "Falls Church" on the Sheet1 excel
		Row row2 = sheet.getRow(2);
		Cell cell2 = row2.getCell(2);
		String r2cell3 = cell2.toString();
		System.out.println(r2cell3);
		
		//access VA
		String r3cell3=sheet.getRow(2).getCell(3).toString();
		System.out.println(r3cell3);
		
		//to retrieve values based on type
		double cellv= sheet.getRow(1).getCell(3).getNumericCellValue();
		System.out.println((int)cellv);
		
		//how to get zip cod in string format
		String valC=sheet.getRow(1).getCell(3).toString();
		String[] array = valC.split("\\.");
		System.out.println(array[0]);
	}

}
	