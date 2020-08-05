package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.linkedin.com/login");
		
		// CSS selector 
		// #id
		// classNames(.)
		// tag[attribute='value']
		// tag[attribute='value'] [attribute='value']
     
		//WebElement username = driver.findElement(By.cssSelector("input[aria-label='Email or Phone']"));
		WebElement username = driver.findElement(By.cssSelector("#username"));
		username.sendKeys("marcelam70@yahoo.es");
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("123test!");
		WebElement signInBurtton = driver.findElement(By.cssSelector(".btn__primary--large"));
		signInBurtton.click();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
