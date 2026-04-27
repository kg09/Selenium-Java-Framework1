package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//Login page:  implement page object model 	
	
	//POM includes all the locators and methods on the locators in the same class 
	
	//find the locators of each elements and write methods
	
	private WebDriver driver;  //this user id and password should not be used anywhere else in the code so make it private
	
	private By username = By.id("Email");
	
	private By password = By.id("Password");
	
	private By login = By.className("button-1");
	
	//create constructor to ask user to pass argument for the class
	public LoginPage(WebDriver driver)
	{
	   this.driver = driver;	
	}
	
	//Use username passed by user at runtime 
	public void username(String user_name)
	{
	  driver.findElement(username).clear();
	  driver.findElement(username).sendKeys(user_name);
		
	}
	
	public void password(String pwd)
	{
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pwd);
		
	}
	
	public void loginbutton()
	{
		driver.findElement(login).click();
	}
	
	
}

//a[normalize-space()='Amazon Launchpad']
