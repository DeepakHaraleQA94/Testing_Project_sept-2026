package POMLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parentClass.testBase;

public class LoginPage extends testBase{

//	1. Page Object factory/ page factory 2. cunstructor 3. Action fucntion
	
	@FindBy(id = "UserName")
	 WebElement uname;

	@FindBy(id = "Password")
	 WebElement pass;
	
	@FindBy(id = "btnLogin")
	 WebElement loginBtn;
	
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUname(String userName) {
		uname.sendKeys(userName);
	}
	
	
	public void enterPassword(String Password) {
		pass.sendKeys(Password);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	

	
}
