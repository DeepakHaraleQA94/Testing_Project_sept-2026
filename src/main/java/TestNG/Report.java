package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {

@Test
	public void test1() {
	System.out.println("hello");	
	Reporter.log("Hi", true);
	}

@Test
public void test2() {
System.out.println("hello2");	
}
}
