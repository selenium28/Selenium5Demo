package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingClass {

	public static void main(String[] args) {
		
	String url = "http://demo.guru99.com/test/upload/"; 
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver(); 
	driver.get(url);
	driver.manage().window().maximize();
	
	WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
	chooseFile.sendKeys("File/EnCap.png");
	
	WebElement checkBox = driver.findElement(By.id("terms"));
	checkBox.click();
	
	WebElement submitBtn = driver.findElement(By.name("send"));
	submitBtn.click();
	
	}

}
