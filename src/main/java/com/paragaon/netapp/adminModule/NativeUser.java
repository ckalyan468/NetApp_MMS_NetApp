package com.paragaon.netapp.adminModule;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NativeUser 
{
	public static void newUserCreation(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(3000); 
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//*[text()='Native User Management']")).click();
		driver.findElement(By.xpath("//button[text()='Add User']")).click();

		Thread.sleep(3000); 
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys("kalyan");
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys("ckalya");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("ckalya");
		driver.findElement(By.name("confirmPassword")).clear();
		driver.findElement(By.name("confirmPassword")).sendKeys("ckalya");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ckalyan468@gmail.com");
		Select dropdown = new Select(driver.findElement(By.name("userRole")));
		dropdown.selectByVisibleText("ROLE_USER");
		Select dropdown1 = new Select(driver.findElement(By.name("user.enabled")));
		dropdown1.selectByVisibleText("Yes");

// driver.findElement(By.cssSelector("div.modal-footer")).click();
//		driver.findElement(By.xpath(".//*[class()='btn btn-primary']")).click(); 

//driver. findElement(By.xpath("//button[contains(text(),'Add User') and @class='btn.btn-primary']")).click();
		
		driver.findElement(By.xpath("//*[@class='modal-footer']//*[text()='Add User']")).click();
				
		//driver.findElement(By.xpath("/html/body/app-root/main/app-user-admin/app-adduser/form/div/div/div[3]/button")).click();


	//	driver.findElement(By.xpath("/html/body/app-root/main/app-user-admin/app-adduser/form/div/div/div[3]/button")).click();


		Thread.sleep(5000); 
		driver.switchTo().alert().accept();

		Thread.sleep(5000); 
		driver.findElement(By.cssSelector("button.close.pull-right")).click();

		//driver.findElement(By.className("close pull-right")).click();
        // driver.findElement(By.xpath("//span[class='_ngcontent-c7']")).click();
 		//button[@class='close pull-right']
		// WebElement wb=driver.findElement(By.name("userRoleId"));
		// Select s =new Select(wb);
		// s.selectByVisibleText("Migration Specialist");
	}
}
