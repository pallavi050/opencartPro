package com.opencart.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	private WebDriver driver;

	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//----------------------obj reposetory-----------------
	
	
	private By myacc_link=(By.xpath("(//span[@class=\"hidden-xs hidden-sm hidden-md\"])[3]"));
	
	private By Register_link=(By.xpath("//a[contains(text(),'Register')]"));
	
	private By Login_link=(By.xpath("//a[contains(text(),'Login')]"));
	
	private By ProductName_textbox=(By.xpath("//input[@type=\"text\"]"));
	
	public void clickOnMyaccount()
	{
		driver.findElement(myacc_link).click();
	}
	
	public void clickOnRegisterLink()
	{
		driver.findElement(Register_link).click();
	}
	
	public void clickOnLoginLink()
	{
		driver.findElement(Login_link).click();
	}
	
	public void entersearchProductName(String product)
	{
		driver.findElement(ProductName_textbox).sendKeys(product);
	}
}

