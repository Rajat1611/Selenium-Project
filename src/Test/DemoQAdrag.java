package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQAdrag {

	public static void main(String args[]) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(100);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(10,500)");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDropBy(drag, 275, 25).build().perform();

	}
}
