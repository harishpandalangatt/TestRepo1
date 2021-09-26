package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignInElementsObjects {
WebDriver driver;
@FindBy(name="email")
WebElement emailId;
@FindBy(name="passwd")
WebElement password;
@FindBy(name="SubmitLogin")
WebElement signInButton;
public SignInElementsObjects(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}
public void emailID()
{
emailId.sendKeys("varun");
}
public void passWd()
{
password.sendKeys("password");
}
public void signIn()
{
signInButton.click();
}
}
