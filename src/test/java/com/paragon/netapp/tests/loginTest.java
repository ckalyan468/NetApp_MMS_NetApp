package com.paragon.netapp.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.paragon.netapp.modules.LoginPage;

public class loginTest

{
	public static WebDriver driver;
	String browser = "Chrome"; // browser can be brought from external properties file too
	String APPURL = "http://dv2-ls-cts-1:4200/";

	// @SuppressWarnings("deprecation")

	@BeforeSuite
	public void launchBrowser() throws Exception {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					".\\src\\main\\resources\\com\\paragon\\resources\\drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new InternetExplorerDriver();
		}
	}

	@BeforeMethod
	public void launchApp() throws Exception {
		driver.get(APPURL);
		Thread.sleep(2000);
	}

	// We can use data provider to tests - using apache poi or from DB
	@Test
	public void TestCase01() throws Exception {
		LoginPage.loginToApp(driver, "jdortye@corp.com", "Paragon1a");

		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		LoginPage.loginToApp(driver, "jdoe@corp.com", "123");

		Thread.sleep(2000);

		
	}
	
	@Test
	public void TestCase02() throws Exception
	{
		LoginPage.clickAllTabs(driver);

		Thread.sleep(10000);

		LoginPage.newUserCreation(driver);

		Thread.sleep(10000);

		LoginPage.logoutFromApp(driver);
	}
	
	// @AfterClass
	// public void closeBrowser()
	// {
	// driver.close();
	// driver.quit();
	// }
}
