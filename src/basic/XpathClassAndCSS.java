package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClassAndCSS {

	public static void main(String[] args) {
		String url = "https://www.redbus.com/"; 
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get(url);
		driver.manage().window().maximize();

		//By using xpath
		WebElement fromSoure = driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		fromSoure.sendKeys("Mumbai");

		//By using cssSelector
		WebElement destination =  driver.findElement(By.cssSelector("input[data-message='Please enter a destination city']"));
		destination.sendKeys("Pune");

//		By using tagName  -  Not in use
//		WebElement searchBuses =  driver.findElement(By.tagName("button"));
//		searchBuses.sendKeys("Pune");

		//By using ClassName  -  Not in use
		WebElement search =  driver.findElement(By.cssSelector("button[class='fl button']"));
		search.sendKeys("Pune");
		
		System.out.println("Css selector clicked on search button");


	}

}
