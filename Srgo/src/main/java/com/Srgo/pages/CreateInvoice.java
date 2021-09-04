package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateInvoice 
{
    @FindBy(xpath="//input[@name=\"property(Subject)\"]") private WebElement subjecttb;
    @FindBy(xpath="//input[@id=\"Account Name\"]") private WebElement accountnametb;
    @FindBy(xpath="//input[@id=\"txtProduct1\"]") private WebElement productname;
    @FindBy(xpath="//input[@id=\"txtQty1\"]") private WebElement Quantitytb;
    @FindBy(xpath="//input[@id=\"txtListPrice1\"]") private WebElement listpricetb;
    @FindBy(xpath="(//input[@value=\"Save\"])[2]") private WebElement savebt;
    
    
    
}
