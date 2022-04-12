package com.qa.guru99.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {

	 public WebDriver driver;
	 public Properties prop;
	 
	 
	 public WebDriver init_driver(Properties prop) 
	 
	 {
		 String browser= prop.getProperty("browser").trim();
		 
		 if(browser.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 
		 }
		 else if (browser.equalsIgnoreCase("firfox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 
		 }
		 else if (browser.equalsIgnoreCase("safari"))
		 {
			 driver = new SafariDriver();
			 
		 }
		 else 
		 {
			 System.out.println("please enete valid driver ");
			 
		 }
		 
		 driver.get(prop.getProperty("url").trim());
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 
		 
		return driver; 
	 }
	 
	 public Properties init_prop() {
		 prop= new Properties();
		 try {
			FileInputStream ip = new FileInputStream("./src/test/resource/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 return prop;
		 
	 }
	
	

}