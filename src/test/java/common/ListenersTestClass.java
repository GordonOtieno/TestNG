package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.testUtils;

public class ListenersTestClass extends testUtils implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Fail Creen capture");
        try {
			getScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub        
    }
}
