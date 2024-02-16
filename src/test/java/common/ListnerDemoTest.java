package common;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class ListnerDemoTest extends BaseTest {
     
	@Test
	public void launchApp() {
		driver.get("https://www.ebay.com/");
		Assert.isTrue(false, null, null);
	}
}
