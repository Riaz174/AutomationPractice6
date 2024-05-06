package Capstone.AutomationPractice6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes6 {
	public static WebDriver driver;
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice6\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
//		WebElement sbutton = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
//		sbutton.click();
//		Thread.sleep(6000);
//		WebElement sbox = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
//		sbox.sendKeys("Computer");
		WebElement phonefield = driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
		phonefield.sendKeys("john@gmail.com");
		Thread.sleep(3000);
		WebElement pword = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pword.sendKeys("abcdef");
		WebElement loginfield = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		loginfield.click();
		Thread.sleep(6000);
		WebElement forgotpword = driver.findElement(By.xpath("//*[text()='Forgot password?']"));//This is text()function in xpath.
		forgotpword.click();
	}
	
		
	}

