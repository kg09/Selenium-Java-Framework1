package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	
	//TestNG Annotation
	@Test(priority = 3) //test annotation is to make the method as test method
	public void testlogin()
	{
	
		//This is a page object 
		LoginPage loginpage = new LoginPage (driver);

	    loginpage.username("admin@yourstore.com");
	    loginpage.password("admin");
	    loginpage.loginbutton();
	    
	    System.out.println("Title of the page is:" + driver.getTitle());
      
	    //check the page title 
	    Assert.assertEquals(driver.getTitle(),"Just a moment...");
	    
	}
	
	@Test(priority = 2)
	public void invalidtestlogin()
	{
		LoginPage loginpage = new LoginPage (driver);

	    loginpage.username("abcsd");
	    loginpage.password("dssv");
	    loginpage.loginbutton();
	    
	    System.out.println("invalid login : Title of the page is:" + driver.getTitle());
		
	}
	
	@Test(priority = 1)
	public void login_with_empty_password()
	{
		LoginPage loginpage = new LoginPage (driver);
		
		loginpage.username("");
		loginpage.password("");
		loginpage.loginbutton();
		System.out.println("invalid login : Title of the page is:" + driver.getTitle());
			
	}
}
