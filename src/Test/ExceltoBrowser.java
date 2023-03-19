package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExceltoBrowser {
	private static final String STRING = null;
	private static final String NUMERIC = null;
	private static final String BOOLEAN = null;

	public static void main(String args[]) throws IOException, InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://zydusfrontline.com/");

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String path = "E:\\Login.xls";
	FileInputStream input = new FileInputStream(path);

	XSSFWorkbook workbook = new XSSFWorkbook(input);
		//XSSFWorkbook workbook;
		XSSFSheet sheet = workbook.getSheetAt(0); // it takes index of sheet

	double rows = sheet.getFirstRowNum();
	short cols= sheet.getRow(1).getLastCellNum();
	//double rows = sheet1.getRow(1).getCell(0).getNumericCellValue();
	//String cols = sheet1.getRow(1).getCell(1).getStringCellValue();
	for(int r=0; r<=rows ; r++)
	{
		XSSFRow row = sheet.getRow(r);
		for(int c=0; c<cols;c++)
		{
		XSSFCell cell = row.getCell(c);

			switch(cell.getCellType())
			{
			case STRING : System.out.print(cell.getStringCellValue()); break;
			case NUMERIC : System.out.print(cell.getNumericCellValue()); break;
			case BOOLEAN : System.out.print(cell.getBooleanCellValue()); break;
			}
			System.out.print(" | ");
		}
		System.out.println();
	}
	}
}