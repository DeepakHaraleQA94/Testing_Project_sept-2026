package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeboardAction {
	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
	driver.findElement(By.id("name")).sendKeys("name");
	driver.findElement(By.id("email")).sendKeys("ul@gmail.com");
	driver.findElement(By.id("phone")).sendKeys("9876754534");
//	 WebElement address = driver.findElement(By.id("textarea"));
	
	Actions action = new Actions(driver);
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("a");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("c");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	action.sendKeys(Keys.TAB);
	action.perform();
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("v");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	
	
		
	}

}
