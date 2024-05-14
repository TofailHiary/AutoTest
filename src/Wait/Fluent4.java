package Wait;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent4 {

	public static void main(String[] args) throws InterruptedException {
		 Instant startTime = Instant.now();
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
	       driver.get("https://www.selenium-tutorial.com/courses");

	        FluentWait<WebDriver> wait = new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(30))
	            .pollingEvery(Duration.ofSeconds(1))  // More reasonable polling frequency
	            .ignoring(NoSuchElementException.class);
	        
	        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LIFETIME MEMBERSHIP TO ALL LIVE TRAININGS"))).click();

	        wait.until(ExpectedConditions.urlContains("xxxxx"));

 
        driver.quit();
        Instant endTime = Instant.now();
     // Calculate elapsed time in milliseconds
        long elapsedTimeMs = endTime.toEpochMilli() - startTime.toEpochMilli();

        // Convert to seconds (optional)
        double elapsedTimeSec = (double) elapsedTimeMs / 1000;

        // Print the elapsed time
        System.out.println("Script execution time: " + elapsedTimeSec + " seconds");
        // OR: System.out.println("Script execution time: " + elapsedTimeSec + " seconds");
	}
}
