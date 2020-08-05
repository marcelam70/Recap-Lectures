package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathConcept {

	public static void main(String[] args) throws InterruptedException {
		// Xpath is designed tallow the navigation of XML documents.
		// /absolute Xpath from the beginning of HTML node
		// // relative Xpath any node of the HTML document
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.linkedin.com/login");
		
//		WebElement username = driver.findElement(By.xpath("//input[@aria-label='Email or Phone']"));
//		username.sendKeys("marcelam70@yahoo.com");
//		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
//		password.sendKeys("1234tes@!");
//		
//	//	WebElement signInbutton = driver.findElement(By.xpath("//button[text()='Sign in']"));
//		WebElement signInbutton = driver.findElement(By.xpath("//button[contains(text()='Sign']"));
//		signInbutton.click();
//		Thread.sleep(4000);
//		driver.quit();
		By username = By.xpath("//input[@aria-label='Email or Phone']");
		By password = By.xpath("//input[@aria-label='Password']");
		By signInButton = By.xpath("//button[text()='Sign in']");
	
				
		ElementUtil.getElement(driver, username).sendKeys("marcelam70@yahoo.es");
		ElementUtil.getElement(driver,password).sendKeys("1234test!");
		
		Thread.sleep(4000);
		driver.quit();
		

	}

}
