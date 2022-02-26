package javaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitsConcept {
	
	// Selenium Waits
	// 1. Implicit Wait
	// 2. Explicit Wait
	// 3. Fluent Wait
	
	static WebDriver driver; 

	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/delete_customer.php";
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		// 1. Implicit Wait
		// Implicit Wait will tells to the WebDriver to wait for certain amount of time before it throw a "No such Element Exception".
		// As compare to Explicit wait its bit slow.
		// Default setting of Implicit wait 0
		// exp: If we add implicit on line no 32 it will apply till last line. 
		// Different time intervals
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		// 2. Explicit Wait
		// Explicit Wait is used to tell the webdriver to wait for the certain conditions (Expected Contions) or maximum time 
		// exceeded before throwing an "ElementNotVisibleException"
		
		WebElement cusID = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(cusID));
//		wait.until(ExpectedConditions.elementToBeClickable(cusID));
		cusID.sendKeys("Amol123");
		
		String title = "ABC";
		driver.getTitle();
		wait.until(ExpectedConditions.titleContains(title));
		wait.until(ExpectedConditions.titleIs("FaceBook Login Page"));
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		Alert alert = driver.switchTo().alert();
		String popmsg = alert.getText();
		System.out.println(popmsg);
		alert.accept();
		
		// Fluent Wait is used to tell the webdriver to wait for the certain conditions (Expected Contions) as well as the frequency with 
		// which we want to check the conditions before throwing an "ElementNotVisibleException" exception.
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
				
		
	}
	
	

}
