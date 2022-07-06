import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys("oil");
		driver.findElement(By.xpath("//button[@qa='searchBtn']")).click();
		
		
		
		
		

	}

}
