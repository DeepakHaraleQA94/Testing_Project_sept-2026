package TestLayer;

import java.io.IOException;

import org.jspecify.annotations.Nullable;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMLayer.LoginPage;
import parentClass.testBase;

public class LoginTestPage extends testBase {

	public LoginTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void preRequisite(){
		Intilization();	
	}
	
	@Test
	public void verifyLoginPage() throws IOException, InterruptedException {
		LoginPage login = new LoginPage();
		login.enterUname(prop.getProperty("uname"));
		login.enterPassword(prop.getProperty("pass"));
		login.clickOnLoginBtn();
		Thread.sleep(3000);
		String actual = driver.getTitle();
	
		Assert.assertEquals(actual, "Magnus", "TC not matching");
		Reporter.log("Landed successfully to the home page, TC passed", true);
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
