package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.WebDriverComLib;

public class Displayingcustomviewdetailspage 
{
	@FindBy(xpath="//a[text()=\"Create View\"]") private WebElement Createview;
	@FindBy(xpath="//input[@id=\"customviewname\"]") private WebElement viewname ;
	@FindBy(xpath="//select[@id=\"availList\"]") private WebElement avilablecolumnsdd;
	@FindBy(xpath="//input[@value=\"Add\"]") private WebElement addbt;
	@FindBy(xpath="//input[@value=\"Save\"]") private WebElement savebt;
	@FindBy(xpath="(//input[@value=\"4501\"])[2]") private WebElement editcheckbox;
	@FindBy(xpath="value=\"Create Task\"") private WebElement createtaskbt;
	
	
	public Displayingcustomviewdetailspage()
	{
		PageFactory.initElements(Basetest.driver, this);
	}
	public void Createnewview(String name,int i)
	{
		Createview.click();
		viewname.sendKeys(name);
		WebDriverComLib wlib= new WebDriverComLib();
		wlib.selectOption(avilablecolumnsdd, i);
		addbt.click();
		savebt.click();
	}
	

}
