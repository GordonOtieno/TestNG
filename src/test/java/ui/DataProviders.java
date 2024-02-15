package ui;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {

   //second approach to handling data.
  
		@Test(dataProvider = "logintest", dataProviderClass = DataProvidersdummyData.class)
		public void logintest(String username, String password) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.saucedemo.com/");
			
		   driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		   WebElement btn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		   btn.click();
		   driver.close();
		   
		}
		
	
}
