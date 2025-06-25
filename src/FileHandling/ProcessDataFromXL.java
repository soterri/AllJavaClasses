package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProcessDataFromXL {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\JohnN\\eclipse-workspace\\JavaClasses\\testdata\\Book1.xlsx";

		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("TestData");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int cols =sheet.getRow(0).getLastCellNum();
		
		List<Map<String,String>> xlData=new ArrayList<>();
		
	}
}