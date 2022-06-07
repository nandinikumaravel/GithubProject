package org.demo;

import org.base.HelperCLass;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;

public class Hooks extends HelperCLass{

	@After
	public void screenShot(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot t = (TakesScreenshot)driver;
		byte[] b = t.getScreenshotAs(OutputType.BYTES);
		s.embed(b, "image/png");
		
		}

	}
	
	
}
