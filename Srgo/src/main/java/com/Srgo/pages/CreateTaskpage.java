package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;

public class CreateTaskpage extends Basetest
{
     //  @FindBy(xpath="//input[@id=\"subject\"]") private WebElement Subjectbar;
	   @FindBy(xpath="//img[@title=\"Subject Name Lookup\"]") private WebElement subjectpop;
       @FindBy(xpath="//input[@value=\"Save\"]") private WebElement Savebt;
       @FindBy(xpath="//img[@title=\"Calendar\"]") private WebElement calenderimg;
       @FindBy(xpath="//a[text()='13']") private WebElement date;
       
       public void newtask() throws Throwable
       {
    	   subjectpop.click(); 
    	   WebDriverComLib wlib= new WebDriverComLib();
    	   Filelib flib= new Filelib();
    	   wlib.getwindowhandle(flib.readPropertyData(PROP_PATH, "targetwindowtitle"), subjectpop);
    	   calenderimg.click();
    	   date.click();
    	   Savebt.click();
		
    	   
       }
}
