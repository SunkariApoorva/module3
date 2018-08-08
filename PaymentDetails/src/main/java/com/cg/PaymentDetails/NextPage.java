package com.cg.PaymentDetails;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextPage {
	@FindBy(name="txtFN")
	public WebElement txtFN;
	
	@FindBy(name="debit")
	public WebElement debit;
	
	@FindBy(name="cvv")
	public WebElement cvv;
	
	@FindBy(name="month")
	public WebElement month;
	
	@FindBy(name="year")
	public WebElement year;
	
	@FindBy(id="btnPayment")
	public WebElement btnPayment;
	
	

}
