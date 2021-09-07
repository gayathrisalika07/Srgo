package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;

public class CustomViewPage 
{
       @FindBy(xpath="//input[@value=\"New Lead\"]") private WebElement newLeadBtn;
       
       
       public CustomViewPage() 
       {
    	   PageFactory.initElements(Basetest.driver, this);
       }
       public void clickNewLeadBtn() 
       {
    	   newLeadBtn.click();
       }
	
	
	
	
	
	
	
	
	
	
	
}
