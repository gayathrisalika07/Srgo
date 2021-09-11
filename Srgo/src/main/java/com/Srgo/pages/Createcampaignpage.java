package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;

public class Createcampaignpage extends Basetest
{
      @FindBy(xpath="//input[@name=\"property(Campaign Name)\"]") private WebElement campaignname;
      @FindBy(xpath="//select[@name=\"property(Type)\"] ") private WebElement  typedd;
      @FindBy(xpath="//select[@name=\"property(Status)\"]") private WebElement statusdd;
     // @FindBy(xpath="(//img[@title=\"Calendar\"])[1]") private WebElement calander;
     // @FindBy(xpath="//a[text()='9'") private WebElement date;
      @FindBy(xpath="(//input[@value=\"Save\"])[2]") private WebElement savebt;
       
      public Createcampaignpage()
      {
    	  PageFactory.initElements(Basetest.driver, this);
      }
      
      public void newcampagin(String name) throws Throwable
      {
    	  campaignname.sendKeys(name);
    	  WebDriverComLib wlib= new WebDriverComLib();
    	  wlib.selectOption(typedd, 2);
    	  wlib.selectOption(statusdd, 3);
    	 // calander.click();
    	  Filelib flib = new Filelib();
    	 // wlib.getwindowhandle(flib.readPropertyData(PROP_PATH, "targetwindowtitle"), date);
    	 // date.click();
    	  savebt.click();
      }
}
