package com.paragon.netapp.modules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage

{
	public static void loginToApp(WebDriver driver, String username, String password) throws InterruptedException {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("pwd1")).clear();
		driver.findElement(By.id("pwd1")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000); 
		}

	public static void logoutFromApp(WebDriver driver) throws InterruptedException {

		//driver.findElement(By.xpath("//*[text()='Logout']")).click();
		
		//System.out.println("Searching for Logout");

		 Thread.sleep(5000); 
		
		driver.findElement(By.cssSelector("button.btn.btn-outline-light.my-2.my-sm-0")).click();

		 Thread.sleep(5000); 
		 
		driver.close();
		//driver.quit();
	}

}
