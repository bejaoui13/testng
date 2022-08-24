package common;

import org.testng.ITestResult;
import org.testng.internal.annotations.DisabledRetryAnalyzer;

public class Retry extends DisabledRetryAnalyzer{
 
	
	private int count =0; 
	private static int maxTry =4 ; 
	
	
	public boolean retry(ITestResult ressult)
	{
		
		if (count < maxTry)
		{
			
			count++;
			return true; 
		}
		
		return false; 
	}
	
}

 

 
    