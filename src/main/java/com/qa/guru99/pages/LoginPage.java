package com.qa.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//1 private  By locator 
	
	private WebDriver driver;
	
	
	private By bankprojectlink= By.linkText("Bank Project");
	private By userid = By.name("uid");
	private By psw= By.name("password");
	private By loginbtn=By.name("btnLogin");
	private By rest= By.name("btnReset");
	
	//2   public  crate constructor 
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	// 3 public actions 
	public HomePage dologin(String ud, String pw)
	{
		driver.findElement(userid).sendKeys(ud);
		driver.findElement(psw).sendKeys(pw);
		driver.findElement(loginbtn).click();
		return  new HomePage(driver);
		 
	}	
    public  String getTitle()  
    {
    	 return driver.getTitle();
    	 
    }
	  
    public String getUrl()
    {
    	return driver.getCurrentUrl();
    	
    }
    public boolean resetlinkpresent() {
    	return driver.findElement(rest).isDisplayed();
    }    
    
	
}
