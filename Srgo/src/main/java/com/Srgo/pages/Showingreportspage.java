package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;

public class Showingreportspage 
{
	@FindBy(xpath="//input[@name=\"newReport\"]") private WebElement createnewreport;
	
	public Showingreportspage()
	{
		PageFactory.initElements(Basetest.driver, this);
	}
	public void createnewreport()
	{
		createnewreport.click();
	}
	   

}
