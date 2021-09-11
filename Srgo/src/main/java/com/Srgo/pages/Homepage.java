package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.WebDriverComLib;

public class Homepage
{
       @FindBy(xpath="//a[text()=\"Leads\"]") private WebElement leadsTab;
       @FindBy(xpath="name=\"searchCr\"") private WebElement Tasklistdd;
       @FindBy(xpath="//select[@id=\"searchCategory\"]") private WebElement alldd;
       @FindBy(xpath="//input[@id=\"searchword\"]") private WebElement searchbar;
       @FindBy(xpath="//input[@value=\"Go\"]") private WebElement gobt;
       @FindBy(xpath="//a[text()=\"New Task\"]") private WebElement newtaskbt;
       @FindBy(xpath="//a[text()=\"Dashboards\"]") private WebElement dashboardtab;
       @FindBy(xpath="//a[text()=\"New Task\"]") private WebElement newtasktb;
       @FindBy(xpath="//a[text()='New Forecast']") private WebElement newforecasttab;
       @FindBy(xpath="//a[@id=\"showSubMenu\"]")private WebElement newdd;
       @FindBy(xpath="//a[text()='New Invoice']") private WebElement invoicedd;
       @FindBy(xpath="//a[text()=\"Reports\"]") private WebElement reportstab;
       @FindBy(xpath="//img[@id=\"scrollright\"]") private WebElement scrolltab;
       @FindBy(xpath="//a[text()=\"Purchase Orders\"]") private WebElement purchasetab;
       @FindBy(xpath="//a[text()='Cases']") private WebElement casetab;
       @FindBy(xpath="//a[text()='Activities']") private WebElement activitiestab;
       @FindBy(xpath="//a[text()='Campaigns']") private WebElement campaignstab;
       public Homepage()
       {
    	   PageFactory.initElements(Basetest.driver, this);
       }
       
       public void clickLeadsTab()
       {
    	   leadsTab.click();
       }
       public  void tasklistdd()
       {
    	   
    	   com.Srgo.GenericLib.WebDriverComLib wlib=new com.Srgo.GenericLib.WebDriverComLib();
    	   wlib.selectOption(Tasklistdd, 1);
    
       
       }
       public void search(String TypeText)
       {
    	  
    	   WebDriverComLib wlib=new WebDriverComLib();
    	   wlib.selectOption("Leads", alldd);
    	   searchbar.sendKeys(TypeText);
		
    	   gobt.click();
    	   
    	   
       }
       public void newtak()
       {
    	   newtaskbt.click();
       }
       public void dashboardtab()
       {
    	   dashboardtab.click();
       }
       public void newtasktb()
       {
    	   newtasktb.click();
       }
       public void newforecaste()
       {
    	  newforecasttab.click(); 
       }
       public void newdd()
       {
    	   WebDriverComLib wlib= new WebDriverComLib();
    	   wlib.mousehover(newdd);
    	   invoicedd.click();
       }
       public void clickreportstb()
       {
    	   reportstab.click();
       }
       public void scrollright()
       {
    	   WebDriverComLib wlib= new WebDriverComLib();
    	   wlib.scrolldown(scrolltab);
       }
       public void purchaseclick()
       {
    	   purchasetab.click();
       }
       public void casestab()
       {
    	   casetab.click();
       }
       public void campaignstab()
       {
    	   campaignstab.click();
       }
       

}