package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginConcept {
public static WebDriver driver;
static By username = By.id("username");
static By password = By.id("password");
static By loginBtn = By.className("btn__primary--large");
	public static void main(String[] args) {
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		
		String url = "https://www.linkedin.com/login";
		ElementUtil.launchURL(driver, url);
		ElementUtil.sendKeys(driver, username, "marcela@gmail.com");
		ElementUtil.sendKeys(driver, password, "123@test");
		ElementUtil.getElement(driver, loginBtn).click();
		
		String text = driver.findElement(By.id("error-for-username")).getText();
		System.out.println(text);
	}

}
