package com.paragon.netapp.tests;

import org.testng.annotations.Test;
import org.testng.asserts.LoggingAssert;

import com.paragaon.netapp.adminModule.NativeUser;
import com.paragon.netapp.modules.HomePage;
import com.paragon.netapp.modules.LoginPage;

public class TestUserScenarios extends BaseTest
{

	@Test(priority=1)
	public void addUser()
	{
		//call methods for add user
		
		LoginPage.loginToApp(driver, "", ""); //login as admin
		HomePage.clickAdmin(driver);
		HomePage.clickNativeUserManagement(driver);
		NativeUser.newUserCreation(driver);
		LoginPage.logoutFromApp(driver);
		
		LoginPage.loginToApp(driver, "", ""); //login with new username
		LoginPage.logoutFromApp(driver);
	}
	
	@Test(priority=2)
	public void editUserByUsername()
	{
		//
	}
	
	@Test(priority=3)
	public void editUserByRole()
	{
		//
	}
	
	@Test(priority=4)
	public void deleteUser()
	{
		
	}
	
}
