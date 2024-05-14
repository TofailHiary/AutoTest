package Pom; // Declares the package name for this class, used to organize related classes.

import org.openqa.selenium.By; // Imports the By class from Selenium for locating elements.
import org.openqa.selenium.WebDriver; // Imports the WebDriver interface from Selenium for browser control.

public class HomePage { // Declares the HomePage class which is public and can be accessed by other classes.

    WebDriver driver; // Declares a variable of type WebDriver. This will be used to interact with the web browser.

    By homePageUserName = By.xpath("//table//tr[@class='heading3']"); // Declares and initializes a locator for the username element on the home page using XPath.

    // Constructor for HomePage class. It initializes the driver instance for this class.
    public HomePage(WebDriver driver){ 
        this.driver = driver; // Assigns the passed WebDriver instance to the local driver variable.
    }

    // Method to get the username displayed on the home page dashboard.
    public String getHomePageDashboardUserName(){ 
         return driver.findElement(homePageUserName).getText(); // Finds the username element using the stored locator and returns its text content.
    }

}
