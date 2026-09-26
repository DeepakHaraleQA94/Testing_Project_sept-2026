package TestNG;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 {

	@Test
	public void test1() throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://magnus.jalatechnologies.com/Account/Login");
	driver.manage().window().maximize();
	driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	driver.findElement(By.id("Password")).sendKeys("jobprogram");
	driver.findElement(By.id("btnLogin")).click();
	
	 Thread.sleep(3000);
	String actualResult = driver.getTitle();
	String ExpectedResul = "Magnus";
	
	Assert.assertEquals(actualResult,ExpectedResul, "result not matching, TC failed");
	Reporter.log("Successfully landed to the home page, TC pass", true);
	
	
	}
}
