package Capstone.AutomationPractice6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice6\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement alerts = driver.findElement(By.name("alert"));
		alerts.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement confirm = driver.findElement(By.name("confirmation"));
		confirm.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement prom = driver.findElement(By.name("prompt"));
		prom.click();
		Thread.sleep(6000);
//		driver.switchTo().alert().sendKeys("Alert is displayed");
//		driver.switchTo().alert().accept();
//		Thread.sleep(6000);
		Alert promptAlert = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert Text is " + " _ " + alertText);
		promptAlert.sendKeys("Text User");
		Thread.sleep(6000);
		promptAlert.accept();
		
		

	}

}
