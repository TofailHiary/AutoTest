package Done;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFramesDemo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.navigate().refresh();
//Finding all iframe tags on a web page
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int numberOfTags = elements.size(); 
		System.out.println("No. of Iframes on this Web Page are: " + numberOfTags);
		driver.switchTo().frame(0);
		List<WebElement> elements2 = driver.findElements(By.tagName("iframe"));
		int numberOfTags2 = elements2.size();
		System.out.println(numberOfTags2);
		System.out.println("switched");
//Print the frame source code
		System.out.println("Frame Source" + driver.getPageSource());
		System.out.println("********************************************************");
// Switch back to main web page
		driver.switchTo().defaultContent();
		System.out.println("switched to default");
		//System.out.println("Frame Source" + driver.getPageSource());
		driver.quit();
	}
}