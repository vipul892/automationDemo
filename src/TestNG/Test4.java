package TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test4 {
    
	@BeforeGroups("somke")
	public void beforeSmokeTests() {
		System.out.println("Setting up for Smoke Tests");
	}
     @AfterGroups("somke")
	public void afterSmokeTests() {
		System.out.println("Tearing down Smoke Tests");
	}
	
   @Test(groups="smoke")
	public void testSmoke1() {
		System.out.println("Executing Smoke Test 1");
	}
    @Test(groups="smoke")
	public void testSmoke2() {
		System.out.println("Executing Smoke Test 2");
	}
    @Test(groups="Regression")
	public void testRegression() {
		System.out.println("Executing Regression Test");
	}
    @Test(groups="Regression")
	public void testRegression1() {
		System.out.println("Executing Regression Test1");
	}
    @Test(groups = {"smoke", "regression"})
    public void testBoth() {
        System.out.println("Executing Both Smoke and Regression Test");

}
}