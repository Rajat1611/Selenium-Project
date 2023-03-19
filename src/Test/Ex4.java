package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajat.parmar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://zydusfrontline.com/");

		driver.manage().window().maximize();

		// WebElement email = driver.findElement(By.xpath("//input[@class='form-control
		// input ng-pristine ng-invalid ng-touched']"));
		// WebElement password =
		// driver.findElement(By.xpath("//input[@class='form-control input ng-pristine
		// ng-invalid ng-touched']"));
		WebElement email = driver.findElement(By.xpath(("//input[@formcontrolname='username']")));
		WebElement password = driver.findElement(By.xpath(("//input[@formcontrolname='password']")));
		Thread.sleep(2000);
		email.sendKeys("1733");
		password.sendKeys("Liva123$");
		WebElement submit = driver.findElement(By.xpath("//button[@class='signin']"));
		// WebElement
		// submit=driver.findElement(By.xpath(("//button[@class='signin']")).click();
		submit.click();
		Thread.sleep(3000);
		WebElement scroll = driver.findElement(By.xpath("/html/body/app-root/div/app-content-layout/div/div/div"));
		Thread.sleep(3000);
		scroll.click();
		WebElement exp = driver.findElement(By.xpath("//a[@class='ng-tns-c6-0 ng-star-inserted']"));
		Thread.sleep(3000);
		exp.click();
		WebElement salary = driver.findElement(By.xpath("//a[@class='ng-tns-c6-0 ng-star-inserted']"));
		Thread.sleep(3000);
		salary.click();
		WebElement salary1 = driver.findElement(By.xpath("//span[@class='ng-tns-c6-0']"));
		Thread.sleep(3000);
		salary1.click();
		WebElement salary2 = driver.findElement(By.xpath("//li[@class='ng-tns-c6-0 ng-star-inserted active sidebar-dropdown']"));
		 Thread.sleep(3000);
		 salary2.click();

		WebElement salary3 = driver.findElement(
				By.xpath("//span[@class='sidebar-submenu ng-tns-c6-0 ng-trigger ng-trigger-slide ng-star-inserted']"));
		salary3.click();
		// WebElement scroll =
		// driver.findElement(By.xpath("//span[@class='menu-close']"));
		// WebElement Scroll1 =
		// driver.findElement(By.xpath("//span[@class='ng-tns-c6-0']"));
		// WebElement scroll1 =
		// driver.findElement(By.xpath("//div[@class='page-wrapper']"));
		// WebElement scroll =
		// driver.findElement(By.xpath("//div[@class='hambuger-open']"));
		// WebElement scroll1 =
		// driver.findElement(By.xpath("//div[@class='page-wrapper']"));
		// WebElement scroll1 = driver.findElement(By.xpath("))
		// WebElement scroll1 = driver.findElement(By.className("//i [@class='fas
		// fa-bars']"));

		// driver.findElement(By.class())
		// scroll1.click();
		// scroll.click();
		Thread.sleep(2000);
		// scroll.click();

	}
}
