import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\Study Materials\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList"));

		// Enter uppercase letters in the text-box(with Actions class)
		// a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

		// Enter uppercase letters in the text-box(without Actions class)
		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.SHIFT,"shubha");

		// Double click on the text
		// a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		// Moves to the specific element
		// a.moveToElement(move).build().perform();

		// Right click
		//a.moveToElement(move).contextClick().perform();

	}

}
