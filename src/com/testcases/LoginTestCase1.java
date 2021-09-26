package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.pageobjects.SignInElementsObjects;

public class LoginTestCase1 {
	
	
	
	
	public static void main(String args[]){

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.com/index.php?controller=authentication&back=my-account");

		WebElement emailTextBox=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Password= driver.findElement(By.xpath("//input[@id='passwd']"));
		WebElement LoginButton=driver.findElement(By.xpath("//button[@id='SubmitLogin']"));

		WebDriverWait wait1=new WebDriverWait(driver,10);


		//Step 2 wait for an element to display or load in the webpage
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
		emailTextBox.sendKeys("varunbhatia84@gmail.com");

		//Step 3 wait for an element to display or load in the webpage
		wait1.until(ExpectedConditions.visibilityOf(Password));
		Password.sendKeys("varun123");
		//Step 2 wait for an element to display or load in the webpage
		wait1.until(ExpectedConditions.visibilityOf(LoginButton));
		LoginButton.click();
		System.out.println("Login successful"+'\n');


		}
	

}
