import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Utility.BaseClass;

public class HeadlessChromeDemo extends BaseClass
{
	
 public static void test()
 {
	 driver.get("https://google.com");
	 driver.findElement(By.name("q")).sendKeys("Automation");
	 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
 }
 
 public static void main()
 {
	 test();
 }
}