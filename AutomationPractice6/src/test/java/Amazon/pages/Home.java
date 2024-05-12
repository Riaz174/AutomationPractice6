package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Email address or phone number']") WebElement sign;
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void signinClick() {
		sign.sendKeys("jhon@gmail.com");
		
	}

}
