package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//------------------------------obj resp-------------------------
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	private WebElement email_textbox;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	private WebElement password_textbox;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement Login_button;
	
	@FindBy(xpath="//div/h2")
	private WebElement loginmsg;
	
	public void enterEmail(String emails)
	{
		email_textbox.sendKeys(emails);
		
	}
	
	public void enterPass(String pass)
	{
		password_textbox.sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		Login_button.click();
	}
	
	public String getAfterLoginMsg()
	{
		String msg=loginmsg.getText();
	  return msg;	
	}
	 
}
