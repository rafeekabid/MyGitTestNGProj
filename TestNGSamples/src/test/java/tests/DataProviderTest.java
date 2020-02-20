package tests;

import org.testng.annotations.*;

public class DataProviderTest {
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][2];
		
		data[0][0] = "UserName1";
		data[0][1] = "Password1";
		data[1][0] = "UserName2";
		data[1][1] = "Password2";		
		return data;				
	}
	
	@Test (dataProvider="getData")
	public void dataProviderTestMethod(String userName, String Password) {
		System.out.println("You have provided user name is:" + userName);
		System.out.println("You have provided password is:" + Password);
		
	}

}
