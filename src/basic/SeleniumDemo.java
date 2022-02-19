package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver123 = new ChromeDriver();
		driver123.get("https://opensource-demo.orangehrmlive.com/");
		driver123.quit();
		
//		WebDriver driver = new WebDriver();
//		ChromeDriver driver = new ChromeDriver();
		
//		driver123.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
	}

}

// 1. JDK
//2.  Eclipse
//3. Create Project
//4. Selenium Jar - Configure
//5. Drivers - chrome
