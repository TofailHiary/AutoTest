package WebdriverCommands;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class seriesOfActions2 {
    
    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
    	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.navigate().to("https://www.facebook.com/");
    	  
    	  WebElement element = driver.findElement(By.xpath("//*[@id='email']"));
    	  
    	  Actions act = new Actions(driver);
    	  //Below line sends some text to field by converting it to uppercase, then double click the text so that it will select all, then do right click
    	  act.moveToElement(element).click().keyDown(element, Keys.SHIFT).sendKeys("panarkhede").keyUp(element, Keys.SHIFT).doubleClick(element).contextClick(element).build().perform();
    	  driver.quit();
    	 }

    	}