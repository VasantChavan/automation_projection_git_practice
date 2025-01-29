package com.automation_projection_git_practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Here you may create a page level repositoty and write action method on login page
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "uid")
	WebElement username_txt;

	@FindBy(name = "password")
	WebElement password_txt;

	@FindBy(name = "btnLogin")
	WebElement loginBtn;

	@FindBy(name = "btnReset")
	@CacheLookup
	WebElement resetBtn;
	
	public void setUsername(String username) {
		username_txt.sendKeys(username);
	}
	
	public void setPassword(String password) {
		password_txt.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginBtn.click();
	}
	public void resetButton() {
		resetBtn.click();
	}
	
	
	

}
