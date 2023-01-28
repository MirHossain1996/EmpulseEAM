package com.EmpulseEAM.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

		@FindBy(xpath="//i[contains(@class,'fa fa-power-off')]")
		private WebElement logout;
		
		public LogoutPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		public WebElement getLogout() {
			return logout;
		}
		public void Logout() {
			logout.click();
			
		}


	

}
