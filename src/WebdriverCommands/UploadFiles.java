package WebdriverCommands;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        String baseUrl = "https://demo.guru99.com/test/upload/";
  
    	WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\tofailh\\eclipse-workspace\\SeleniumTraining\\Files\\Test.png");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        driver.quit();
        }
   
}
