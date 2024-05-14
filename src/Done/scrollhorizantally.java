package Done;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

public class scrollhorizantally {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // Initialize a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        
        // Cast driver to JavascriptExecutor to perform JS-based scrolling
       


       
        // Close the browser after operation
        
        driver.get("https://www.lambdatest.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        //decrease the size of window to show both scroll bars
        driver.manage().window().setSize(new Dimension(450,630));
       
        //scroll to the right
        js.executeScript("window.scrollBy(6000,0)");  
        Thread.sleep(3000);
 
        driver.quit();
    }
}

