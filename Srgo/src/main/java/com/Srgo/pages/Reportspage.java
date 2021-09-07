package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reportspage
{
     @FindBy(xpath="//input[@name=\"newReport\"]") private WebElement createnewreport;
     @FindBy(xpath="//select[@id=\"primarymodule\"]") private WebElement selectNewreportdd;
     @FindBy(xpath="(//option[text()='SalesOrders'])[5]") private WebElement modulesdd;
     @FindBy(xpath="//input[@name=\"nextBtn\"]") private WebElement continuebt;
     @FindBy(xpath="//td[text()='Tabular reports provide you the way to list your data in a simpler form.']") private WebElement tabularbt;
     @FindBy(xpath="//input[@name=\"btnSaveAndRun\"]") private WebElement savebt;
	 @FindBy(xpath="//a[text()='Columns']") private WebElement columntab;
	 @FindBy(xpath="//select[@id=\"availList\"]") private WebElement avilablecolumn;
	 @FindBy(xpath="//input[@value=\"Add\"]") private WebElement addbt;
	 @FindBy(xpath="(//input[@value=\"Save\"])[2]") private WebElement savebt2;
	  
	
	
}
