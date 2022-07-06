import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
