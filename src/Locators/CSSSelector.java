package Locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	  public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	        // declaration and instantiation of objects/variables
	    	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        WebElement footer = driver.findElement(By.cssSelector("table:nth-child(1) tbody:nth-child(1) tr:nth-child(5) td:nth-child(1) > div.footer"));
	        Assert.assertTrue(footer.isDisplayed());
	       String Expected = "© 2005, Mercury Interactive test(v. 011003-1.01-058)";
	       String Actual = footer.getText();
	       Assert.assertTrue(Expected.contains(Actual));
//System.out.println(footer.getText());

	        driver.quit();
}
}
