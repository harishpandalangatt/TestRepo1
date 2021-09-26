package com.listnerexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(com.listnerexample.ListnerExample.class)
public class Demo1 {
	
	
	
	public static WebDriver driver;
	@Test  //Passing Test
	public void Testcase1() 
	{
		
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("jose")).click();
	
		driver.close();
	
	
		
	}
	}