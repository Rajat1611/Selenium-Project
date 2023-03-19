package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String args[]) throws InterruptedException, EncryptedDocumentException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		WebElement radio = driver.findElement(By.xpath("//label[text()='Impressive']"));
		radio.click();
	}
}