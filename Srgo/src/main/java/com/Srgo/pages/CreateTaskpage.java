package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTaskpage
{
       @FindBy(xpath="//input[@id=\"subject\"]") private WebElement Subjectbar;
       @FindBy(xpath="//input[@value=\"Save\"]") private WebElement Savebt;
       public void newtask( String Text)
       {
    	   Subjectbar.sendKeys(Text) ;
    	   Savebt.click();
		
    	   
       }
}
