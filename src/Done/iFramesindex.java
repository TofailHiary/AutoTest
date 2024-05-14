package Done;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramesindex {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");

		driver.switchTo().frame(50);

//Print the frame source code
		System.out.println("Frame Source" + driver.getPageSource());
// Switch back to main web page
		driver.switchTo().defaultContent();

		driver.quit();
	}
}