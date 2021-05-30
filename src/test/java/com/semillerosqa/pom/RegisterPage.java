package com.semillerosqa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base {
	
	String myName = "Pepito";
	String myLastName = "Perez";
	String myEmail = "donpepeee@gmail.com";
	String myPassword = "1234ac";
	
	By signInLinkLocator = By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account']");
	
	By createAccountFormLocator = By.id("create-account_form");
	By emailCreateInputLocator = By.name("email_create");
	By createAccountButtonLocator = By.id("SubmitCreate");
	
	By textCreateAnAccount = By.xpath("//*[@id='noSlide']/h1");
	By genderButtonLocator = By.id("id_gender1");
	By firstNameInputLocator = By.id("customer_firstname");
	By lastNameInputLocator = By.id("customer_lastname");
	By passwordInputLocator = By.id("passwd");
	
	By dayBirthSelectorLocator = By.id("days");
	By monthBirthSelectorLocator = By.id("months");
	By yearBirthSelectorLocator = By.id("years");
	
	By newsletterCheckboxLocator = By.id("newsletter");
	By specialOffersCheckboxLocator = By.id("optin");
	
	By companyInputLocator = By.id("company");
	By addressCompanyInputLocator = By.id("address1");
	By cityInputLocator = By.id("city");
	By stateSelectorLocator = By.id("id_state");
	By postalCodeInputLocator = By.id("postcode");
	By mobilePhoneInputLocator = By.id("phone_mobile");
	By addressAliasInputLocator = By.id("alias");
	
	By registerAccountButtonLocator = By.id("submitAccount");
	
	By myAccountTextLocator = By.xpath("//div[@id='center_column']/h1");
	

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public void registerPersonalInformation() throws InterruptedException {
		click(signInLinkLocator);
		Thread.sleep(2000);
		
		if(isDisplayed(createAccountFormLocator)) {
			type(myEmail, emailCreateInputLocator);
			click(createAccountButtonLocator);
			
			Thread.sleep(2000);
			
			if(isDisplayed(textCreateAnAccount )) {
				click(genderButtonLocator);
				type(myName, firstNameInputLocator);
				type(myLastName, lastNameInputLocator);
				type(myPassword, passwordInputLocator);
				
				click(dayBirthSelectorLocator);
				type("10", dayBirthSelectorLocator);
				click(monthBirthSelectorLocator);
				type("March", monthBirthSelectorLocator);
				click(yearBirthSelectorLocator);
				type("2000", yearBirthSelectorLocator);
				
				click(newsletterCheckboxLocator);
				click(specialOffersCheckboxLocator);
				
				type("Whatever Company", companyInputLocator);
				type("Central park", addressCompanyInputLocator);
				type("New York City", cityInputLocator);
				click(stateSelectorLocator);
				type("New York", stateSelectorLocator);
				type("10006", postalCodeInputLocator);
				type("124325", mobilePhoneInputLocator);
				
				click(registerAccountButtonLocator );
				
				Thread.sleep(5000);

			} else {
				System.out.print("Page not found");
			}
		} 
		
		else {
			System.out.print("Page not found");
		}

	}
	
	public String registerMessage() {
		return getText(myAccountTextLocator);
	}
	
}
