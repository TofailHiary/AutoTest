package Done;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.chrome.ChromeDriver;
public class Cookies {
 
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
   		WebDriver driver = new ChromeDriver();       
      String URL="https://demo.guru99.com/test/cookie/selenium_cookie.php";
      driver.navigate().to(URL);
   driver.manage().deleteAllCookies();
  
// driver.manage().deleteCookieNamed("Selenium");
// driver.manage().deleteCookieNamed("_cc_id");
 Cookie cookie1 = driver.manage().getCookieNamed("Selenium");
 Cookie cookie2 = driver.manage().getCookieNamed("_cc_id");
//          driver.manage().deleteCookie(cookie1);
//          driver.manage().deleteCookie(cookie2);
          if(cookie1==null&&cookie2==null) {
          System.out.println("Cookies deleted successfully.");
          }else {
        	  System.out.println("Cookies not deleted");
          }
          
          driver.quit();
     
 
 
	}
 
}