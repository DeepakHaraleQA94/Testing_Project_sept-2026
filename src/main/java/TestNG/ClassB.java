package TestNG;

import org.testng.annotations.Test;

public class ClassB {
	
	@Test(groups  = "sanity")
	public void d() {
		System.out.println("D");
	}
	
	
	@Test(groups = "smoke")
	public void E() {
		System.out.println("E");
	}
	

	@Test(groups = "smoke")
	public void F() {
		System.out.println("F");
	}

}
