package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		
		String url = "https://demo.guru99.com/test/delete_customer.php"; 
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement cusID = driver.findElement(By.xpath("//input[@name='cusid']"));
		cusID.sendKeys("Amol123");
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		Alert alert = driver.switchTo().alert();
//		String popmsg = driver.switchTo().alert().getText();
		String popmsg = alert.getText();
		System.out.println(popmsg);
//		alert.accept();
		alert.dismiss();

	}
	
	
	
	
	

}
