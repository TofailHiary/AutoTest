package WebdriverCommands;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
    
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.gecko.driver","Driver/chromedriver.exe");
                WebDriver driver = new ChromeDriver();

                driver.get(baseUrl);           
                WebElement link_Home = driver.findElement(By.linkText("Home"));
                WebElement link_Flights = driver.findElement(By.linkText("Flights"));
                WebElement td_Home = driver
                        .findElement(By
                        .xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]"));    
                 
                Actions builder = new Actions(driver);
                Action mouseOverHome = builder
                        .moveToElement(link_Home)
                        .build();
                 
                String bgColor = td_Home.getCssValue("background-color");
                System.out.println("Before hover: " + bgColor);   
                Thread.sleep(5000);
                mouseOverHome.perform();    
                Thread.sleep(5000);
                bgColor = td_Home.getCssValue("background-color");
                System.out.println("After hover: " + bgColor);
                Thread.sleep(5000);
                Action mouseOverFlights = builder
                        .moveToElement(link_Flights)
                        .build();
                mouseOverFlights.perform();
                Thread.sleep(5000);
                driver.quit();
        }
}