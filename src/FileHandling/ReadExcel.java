package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\JohnN\\OneDrive\\Desktop\\XLSX\\Book1.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		// to get an object of workbook type
		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Sheet1");

		// need to find numbers or rows
		int rows = sheet.getPhysicalNumberOfRows();

		// find numbers of cols
		int colls = sheet.getRow(0).getLastCellNum();

		// get data from all rows and columns - use nested loop
		for (int r = 0; r < rows; r++) {// iterates over rows

			for (int c = 0; c < colls; c++) {
				String cellVal = sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" ");

			}
			System.out.println();

		}

	}
}
