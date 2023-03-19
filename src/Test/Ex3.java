package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajat.parmar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://spectrum.specindia.com/");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("emal"));
		WebElement password = driver.findElement(By.name("passwod"));
		WebElement email1=(WebElement) driver.findElements(By.xpath("//input[@id='emal']"));
		WebElement password1=driver.findElement(By.xpath("//input[@name='passwod']"));
		email1.sendKeys("rajat.parmar@spec-india.com");
		password1.sendKeys("Rajat@1611");

		email1.clear();
		password1.clear();
		WebElement submit = driver.findElement(By.id("Submit"));
		driver.findElement(By.xpath("(//a[@class='btn-outline-primary'])")).click();
		submit.click();

	}
}
