package Pom; // Declares the package name for this class, used to organize related classes.

import org.openqa.selenium.By; // Imports the By class from Selenium for locating elements.
import org.openqa.selenium.WebDriver; // Imports the WebDriver interface from Selenium for browser control.

public class Login { // Declares the Login class which is public and can be accessed by other classes.

    WebDriver driver; // Declares a WebDriver instance to interact with the web browser.

    By user99GuruName = By.name("uid"); // Locator for the username input field on the login page, identified by its name attribute.
 
    By password99Guru = By.name("password"); // Locator for the password input field on the login page, identified by its name attribute.
    By titleText = By.className("barone"); // Locator for the title element on the login page, identified by its class name.
    By login = By.name("btnLogin"); // Locator for the login button on the login page, identified by its name attribute.

    // Constructor for the Login class. It initializes the driver instance for this class.
    public Login(WebDriver driver){ 
        this.driver = driver; // Assigns the passed WebDriver instance to the local driver variable.
      
    }

    // Method to set the username in its input field.
    public void setUserName(String strUserName){ 
        driver.findElement(user99GuruName).sendKeys(strUserName); // Locates the username input field and sends the provided username to it.
    }

    // Method to set the password in its input field.
    public void setPassword(String strPassword){ 
         driver.findElement(password99Guru).sendKeys(strPassword); // Locates the password input field and sends the provided password to it.
    }

    // Method to simulate the click action on the login button.
    public void clickLogin(){ 
            driver.findElement(login).click(); // Locates the login button and performs a click action on it.
    }

    // Method to get the title text of the login page.
    public String getLoginTitle(){ 
     return driver.findElement(titleText).getText(); // Locates the title element and returns its text content.
    }

    // Method to perform the login operation using username and password.
    public void loginToGuru99(String strUserName, String strPasword){ 
        this.setUserName(strUserName); // Calls setUserName method to fill the username.
        this.setPassword(strPasword); // Calls setPassword method to fill the password.
        this.clickLogin(); // Calls clickLogin method to submit the login form.
    }

}
