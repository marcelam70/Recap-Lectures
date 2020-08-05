package seleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
       //https://www.hyrtutorials.com/p/window-handles-practice.html
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//String parentWindow = driver.getWindowHandle();
		
	   // System.out.println("Parent window :" + parentWindow);
	    driver.findElement(By.id("newWindowBtn")).click();
	    
	   Set<String> handles = driver.getWindowHandles();
	   
	   Iterator<String> iterator = handles.iterator();
	   
	   String parent = iterator.next();
	   System.out.println("Parent window: " + parent);
	   
	   String child = iterator.next();
	   System.out.println("Child window : " + child);
	   
	   // switch to child window
	   driver.switchTo().window(child);
	   driver.manage().window().maximize();
	   System.out.println("Child window title is : " + driver.getTitle());
	   Thread.sleep(2000);
	   
	   driver.close();
	   // switch to parent window
	   driver.switchTo().window(parent);
	   System.out.println("Parent window title is : " + driver.getTitle());
	   Thread.sleep(2000);
	   driver.quit();
	   
		
		
	}

}








