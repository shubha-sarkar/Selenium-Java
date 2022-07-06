import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Using List
		/*List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());*/
		
		//Without List
		System.out.println(driver.findElements(By.tagName("a")).size());

	}

}
