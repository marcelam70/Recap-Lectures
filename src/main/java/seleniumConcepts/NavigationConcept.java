package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/marcelavinueza/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.youtube.com");
		
		driver.navigate().to("http://www.booking.com");
		//Navigation is interface RemoteNavigation is the class an implements Navigation
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		driver.quit();
		
		//Get method
		// Drivr get method is used to open a URL and it will wait until the page is loaded fully
		//Webdriver will wait until the page has fully loaded before
		//returning control to your test
		
		//Navigate().tomethod
		//Driver .navigate().to()method navigate to URL and it will not wait until the webpage is loaded
		//It keeps browser history and cookies so we can use forward and backward
		// methods.
		

	}

}
