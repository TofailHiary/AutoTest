package Done;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts4 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

 
            driver.findElement(By.id("promtButton")).click();

            Alert simpleAlert = driver.switchTo().alert();
            simpleAlert.sendKeys("Hello");
            simpleAlert.accept();
            System.out.println("Unexpected alert accepted");
        
        driver.quit();
    }
}
