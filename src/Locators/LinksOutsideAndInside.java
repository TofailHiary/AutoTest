package Locators;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;		

public class LinksOutsideAndInside {				
    		
    public static void main(String[] args) throws InterruptedException {									
        String baseUrl = "http://demo.guru99.com/test/block.html";					
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");				
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        driver.findElement(By.partialLinkText("Inside")).click();					
        System.out.println(driver.getTitle());					
        driver.navigate().back();	
        
        
        
        
        driver.findElement(By.partialLinkText("Outside")).click();
        Thread.sleep(3000);
   driver.navigate().refresh();
   //driver.navigate().back();
   driver.findElement(By.partialLinkText("Outside")).click();  
   Thread.sleep(3000);
        System.out.println(driver.getTitle());					
        driver.quit();	
  
    }		
}	