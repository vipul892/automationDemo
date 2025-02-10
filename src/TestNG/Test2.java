package TestNG;

import org.junit.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

	@AfterTest
	public void afterSuite() {
		System.out.println("Hiiiiiiiiii am i last testcase in suit");
	}

	@AfterClass
	public void beforClasssss() {
		System.out.println("run after class");
	}
	@Test
	public void TestCase1() {
		System.out.println("This is first Test Case");
	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("hi iam lasssssst");
	}

	@Test
	public void TestCase2() {
		System.out.println("This is second Test Case");
	}

	@Test
	public void TestCase3() {
		System.out.println("This is Third Test Case");
	}
	
	@BeforeMethod
	public void beforMethod()
	{
		System.out.println("Hiiiiiii connection start");
	}

}
