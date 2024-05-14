package Wait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Implicit2 {

	protected static WebDriver driver;

	public static void main(String[] args) { 
	
	System.setProperty ("webdriver.chrome.driver","Driver/chromedriver.exe" );
	driver = new ChromeDriver(); 
	String baseUrl = "http://www.google.com";
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(baseUrl);
	WebElement element = driver.findElement(By.id("APjFqb"));
	element.sendKeys("Selenium WebDriver Interview questions");
	element.sendKeys(Keys.RETURN);
	List<WebElement> list = driver.findElements(By.className("_Rm"));
	System.out.println(list.size());

	driver.quit();
}
}