package com.opencart.tastbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class Testbase {
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeTest
	public void start()
	{
		 logger=Logger.getLogger("Opencart automation framework");
		
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Framewok execution started");
		
	}
	
	@AfterTest
	public void finish()
	{
		logger.info("Framewok execution finish");
	}
	
	
	
	@BeforeMethod
	public void setUp()
	{
		
		String browser_name="chrome";
		
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browser_name.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Provide valid browser name");
		}
		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("Browser Launched with url");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
		//logger.info("browser execution finish");
	}

}
