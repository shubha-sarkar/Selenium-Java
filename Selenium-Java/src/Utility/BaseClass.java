package Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{      
	
public static WebDriver driver;

public void setupApplication()
{
  System.setProperty("webdriver.chrome.driver", "D:\\Shubha\\Study Materials\\Selenium\\driver\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.manage().window().maximize();
}

public void closeApplication()
{
  driver.quit();
}
}