package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parameter {
WebDriver driver;
    @Parameters("name")
	@Test
	public void test(String name) {
	
		if(name.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(name.equals("edge")) {
			driver = new EdgeDriver();
		}else if(name.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
			Reporter.log("please enter valid name ", true);
		}
		
		driver.get("https://magnus.jalatechnologies.com/Account/Login");
		driver.manage().window().maximize();
	}
}
