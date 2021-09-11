package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;

public class subjectnamelookuppage
{
      @FindBy(xpath="//a[text()='Email']") private WebElement email;
      
      public subjectnamelookuppage()
      {
    	  PageFactory.initElements(Basetest.driver, this);
      }
      public void selectsubject()
      {
    	  email.click();
      }
}
