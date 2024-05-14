package Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit2 {
	protected WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		// driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		// *[@id="u_0_0_eu"]
		driver.get("https://www.facebook.com/");
		WebElement signup = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]"));
		signup.click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		sendKeys(driver, firstname, Duration.ofSeconds(20), "Edureka");
		sendKeys(driver, lastname, Duration.ofSeconds(20), "Edureka");
		WebElement create = driver.findElement(
				By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button"));
		clickOn(driver, create, Duration.ofSeconds(20));
		driver.quit();
	}

	public static void sendKeys(WebDriver driver1, WebElement element, Duration timeout, String value) {
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void clickOn(WebDriver driver1, WebElement element, Duration timeout) {
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
