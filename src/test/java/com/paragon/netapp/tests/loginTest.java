package com.paragon.netapp.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.paragon.netapp.modules.LoginPage;


public class loginTest extends BaseTest

{
	// We can use data provider to tests - using apache poi or from DB
	@Test
	public void TestCase01() throws Exception 
	{
	LoginPage.loginToApp(driver, "jdortye@corp.com", "Paragon1a");
  //Thread.sleep(10000); 
				
//		wait.until(ExpectedConditions.alertIsPresent());

	//	driver.switchTo().alert().accept();
	
		driver.navigate().refresh();

		LoginPage.loginToApp(driver, "jdoe@corp.com", "123");
		
		WebElement wb=driver.findElement(By.partialLinkText("Home"));

		wait.until(ExpectedConditions.elementToBeClickable(wb));
		
		//driver.manage().window().maximize();
	}

@Test
public void TestCas02() throws InterruptedException
{

	LoginPage.logoutFromApp(driver);
	
	
	
}
}
