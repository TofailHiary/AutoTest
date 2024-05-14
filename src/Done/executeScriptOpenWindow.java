package Done;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeScriptOpenWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		((JavascriptExecutor) driver).executeScript(
				"window.open('https://demo.guru99.com/V4/index.php', 'new window', 'width=800,height=600,left=100,top=100');");
		Thread.sleep(3000);
		
		driver.quit();
	}
}