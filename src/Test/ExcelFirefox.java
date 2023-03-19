package Test;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opencsv.CSVReader;

public class ExcelFirefox {
	public static void main(String args[]) throws IOException, InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://zydusfrontline.com/");

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String path = "E:\\Login.xls";
		FileInputStream file = new FileInputStream (path);
		Workbook book  = WorkbookFactory.create(file);
			
		Sheet sheet1 =book.getSheet("Sheet1");
		
		double userId = sheet1.getRow(1).getCell(0).getNumericCellValue();
		String password = sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.printf("User id is: "+ userId);
		System.out.println("");
		System.out.printf("Password is : "+ password);
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		
		String str = Long.toString((long)userId);
		WebElement user = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
		WebElement passwordd = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		user.sendKeys(str);
		passwordd.sendKeys(password);
		WebElement submit = driver.findElement(By.xpath("//button[@class='signin']"));
		Thread.sleep(5000);
		submit.click();
		//		
		//userId.sendKeys(userId.getStringCellValue());
		//password.sendKeys(password.getStringCellValue());
//		WebElement usernameField = driver.findElement(By.id("username"));
//        WebElement passwordField = driver.findElement(By.id("password"));
//        XSSFRow row = sheet1.getRow(1);
//        XSSFCell usernameCell = row.getCell(0);
//        XSSFCell passwordCell = row.getCell(1);
//        usernameField.sendKeys(usernameCell.getStringCellValue());
//        passwordField.sendKeys(passwordCell.getStringCellValue());
		
		
		
		//driver.findElement(By.xpath(("//input[@formcontrolname='username']")).sendKeys(userId);
		//driver.findElement(By.xpath(("//input[@formcontrolname='password']")).sendKeys(password);
//		
		
		
//		FileInputStream file = new FileInputStream("E:\\Login.xls");
//
//		XSSFWorkbook book = new XSSFWorkbook(file);
//		XSSFSheet sheet = book.getSheet("Sheet1");
//		int rowCount = sheet.getLastRowNum();

//		for (int i = 1; i < rowCount; i++) {
//
//			XSSFRow currentrow = sheet.getRow(i);
//			{
//				String user_id = currentrow.getCell(1).getStringCellValue();
//				String password = currentrow.getCell(2).getStringCellValue();
//				
//				
//				System.out.printf("User id is: ",user_id);
//				System.out.printf("Password is: ",password);
//				//driver.findElement(By.xpath(("//input[@formcontrolname='username']")).sendKeys(user_id));
//				//
//				Thread.sleep(2000);
//				//WebElement submit = driver.findElement(By.xpath("//button[@class='signin']"));
//				
//			}

		}
	}

