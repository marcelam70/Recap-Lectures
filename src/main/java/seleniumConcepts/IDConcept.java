package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IDConcept {

	public static void main(String[] args) throws InterruptedException {
		
		// ID's are always unique for each element so it is very common way to locate elements
		// using ID locator
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		
		// First usage
//		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("marcelam70@yahoo.com");
//		Thread.sleep(2000);
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("1234bosie");
//		Thread.sleep(2000);
//		//WebElement signInButton = driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']"));
//		WebElement signInButton = driver.findElement(By.className("from_button--floating"));
//	
//		signInButton.click();
//		//Second usage
//		driver.findElement(By.id("username")).sendKeys("marcelam70@yahoo.es");
		
		// Third usasge
		By username = By.id("username");
//		WebElement usernameElement = driver.findElement(username);
//		
//		usernameElement.sendKeys("jorgevin62@yahoo.com");
		
		
		// Profesional usage
		//ElementUtil.getElement(driver,username).sendKeys(jorgevin62@yahoo.com");
		
		ElementUtil.sendKeys(driver, username, "jorgevin62@yahoo.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
