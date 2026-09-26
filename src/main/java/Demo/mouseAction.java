package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
		  WebElement doubleclicks = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		  Actions action = new Actions(driver);
		  action.doubleClick(doubleclicks).perform();
	}

}
