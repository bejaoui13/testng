package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.TestUtils;

public class Listeners extends TestUtils implements ITestListener {

	public void onTestStart(ITestResult ressult) {

		System.out.println("Test case is starting");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void onTestSuccess(ITestResult ressult)
	{
		System.out.println("Test case ");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void onTestFailur(ITestResult ressult)
	{
		System.out.println("Test Failed - screenshot");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult ressult)
	{
		System.out.println("Test Skipped");
	}
}
