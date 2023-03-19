package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalSQA {
	public static void main(String args[]) throws IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/");
		driver.manage().window().maximize();
		WebElement testing = driver
				.findElement(By.xpath("//a[text()='Tester’s Hub']//parent::li[@id='menu-item-2822']"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(testing).perform();
		WebElement submenu = driver.findElement(
				By.xpath("//span[text()='Demo Testing Site']//parent::a[@class='no_border sub_menu_parent']"));
		Thread.sleep(2000);
		action.moveToElement(submenu).perform();

		WebElement click1 = driver.findElement(By.xpath(
				"//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-2831']//span[text()='Tooltip']"));

		click1.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(10,500)");
		WebElement idd = driver.findElement(By.xpath("//li[@id='Video Based']"));
		idd.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(25,200)");
		WebElement dislike = driver.findElement(By.xpath("//button[@title='I dislike this' and @class='ui-widget ui-button-icon-only ui-controlgroup-item ui-button ui-corner-right']"));
		dislike.click();
		WebElement slider=driver.findElement(By.xpath("//span[text()='Sliders']//parent::span[@class='link_span']"));
		slider.click();

	}
}
