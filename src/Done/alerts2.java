package Done;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts2 {
 public static void main(String[] args) throws InterruptedException {
	  	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
  driver.get("https://demoqa.com/alerts");
  //driver.manage().window().maximize();
 // This step will result in an alert on screen
  WebElement element = driver.findElement(By.id("confirmButton"));
  //((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
  element.click();
  Thread.sleep(5000);
  Alert confirmationAlert = driver.switchTo().alert();
  String alertText = confirmationAlert.getText();
  System.out.println("Alert text is " + alertText);
  confirmationAlert.dismiss();
  driver.quit();
 }
}