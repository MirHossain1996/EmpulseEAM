package com.EmpulseEAM.Pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisitorEntryDetailsPage {

	@FindBy(xpath="//input[@name='VisitorsEHlx']")
	private WebElement visitorName;

	@FindBy(xpath="//input[contains(@class,'p-inputtext p-component ng-star-inserted')]")
	private WebElement idDateTime;

	@FindBy(xpath="//div[contains(@class,'p-datepicker p-component ng-star-inserted')]/descendant::span[.='29']")
	private WebElement dateforId;

	@FindBy(xpath="//textarea[@name='LaptopDevPP4']")
	private WebElement laptopdetails;

	@FindBy(xpath="//textarea[@name='RemarksBhNF']")
	private WebElement remarks;

	@FindBy(xpath="//input[@name='Documents1Qm']")
	private WebElement documentName;

	@FindBy(xpath="//textarea[@name='SecurityfSt7']")
	private WebElement securityRemark;

	@FindBy(xpath="//input[@name='TotalMemBPEo']")
	private WebElement totalmember;

	@FindBy(xpath="//input[@id='Submit']")
	private WebElement submit;

	@FindBy(xpath="//span[.='Select']")
	private WebElement whomToMeet;

	@FindBy(xpath="//span[contains(@class,'p-dropdown-label p-inputtext p-placeholder ng-star-inserted')]")
	private WebElement idcardStatus;

	@FindBy(xpath="(//span[contains(@class,'p-dropdown-label p-inputtext p-placeholder ng-star-inserted')])[2]")
	private WebElement purposeOfVisit;

	@FindBy(xpath="//input[@name='VisitorIyMrh']")
	private WebElement visitorId;

	@FindBy(xpath="//input[@class='displayblk' and @placeholder='Select File' ]")
	private WebElement upload;

	@FindBy(xpath="(//input[contains(@class,'p-inputtext p-component ng-star-inserted')])[2]")
	private WebElement outDatetime;

	@FindBy(xpath="//div[contains(@class,'p-datepicker p-component ng-star-inserted')]/descendant::span[.='30']")
	private WebElement DateforOut;
	
	@FindBy(xpath="//span[@class='ng-star-inserted' and text()='Official']")
	private WebElement purposeOfVisitOptin;
	
	@FindBy(xpath="(//button[@aria-label='Close'])[2]/span")
	private WebElement close;
	

	public VisitorEntryDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getDateforId() {
		return dateforId;
	}
	public WebElement getDateforOut() {
		return DateforOut;
	}
	public WebElement getOutDatetime() {
		return outDatetime;
	}
	public WebElement getUpload() {
		return upload;
	}
	public WebElement getVisitorId() {
		return visitorId;
	}
	public WebElement getPurposeOfVisit() {
		return purposeOfVisit;
	}
	public WebElement getPurposeOfVisitOptin() {
		return purposeOfVisitOptin;
	}
	public WebElement getSelect2() {
		return idcardStatus;
	}
	
	public WebElement getTotalmember() {
		return totalmember;
	}
	public WebElement getWhomToMeet() {
		return whomToMeet;
	}
	public WebElement getIdcardStatus() {
		return idcardStatus;
	}
	public WebElement getVisitorName() {
		return visitorName;
	}
	public WebElement getIdDateTime() {
		return idDateTime;
	}
	public WebElement getLaptopdetails() {
		return laptopdetails;
	}
	public WebElement getRemarks() {
		return remarks;
	}
	public WebElement getDocumentName() {
		return documentName;
	}
	public WebElement getSecurityRemark() {
		return securityRemark;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getClose() {
		return close;
	}
	
	public void visitorEntryDetails(String vname,String laptopdetail, String remark,String visitorid, String document_Name,String security_Remark,String totalNumOfMem) throws Throwable {
		visitorName.sendKeys(vname);
		laptopdetails.sendKeys(laptopdetail);
		remarks.sendKeys(remark);
		documentName.sendKeys(document_Name);
		securityRemark.sendKeys(security_Remark);
		visitorId.sendKeys(visitorid);
		totalmember.sendKeys(totalNumOfMem);
		
		
		idDateTime.click();
		dateforId.click();
		
		
		outDatetime.click();
		DateforOut.click();
		
		
		purposeOfVisit.click();
		purposeOfVisitOptin.click();
		
		whomToMeet.click();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		idcardStatus.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		File f=new File("./src/test/resources/Indian_Flag.jpg");
		String absulatepath = f.getAbsolutePath();
		upload.sendKeys(absulatepath);
		
		
		submit.click();
		
		close.click();

	}
}
