package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {

	@Test()
	public void C()
	{
		Reporter.log("C is running",true);
		
	  }
	  
  @Test ()
    public void A()
  {
	 Reporter.log("A is running",true);
  }
  
  @Test ()
  public void B() throws InterruptedException 
  {
	
	 Reporter.log("B is running",true);
  }
  

	
}
