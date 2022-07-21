package ui;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import common.BaseTest;
import common.Retry;


public class ListenerDemo extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
	public void lanchBrowser()
	{
		driver.get("https://www.ebay.com/");
		assertTrue(true);
	}
}
