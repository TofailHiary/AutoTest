package Pom; // Declares the package name for this class, used to organize related classes.

import java.util.concurrent.TimeUnit; // Imports TimeUnit which is necessary for specifying time units in managing waits.

import org.openqa.selenium.WebDriver; // Imports the WebDriver interface from Selenium for browser control.
import org.openqa.selenium.chrome.ChromeDriver; // Imports ChromeDriver, a specific driver for Chrome.

import org.junit.Assert; // Imports Assert from JUnit for making assertions in tests.

public class TestLogin { // Declares the TestLogin class which is public and can be accessed by other classes.

	 static String driverPath = "Driver/chromedriver.exe"; // Static variable to hold the path to the ChromeDriver executable.
    
    static WebDriver driver; // Static variable to hold the WebDriver instance.

    static Login objLogin; // Static variable to hold the Login object for login functionality.

    static HomePage objHomePage; // Static variable to hold the HomePage object for home page interactions.

	public static void main(String[] args) { // Main method, which is the entry point of the program.
        System.setProperty("webdriver.chrome.driver", driverPath); // Sets the system property to point to the ChromeDriver location.
        
        driver = new ChromeDriver(); // Instantiates the ChromeDriver, opening a Chrome browser instance.

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Sets an implicit wait of 10 seconds to allow elements to load.

        driver.get("http://demo.guru99.com/V4/"); // Navigates to the specified URL for the test.
        test_Home_Page_Appear_Correct(); // Calls the method to test if the home page appears as expected after login.
        driver.quit(); // Closes the browser and quits the WebDriver.
	}

    // Method to test if the home page appears correctly after login.
    public static void test_Home_Page_Appear_Correct(){
        objLogin = new Login(driver); // Instantiates a new Login object with the current driver.

        // Retrieves and verifies the title of the login page.
        String loginPageTitle = objLogin.getLoginTitle(); // Calls getLoginTitle method to fetch the title text.
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank")); // Asserts that the title text contains the expected text.

        // Performs login using specified credentials.
        objLogin.loginToGuru99("mgr123", "mgr!23"); // Calls the login method with username and password.

        objHomePage = new HomePage(driver); // Instantiates a new HomePage object with the current driver.

        // Verifies the user name on the home page.
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123")); // Asserts that the user name on the home page contains the expected ID.
    }
}
