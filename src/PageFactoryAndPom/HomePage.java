package PageFactoryAndPom; // Declares the package name, used to organize related classes.

import org.openqa.selenium.WebDriver; // Imports the WebDriver interface for controlling the browser.
import org.openqa.selenium.WebElement; // Imports the WebElement class, which represents an HTML element.
import org.openqa.selenium.support.FindBy; // Imports the FindBy annotation used to locate page elements.
import org.openqa.selenium.support.PageFactory; // Imports PageFactory, which is used for initializing WebElements.

public class HomePage { // Declares the public class HomePage.

    WebDriver driver; // Declares a WebDriver instance to interact with the web browser.

    @FindBy(xpath="//table//tr[@class='heading3']") // Uses the FindBy annotation to locate the username element by XPath.
    WebElement homePageUserName; // WebElement for the username displayed on the home page.

    public HomePage(WebDriver driver){ // Constructor for the HomePage class.
        this.driver = driver; // Initializes the 'driver' instance variable with the WebDriver passed from the test.
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this); // Initializes elements annotated with @FindBy.
    }   

    // Get the User name from Home Page
    public String getHomePageDashboardUserName(){ // Method to get the username from the dashboard on the home page.
         return homePageUserName.getText(); // Returns the text content of the 'homePageUserName' WebElement.
    }
}
