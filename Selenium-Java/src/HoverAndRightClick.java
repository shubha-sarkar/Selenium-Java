import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAndRightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Hover
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("mousehover"))).perform();
		
		//Right click
		action.contextClick(driver.findElement(By.id("mousehover"))).perform();

	}

}
