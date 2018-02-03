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

	public static void clickAllTabs(WebDriver driver) throws InterruptedException {
		//driver.findElement(By.id("connectionDropdown")).click();
		//System.out.println("clicked on connections");
		//driver.findElement(By.id("discoverDropdown")).click();
		//System.out.println("Clicked on discover ");
		//driver.findElement(By.xpath("//*[text()='Metrics']")).click();
		//driver.findElement(By.xpath("//*[text()='Scheduling']")).click();
		//driver.findElement(By.xpath("//*[text()='Planning']")).click();
		//driver.findElement(By.xpath("//*[text()='Execution']")).click();
		
		driver.findElement(By.id("adminDropdown")).click();
		//driver.findElement(By.xpath("//*[text()='Admin']")).click();
		Thread.sleep(2000);
	
		System.out.println("Clicked on admin drop down");
		System.out.println("about to click on user man");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Native User Management']")).click();
		Thread.sleep(2000);
		System.out.println("clicked on NVM");

	}

	public static void newUserCreation(WebDriver driver) {
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

	public static void logoutFromApp(WebDriver driver) {
		driver.findElement(By.xpath("//span[@class='name']")).click();
		driver.findElement(By.xpath(".//*[@class='fa fa-power-off icon']")).click();
	}

}
