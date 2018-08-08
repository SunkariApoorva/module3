package com.cg.PaymentDetails;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
	
	@FindBy(name="txtFN")
	public WebElement txtFN;
	
	@FindBy(name="txtLN")
	public WebElement txtLN;
	
	@FindBy(name="Email")
	public WebElement Email;
	
	@FindBy(name="Phone")
	public WebElement Phone;
	
	@FindBy(name="size")
	public WebElement size;
	
	@FindBy(name="Address")
	public WebElement Address;
	
	@FindBy(name="Address2")
	public WebElement Address2;
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(name="state")
	public WebElement state;
	
	@FindBy(name="memberStatus")
	public WebElement memberStatus;
	
	@FindBy(tagName="a")
	public WebElement a;
	

}
