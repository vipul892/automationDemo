package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test6 {

	@Test
	@Parameters({"eID","eName"})
	
	public void eInfo(int eID,String eName) {
		System.out.println("Employee id is:-"+eID);
		System.out.println("Employee name is:-"+eName);
		
		
	}
	
	
	
	@Test(dataProvider ="getData")
	public void loginTest(String username,String password) {
		System.out.println("Print username:"+username);
		System.out.println("Print Password:"+password);
		
	}
	
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="FistsetUsername";
		data[0][1]="FistSetPassword";
		
		data[1][0]="SecondSetUsername";
		data[1][1]="SecondSetPassword";
		
		data[2][0]="thirdSetUsername";
		data[2][1]="thirdSetPassword";
		
		return data;
	}
}
