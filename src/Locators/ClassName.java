package Locators;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	  public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

	    	
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        List<WebElement> inputs = driver.findElements(By.tagName("input"));
	        inputs.get(1).sendKeys("Test"); 
	        inputs.get(2).sendKeys("Test") ;
	        inputs.get(3).click();
Assert.assertTrue(inputs.size()>=2);


driver.quit();
}
}
