package PageFactoryAndPom; // Declares the package name. Packages are used in Java to organize related classes.

import java.util.concurrent.TimeUnit; // Imports the TimeUnit class to specify time units.

import org.openqa.selenium.WebDriver; // Imports the WebDriver interface for controlling browsers.
import org.openqa.selenium.chrome.ChromeDriver; // Imports ChromeDriver, a concrete implementation of WebDriver for Chrome.

import org.junit.Assert; // Imports the Assert class for assertions.

public class TestLoginWithPageFactory { // Declares the public class TestLoginWithPageFactory.

    static String driverPath = "Driver/chromedriver.exe"; // Static variable to store the path to the chromedriver executable.
    
    static WebDriver driver; // Static WebDriver variable to manage browser interactions.

    static FLogin objLogin; // Static variable for the FLogin page object.

    static HomePage objHomePage; // Static variable for the HomePage page object.

    public static void main(String[] args) { // Main method, the entry point of the program.
        System.setProperty("webdriver.chrome.driver", driverPath); // Sets the system property for the Chrome driver path.
        
        driver = new ChromeDriver(); // Creates a new instance of ChromeDriver.

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Sets an implicit wait to handle delays in element loading.

        driver.get("http://demo.guru99.com/V4/"); // Navigates to the specified URL.
        
        test_Home_Page_Appear_Correct(); // Calls the method to test if the home page appears correct after login.
        driver.quit(); // Closes the browser and ends the WebDriver session.
    }

    public static void test_Home_Page_Appear_Correct(){ // Method to test if the home page appears correct.
        //Create Login Page object
        objLogin = new FLogin(driver); // Initializes the FLogin page object using the driver.

        //Verify login page title
        String loginPageTitle = objLogin.getLoginTitle(); // Retrieves the login page title.
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank")); // Asserts that the page title contains the expected text.

        //login to application
        objLogin.loginToGuru99("mgr123", "mgr!23"); // Logs into the application with specified credentials.

        // go the next page
        objHomePage = new HomePage(driver); // Initializes the HomePage object using the driver.

        //Verify home page
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123")); // Asserts that the home page contains the expected user ID.
    }
}
