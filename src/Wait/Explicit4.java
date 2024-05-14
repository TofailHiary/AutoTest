package Wait;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit4 {
	protected WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 Instant startTime = Instant.now();
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		WebElement Checkthis = driver.findElement(By.xpath("//button[contains(text(),'Check this')]"));
		Checkthis.click();

		
		WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("dte")));
	


         checkbox.click();
       driver.quit();
       Instant endTime = Instant.now();
   
       long elapsedTimeMs = endTime.toEpochMilli() - startTime.toEpochMilli();

       // Convert to seconds (optional)
       double elapsedTimeSec = (double) elapsedTimeMs / 1000;

       // Print the elapsed time
       System.out.println("Script execution time: " + elapsedTimeSec + " seconds");
   
	}

}
