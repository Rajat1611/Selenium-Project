package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajat.parmar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spec-india.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='btn-outline-primary'])")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//a[@class='research'])")).click();
		//driver.findElement(By.xpath("(//button[@class='button'])")).click();
		//driver.findElement(By.xpath("(//button[@class='button'])")).click();
		//driver.findElement(By.xpath("(//a[@class='research#researchpipeline'])")).click();
		//driver.get("https://www.spec-india.com");
		
		//driver.findElement(By.xpath("(//a[@class='https://www.spec-india.com/hire-bi-developer'])")).click();
		driver.close();
	}	
}
