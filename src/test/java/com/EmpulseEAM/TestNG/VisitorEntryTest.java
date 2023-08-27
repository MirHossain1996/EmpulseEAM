package com.EmpulseEAM.TestNG;

import org.testng.annotations.Test;

import com.Empulse.GenricUtility.BaseClass;
import com.EmpulseEAM.Pom.HomePage;
import com.EmpulseEAM.Pom.VisitorEntryDetailsPage;

public class VisitorEntryTest extends BaseClass{

	@Test
	public void visitorDetails() throws Throwable {
		HomePage  hp=new HomePage(driver);
		hp.clickAddButton();
		VisitorEntryDetailsPage vedp=new VisitorEntryDetailsPage(driver);
		vedp.visitorEntryDetails("Vikshita Alva",  "Dell", "very good", "129", "Flag", "silent", "20");
}
}