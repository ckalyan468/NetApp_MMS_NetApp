package com.paragon.netapp.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
	public static WebDriver driver;
	public WebDriverWait wait;
	String browser = "Chrome"; // browser can be brought from external properties file too
	String APPURL = "http://dv2-ls-cts-1:4200/";

	@BeforeSuite
	public void launchBrowser() throws Exception 
	{
		if (browser.equalsIgnoreCase("Chrome")) 
		{
			ChromeOptions options=new ChromeOptions();
			options.setProxy(null);
			
			System.setProperty("webdriver.chrome.driver",
					".\\src\\main\\resources\\com\\paragon\\resources\\drivers\\chromedriver.exe");

		    driver = new ChromeDriver(options);
		    
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else 
		{
			driver = new InternetExplorerDriver();
		}
		
		wait=new WebDriverWait(driver, 30);

	}
	
	@BeforeTest
	public void launchApp() throws Exception 
	{
		driver.get(APPURL);
	}
	
//	@AfterClass
//	public void closeBrowser()
//	{
//		driver.close();
//		driver.quit();
//	}
	
}
