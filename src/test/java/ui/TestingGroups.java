package ui;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups = "User-Registration")
public class TestingGroups {
	@Test(priority = 1, groups = "abc")
	public void testone() {
	 System.out.println("Testing one");
	}
	
	@Test(priority = 2, groups = "abc")
	public void testTwo() {
	 System.out.println("Testing Two");
	}
	@Test(priority = 3, groups = {"abc","cde"})
	public void testThree() {
	 System.out.println("Testing Three");
	}
	@Test(priority = 4, groups = {"abc","cde"})
	public void testFour() {
	 System.out.println("Testing Four");
	}
}
