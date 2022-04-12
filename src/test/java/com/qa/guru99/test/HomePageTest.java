package com.qa.guru99.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.guru99.pages.HomePage;

public class HomePageTest extends BaseTest {
@BeforeClass
	public void homePageSetUp()
	{
		 hp=lp.dologin(prop.getProperty("userid"), prop.getProperty("password"));
	}
	
	
	
	@Test
	public  void headerisExitTest() {
		Assert.assertTrue(hp.headerisDisply(),"GTPL bank header is not exit");
	}
	
	@Test
	public void managerlineExitTest() {
		Assert.assertTrue(hp.managerheadingDispaly(),"manager line is not available on page");
	}
	
	@Test
	public void imageExitTest() {
		Assert.assertTrue(hp.imageDispaly(),"image is not exit");
	}
	
	
	@Test
	public void logOutTest() {
		hp.logOut();
	}
}
