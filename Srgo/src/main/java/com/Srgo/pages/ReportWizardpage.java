package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportWizardpage 
{
	 @FindBy(xpath="//a[text()='Columns']") private WebElement columntab;
	 @FindBy(xpath="//select[@id=\"availList\"]") private WebElement avilablecolumn;
	 @FindBy(xpath="//input[@value=\"Add\"]") private WebElement addbt;
	 @FindBy(xpath="(//input[@value=\"Save\"])[2]") private WebElement savebt2;
	
}
