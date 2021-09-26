package com.handletab;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabExample {
	
	public static void main(String args[])
	{
	
	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,2000)", "");
	
	 driver.findElement(By.xpath("(//a[text()='Learn more'])[1]")).click();
	
	 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
     driver.switchTo().window((String)tabs.get(1));
	
     driver.findElement(By.xpath("(//a[text()='FAQ'])[1]")).click();
     
     driver.close();
     
     driver.switchTo().window((String)tabs.get(0));
     
     driver.findElement(By.xpath("(//a[text()='For work'])[1]")).click();
    
	}

}
