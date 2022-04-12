package com.qa.guru99.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.guru99.utilities.Constants;



public class LoginPageTest extends BaseTest {
	
@Test
public void  loginPageTitle() {
	 String actualtitle= lp.getTitle();
	 System.out.println(actualtitle);
	 Assert.assertEquals(actualtitle, Constants.LOGIN_PAGE_TITLE);

}
@Test
public void loginPageUrl() {
	String actualurl= lp.getUrl();
	System.out.println("LoginPage url-----"+actualurl);
	Assert.assertTrue(actualurl.contains(Constants.LOGIN_PAGE_URL_FRACTION));
	
}

@Test
public void resetLinkExit() {
	Assert.assertTrue(lp.resetlinkpresent());
	
}
@Test
public void loginTest() {
	lp.dologin(prop.getProperty("userid"),prop.getProperty("password"));
}

}
