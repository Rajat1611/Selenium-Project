package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spectrumdb {
	public static void main(String args[]) throws IOException, InterruptedException {
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://spectrumdbperformance.specindia.com/");
	
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String path = "E:\\Login_Details.xlsx";
		FileInputStream file = new FileInputStream (path);
		Workbook book  = WorkbookFactory.create(file);
			
		Sheet sheet1 =book.getSheet("Sheet1");
		
		String userId = sheet1.getRow(1).getCell(0).getStringCellValue();
		String userID1 =userId.replaceAll(" ", "");
		String password = sheet1.getRow(1).getCell(1).getStringCellValue();
		String password1 =password.replaceAll(" ", "");
		System.out.printf("User id is: "+ userId);
		System.out.println("");
		System.out.printf("Password is : "+ password);
		//driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		
		//String str = Long.toString((long)userId);
		WebElement user = driver.findElement(By.xpath("//input[@id='UserId']"));
		WebElement passwordd = driver.findElement(By.xpath("//input[@id='Password']"));
		
		user.sendKeys(userID1);
		passwordd.sendKeys(password1);
		WebElement submit = driver.findElement(By.xpath("//button[@id='btnSubmit']"));
		//System.out.printf(user+" " +passwordd);
		Thread.sleep(8000);
		submit.click();
		}

	}
}
