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

//we are looking to read files, in order for us to work with files
//we bring in apache poi library, inside library we have set of interfaces and 
//classes that will help us read and extract data from excel 
//so first we must have a filepath, then bring obj of FIS and 
//then we will work with excel specific classes, sowe will build obj of workbooktype, from wbook type we excess shet and can caluclate rows and cols
//we use nested loop to loop over rows and to loop over cols
//from sheet, we access getrow and getcol and convert to string