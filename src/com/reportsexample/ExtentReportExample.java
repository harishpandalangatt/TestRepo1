package com.reportsexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportExample {
	
	public static ExtentTest test;
	public static ExtentReports report;	
	
	
	@Test
	
	public static void LauchTheApplication()
	
	{
		report = new ExtentReports("./Report/report.html");

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		test = report.startTest("Launch App"); 
		test.log(LogStatus.PASS, "URL has been launched successfully");
		
		String url = driver.getCurrentUrl();
		
		test.log(LogStatus.INFO, url);
		
		test.log(LogStatus.FAIL, "Print some failure");
		
		
		report.endTest(test);
		report.flush();
			
	}
	
@Test
	
	public static void ValidatePageTitle()
	
	{
		report = new ExtentReports("./Report/report.html");

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		test = report.startTest("Check Page Tile"); 
		test.log(LogStatus.PASS, "URL has been launched successfully");
		
		String url = driver.getCurrentUrl();
		
		test.log(LogStatus.INFO, url);
		
		test.log(LogStatus.FAIL, "Print some failure");
		
		
		report.endTest(test);
		report.flush();
			
	}

}
