package Wait;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadingPage{
 public static void main(String[] args) throws InterruptedException {
	 Instant startTime = Instant.now();
   System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
   // driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

    try {
      driver.get("https://demoqa.com/alerts");
      
    }    
      catch (org.openqa.selenium.TimeoutException e) {
          System.out.println("Page did not load within 10 seconds!");
        //  driver.navigate().refresh();
          // Optionally, you can manually stop the loading using JavaScript
          if (driver instanceof JavascriptExecutor) {
              ((JavascriptExecutor) driver).executeScript("window.stop();");
        }
      }

  // This step will result in an alert on screen
  WebElement x =   driver.findElement(By.id("alertButton"));
  x.click();
    Thread.sleep(5000);
    Alert simpleAlert = driver.switchTo().alert();

    System.out.println(simpleAlert.getText());
    simpleAlert.accept();
    driver.quit();
    Instant endTime = Instant.now();
    
    long elapsedTimeMs = endTime.toEpochMilli() - startTime.toEpochMilli();

    // Convert to seconds (optional)
    double elapsedTimeSec = (double) elapsedTimeMs / 1000;

    // Print the elapsed time
    System.out.println("Script execution time: " + elapsedTimeSec + " seconds");
  }
}