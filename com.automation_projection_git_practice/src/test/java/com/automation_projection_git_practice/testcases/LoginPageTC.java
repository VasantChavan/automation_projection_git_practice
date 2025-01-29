package com.automation_projection_git_practice.testcases;

import org.testng.annotations.Test;

import com.automation_projection_git_practice.testbase.TestBase;
import com.automation_projection_git_practice.pageobjects.LoginPage;


public class LoginPageTC extends TestBase {
	
	// Here you may cover all the test cases regarding login page
	
	@Test
	public void verifyLoginFunctionality() {
		
		LoginPage lp = new LoginPage(driver);
     	lp.setUsername("mngr605727");
     	lp.setPassword("vaqapYs");
     	lp.clickOnLoginButton();
	}
	
	

}
