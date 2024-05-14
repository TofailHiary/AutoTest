package Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent2 {
	protected WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		String eTitle = "Demo javaTpoint Page";
		String aTitle = "";
		WebDriver driver = new ChromeDriver();

		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		driver.get("https://www.browserstack.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement clickbutton = driver.findElement(By.xpath("//button[contains(text(),'Check this')]"));
		clickbutton.click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(20)).ignoring(NoSuchElementException.class);
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(
						"/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
			}
		});
		// click on the selenium link
		clickseleniumlink.click();
		// close~ browser
		driver.close();
	}
}