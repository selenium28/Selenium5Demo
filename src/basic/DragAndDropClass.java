package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropClass {

	public static void main(String[] args) {
		String url = "https://jqueryui.com/droppable/";

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement dragSource = driver.findElement(By.id("draggable"));
				
		WebElement dropDestination = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(dragSource).moveToElement(dropDestination).release().perform();
		System.out.println("Drag and Drop action Performed");

	}

}
