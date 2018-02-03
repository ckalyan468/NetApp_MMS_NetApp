package com.paragon.netapp.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	String browser = "Chrome"; // browser can be brought from external properties file too
	String APPURL = "http://dv2-ls-cts-1:4200/";

	public WebDriver driver;

	@Test()
	public void createUser() throws Exception {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					".\\src\\main\\resources\\com\\paragon\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
		}
		driver.get(APPURL);
		Thread.sleep(2000);

		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("jdoe@corp.com");
		driver.findElement(By.id("pwd1")).clear();
		driver.findElement(By.id("pwd1")).sendKeys("123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		System.out.println("Clicked on admin drop down");
		System.out.println("about to click on user man");
		driver.findElement(By.xpath("//*[text()='Native User Management']")).click();

	}

}
