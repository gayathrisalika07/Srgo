package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;

public class CreateInvoicepage 
{
    @FindBy(xpath="//input[@name=\"property(Subject)\"]") private WebElement subjecttb;
    @FindBy(xpath="//input[@id=\"Account Name\"]") private WebElement accountnametb;
    @FindBy(xpath="//input[@id=\"txtProduct1\"]") private WebElement productname;
    @FindBy(xpath="//input[@id=\"txtQty1\"]") private WebElement Quantitytb;
    @FindBy(xpath="//input[@id=\"txtListPrice1\"]") private WebElement listpricetb;
    @FindBy(xpath="(//input[@value=\"Save\"])[2]") private WebElement savebt;
    public CreateInvoicepage()
    {
    	PageFactory.initElements(Basetest.driver, this);
    }
    public void FillMandatorydetails(String subject,String accountname,String product, int i, int j)
    {
    	subjecttb.sendKeys(subject);
    	accountnametb.sendKeys(accountname);
    	productname.sendKeys(product);
        Quantitytb.sendKeys(i);
    	listpricetb.sendKeys(j);
    	savebt.click();
   
    
    
    
     }
	
}

