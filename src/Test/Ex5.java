package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajat.parmar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://spectrum.specindia.com/");
		//Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//input[@id='UserId']"));
		///WebElement email = driver.findElement(By.xpath("//input[@id='UserId']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));

		user.sendKeys("rajat.parmar");
		password.sendKeys("Rajat@1611");

		//user.clear();
		//password.clear();
		// WebElement submit = driver.findElement(By.id("Submit"));
		WebElement submit = driver.findElement(By.xpath("//button[@id='btnSubmit']"));
		//WebElement drawer = driver.findElement(By.xpath("//div[@class='fadbg']"));
		WebElement search = driver.findElement(By.xpath("//span[@class='k-widget k-autocomplete k-header search-consultant k-autocomplete-clearable k-state-default']"));
		search.sendKeys("Rajat Parmar");
		submit.click();

	}
}
