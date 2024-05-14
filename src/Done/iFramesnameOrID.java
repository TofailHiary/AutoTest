package Done;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class iFramesnameOrID {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		//driver.findElement(By.id("sampleHeading"));
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("sampleHeading"));
	
System.out.println(driver.getPageSource());

//Print the frame source code
		System.out.println("Frame Source" + driver.getPageSource());
// Switch back to main web page
		driver.switchTo().defaultContent();
		System.out.println(driver.getPageSource());
		driver.quit();
	}
}