package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook6 {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Facebook helps you connect and share with the people in your life.')]") WebElement text;
	@FindBy(name = "email") WebElement email;
	@FindBy(name = "pass") WebElement pword;
	@FindBy(name = "login") WebElement login;
	public HomeOfFacebook6(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String VerificationOfText() {
		String tx = text.getText();
		return tx;
	}
	public void UserName(String id) {
		email.sendKeys(id);
	}
	public void Password(String id) {
		pword.sendKeys(id);
	}
	public void login() {
		login.click();
		
	}

}
