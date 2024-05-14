package Done;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowPosition {
    public static void main(String[] args) {
        // Set the path for the WebDriver executable

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a URL
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");

        // Get the position of the window
        Point position = driver.manage().window().getPosition();

        // Print the position
        System.out.println("Window position - X: " + position.getX() + ", Y: " + position.getY());

        // Close the browser
        driver.quit();
    }
}
