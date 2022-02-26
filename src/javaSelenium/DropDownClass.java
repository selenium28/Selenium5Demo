package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {
	// DropDowns in Selenium
	//1. ByIndex
	//2. By Value
	//3. By VisibleByText

	static WebDriver driver;  // Globally - Class level 
	
	public static void main(String[] args) {

		launchBrowser();
		handleDropDown();
//		logout();


	}

	public static void launchBrowser() {
		String url = "https://demo.guru99.com/test/newtours/register.php";
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void handleDropDown() {
		// Select is a Class in Selenium
		
		WebElement selectDropdown = driver.findElement(By.name("country"));
		Select country = new Select(selectDropdown);
//		country.selectByIndex(18);
//		country.selectByValue("COLOMBIA");
		country.selectByVisibleText("INDIA");
		
	}
	
	public static void logout() {
		driver.quit();

	}
	
	

}
