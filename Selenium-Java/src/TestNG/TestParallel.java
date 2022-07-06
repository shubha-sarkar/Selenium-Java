package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestParallel {
	WebDriver driver=null;
	
	@Test
	public void Test1()
	{
		System.out.println("I am in Test 1 | Thread "+Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("I am in Test 2 | Thread "+Thread.currentThread().getId());
		
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");
	}

}
