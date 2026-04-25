package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	//open browser and close the connection if not required 
  
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");		
		
	}
	
	@AfterMethod	
	public void quitbrowser()
	{
		if(driver!=null)
		{
		//	driver.quit();
		}
	}
	
	

}
