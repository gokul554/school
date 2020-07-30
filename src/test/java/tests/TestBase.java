package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import core.DriverFactory;
import pages.JavaHome;

public class TestBase extends DriverFactory {
	
	JavaHome home = null;
	
	@Test
	public void ExecuteHomePage()
	{
		home = new JavaHome(getDriver("chrome"));
		Assert.assertEquals(home.launchW3schools("https://www.w3schools.com/java/default.asp"), true, "unable to load");
	}

}
