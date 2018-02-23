package com.paragon.netapp.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paragon.netapp.modules.LoginPage;
import com.paragon.netapp.projectUtils.XLUtility;


public class loginTest extends BaseTest

{
	// We can use data provider to tests - using apache poi or from DB

	@Test (dataProvider="LoginTest",priority=1)
	public void TestCase01(String iusername,String ipassword,String username,String password) throws Exception 
	{
		LoginPage.loginToApp(driver, iusername, ipassword);
	
		driver.navigate().refresh();

		LoginPage.loginToApp(driver, username, password);
		
		WebElement wb=driver.findElement(By.partialLinkText("Home"));

		wait.until(ExpectedConditions.elementToBeClickable(wb));
		
	}

	@Test(priority=2)
	public void TestCas02() throws InterruptedException
	{

		LoginPage.logoutFromApp(driver);	
	
	}
	
	@DataProvider(name="LoginTest")
	public String[][] getData() throws Exception
	{
		String[][] data=XLUtility.getData("loginTest","TestData.xls");
		
		return data;
		
	}
	
}
