package com.paragon.netapp.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage

{

	public static void loginToApp(WebDriver driver, String username, String password) {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("pwd1")).clear();
		driver.findElement(By.id("pwd1")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	
	public static void logoutFromApp(WebDriver driver) {
		driver.findElement(By.xpath("//button[text()='Logout']")).click();
	}

}
