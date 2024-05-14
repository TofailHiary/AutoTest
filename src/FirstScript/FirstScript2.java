package FirstScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirstScript2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get(baseUrl);
		
		driver.navigate().to("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.quit();
	
		
	}


}
