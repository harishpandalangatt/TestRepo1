package com.testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {

	
	@Test 
	
	public static void ChromeExecution()
	
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.rediff.com");
		
		
	}
		
	@Test
	
	public static void FirefoxExecution()
	{
		System.setProperty("webdriver.gecko.driver", "./BrowserUtils/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.rediff.com");
		
	}
}
