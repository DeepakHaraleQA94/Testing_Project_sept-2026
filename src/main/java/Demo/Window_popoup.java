package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Window_popoup {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Popups")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("btn-one")).click();
		
	 	 String main = driver.getWindowHandle();
	 	 System.out.println(main);
	 	 
	 	  Set<String> windowIds = driver.getWindowHandles();
	 	  System.out.println(windowIds);
	 	  
	 	   Iterator<String> itr = windowIds.iterator();
	 	     String mainWindow = itr.next();
	 	     System.out.println(mainWindow);
	 	     
	 	      String childWindows = itr.next();
	 	      
	 	      System.out.println(childWindows);
	 	      
	 	      
	 	      driver.switchTo().window(childWindows);
	 	   driver.manage().window().maximize();  
	 	   
	 	  driver.switchTo().window(mainWindow);
	 	  
	 	 Thread.sleep(3000);
		driver.close();
		
	}
}
