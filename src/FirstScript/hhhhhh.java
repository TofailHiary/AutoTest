package FirstScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hhhhhh {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
    	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the login page
            driver.get("https://ss.estartasolutions.com/login");

            // Wait for the elements to load
            Thread.sleep(2000); // This is a simple method for demonstration. Consider using WebDriverWait.

            // Find the username, password fields and the login button
            WebElement usernameField = driver.findElement(By.id("MainContent_ucLogin_LoginUser_UserName"));
            WebElement passwordField = driver.findElement(By.id("MainContent_ucLogin_LoginUser_Password"));
            WebElement loginButton = driver.findElement(By.id("MainContent_ucLogin_LoginUser_LoginButton"));

            // Enter the username and password
            usernameField.sendKeys("your_username");
            passwordField.sendKeys("your_password");

            // Captcha Handling
            // Extract the CAPTCHA image URL
            WebElement captchaImage = driver.findElement(By.id("MainContent_ucLogin_LoginUser_imgCaptcha"));
            String captchaUrl = captchaImage.getAttribute("src");
            String captchaCode = captchaUrl.substring(captchaUrl.lastIndexOf('?') + 1);

            // Normally, you'd need to handle the CAPTCHA manually or use a CAPTCHA solving service
            // For demonstration, let's assume you manually solve it or bypass this part
            WebElement captchaInput = driver.findElement(By.id("MainContent_ucLogin_LoginUser_txtCode"));
            captchaInput.sendKeys(captchaCode); // This might not be correct if the CAPTCHA requires actual solving

            // Click the login button
            loginButton.click();

            // Optionally, add more code to handle post-login actions or verify the login
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser after the test
            driver.quit();
        }
    }
}
