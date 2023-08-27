package com.EmpulseEAM.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Empulse.GenricUtility.IpathContent;

public class LoginPage {

		@FindBy(xpath="//input[@value='Username']")
		private WebElement User;

		@FindBy(xpath="//input[@value='Password']")
		private WebElement Password;

		@FindBy(xpath="//button[.='Login']")
		private WebElement loginbtn;
		

		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		public WebElement getUser() {
			return User;
		}
		public WebElement getPassword() {
			return Password;
		}
		
		public WebElement getLogin() {
			return loginbtn;
		}

		public void Login() {
			User.sendKeys(IpathContent.username);
			Password.sendKeys(IpathContent.password);
			loginbtn.click();
					}
		
	}

