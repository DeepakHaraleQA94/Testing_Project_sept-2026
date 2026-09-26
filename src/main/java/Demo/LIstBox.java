package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LIstBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create")).click();
		  WebElement list = driver.findElement(By.id("CountryId"));
		  List<WebElement> lists = list.findElements(By.tagName("option"));
		  for(WebElement obj:lists) {
			  String countryOptions = obj.getText().toString();
//			  System.out.println(countryOptions);
//			  System.out.println("**************");
			  if(countryOptions.equals("Nepal")) {
				 
				  Thread.sleep(3000);
				  obj.click();
			  }
		  }
		  
		  
		  
//		  Select select = new Select(list);
//		  select.selectByVisibleText("China");
//		  Thread.sleep(3000);
//		  select.selectByIndex(5);
		  
		  
		  
	}
}
