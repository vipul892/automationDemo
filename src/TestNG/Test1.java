package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void method1()
	{
		System.out.println("this is the method first");
	}
    
	@BeforeTest
	public void beforeTest() {
		System.out.println("Hiiii i am first suit");
	}
	
	
	@Test
	public void method2()
	{
		System.out.println("This is the method Second");
		Assert.assertTrue(false);
	}
	@Test
	public void method3()
	{
		System.out.println("This is the method Third");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("hiiiiiiii stop");
	}
	
}
