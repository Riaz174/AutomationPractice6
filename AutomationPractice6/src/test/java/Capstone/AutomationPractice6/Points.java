package Capstone.AutomationPractice6;

import org.testng.annotations.Test;

import Amazon.pages.HomeOfFacebook6;
import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Points extends Utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  HomeOfFacebook6 home = new HomeOfFacebook6(driver);
	  home.UserName(n);
	  home.Password(s);
	  home.login();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Ali", "abcdef" },
      new Object[] { "Saleem", "ghijkl" },
      new Object [] {"Rabia", "mnopqrs" },
    };
  }
}
