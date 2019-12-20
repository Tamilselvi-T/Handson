package phpTravels;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.DateFormatConverter;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login {
	
	public static String logindata(int a, int b) throws InvalidFormatException, IOException {
		
		File file =    new File("F:\\Excel_Selenium\\UserData.xlsx");
		XSSFWorkbook wrkbook = new XSSFWorkbook(file);
		XSSFSheet wrksheet = wrkbook.getSheet("Sheet1");
		
		
		String str_Value = wrksheet.getRow(a).getCell(b).getStringCellValue();
				return str_Value; 
				
	}
	
public static String logindata1(int a, int b) throws InvalidFormatException, IOException {
		
		File file =    new File("F:\\Excel_Selenium\\UserData.xlsx");
		XSSFWorkbook wrkbook = new XSSFWorkbook(file);
		XSSFSheet wrksheet = wrkbook.getSheet("Sheet1");
		
		int int_Value = (int)wrkbook.getSheetAt(0).getRow(a).getCell(b).getNumericCellValue();
		
		    String str = NumberToTextConverter.toText(int_Value);
		
		return str;
		
	}

public static String logindata2(int a, int b) throws InvalidFormatException, IOException {
	
	File file =    new File("F:\\Excel_Selenium\\UserData.xlsx");
	XSSFWorkbook wrkbook = new XSSFWorkbook(file);
	XSSFSheet wrksheet = wrkbook.getSheet("Sheet1");
		
	Date date1 = wrksheet.getRow(a).getCell(b).getDateCellValue();
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	String str = df.format(date1);
	   
	return str;
	
}
}
