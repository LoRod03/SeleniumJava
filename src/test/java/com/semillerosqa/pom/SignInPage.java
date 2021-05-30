package com.semillerosqa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base {
	
	By signInLinkLocator = By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account']");
	By alreadyRegisteredTextLocator = By.xpath("//form[@id='login_form']/h3");
	By emailAddressSigninSectionLocator = By.id("email");
	By passwordSigninSectionLocator = By.id("passwd");
	By signinButtonLocator = By.id("SubmitLogin");

	By accountWelcomeLocator = By.xpath("//div[@id='center_column']/p");
	By userNameAccountLocator = By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account']/span");
	
	public SignInPage(WebDriver driver) {
		super(driver);
	}
		
	public void signInTest() throws InterruptedException {
		click(signInLinkLocator);
		
		if(isDisplayed(alreadyRegisteredTextLocator)) {
			type("donpepe@gmail.com", emailAddressSigninSectionLocator);
			type("1234ac", passwordSigninSectionLocator);
			click(signinButtonLocator);
			
			Thread.sleep(5000);
		}
		
		else {
			System.out.println("Page was not found");
		}
	}
	
	public String accountWelcomeText() {
		return getText(accountWelcomeLocator);
	}
	
	public String userNameAccount() {
		return getText(userNameAccountLocator);
	}
	
	
}
