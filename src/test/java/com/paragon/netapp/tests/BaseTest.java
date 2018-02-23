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

import com.paragon.netapp.projectUtils.ProjectUtility;

public class BaseTest
{
	public static WebDriver driver;
	public WebDriverWait wait;

	

	@BeforeSuite
	public void launchBrowser() throws Exception 
	{
		String browser=ProjectUtility.getProperty("Browser");
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
		String APPURL=ProjectUtility.getProperty("URL");
		driver.get(APPURL);
	}
	
//	@AfterClass
//	public void closeBrowser()
//	{
//		driver.close();
//		driver.quit();
//	}
	
}
