package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.linkedin.com/login");
		// 1
//		WebElement username = driver.findElement(By.name("session_key"));
//		username.sendKeys("marcelam70@yahoo.es");
//		WebElement password= driver.findElement(By.name("session_password"));
//		
//		password.sendKeys("1234@#test");
//		
//		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
//		signInButton.click();
		
		// 2
		//driver.findElement(By.name("session_key")).sendKeys("vinueza.jorge@yahoo.com");
		// 3
		By username = By.name("session_key");
		WebElement userName = driver.findElement(username);
		userName.sendKeys("marcelam70@yahoo.es");
		
		// 4 this is proffesional
		ElementUtil.getElement(driver, username).sendKeys("marcela,70@yahoo.es");
		
		Thread.sleep(3000);
		
				

	}

}
