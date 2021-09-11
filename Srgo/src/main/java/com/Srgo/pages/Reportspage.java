package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.WebDriverComLib;

public class Reportspage 
{
     
     @FindBy(xpath="//select[@id=\"primarymodule\"]") private WebElement selectNewreportdd;
   //  @FindBy(xpath="//select[@id=\"Productsrelatedmodule\"]") private WebElement prmodule;
     //@FindBy(xpath="(//select[text()='Invoices'])[4]") private WebElement modulesdd;
     @FindBy(xpath="//input[@name=\"nextBtn\"]") private WebElement continuebt;
     
     public Reportspage()
     {
    	 PageFactory.initElements(Basetest.driver, this);
     }
     public void createreport()
     {
    	 WebDriverComLib wlib =new WebDriverComLib();
    	 wlib.selectOption("Products", selectNewreportdd);
    	 //wlib.scrolldown(prmodule);
    	// wlib.selectOption("Invoice", modulesdd);
    	 continuebt.click();
     }
	
	
}
