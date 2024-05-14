package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class LocatorClsName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// URL launch
		driver.get("https://www.facebook.com/");
		// identify element with class
		WebElement n = driver.findElement(By.className("inputtext"));
		n.sendKeys("Testclass");
		Thread.sleep(3000);
		driver.quit();
	
	}
}