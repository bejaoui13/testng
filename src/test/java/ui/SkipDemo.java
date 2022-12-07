package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemo {

	
	boolean datasetup=true;
	
	
	@Test(enabled=true)
	public void skipTest()
	{
		System.out.println("doooo this test as it not complete");
	}
	
	
	@Test
	public void skipTest1()
	{
		System.out.println("skiped this test forcefolly");
		throw new SkipException("Skipping this test");
	}
	
	
	@Test
	public void skipTest2()
	{
		System.out.println("do this test ");
		if  (datasetup==true)
		{
			System.out.println("Execute this Test ");
		}
		else 
		{
			System.out.println("do not execute this Test ");
            throw new SkipException("** not execute this Test **");
		}
 		
	}
}
