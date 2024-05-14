package Done;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class scrollelement {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // Initialize a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lambdatest.com/selenium-playground/");
        
        //specify the WebElement till which the page has to be scrolled
        WebElement element = driver.findElement(By.linkText("Window Popup Modal"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //get the height of the web page and scroll to the end
           js.executeScript("arguments[0].scrollIntoView();", element); 
        driver.quit();
    }
}

