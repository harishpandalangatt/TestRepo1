package log4jExample;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Demo1 {



public static WebDriver driver;

@Test

public static void DemoLog4J()

{
	
	// Create an object for Logger class
	Logger logger=Logger.getLogger("Testclass");
	
	PropertyConfigurator.configure("./LogProperties/log4j.properties");
	

	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	
	logger.info("Browser Opened");
	
	String url = driver.getCurrentUrl();
	
	logger.info(url);
	
	driver.close();
	
	
	
	
}

}



