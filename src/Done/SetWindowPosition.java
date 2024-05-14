package Done;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowPosition {
    public static void main(String[] args) throws InterruptedException {
        // Set the path for the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a URL
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        Thread.sleep(3000);
        // Set the new position of the window
        Point newPosition = new Point(12, 20); // You can change these values to move the window
        driver.manage().window().setPosition(newPosition);
Thread.sleep(3000);
        // Get the new position of the window
        Point position = driver.manage().window().getPosition();

        // Print the new position
        System.out.println("New window position - X: " + position.getX() + ", Y: " + position.getY());

        // Close the browser
        driver.quit();
    }
}
