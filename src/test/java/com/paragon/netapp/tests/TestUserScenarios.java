package com.paragon.netapp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.LoggingAssert;

import com.paragaon.netapp.adminModule.NativeUser;
import com.paragon.netapp.modules.LoginPage;

public class TestUserScenarios extends BaseTest
{

	@Test(priority=1)
	public void logintoApp() throws InterruptedException
	{
		LoginPage.loginToApp(driver, "jdoe@corp.com", "123");
		WebElement wb=driver.findElement(By.partialLinkText("Home"));
		wait.until(ExpectedConditions.elementToBeClickable(wb));
	}
	
	@Test(priority=2)
	public void addUser() throws InterruptedException
	{
		NativeUser.newUserCreation(driver);
				
//		LoginPage.loginToApp(driver, "", ""); //login with new username

	}
	
	@Test(priority=3)
	public void editUserByUsername()
	{
		//
	}
	
	@Test(priority=4)
	public void editUserByRole()
	{
     //
	}
	
	@Test(priority=5)
	public void deleteUser()
	{
		
	}
	
}
