package com.paragaon.netapp.adminModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NativeUser 
{
	public static void newUserCreation(WebDriver driver) 
	{
		
		driver.findElement(By.xpath("//button[text()='Add User']")).click();

	
		//driver.findElement(By.className("close pull-right")).click();
        driver.findElement(By.xpath("//span[class='_ngcontent-c7']")).click();
 

		
		//button[@class='close pull-right']

		driver.findElement(By.name("firstName")).sendKeys("kalyan");
		driver.findElement(By.name("lastName")).sendKeys("ckalya");
		driver.findElement(By.name("password")).sendKeys("ckalya");
		driver.findElement(By.name("confirmPassword")).sendKeys("ckalya");
		driver.findElement(By.name("email")).sendKeys("ckalyan468@gmail.com");

		// WebElement wb=driver.findElement(By.name("userRoleId"));
		// Select s =new Select(wb);
		// s.selectByVisibleText("Migration Specialist");

	}


}
