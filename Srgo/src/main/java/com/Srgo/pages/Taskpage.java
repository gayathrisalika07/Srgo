package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;

public class Taskpage
{
     @FindBy(xpath="//input[@id=\"subject\"]") private WebElement subject;
     @FindBy(xpath="//input[@value=\"Save\"]") private WebElement savebt;
     
     public Taskpage()
     {
    	 PageFactory.initElements(Basetest.driver, this);
     }
     public void Createtaskwithmandatoy(String Subname)
     {
    	 subject.sendKeys(Subname);
    	 savebt.click();
		
     }
	
	}

