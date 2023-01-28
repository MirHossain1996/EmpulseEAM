package com.EmpulseEAM.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//div[@class='ng-star-inserted']/following-sibling::div")
	private WebElement visitorFile;
	
	@FindBy(xpath="//button[@class='btn commonbutton addform ng-star-inserted']")
	private WebElement addBtn;
	
	public WebElement getVisitorFile() {
		return visitorFile;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickAddButton() {
		visitorFile.click();
		addBtn.click();
	}
}
