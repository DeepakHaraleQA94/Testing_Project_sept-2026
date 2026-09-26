package Demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class javaScript {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("document.getElementById('draggable').scrollIntoView()");
		
		
		
//		js.executeScript("document.getElementById('UserName').value='training@jalaacademy.com'");
//		js.executeScript("document.getElementById('Password').value='jobprogram'");
//		js.executeScript("document.getElementById('btnLogin').click()");
//	
//		String url = driver.getCurrentUrl();
//		String getURL = js.executeScript("return document.URL").toString();
//		System.out.println(getURL);
//		String getTitle = js.executeScript("return document.title").toString();
//		System.out.println(getTitle);
//		String javascript = "document.getElementById('btnLogin').style.border='6px solid red'";
//		js.executeScript(javascript);
		
		
		



		
		
	}
}
