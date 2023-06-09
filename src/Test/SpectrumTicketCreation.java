package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpectrumTicketCreation {

	private static final TimeUnit TimeUnit = null;
	WebDriver driver;

	public void login() throws InterruptedException {
		driver = new EdgeDriver();
		//driver = new ChromeDriver();
		driver.get("https://spectrumdbperformance.specindia.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement userid = driver.findElement(By.xpath("//input[@id='UserId']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		Thread.sleep(6000);
		userid.sendKeys("amisha.shah");
		password.sendKeys("Amisha@123");

		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit().SECOND)
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait()
		WebElement button = driver.findElement(By.xpath("//button[@id='btnSubmit']"));
		Actions submitt = new Actions(driver);
		Thread.sleep(10000);
		submitt.moveToElement(button);
		button.click();
		Thread.sleep(10000);
	}

	/**
	 * @throws InterruptedException
	 */
	public void TicketCreation() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.xpath("//a[@class='cd-dropdown-trigger']"));
		Actions action = new Actions(driver);
		action.moveToElement(dropdown).perform();
		Thread.sleep(5000);
		WebElement Red = driver.findElement(By.xpath("//li[@class='has-children RED_menu ']"));
		Actions action1 = new Actions(driver);
		action.moveToElement(Red).perform();
		Thread.sleep(5000);
		// WebElement ticket = driver.findElement(By.xpath("//a[@id='accordiontest']"));
		WebElement ticket = driver.findElement(By.xpath("//*[@id=\"accordiontest\"]/ul/li[3]/ul/li[1]/li[1]/a"));
		ticket.click();
		Thread.sleep(6000);
		WebElement createticket = driver.findElement(By.xpath("//button[@id='createTicket']"));
		createticket.click();
		Thread.sleep(6000);
		// WebElement form=driver.findElement(By.xpath("//form[@id='ticketSection']"));
		// driver.switchTo().frame(form);

		// driver.switchTo().frame(driver.findElement(By.xpath("//form[@id='ticketSection']")));
		WebElement project = driver.findElement(By.xpath("//input[@placeholder='Select Project']"));
		project.clear();
		WebElement Application = driver.findElement(By.xpath("//input[@placeholder='Select Application']"));
		Application.clear();
		Thread.sleep(2000);

		// WebElement project1 = driver.findElement(By.xpath("//input[@class='k-input
		// k-invalid' and @placeholder='Select Project']"));
		// WebElement project1 =
		// driver.findElement(By.xpath("//*[@id='ticketSection']/div[1]/div[1]/span/span/span[1]"));

		// Select s = new Select(project1);
		// WebElement env=driver.findElement(By.xpath("(//*[@class='k-invalid'])[1]"));
		// Thread.sleep(2000);
		// Select s=new Select(env);
		// s.selectByValue("QA");
		// System.out.print(s);
		// s.selectByVisibleText("C00061-C02075");
		// s.selectByValue(2075);
		// s.selectByIndex(42);
		// s.selectByIndex(2075);
		project.sendKeys("C00061-C02075");
		Thread.sleep(2000);
		project.sendKeys(Keys.ENTER);
		WebElement env = driver.findElement(By.xpath("//input[@placeholder='Select Environment']"));
		env.sendKeys("QA");
		Thread.sleep(2000);
		project.sendKeys(Keys.ENTER);
		// Application.sendKeys("All");
		Thread.sleep(2000);
		project.sendKeys(Keys.ENTER);
		WebElement feature = driver.findElement(By.xpath("//input[@placeholder='Select Feature']"));
		feature.sendKeys("None");
		Thread.sleep(1000);
		project.sendKeys(Keys.ENTER);
		WebElement aff = driver.findElement(By.xpath("//input[@placeholder='Select Affected Version']"));
		aff.sendKeys("AC2308-4.28.0");
		Thread.sleep(1000);
		project.sendKeys(Keys.ENTER);
		WebElement sta = driver.findElement(By.xpath("//input[@placeholder='Select Ticket As']"));
		sta.sendKeys("Bug");
		Thread.sleep(1000);
		project.sendKeys(Keys.ENTER);
		WebElement type = driver.findElement(By.xpath("//input[@placeholder='Select Type']"));
		type.sendKeys("Functional");
		Thread.sleep(1000);
		project.sendKeys(Keys.ENTER);
		WebElement sev = driver.findElement(By.xpath("//input[@placeholder='Select Severity']"));
		sev.sendKeys("Medium");
		Thread.sleep(1000);
		project.sendKeys(Keys.ENTER);
		WebElement title = driver.findElement(By.xpath("//textarea[@id='txtTitle']"));
		Thread.sleep(1000);
		title.sendKeys("User is not able to login Properly");
		WebElement tarea = driver
				.findElement(By.xpath("//*[@id=\"ticketSection\"]/div[8]/div[1]/div/table/tbody/tr[2]/td/iframe"));
		driver.switchTo().frame(tarea);

		Thread.sleep(2000);
		WebElement Narration = driver.findElement(By.xpath("(//body[@autocorrect='off'])[1]"));
		Thread.sleep(1000);
		Narration.sendKeys(
				"Please Find Attachment    \nAcutal Result = User is not able to Login   \n Expected Result = User should be able to login with valid credentials ");
		Narration.click();
		Thread.sleep(2000);
		Narration.sendKeys(Keys.CONTROL + "a");
		Narration.sendKeys(Keys.CONTROL + "b");
		// driver.findElement(By.xpath(""));
		// driver.close();
		// arration.sendKeys("A");
		// WebElement submit=driver.findElement(By.xpath("//button[@class='btn-gray'"));
		// submit.click();
//		// Thread.sleep(6000);
//		// WebElement drp = driver.findElement(By.xpath("//input[@class='k-input
//		// k-invalid']"));
//		drp.click();
//		Thread.sleep(2000);
//		// drp.clear();
//		action.doubleClick(drp).perform();
//		drp.sendKeys("BI_SEC-WFAUTO");
//
//		WebElement get = driver
//				.findElement(By.xpath("//*[@id=\"ticketSection\"]/div[1]/div[1]/span/span/span/span[2]"));
//		get.click();

		// WebElement Project=driver.findElement(By.xpath("//li[@class='k-item
		// ng-scope']"));
		// Project.click();

		// WebElement option =
		// driver.findElement(By.xpath("//*[@id=/html/body/div[19]/div/div[2]/ul/li[7]"));
		// option.click();

	}

	public static void main(String args[]) throws InterruptedException {
		SpectrumTicketCreation sc = new SpectrumTicketCreation();
		sc.login();
		sc.TicketCreation();
	}
}