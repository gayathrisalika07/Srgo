package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;
import com.Srgo.GenericLib.WebDriverComLib;


public class Createforecastepage
{
    @FindBy(xpath="//select[@id=\"forecastYear\"]") private WebElement yeardd;
	@FindBy(xpath="//select[@id=\"forecastQuarter\"]") private WebElement Quaterdd;
	@FindBy(xpath="//input[@name=\"new\"]") private WebElement nextbt;

public Createforecastepage()
{
	PageFactory.initElements(Basetest.driver, this);
}
public void Fillrequiredfileds(int i,int j)
{
	WebDriverComLib wlib= new WebDriverComLib();
	wlib.selectOption(yeardd, i);
	wlib.selectOption(Quaterdd, j);
	nextbt.click();
}


}