package Done;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class scrollup {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // Initialize a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("http://demo.guru99.com/test/guru99home/");
        
        // Cast driver to JavascriptExecutor to perform JS-based scrolling
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Execute JavaScript to scroll down by 350 pixels
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-500)", "");
        Thread.sleep(3000);
        // Close the browser after operation
        driver.quit();
    }
}

