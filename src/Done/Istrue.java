package Done;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
public class Istrue {
    public static void main(String[] args) {
      

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
      
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
 

 
      
        WebElement accordionExampleCheckboxTrue = driver.findElement(By.id("bicycle-checkbox"));
        WebElement accordionExampleCheckboxFalse = driver.findElement(By.id("tricycle-checkbox"));
boolean checked= accordionExampleCheckboxTrue.isSelected();
boolean enabled1= accordionExampleCheckboxTrue.isEnabled();
if (enabled1 && !checked ) {
	accordionExampleCheckboxTrue.click();
	
}
System.out.println(checked);
accordionExampleCheckboxTrue.click();
checked= accordionExampleCheckboxTrue.isSelected();
System.out.println(checked);
boolean enabled= accordionExampleCheckboxFalse.isEnabled();

if (enabled) {
	accordionExampleCheckboxFalse.click();
	
}
System.out.println(!enabled);
//        boolean isCheckedTrue = accordionExampleCheckboxTrue.isSelected();
//        System.out.println();
//
//        boolean isCheckedFalse = accordionExampleCheckboxFalse.isSelected();
//        System.out.println();
 
  
        driver.quit();
    }
}
 
