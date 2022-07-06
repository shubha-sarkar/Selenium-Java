import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
	
//		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com"); //hit url on the browser
		
		System.out.println(driver.getTitle()); //validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on the correct url.
		//System.out.println(driver.getPageSource()); //print page source
		
		driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		driver.close(); //it closes the currect browser
		//driver.quit(); //it closes all the browsers opened by selenium script

	}

}
