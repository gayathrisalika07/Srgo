package com.Srgo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Srgo.GenericLib.Basetest;

public class Loginpage {
	@FindBy(id = "userName")
	private WebElement untb;
	@FindBy(id = "passWord")
	private WebElement pwtb;
	@FindBy(xpath = "//input[@title=\"Sign In\"]")
	private WebElement signInBtn;

	public Loginpage() {
		PageFactory.initElements(Basetest.driver, this);
	}

	public WebElement getUntb() {
		return untb;
	}

	public WebElement getPwtb() {
		return pwtb;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public void loginToApp(String un, String pwd) {
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		signInBtn.click();
	}

}
