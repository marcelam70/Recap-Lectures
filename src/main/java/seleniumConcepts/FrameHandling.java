package seleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		// An iframe (Inline frame) is an HTML document embedded inside the current HTML document on a page
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.chase.com");
		
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		
		System.out.println(iframes.size());
		
		driver.switchTo().frame(0); //id or name = logonbox
		
		driver.findElement(By.id("userId-text-input-field")).sendKeys("marcelam70");
		driver.findElement(By.id("password-text-input-field")).sendKeys("jake123");
		//Thread.sleep(30000);
		//driver.findElement(By.id("signin-button")).click();
		
		
		
		driver.switchTo().defaultContent(); //switch to main page
		driver.findElement(By.id("firstFocusableElement")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		

	}
}











