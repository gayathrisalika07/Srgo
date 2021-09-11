package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.Filelib;
import com.Srgo.GenericLib.WebDriverComLib;

public class ReportWizardpage extends Basetest
{
	 @FindBy(xpath="//a[text()='Columns']") private WebElement columntab;
	 @FindBy(xpath="//select[@id=\"availList\"]") private WebElement avilablecolumn;
	 @FindBy(xpath="//input[@value=\"Add\"]") private WebElement addbt;
	 @FindBy(xpath="(//input[@value=\"Save\"])[2]") private WebElement savebt2;
	 
	 
	 
	 public ReportWizardpage()
	 {
		 PageFactory.initElements(Basetest.driver, this);
	 }
	 
	 public void fillcolumns() throws Throwable
	 {
		 columntab.click();
		 WebDriverComLib wlib= new WebDriverComLib();
		 wlib.selectOption("Product Code", avilablecolumn);
		 addbt.click();
		 savebt2.click();
		 Filelib flib= new Filelib();
		 wlib.getwindowhandle(flib.readPropertyData(PROP_PATH, "targetwindow"), savebt2);
	 }
	
}
