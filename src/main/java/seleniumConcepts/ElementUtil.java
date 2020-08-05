package seleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author marcelavinueza
 *
 */
public class ElementUtil {
	/**
	 * This method is used to handle alert
	 * @param driver
	 * @return
	 */
	
	public static String getAlertText(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
}
	/**
	 * 
	 * @param element
	 */
	 public static void getAllOptions(WebElement element){
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();

			for(int i = 0; i <options.size();i++){
			System.out.println(options.get(i).getText());
		}
	 }
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement waitForPresenceOfElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element;
	}
	/**
	 * This method is used to send characters into a textbox
	 * 
	 * @param driver
	 * @param locator
	 * @param keys
	 */
	public static void sendKeys(WebDriver driver, By locator, CharSequence... keys) {
		driver.findElement(locator).sendKeys(keys);
	}
	public static String getPageTitle(WebDriver driver){
		return driver.getTitle();
	}
	/**
	 * 
	 * @param driver
	 * @param path
	 * @throws IOException
	 */
	public static void takeScreenshot(WebDriver driver, String path) throws IOException{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(path));
	}
	/**
	 * 
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver,String url){
		driver.get(url);
	}
	public static WebDriver launchBrowser(WebDriver driver,String browserName){
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/marcelavinueza/Documents/Drivers/chromedriver");
			driver = new ChromeDriver();
			
		}else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/marcelavinueza/Documents/Drivers/geckodriver");
			driver = new FirefoxDriver();	
		}else{
			System.out.println("Browser is not available:" + browserName);
			
		}
		return driver;
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver,By locator){
		driver.findElement(locator).click();
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver,By locator){
		WebElement element = driver.findElement(locator);
		return element;
	}
	/**
	 * 
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver){
		driver.close();
	}
	public static void quitBrowser(WebDriver driver){
		driver.quit();
	}
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement  getText(WebDriver driver) {
		return null ;
		
	}
}