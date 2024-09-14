package testcase_2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class Reading_Data_from_Excel {
	

@Test
public void fetching_Data_from_Excel() throws IOException {
	
	FileInputStream  fis = new FileInputStream("D:\\java\\automation\\Data\\Book1.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	XSSFRow row = sheet.getRow(1);
	XSSFCell cell = row.getCell(0);
	System.out.println(row.getCell(0));
	System.out.println(row.getCell(1));
	
	
}
		
		
	

}
