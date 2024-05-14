package WebdriverCommands;

	
import org.openqa.selenium.interactions.Actions;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		

public class ToolTip {				
    public static void main(String[] args) throws InterruptedException {									
     
        String baseUrl = "https://demo.guru99.com/test/tooltip.html";					
    	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();					
        String expectedTooltip = "What's new in 3.2";					
        driver.get(baseUrl);					
        		
        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
        Actions builder = new Actions (driver);							

        builder.clickAndHold().moveToElement(download).perform();					
      //  builder.moveToElement(download).build() 	
        Thread.sleep(5000);
        WebElement toolTipElement = driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div/div/a"));							
        String actualTooltip = toolTipElement.getText();			
        
        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.quit();		
   }		
}		