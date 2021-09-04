package com.Srgo.GenericLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverComLib
{
	public String getPageTitle()
	{
		String PageTitle=Basetest.driver.getTitle();
		
		return PageTitle;
		
	}
	public void verify(String actual,String expected, String Page)
	{
		if(actual.equals(expected))
		{
			System.out.println(Page+"is displayed ,pass");
		}
		else 
		{
			System.out.println(Page+"is not displayed,fail");
		}
	
	}
	  public void selectOption(WebElement Element,int index)
	 {
		Select sel= new Select(Element);
		sel.selectByIndex(index);
		
    }
	  public void selectOption(WebElement Element,String value)
		 {
			Select sel= new Select(Element);
			sel.selectByValue(value);
			
		 }
	  public void selectOption(String text ,WebElement Element)
		 {
			Select sel= new Select(Element);
			sel.selectByVisibleText(text);
			
	    }
	  public void mouseHover(WebElement element)
	  {
		  Actions ac = new Actions(Basetest.driver);
		  ac.moveToElement(element).perform();
	  }
	  public void rightClick(WebElement element)
	  {
		  Actions ac = new Actions(Basetest.driver);
		  ac.contextClick(element).perform();
	  }
	  public void mouseHover1(WebElement element)
	  {
		  Actions ac = new Actions(Basetest.driver);
		  ac.moveToElement(element).perform();
	  }
	  public void dragAndDropElement(WebElement source,WebElement target)
	  {
		  Actions ac = new Actions(Basetest.driver);
		  ac.dragAndDrop(target, target).perform();
	  }
	  public void switchToFrame(int index)
	  {
		  Basetest.driver.switchTo().frame(index);
	  }
	  public void switchToFrame(String value)
	  {
		  Basetest.driver.switchTo().frame(value);
	  }
	  public void switchToFrame(WebElement element)
	  {
		  Basetest.driver.switchTo().frame(element);
	  }
	public void getFullpagescreenshot(String screenshotpath)
	{
		TakesScreenshot ts=(TakesScreenshot) Basetest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des= new File(screenshotpath);
		try
		{
			Files.copy(src, des);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	 public void scrolldown(WebElement element)
	   {
		Point loc= element.getLocation();
		JavascriptExecutor jse=(JavascriptExecutor)Basetest.driver;
		jse.executeScript("window.scrollBy"+loc);
		
	   }
	 public void mousehover(WebElement element)
	 {
		 Actions ac= new Actions(Basetest.driver);
		 ac.moveToElement(element).perform();
	 }
	  
	  
		  
	
}
