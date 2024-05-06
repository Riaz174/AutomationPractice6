package Capstone.AutomationPractice6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flights {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice6\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/?locale=en_US&siteid=1&semcid=US.B.BING.BT-c-EN.GT&semdtl=a1686369380.b11323813544955738.g1kwd-82739181266510:loc-190.e1c.m16e8bd0aba7d516b8f24eb68bbcba4936.r1568147637bed13b77227d7e85b4dfcbeaf264a73fe13f4b6af3b5cb4b8ac6b23.c1JNN8WhQlMu7lSV73wbu0Pw.j151777.k1.d182738594860153.h1e.i1.l1.n1.o1.p1.q1.s1.t1.x1.f1.u1.v1.w1&msclkid=6e8bd0aba7d516b8f24eb68bbcba4936");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flight = driver.findElement(By.xpath("//*[text()='Flights']"));
		flight.click();
		Thread.sleep(6000);
		WebElement departdate = driver.findElement(By.name("EGDSDateRange-date-selector-trigger"));
		departdate.click();
		Thread.sleep(10000);
		WebElement dateofdepart = driver.findElement(By.xpath("//*[@aria-label='Saturday, May 25, 2024']"));
		Actions action = new Actions(driver);//Create object of Actions class
		action.moveToElement(dateofdepart).click().build().perform();
		Thread.sleep(10000);
		WebElement link = driver.findElement(By.xpath("//*[text()='Done']"));
		link.click();
		Thread.sleep(6000);
		WebElement traveller = driver.findElement(By.xpath("//*[@class='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']"));
		action.moveToElement(traveller).click().build().perform();
		
		

	}

}
