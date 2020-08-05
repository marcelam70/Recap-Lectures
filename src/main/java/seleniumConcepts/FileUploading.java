package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploading {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
         driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
		
		//fileUpload.sendKeys("/Users/marcelavinueza/Desktop/Marcela.rtf");
		fileUpload.sendKeys("/Users/marcelavinueza/Desktop/CTFL/Real ISTQB Questions/readMe.txt");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		
	
	//	/Users/marcelavinueza/Desktop/CTFL/Real ISTQB Questions/readMe.txt
	
	}

	}

