package Done;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Task3 {
			
	    public static void main(String[] args) throws InterruptedException {	
	    	
	    	WebDriver driver = new ChromeDriver();
	        driver.get("https://jqueryui.com/tooltip/");
	        driver.manage().window().maximize();					
	        String expectedTooltip = "We ask for your age only for statistical purposes.";					
	        driver.switchTo().frame(0);
	        Thread.sleep(3000);
	        		
	        WebElement download = driver.findElement(By.id("age"));							
	        Actions builder = new Actions (driver);							
	
	        builder.moveToElement(download).clickAndHold().perform();					
	       //builder.moveToElement(download).build()
	        Thread.sleep(3000);
	        driver.switchTo().defaultContent();
	        WebElement toolTipElement = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));							
	        String actualTooltip = toolTipElement.getText();			
	        
	        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
	        if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }	
	        driver.quit();		
	   }		
	}