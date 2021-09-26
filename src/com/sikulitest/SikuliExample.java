package com.sikulitest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class SikuliExample {

	
	
	public static void main(String args[]) throws  InterruptedException, FindFailed
	{

System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://www.google.com");

Thread.sleep(3000);

Screen s = new Screen();
Pattern signinpage = new Pattern("D:\\SimpliLearn\\Batch Notes\\Session 7\\login.png");
Pattern loginpage = new Pattern("D:\\SimpliLearn\\Batch Notes\\Session 7\\signin.png");

s.click(signinpage);

Thread.sleep(2000);

s.click(loginpage);


// using screen object we can call click method which will accept image path and will perform //action

// This will click on gmail image on google home page







}

}
