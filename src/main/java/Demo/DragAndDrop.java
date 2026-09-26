package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.id("draggable"));
		  WebElement des = driver.findElement(By.id("droppable"));
		  WebElement point = driver.findElement(By.xpath("//button[text()='Point Me']"));
//		  point.click();
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView(true);", point);
		  Actions action = new Actions(driver);
		  action.moveToElement(point).build().perform();
		  List<WebElement> options = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		  for( WebElement obj:options) {
			  String list = obj.getText().toString();
			  System.out.println(list);
			  Thread.sleep(3000);
			  if(list.equals("Laptops")) {
				  obj.click();
			  }
			  
		  }
		  
		  
//		  action.clickAndHold(point).perform();
		  
		  
//		  action.clickAndHold(src).perform();
//		  action.release(des).perform();
		  
		  
	}
}
