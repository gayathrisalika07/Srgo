package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;

public class Forecastepage 
{
    // @FindBy(xpath="//input[@name=\"forecastQuota1\"]") private WebElement jantextbox;
	     @FindBy(xpath="(//input[@value='Save'])[1]") private WebElement savebt;
	

public Forecastepage()
{
	PageFactory.initElements(Basetest.driver, this);

}
public void FillDetails()
{
	
	savebt.click();
	
}





}