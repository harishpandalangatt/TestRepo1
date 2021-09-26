package com.javascriptexecutorexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExample {
	
@Test
	
	public void MouseClick()
	{

	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com");
	
	driver.manage().window().maximize();
	
	
	//click on element
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("history.go(0);");
	
	WebElement twelfthArticle = driver.findElement(By.xpath("//a[text()='A/B Testing']"));
	//js.executeScript("arguments[0].click();", twelfthArticle);
	
	//Scroll down page
	
	js.executeScript("window.scrollBy(0,550)", "");
	
	
	
	
	}

}
