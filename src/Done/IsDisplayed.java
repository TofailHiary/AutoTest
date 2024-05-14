package Done;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3.org/WAI/ARIA/apg/patterns/accordion/examples/accordion/");

		WebElement email = driver.findElement(By.xpath("//input[@id='b-add1']"));
		boolean isEmailBoxPresent = email.isDisplayed();

		System.out.println(isEmailBoxPresent);
		WebElement address = driver.findElement(By.xpath("//button[@id='accordion2id']"));
		address.click();
		 isEmailBoxPresent = email.isDisplayed();

		System.out.println(isEmailBoxPresent);
	}
}
