package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;

public class Savereportpage 
{
        @FindBy(xpath="//input[@name=\"reportName\"]") private WebElement reportname;
        @FindBy(xpath="//input[@value=\"Save\"]") private WebElement savebt;
        
        
        public Savereportpage()
        {
        	PageFactory.initElements(Basetest.driver, this);
        }
        public void Fillreportname(String report)
        {
        	reportname.sendKeys(report);
        	savebt.click();
        	
        	
        }
	
}
