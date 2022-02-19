package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {

	public static void main(String[] args) {
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		String actTitle = "OrangeHRM";

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		
		driver.navigate().refresh();

		String expTitle = driver.getTitle();
		System.out.println("Title of this site: " +expTitle);
		
		if(actTitle.equals(expTitle)) {
			System.out.println("Title is matched");
			
		}else {
			System.out.println("Title is not matched");
		}
		
		driver.quit();


	}

}
