package Capstone.AutomationPractice6;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.primitives.Shorts;

import Amazon.pages.HomeOfFacebook6;
import Common.Utilities;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestOfVerification6 extends Utilities {

  @Test(priority = 2,dependsOnMethods = "signin")
  public void f() throws IOException, InterruptedException {
	  HomeOfFacebook6 home = new HomeOfFacebook6(driver);
	  String tx = home.VerificationOfText();
	  shots();
	  System.out.println(tx);
	 // Assert.assertEquals(tx, "Facebook helps you connect and share with the people in your life.");
	  SoftAssert st = new SoftAssert();
	  Thread.sleep(3000);
	  shots();
	  st.assertEquals(tx, "Facebook helps you connect and share with the people in your life.");
	  System.out.println("This is after assertion");
	  Thread.sleep(3000);
	 shots();
	  st.assertAll();
  }
    
  
  @Test(priority = 1)
  public void signin() {
	  HomeOfFacebook6 home = new HomeOfFacebook6(driver);
	  home.UserName("id");
	  home.Password("id");
	  home.login();
  
	  }
 		  
	  }

  
  


