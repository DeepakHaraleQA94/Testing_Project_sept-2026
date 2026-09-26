package TestNG;

import org.testng.annotations.Test;

public class ClassA {

	
	@Test(groups = "sanity")
	public void A() {
		System.out.println("A");
	}
	
	
	@Test(groups = "smoke")
	public void B() {
		System.out.println("B");
	}
	

	@Test(groups  = "functional")
	public void c() {
		System.out.println("C");
	}
}
