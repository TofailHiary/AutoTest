package Locators;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName2 {

	  public static void main(String[] args) throws InterruptedException {
	        // declaration and instantiation of objects/variables
		
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
				driver.get(baseUrl);
Thread.sleep(2000);
				WebElement username = driver.findElement(By.name("username"));
				username.sendKeys("Admin");
				WebElement password = driver.findElement(By.name("password"));
				password.sendKeys("admin123");
				WebElement button = driver.findElement(By.tagName("button"));
				button.click();
				List<WebElement> menu = driver.findElements(By.xpath("//a[contains(@class,'oxd')]"));
//			    System.out.println("");
			}
		 
		
}

