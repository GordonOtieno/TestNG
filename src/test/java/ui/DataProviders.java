package ui;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {

	@Test(dataProvider = "dataset")
	public void test(String username, String password) {
		System.out.println(username+"***"+password);
	}
	
	@DataProvider(name="dataset")
	public Object[][] dataset(){
		Object [][] dataset = new Object [4][2];
		//first row
		dataset[0][0] = "user1";
		dataset[0][1] = "pass1";
		//first row
		dataset[1][0] = "user2";
		dataset[1][1] = "pass2";
		//first row
		dataset[2][0] = "user3";
		dataset[2][1] = "pass3";
		//first row
		dataset[3][0] = "user4";
		dataset[3][1] = "pass4";
		
		return dataset;
	}

   //second approach to handling data.
  
		@Test(dataProvider = "dataset2")
		public void test2(String username, String password, String text) {
			System.out.println(username+"***"+password+"**"+text);
		}
		
		@DataProvider(name="dataset2")
		public Object[][] dataset2(){
		return new	Object [][] {
			{"First-Value","Second-Value", "text section"},
			{"First-Value","Second-Value", "text section"},
			{"First-Value","Second-Value", "text section"}
			};
		}
}
