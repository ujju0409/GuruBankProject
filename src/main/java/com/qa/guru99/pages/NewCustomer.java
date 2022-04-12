package com.qa.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomer {

	private WebDriver driver;
	
	//1 private By Locator
	
	private By  customername= By.name("name");
	private By  genderbtn= By.xpath("(//input[@name='rad1'])[1]");
	private By  DOB= By.xpath("");
	private By Addrss = By.name("addr");
	private By city = By.name("city");
	private By state= By.name("state");
	private By pin= By.name("pinno");
	private By TelePhone = By.name("telephoneno");
	private By  emailid= By.name("emailid");
	private By submitbtn= By.name("sub");
	private By reset= By.name("res");
	private By home = By.xpath("------");
	
	
	
	// 2 Create const...
	public NewCustomer(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	// public action on the 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
