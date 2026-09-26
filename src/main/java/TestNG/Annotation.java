package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {

	@AfterMethod
	public void LogoutWebApp() {
		System.out.println("logout successfully");
	}
	
	
	
	@BeforeMethod
	public void enterUnameAndPass() {
		System.out.println("enter unam e, pass and click on login button");
	}
	
	@Test
	public void validateLoginPage() {
		System.out.println("successfully landed to the homepage");
	}
	

	
	
	
	@AfterClass
	public void closeBrowser() {
		
		System.out.println("close browser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("brower luanch and enter url");
	}
	
	@Test
	public void test1() {
		System.out.println("hi");
	}
	
	
}
