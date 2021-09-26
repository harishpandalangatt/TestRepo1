package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	
	public static WebDriver driver;
	
	
	@FindBy(id="login1")
	public static WebElement userid;
	
	@FindBy(name="passwd")
	public static WebElement password;
	
	@FindBy(xpath="input[title='Sign in']")
	public static WebElement Signbutton;
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
