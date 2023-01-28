package com.Empulse.GenricUtility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.EmpulseEAM.Pom.LoginPage;
import com.EmpulseEAM.Pom.LogoutPage;
public class BaseClass {

	public WebDriver driver;
	public  ExcelUtility eLib=new ExcelUtility();
	public  WebDriverUtility wLib=new WebDriverUtility();
	public   FileUtility fLib=new FileUtility();
	@BeforeSuite
	public void configDataBase() {
		System.out.println("database connecttivity.....");
	}
	@BeforeClass
	public void configBeforeClass() {
		driver=new ChromeDriver();
		wLib.maximamWindow(driver);
		wLib.implictWait(driver);
		driver.get(IpathContent.url);
		System.out.println("....launching the browser...");
		
	}
	@BeforeMethod
	public void configBM() {
		LoginPage lip=new LoginPage(driver);
		lip.Login();
		System.out.println("---login ---------------");
	}
	@AfterMethod
	public void configAM() {
		LogoutPage lop =new LogoutPage(driver);
		lop.Logout();
		System.out.println("---logout ----------");
		
	}
	@AfterClass
	public void  configAC() {
		driver.quit();
		System.out.println("---close the browser----");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("........disconnect from db.......");
	}
}
