package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertTest {
	@Test
	public void verifyTitle() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		SoftAssert softAssert = new SoftAssert();
		
		String expectedButonTex = "Search";
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		driver.navigate().to("https://www.ebay.com/");
		String actualTitle = driver.getTitle();
        
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase(expectedTitle);
        
        softAssert.assertEquals(actualTitle, expectedTitle, "Title are not matching...");
		WebElement button= driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
		String buttonValue=button.getAttribute("value");
		System.out.println(buttonValue);
		softAssert.assertEquals(buttonValue, expectedButonTex,"Button text does not match");
		softAssert.assertAll();
		driver.quit();
	}

}


