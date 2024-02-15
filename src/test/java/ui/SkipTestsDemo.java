package ui;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SkipTestsDemo {
	Boolean checkValue= false;
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is a before class method");
	}
	
	@Test(enabled = false)
	public void skipDemoOne() {
		System.out.println("Skip test as it is not complete");
	}
	
	@Test
	public void skipDemoTwo() {
		System.out.println("Skip test the hard way");
		throw new SkipException("Skipping the test the hard way");
	}
	
	@Test
	public void skipDemoThree() {
		if (checkValue==true) {
		System.out.println("skipped condtion is passed");
		}else
		throw new SkipException("Skip test based on conditions");
	}

}
