package Test;

import java.util.*;
import java.awt.Button;
import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DemoQA {
	public static void main(String args[]) throws InterruptedException, EncryptedDocumentException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
		element.click();
		WebElement textbox = driver.findElement(By.xpath("//li[@id='item-0']"));
		textbox.click();

		String path = "E:\\ReadDataCSV.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wib = WorkbookFactory.create(fis);
		Sheet sheet1 = wib.getSheet("Sheet1");

		String fname = sheet1.getRow(1).getCell(0).getStringCellValue();
		String email = sheet1.getRow(1).getCell(1).getStringCellValue();
		String curraddr = sheet1.getRow(1).getCell(2).getStringCellValue();
		String permaddr = sheet1.getRow(1).getCell(3).getStringCellValue();
	
		WebElement userid = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement useremail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement usercadd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement userpadd = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));

		userid.sendKeys(fname);
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		useremail.sendKeys(email);
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		usercadd.sendKeys(curraddr);
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		userpadd.sendKeys(permaddr);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(500);
		WebElement submitt = driver.findElement(By.xpath("//button[@id='submit']"));
		submitt.click();
		Thread.sleep(1000);
		WebElement checkbox = driver.findElement(By.xpath("//li[@id='item-1']"));
		checkbox.click();
		Thread.sleep(2000);
		WebElement checkbox1 = driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']"));
		checkbox1.click();
		Thread.sleep(5000);

		WebElement checkbox2 = driver.findElement(By.xpath("//button[@class='rct-option rct-option-collapse-all']"));
		checkbox2.click();
		WebElement Radiobutton1 = driver.findElement(By.xpath("//li[@id='item-2']"));
		Radiobutton1.click();
		Thread.sleep(2000);

		WebElement Webtables = driver.findElement(By.xpath("//li[@id='item-3']"));
		Webtables.click();
		WebElement Webtables1 = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
		Webtables1.click();

		WebElement addrecord = driver.findElement(By.xpath("//button[@id='submit']"));
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rajat");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Parmar");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("rajat.parmar@spec-india.com");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("25");
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("100000");
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("QLT");
		addrecord.click();

	}

}
