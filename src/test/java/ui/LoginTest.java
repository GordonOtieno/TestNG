package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void login() {
	  System.out.println("Login to the system .....");
	}
	
	@BeforeMethod
	public void connectDb() {
		System.out.println("Connect to database....");
	}

	@Test(priority = 1)
	public void loginTest() {
		System.out.println("Performing the dab operations");
	}
	
	@AfterTest
	public void logout() {
	  System.out.println("Login out the system .....");
	}
	
	@AfterMethod
	public void disConnectDb() {
		System.out.println("disconecting to database....");
	}
	
}
