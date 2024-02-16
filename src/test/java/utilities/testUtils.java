package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class testUtils extends BaseTest {

	
	//capture screenshort
	//send emails 
	
	public void getScreenShot() throws IOException {
		Date currentDate = new Date();
		String screenShortFilename = currentDate.toString().replace(" ", "-").replace(":", "-");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// install commons Io library to view screenshot
		FileUtils.copyFile(screenshotFile, new File(".//screenshort//" + screenShortFilename + ".png"));

	}

}
