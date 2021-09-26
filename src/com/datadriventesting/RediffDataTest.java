package com.datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffDataTest {
	
	public static WebDriver driver;
	
	
	@Test
	
	public static void LaunchRediff() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		//Set Excel Sheet File location
		
		
		ExcelUtils.setExcelFile("./Input/InputData.xlsx");
		
		String userid = ExcelUtils.getCellData("UserDetails", 1, 0);
		
		//driver.findElement(By.id("login1")).sendKeys(userid);
		
		//To get all the user id values from the excelsheet
		
		for(int i=1;i<ExcelUtils.getLastRownNo("UserDetails");i++)
		{
			
			driver.findElement(By.id("login1")).sendKeys(ExcelUtils.getCellData("UserDetails", i, 0));
			
			driver.findElement(By.id("login1")).clear();
			
			driver.findElement(By.id("password")).sendKeys(ExcelUtils.getCellData("UserDetails", i, 1));
			
			driver.findElement(By.id("password")).clear();
		}
		
		
		
	}

}
