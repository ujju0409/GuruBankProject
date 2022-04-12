package com.qa.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	
	//1 prtivate By locator
	  private By header= By.xpath("//h2[text()='Gtpl Bank']");
	  private By managerheading = By.cssSelector(".heading3");
	  private By image1= By.xpath("//img[@src='../images/1.gif']");
	  private By logoutbtn = By.xpath("//a[text()='Log out']");
	  
	  // 2 construcor creat
	  
	  
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	  
	  // 3 public class action 
	public  boolean  headerisDisply() 
	{	
      return driver.findElement(header).isDisplayed();
	 	
	}
	public  boolean managerheadingDispaly() 
	{
		return driver.findElement(managerheading).isDisplayed();
	}
	
    public boolean imageDispaly()
    {
    	return driver.findElement(image1).isDisplayed();
    }	
	  
	public void logOut()
	{
		driver.findElement(logoutbtn).click();
	}

}
