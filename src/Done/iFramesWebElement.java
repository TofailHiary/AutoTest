package Done;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class iFramesWebElement {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");

		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));

		//now use the switch command
		driver.switchTo().frame(iframeElement);
	
System.out.println(driver.getPageSource());
System.out.println("**********************");
driver.switchTo().defaultContent();
//Print the frame source code
		System.out.println("Frame Source" + driver.getPageSource());
// Switch back to main web page
		
		System.out.println(driver.getPageSource());
		driver.quit();
	}
}