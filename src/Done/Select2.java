package Done;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class Select2 {
    public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
 
    		WebDriver driver = new ChromeDriver();
 
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
 
        WebElement selfHelpBooksCheckbox = driver.findElement(By.id("self-help-radio-btn"));
        if (!selfHelpBooksCheckbox.isSelected()) {
            // If not checked, click on it to check it
            selfHelpBooksCheckbox.click();
            System.out.println("self-help-radio checked ");
        }
        Thread.sleep(3000);

        Select prog = new Select (driver.findElement(By.id("programming-languages")));
        prog.selectByIndex(3);
        Select sele = new Select (driver.findElement(By.id("selenium_suite")));
        sele.selectByIndex(3);
        sele.selectByValue("IDE");
        
        Thread.sleep(3000);
 
  
        driver.quit();
    }
}
