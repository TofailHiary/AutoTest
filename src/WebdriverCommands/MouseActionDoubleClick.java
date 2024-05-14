package WebdriverCommands;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseActionDoubleClick {

	public static void main(String[] args) throws InterruptedException {
        // Set the system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a W3Schools Tryit Editor
            driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");

            // Switch to the iframe that contains the interactive area
            driver.switchTo().frame("iframeResult");

            // Locate the element to double click (a paragraph in this case)
            WebElement pElement = driver.findElement(By.xpath("//p[@ondblclick='myFunction()']"));

            // Create an instance of Actions to perform a double-click
            Actions actions = new Actions(driver);

            // Double-click on the paragraph element
            actions.doubleClick(pElement).perform();
            Thread.sleep(3000);
            actions.doubleClick(pElement).perform();
            // Optional: pause to see the effect of the double-click
            Thread.sleep(3000);  // Use WebDriverWait in real projects

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}