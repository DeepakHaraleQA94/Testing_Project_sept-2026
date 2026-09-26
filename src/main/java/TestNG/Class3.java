package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class3 {
	@Test
	public void test1() {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	}
}
