package Locators;

import org.junit.Assert;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class LinkText {				
    		
    public static void main(String[] args) {									
        String baseUrl = "http://demo.guru99.com/test/link.html";					
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");				
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);	
        String current = driver.getCurrentUrl();
        driver.findElement(By.linkText("click here")).click();	
        String Nextpage = driver.getCurrentUrl();
        
        System.out.println("title of page is: " + driver.getTitle());		
        Assert.assertTrue(current.equalsIgnoreCase(Nextpage));
        driver.quit();			
    }		

}
