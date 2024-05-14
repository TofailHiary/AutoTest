package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	  public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	        String baseUrl = "http://demo.guru99.com/test/link.html";					
	        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();
	    	
	
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]"));
	        signInButton.click();

	        driver.quit();

}
}
