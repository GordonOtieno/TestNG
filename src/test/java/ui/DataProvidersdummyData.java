package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProvidersdummyData {

		
		@DataProvider(name="logintest")
		public Object[][] login(Method m){
			Object[][] testData = null;
			
			if(m.getName().equals("logintest")) {
				
				testData= new	Object [][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"} 
			};
		 }
			else {
				testData = new	Object [][] {
					{"standard_user","secret_sauce","welcome"},
					{"locked_out_user","secret_sauce","welcome"},
					{"problem_user","secret_sauce","welcome"},
					{"performance_glitch_user","secret_sauce","welcome"} 
			    };
			}
			
			return testData;
		}
}
