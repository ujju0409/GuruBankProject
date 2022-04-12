package com.qa.guru99.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.guru99.factory.Driverfactory;
import com.qa.guru99.pages.HomePage;
import com.qa.guru99.pages.LoginPage;

public class BaseTest {
  public Properties prop;
  public WebDriver driver;
  public Driverfactory dp;
  public LoginPage lp;
  public HomePage hp;
  
	
	@BeforeTest
	public void setUp() {
		dp = new Driverfactory();
		  prop=dp.init_prop();
		  driver=dp.init_driver(prop);
		  lp= new LoginPage(driver);
		  hp= new HomePage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
