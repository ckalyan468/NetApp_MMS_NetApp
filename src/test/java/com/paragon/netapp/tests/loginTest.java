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

public class loginTest extends BaseTest

{
	// We can use data provider to tests - using apache poi or from DB
	@Test
	public void TestCase01() throws Exception 
	{
		LoginPage.loginToApp(driver, "jdortye@corp.com", "Paragon1a");

		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		LoginPage.loginToApp(driver, "jdoe@corp.com", "123");

		Thread.sleep(2000);

		LoginPage.logoutFromApp(driver);
	}
	
	
	
}
