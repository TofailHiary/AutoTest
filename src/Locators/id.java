package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class id {

	  public static void main(String[] args) throws InterruptedException {

	        // declaration and instantiation of objects/variables
	    	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "https://www.facebook.com/";
//	        String expectedTitle = "Welcome: Mercury Tours";
//	        String actualTitle = "";

	  
	        driver.get(baseUrl);
	        WebElement username = driver.findElement(By.id("email"));
	  Thread.sleep(3000);
	  username.sendKeys("Test username");
	  Thread.sleep(3000);
	  username.clear();
	  Thread.sleep(3000);
	  username.click();
	        Thread.sleep(3000);
	        driver.quit();
}
}