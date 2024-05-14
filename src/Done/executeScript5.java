package Done;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class executeScript5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        try {
            driver.get("https://demo.guru99.com/V4/");
            WebElement button = driver.findElement(By.name("btnLogin"));
            driver.findElement(By.name("uid")).sendKeys("mngr34926");
            driver.findElement(By.name("password")).sendKeys("amUpenu");

            js.executeScript("arguments[0].click();", button);

            // Handle alert after login attempt
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                System.out.println("Alert data: " + alertText);
                alert.accept();
            } catch (NoAlertPresentException e) {
                System.out.println("No alert present after login attempt.");
            }

            // Another alert after handling the login alert
            js.executeScript("alert('Welcome to Guru99');");
        } finally {
            driver.quit();
        }
    }
}