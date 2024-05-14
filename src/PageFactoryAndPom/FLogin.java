package PageFactoryAndPom; // Declares the package name. This is used to organize related classes.

import org.openqa.selenium.WebDriver; // Imports the WebDriver interface for controlling the browser.
import org.openqa.selenium.WebElement; // Imports the WebElement class, representing HTML elements.
import org.openqa.selenium.support.FindBy; // Imports the FindBy annotation used to locate page elements.
import org.openqa.selenium.support.PageFactory; // Imports PageFactory class for initializing elements.

public class FLogin { // Declares the public class FLogin.

    /**
     * All WebElements are identified by @FindBy annotation
     */
    WebDriver driver; // WebDriver variable to manage interactions with the browser.

    @FindBy(name="uid") // FindBy annotation to locate the username input field by its name attribute.
    WebElement user99GuruName; // WebElement for the username input field.

    @FindBy(name="password") // FindBy annotation to locate the password input field by its name attribute.
    WebElement password99Guru; // WebElement for the password input field.

    @FindBy(className="barone") // FindBy annotation to locate an element by its class name.
    WebElement titleText; // WebElement for the element that contains the title text.

    @FindBy(name="btnLogin") // FindBy annotation to locate the login button by its name attribute.
    WebElement login; // WebElement for the login button.

    public FLogin(WebDriver driver){ // Constructor of the FLogin class.
        this.driver = driver; // Initializes the driver variable with the WebDriver passed from the test.
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this); // Initializes elements annotated with @FindBy.
    }

    //Set user name in textbox
    public void setUserName(String strUserName){ // Method to set the username in its text box.
        user99GuruName.sendKeys(strUserName); // Sends the specified username to the username WebElement.
    }

    //Set password in password textbox
    public void setPassword(String strPassword){ // Method to set the password in its text box.
    password99Guru.sendKeys(strPassword); // Sends the specified password to the password WebElement.
    }

    //Click on login button
    public void clickLogin(){ // Method to perform a click action on the login button.
            login.click(); // Executes the click operation on the login WebElement.
    }  

    //Get the title of Login Page
    public String getLoginTitle(){ // Method to get the title text from the login page.
     return titleText.getText(); // Returns the text of the titleText WebElement.
    }

    /**
     * This POM method will be exposed in test case to login in the application
     * @param strUserName
     * @param strPasword
     * @return
     */
    public void loginToGuru99(String strUserName, String strPasword){ // Method to perform the entire login process.
        //Fill user name
        this.setUserName(strUserName); // Calls setUserName to input the username.
        //Fill password
        this.setPassword(strPasword); // Calls setPassword to input the password.
        //Click Login button
        this.clickLogin(); // Calls clickLogin to submit the login form.
    }
}
