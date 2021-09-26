package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjects.LoginPageObjects;

public class LoginTestCase {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	
	public static void LaunchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	}
	
	@Test
	
	public static void logintest() {
		
		
		
		driver.manage().window().maximize();
		
		LoginPageObjects loginpageobject = new LoginPageObjects(driver);
		
		driver.findElement(By.id("login1")).click();
		
		loginpageobject.userid.sendKeys("Hi");
		
		loginpageobject.password.sendKeys("password");
		
		loginpageobject.Signbutton.click();
		
		
	}
	
	@Test
	
	public static void validatePageTitle()
	{
		
		
		String actualpagetitle = driver.getTitle();
		
		Assert.assertEquals(actualpagetitle, "Rediffmail");
		
		
		
	}
	
	
	
	@AfterTest
	
	public static void closeBrowser()
	{
		driver.close();
	}

}
