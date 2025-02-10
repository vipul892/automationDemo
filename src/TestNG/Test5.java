package TestNG;

import org.testng.annotations.Test;

public class Test5 {

	@Test
	public void loginTest() {
		// Logic to login
		System.out.println("Login Test Passed");
	}

	@Test(dependsOnMethods = { "loginTest" })
	public void viewProfileTest() {
		// This test will run only if loginTest passes
		System.out.println("View Profile Test Passed");
	}

	@Test(dependsOnMethods = { "loginTest" })
	public void changePasswordTest() {
		// This test will run only if loginTest passes
		System.out.println("Change Password Test Passed");
	}

	@Test(dependsOnMethods = { "viewProfileTest", "changePasswordTest" })
	public void updateSettingsTest() {
		// This test will run only if loginTest and viewProfileTest pass
		System.out.println("Update Settings Test Passed");

	}
	@Test(enabled=true)
	public void logout()
	{
		System.out.println("log out scessfully");
	}
}
