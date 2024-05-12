package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	public WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Email address or phone number']") WebElement email;
	@FindBy(id = "pass") WebElement password;
	public Sign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void emailField() {
		email.sendKeys("john@gmail.com");
	}
	public void PasswordField() {
		password.sendKeys("abcdef");;
	}

}
