package Done;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class executeScript4 {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
    	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // Initialize a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Google
            driver.get("https://www.google.com");

            // Create a JavascriptExecutor instance by casting the WebDriver instance
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Execute JavaScript to fetch and print the title of the page
            String title = (String) js.executeScript("return document.title;");
            System.out.println("Page title is: " + title);

            // Use JavaScript to enter text into the search box
            js.executeScript("document.getElementsByName('q')[0].value='Selenium WebDriver';");

            // Use JavaScript to click the Google Search button
            WebElement searchButton = driver.findElement(By.name("btnK"));
            js.executeScript("arguments[0].click();", searchButton);

            // Wait a bit to see the results
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}