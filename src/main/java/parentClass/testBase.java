package parentClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {
public static	Properties prop;
public static WebDriver driver;
	public testBase() throws IOException {
		 prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Selenium_Project\\src\\main\\java\\enviromentLayer\\config.properties");
		prop.load(file);
	}
	
	
	public void Intilization() {
		
		String browser = prop.getProperty("browserName");
		
		switch(browser) {
		case "chrome" : driver = new ChromeDriver();
		break;
		case "edge" : driver = new EdgeDriver();
		break;
		case "firefox" : driver = new FirefoxDriver();
		break;
		default: System.out.println("please check browser name");
		
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
	}
	
	
	public static void bufferTime() throws InterruptedException {
		Thread.sleep(4000);
	}
	
	
	
}
