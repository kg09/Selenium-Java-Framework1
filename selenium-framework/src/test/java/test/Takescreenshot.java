package test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class Takescreenshot extends BaseTest {

	//Webdriver's take screenshot interface
	
	
	public void takescreenshot()
	{
		//TakesScreenshot is an interface , object creation is not allowed 
		//so typecast it by using object of WebDriver 
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//capture the ss as a file 
		
		  File screenshot = ts.getScreenshotAs(OutputType.FILE); 
	}
	
}
