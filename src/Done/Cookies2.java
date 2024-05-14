package Done;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Cookies2 {
 
	   public static void main(String[] args) throws InterruptedException
	   {
	      System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
	   	  WebDriver driver = new ChromeDriver();       
	      String URL="https://demo.guru99.com/test/cookie/selenium_cookie.php";
	      driver.get(URL);
	      Thread.sleep(2000);
	      Cookie c= driver.manage().getCookieNamed("__gpi");
	      Thread.sleep(2000);
	      driver.manage().deleteCookie(c);
	      System.out.println("__gpi Cookie Deleted");
	      Cookie c1= driver.manage().getCookieNamed("__gads");
	      driver.manage().deleteCookie(c1);
	      System.out.println("__gads Cookie Deleted");
	      driver.quit();
	   }
	}
 