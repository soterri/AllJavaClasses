package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToMap {

	public static void main(String[] args) throws IOException {

		//File Path Definition - this defines the path to my excel file on my local machine
		//the dbl backslashes are used to escape the backslash character in java string
		String filePath = "C:\\Users\\JohnN\\eclipse-workspace\\JavaClasses\\testdata\\Book1.xlsx";

	    //creating the object of FIS which makes the connection
		//b/w the java code and file
		FileInputStream fis = new FileInputStream(filePath);

		//Load the workbook, loads the entire excel workbook into memory
		//book represents the excel file
		Workbook book = new XSSFWorkbook(fis);

		//accessing sheet, retrieves a specific worksheet from the workbook
		Sheet sheet = book.getSheet("TestData");

		//get row and column count
		//gets the # of physically used rows
		int rows = sheet.getPhysicalNumberOfRows();
		
		//gets the # of cols in the first row
		//getLastCellNum returns index + 1, so if the last cell is at index 3 it returns 4
		int cols = sheet.getRow(0).getLastCellNum();

		//creating an empty list to store each row as a map
		//each Map<String, String> will rep one row of data, mapping
		//column name -> cell value
		List<Map<String, String>> listMap = new ArrayList<>();

		//loop over data rows, starts at r=1 to skip the header row
		//loops through each row of actual data
		for (int r = 1; r < rows; r++) {

			//creates a new map for each row
			//to store k,v pair of cols names and cell values
			Map<String, String> map = new LinkedHashMap<>();
			
			//loops over cols in the row
			for (int c = 0; c < cols; c++) {

				//get column header as key
				String key = sheet.getRow(0).getCell(c).toString();
				
				//get cell value as string, gets actual value from the current row and column
				String value = sheet.getRow(r).getCell(c).toString();
				
				//put into map, puts header and its corresponding cell value into the map
				map.put(key, value);

			}
			//add map to list - adds the completed row-map to list
			listMap.add(map);
		}
		System.out.println(listMap);

	}
}
