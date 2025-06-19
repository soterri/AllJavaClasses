package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\JohnN\\OneDrive\\Desktop\\XLSX\\Book2.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook wbook = new XSSFWorkbook(fis);

		Sheet sheet = wbook.getSheet("Task");

		// need to find numbers or rows
		int rows = sheet.getPhysicalNumberOfRows();

		// find numbers of cols
		int colls = sheet.getRow(0).getLastCellNum();

		// get data from all rows and columns - use nested loop
		for (int r = 0; r < rows; r++) {// iterates over rows

			for (int c = 0; c < colls; c++) {
				String cellVal = sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal + " ");

			}
			System.out.println();

		}

	
}
}


//created a testdata folder, this folder lives inside java project, 
/*all the modules are specfic, our source package, we use to write src code
 * reference libraries any additional files besides the default java library will such as jar files
 * any third party libraries will be stored in referenced library
 * any library that will not be jre will be in reference library
 * such apache poi
 * we have configs folder. we store properties files
 * we have testdata folder that holds different excel files
 * we can perform testing with different sets of data
 * if have large sets of data, advisable to store in xternal file
 * best choice would to excel files
 * 
 * 
 *
 *
 */
 