package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;

public class CreateLeadPage 
{
   @FindBy(xpath="//input[@name=\"property(Company)\"]") private WebElement companyTb;
   @FindBy(xpath="//input[@name=\"property(Last Name)\"]") private WebElement lastNameTb;
   @FindBy(xpath="(//input[@value=\"Save\"])[2]") private WebElement savebtn;
   
   
   public CreateLeadPage()
   {
	   PageFactory.initElements(Basetest.driver,this);
   }
   public void CreateLeadWithMandatoryDetails(String companyName,String ln)
   {
	   companyTb.sendKeys(companyName);
	   lastNameTb.sendKeys(ln);
	   savebtn.click();
   }
 
   
}
