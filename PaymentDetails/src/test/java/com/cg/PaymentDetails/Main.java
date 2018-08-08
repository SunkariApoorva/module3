package com.cg.PaymentDetails;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Main {
	WebDriver driver;
	RegistrationPage registration;
	NextPage next;



	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\sapoorva\\Documents\\workspace-sts-3.9.2.RELEASE\\PaymentDetails\\ConferenceRegistartion.html");
		registration = PageFactory.initElements(driver, RegistrationPage.class);

	}

	@Given("^firstname is \"([^\"]*)\"$")
	public void firstname_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		registration.txtFN.sendKeys(arg1);


	}

	@Then("^lastname is \"([^\"]*)\"$")
	public void lastname_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		registration.txtLN.sendKeys(arg1);

	}

	@Then("^Email is \"([^\"]*)\"$")
	public void Email_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		registration.Email.sendKeys(arg1);

	}

	@Then("^PhoneNumber is \"([^\"]*)\"$")
	public void PhoneNumber_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		registration.Phone.sendKeys(arg1);

	}

	@Then("^NoOfAttendes is \"([^\"]*)\"$")
	public void NoOfAttendes_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		registration.size.sendKeys(arg1);

	}

	@Then("^BuildingName is \"([^\"]*)\"$")
	public void BuildingName_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		registration.Address.sendKeys(arg1);

	}

	@Then("^AreaName is \"([^\"]*)\"$")
	public void AreaName_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		registration.Address2.sendKeys(arg1);

	}

	@Then("^City is \"([^\"]*)\"$")
	public void City_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		registration.city.sendKeys(arg1);

	}

	@Then("^State is \"([^\"]*)\"$")
	public void State_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		registration.state.sendKeys(arg1);

	}

	@Then("^MemberStatus is \"([^\"]*)\"$")
	public void MemberStatus_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		registration.memberStatus.click();
		registration.a.click();

		Alert jsAlert = driver.switchTo().alert();
		if(jsAlert.getText().equals("Personal details are validated.")){

			Thread.sleep(1000);
			jsAlert.accept();
			driver.get("C:\\Users\\sapoorva\\Documents\\workspace-sts-3.9.2.RELEASE\\PaymentDetails\\PaymentDetails.html");
			next = PageFactory.initElements(driver, NextPage.class);
		}
		else {

		}

	}

	@Given("^CardHolderName is \"([^\"]*)\"$")
	public void CardHolderName_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		next.txtFN.sendKeys(arg1);

	}
	@Then("^CVV is \"([^\"]*)\"$")
	public void CVV_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		next.cvv.sendKeys(arg1);


	}

	@Then("^Expiration month is \"([^\"]*)\"$")
	public void Expiration_month_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		next.month.sendKeys(arg1);


	}

	@Then("^Expiration Year is \"([^\"]*)\"$")
	public void Expiration_Year_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		next.year.sendKeys(arg1);
		//Thread.sleep(1000);
		next.btnPayment.click();;



	}



}
