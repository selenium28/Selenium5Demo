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

// http://demo.guru99.com/test/newtours/register.php -- DropDown
// http://demo.guru99.com/test/delete_customer.php  --- AlertPopup
// https://www.travolook.in/?gclid=Cj0KCQjw4cOEBhDMARIsAA3XDRjGAeFHS8cqdKjY45Sc7ZEf98H63uG7bP6HsxGr9ugbNNNMU0GJZdYaAoH4EALw_wcB   --- ActionClass
// http://automationpractice.com/index.php 
// 
