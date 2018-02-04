package com.paragon.netapp.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	public static void clickHome(WebDriver driver)
	{
		driver.findElement(By.xpath("")).click();
	}
	
	public static void clickAdmin(WebDriver driver)
	{
		driver.findElement(By.id("adminDropdown")).click();
		//driver.findElement(By.xpath("//*[text()='Admin']")).click();
	}

	public static void clickNativeUserManagement(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[text()='Native User Management']")).click();
	}
}
