package TestNG;

import org.junit.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void testMethod1()
	{
		System.out.println("This is first TestMethod");
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("This is Second TestMethod");
		
		
	}
	@Test
	public void testMethod3() {
		System.out.println("This is Third TestMethod");
	}
	
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("HIIIIII Fist");
	
	}
}

