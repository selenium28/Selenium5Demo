package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSeleniumClass{

	static WebDriver driver; // Globally - NonStatic
//	static String url = "https://opensource-demo.orangehrmlive.com/";
	static String actTitle = "OrangeHRM";

	public static void main(String[] args) {
		launchBrowser();
		login();
		JavaSeleniumClass obj = new JavaSeleniumClass();
		obj.logout();
	}

	public static void launchBrowser() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(JavaSeleniumClass.actTitle);
	}

	public static void login() {

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();

//		System.out.println(url);

	}

	public void logout() {
		driver.quit();

	}
	
	

}
