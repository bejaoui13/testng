package ui;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import common.BaseTest;

public class ListenerDemo extends BaseTest {

	@Test
	public void lanchBrowser()
	{
		driver.get("https://www.ebay.com/");
		assertTrue(true);
	}
}
