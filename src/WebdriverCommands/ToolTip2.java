package WebdriverCommands;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;

public class ToolTip2 {				
    public static void main(String[] args) throws InterruptedException {									
        				
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();					
       				
        String baseUrl = "https://jqueryui.com/tooltip/"; 

      //CASE 1: Using getAttribute 
      		driver.get("https://demoqa.com/tool-tips/");
      		System.out.println("Tooltip web Page Displayed");

      		//Maximise browser window 
      	//	driver.manage().window().maximize();

      		// Get element for which we need to find tooltip 
      		WebElement button = driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
            Actions builder = new Actions (driver);							
      		//button.click();
          builder.clickAndHold().moveToElement(button);					
          builder.moveToElement(button).build().perform();
         
        
      		//Get title attribute value 
            WebElement text = driver.findElement(By.xpath("//div[contains(text(),'You hovered over the text field')]"));
      		String textf = text.getText(); 
      	
      		System.out.println("Retrieved tooltip text as :"+textf); 
      		builder.clickAndHold().moveToElement(button).release().perform();	
      	builder.moveToElement(button).release().perform();
      		//Verification if tooltip text is matching expected value 
      		if(textf.equalsIgnoreCase("You hovered over the text field")){ 
      			System.out.println("Pass : Tooltip matching expected value");
      			}
      		else{ 
      			System.out.println("Fail : Tooltip NOT matching expected value"); 
      		} 
      		 WebElement text2 = driver.findElement(By.xpath("//div[@id='texToolTopContainer']"));
      		 builder.moveToElement(text2).build().perform();
      		// Close the main window 
      		driver.quit(); 
      	} 
      }