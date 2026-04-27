package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	//open browser and close the connection if not required 
  
	protected WebDriver driver;
	
	@BeforeMethod  //annotation to run the method before each test 
	public void setup()
	{
		driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");		
		
		System.out.println("This method will run before actual test");
		
	}
	
	@AfterMethod	//annotation to run the methods after each test
	public void quitbrowser()
	{
		if(driver!=null)
		{
		  //driver.quit();
		}
		
		System.out.println("This method will run after actual test");
	}
	
	
	

}
