package Done;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CookiesDelete {
   public static void main(String[] args) 
   {
     	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
   		WebDriver driver = new ChromeDriver();       
      String URL="https://www.facebook.com/";
      driver.navigate().to(URL);
      driver.manage().deleteAllCookies();
      System.out.println("Cookies Deleted");
      driver.quit();
   }
}