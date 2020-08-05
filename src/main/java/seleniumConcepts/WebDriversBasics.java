package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriversBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/marcelavinueza/Documents/Drivers/chromedriver");
//SetProperty method enables to set properties for the desired browser
// 2 attributes : "Driver", "Driver's path"	
		
		//Setting up the browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		//Get title
		String title = driver.getTitle();
		System.out.println("title is: " + title);
		
		//Verify title
		if (title.equals("My Store")) {
			System.out.println("Correct title");
			
		}else{
			System.out.println("Incorrect title");
		}
		System.out.println();
		
		//Get current URL
		String url = driver.getCurrentUrl();
		System.out.println("URL is ::" + url);
		
		//Verify URL
		
		if (url.equals("http://automationpractice.com/index.php")) {
			System.out.println("Correct URL");
			
		}else{
			System.out.println("Incorrect URL");
		}
		Thread.sleep(3000);
		driver.close(); //closes the current browser
		//driver.quit();  // close all the intances
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
