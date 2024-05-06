package Capstone.AutomationPractice6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators6 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice6\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		Thread.sleep(6000);
		WebElement bseller = driver.findElement(By.linkText("Best Sellers"));
		bseller.click();
		Thread.sleep(6000);
		WebElement grocery = driver.findElement(By.linkText("Groceries"));
		grocery.click();
		Thread.sleep(6000);
		WebElement mcare = driver.findElement(By.linkText("Medical Care"));
		mcare.click();
		Thread.sleep(6000);
		WebElement sfield = driver.findElement(By.name("field-keywords"));
		sfield.sendKeys("Computer");

	}

}
