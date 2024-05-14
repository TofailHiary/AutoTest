package Done;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeScriptHighlight {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/index.php");
		WebElement element = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'yellow';", element);

		Thread.sleep(3000);

		driver.quit();
	}
}