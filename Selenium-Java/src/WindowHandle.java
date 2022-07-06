import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\Study Materials\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windows = driver.getWindowHandles(); // parentWindowID and childWindowID
		Iterator<String> it = windows.iterator();
		String parentWindowsID = it.next();
		String childWindowID = it.next();

		driver.switchTo().window(childWindowID);
		String emailID = driver.findElement(By.cssSelector(".im-para.red a")).getText();
		System.out.println(emailID);

		driver.switchTo().window(parentWindowsID);
		driver.findElement(By.id("username")).sendKeys(emailID);

	}

}
