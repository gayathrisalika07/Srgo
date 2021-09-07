package com.Srgo.pages;
 import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;

public class LeadPage 
{
	    
	@FindBy(xpath="//input[@name=\"property(Company)\"]") private WebElement companyTb;
	    @FindBy(xpath="//input[@name=\"property(Last Name)\"") private WebElement lastNameTb;
        @FindBy(xpath="//input[@value=\"save\"]") private WebElement savebtn;
        
        public LeadPage()
        {
        	PageFactory.initElements(Basetest.driver, this);
        }
        public void CreateLeadWithMandatoryDetails(String companyName,String ln)
        {
     	   companyTb.sendKeys(companyName);
     	   lastNameTb.sendKeys(ln);
     	   savebtn.click();
        }
        
}
