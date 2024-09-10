package com.opencart.testleyer;

import org.testng.annotations.Test;

import com.opencart.pagelayer.Homepage;
import com.opencart.pagelayer.LoginPage;
import com.opencart.tastbase.Testbase;

import org.testng.Assert;
public class LoginTest extends Testbase {
	
	
	
	@Test
	public void VerifyRegisterWithValidDetails()
	{
		
		String expected_result="My Account";
		
		Homepage homepage_obj=new Homepage(driver);
		LoginPage loginpage_obj=new LoginPage(driver);
		
		homepage_obj.clickOnMyaccount();
		homepage_obj.clickOnLoginLink();
		logger.info("click on login button");
		
		loginpage_obj.enterEmail("pallavi2531@gmail.com");
		loginpage_obj.enterPass("pallavi");
		loginpage_obj.clickOnLogin();
		
		String actual_result=loginpage_obj.getAfterLoginMsg();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result,expected_result);
	}
	
	


	
}
