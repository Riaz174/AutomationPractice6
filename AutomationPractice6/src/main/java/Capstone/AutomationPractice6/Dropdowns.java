package Capstone.AutomationPractice6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice6\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement createaccount = driver.findElement(By.xpath("//*[text()='Create new account']"));
		createaccount.click();
		Thread.sleep(6000);
//		WebElement fname = driver.findElement(By.xpath("//input[@aria-label='First name']"));
//		fname.sendKeys("John");	
//		Thread.sleep(6000);
//		WebElement lname = driver.findElement(By.xpath("//input[@aria-label='Last name']"));
//		lname.sendKeys("Doe");
//		Thread.sleep(3000);
//		WebElement mobile = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
//		mobile.sendKeys("john@gmail.com");
//		Thread.sleep(3000);
//		WebElement npword = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
//		npword.sendKeys("zebra");
//		Thread.sleep(6000);
		WebElement birthmonth = driver.findElement(By.name("birthday_month"));
		Select ob = new Select(birthmonth);
		ob.selectByIndex(7);
		Thread.sleep(6000);
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select ob1 = new Select(birthday);
		ob1.selectByValue("27");
		Thread.sleep(6000);
		WebElement birthyear = driver.findElement(By.name("birthday_year"));
		Select ob2 = new Select(birthyear);
		ob2.selectByValue("1953");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();

	}

}
