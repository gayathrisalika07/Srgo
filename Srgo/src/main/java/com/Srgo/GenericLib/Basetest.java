package com.Srgo.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Basetest implements IAutoconstants 
{
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		Filelib flib=new Filelib();
		String browsername = flib.readPropertyData(PROP_PATH, "browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver= new ChromeDriver();
		
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			    driver= new FirefoxDriver();
		}
		else
		{
			System.out.println("enter proper browser ");
		}
		driver.manage().window().maximize();
		String appURL= flib.readPropertyData(PROP_PATH, "url");
		driver.get(appURL);
		WebDriverComLib wlib= new WebDriverComLib();
		String expectedLoginTitle=flib.readPropertyData(PROP_PATH,"HomeTitle");
		wlib.verify(wlib.getPageTitle(), expectedLoginTitle,"homepage");
	  }
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
