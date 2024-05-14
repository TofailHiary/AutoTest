package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextCaseSensitve {
	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/link.html";
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		String theLinkText = driver.findElement(By.partialLinkText("here")).getText();
		System.out.println(theLinkText);
		theLinkText = driver.findElement(By.partialLinkText("HERE")).getText();
		System.out.println(theLinkText);

		driver.quit();

	}
}
