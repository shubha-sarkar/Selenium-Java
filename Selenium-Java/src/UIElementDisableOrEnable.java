import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UIElementDisableOrEnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		/*we can use "isEnabled" method, but this method does not work for this url.
		Example snippet: System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());*/
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
		System.out.println("It's Enabled");
		Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
