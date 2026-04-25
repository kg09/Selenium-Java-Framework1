package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	//TestNG Annotation
	@Test
	public void testlogin()
	{
	
		LoginPage loginpage = new LoginPage (driver);
		
	    loginpage.username("admin@yourstore.com");
	    loginpage.password("admin");
	    loginpage.loginbutton();
	    
	    System.out.println("Title of the page is:" + driver.getTitle());
      
	    //check the page title 
	    Assert.assertEquals(driver.getTitle(),"Just a moment...");
	    
	}
}
