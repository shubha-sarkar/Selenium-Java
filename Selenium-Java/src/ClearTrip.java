import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Study Materials\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		
		//From
		driver.findElement(By.xpath("(//div[@class='p-relative'])[2]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Bangalore')]")).click();
		//To
		driver.findElement(By.xpath("(//div[@class='p-relative'])[5]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Mumbai')]")).click();
		//Date
		driver.findElement(By.cssSelector("div[class*='homeCalender']")).click();
		

	}

}
