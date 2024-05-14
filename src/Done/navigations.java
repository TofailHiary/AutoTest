package Done;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigations {
	public static void main(String[] args) throws InterruptedException {									
        String baseUrl = "http://demo.guru99.com/test/block.html";					
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");				
        WebDriver driver = new ChromeDriver();					
      
        driver.get(baseUrl);					
        driver.findElement(By.partialLinkText("Inside")).click();

        Thread.sleep(3000);
        //Go back to Home Page  
        driver.navigate().back();   
        Thread.sleep(3000);
        //Go forward to Registration page  
        driver.navigate().forward();  
        Thread.sleep(3000);
        // Go back to Home page  
        driver.navigate().to("http://demo.guru99.com/");  
        Thread.sleep(3000);
        //Refresh browser  
        driver.navigate().refresh();  
        Thread.sleep(3000);
        //Closing browser  
        driver.quit();   
}  
}  
