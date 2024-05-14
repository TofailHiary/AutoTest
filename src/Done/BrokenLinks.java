package Done;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
    
	// Declare a static WebDriver variable named 'driver' and initialize it to null.
	private static WebDriver driver = null;

	// The main method where execution starts for the application.
	public static void main(String[] args) {
	    // Set the system property for the ChromeDriver. This tells Selenium where to find the ChromeDriver executable.
	    System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
	    
	    // The home page URL to which the WebDriver will navigate.
	    String homePage = "https://www.zlti.com";
	    // A variable to store the current URL during link checking.
	    String url = "";
	    // Declare a HttpURLConnection variable to manage HTTP connections.
	    HttpURLConnection huc = null;
	    // Default response code to check against HTTP response codes.
	    int respCode = 200;
	    
	    // Initialize the 'driver' variable with a new instance of ChromeDriver.
	    driver = new ChromeDriver();
	    
	    // Maximizes the browser window.
	    driver.manage().window().maximize();
	    
	    // Navigate to the specified home page URL.
	    driver.get(homePage);
	    
	    // Find all web elements with the tag name 'a' (all links on the page).
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    
	    // Use an iterator to cycle through all elements in the 'links' list.
	    Iterator<WebElement> it = links.iterator();
	    
	    // Loop through each element in the list of links.
	    while(it.hasNext()){
	        
	        // Get the 'href' attribute of the current link element and store it in 'url'.
	        url = it.next().getAttribute("href");
	        
	        // Output the URL to the console.
	        System.out.println(url);
	    
	        // Check if the URL is not configured or is empty and skip the rest of the loop if so.
	        if(url == null || url.isEmpty()){
	            System.out.println("URL is either not configured for anchor tag or it is empty");
	            continue;
	        }
	        
	        // Check if the URL belongs to a domain other than the home page's domain.
	        if(!url.startsWith(homePage)){
	            System.out.println("URL belongs to another domain, skipping it.");
	            continue;
	        }
	        
	        try {
	            // Open a connection to the URL and cast it to HttpURLConnection.
	            huc = (HttpURLConnection)(new URL(url).openConnection());
	            
	            // Set the request method to "HEAD", which is sufficient for checking link validity.
	            huc.setRequestMethod("HEAD");
	            
	            // Establish the connection.
	            huc.connect();
	            
	            // Get the response code from the connection.
	            respCode = huc.getResponseCode();
	            
	            // Check if the response code indicates a client or server error (i.e., the link is broken).
	            if(respCode >= 400){
	                System.out.println(url + " is a broken link");
	            }
	            else{
	                System.out.println(url + " is a valid link");
	            }
	                
	        } catch (MalformedURLException e) {
	            // Catch block for handling malformed URL exceptions and print stack trace for debugging.
	            e.printStackTrace();
	        } catch (IOException e) {
	            // Catch block for handling IO exceptions and print stack trace for debugging.
	            e.printStackTrace();
	        }
	    }
	    
	    // Quit the driver, closing every associated window.
	    driver.quit();
	}
}