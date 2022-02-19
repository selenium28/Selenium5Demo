package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {

	public static void main(String[] args) {
		String url = "https://opensource-demo.orangehrmlive.com/";

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

//		 By using id
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		//By using name
		WebElement password =  driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		
		//By using LinkText
		WebElement forgetPassword = driver.findElement(By.linkText("Forgot your password?"));
		forgetPassword.click();
		
		//By using PartialLinkText
		WebElement forgetPass = driver.findElement(By.partialLinkText("Forgot your"));
		forgetPass.click();
		
	}

}
