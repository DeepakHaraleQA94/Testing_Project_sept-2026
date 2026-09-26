package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void test1() {
	WebDriver driver = new EdgeDriver();
	driver.get("https://testautomationpractice.blogspot.com/#");
	driver.manage().window().maximize();
	}
}
