package com.Empulse.GenricUtility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
	
	public void maximamWindow( WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void implictWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
