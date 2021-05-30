package com.semillerosqa.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignInPageTest {
	
	private WebDriver driver;
	public SignInPage signIn; 

	@Before
	public void setUp() throws Exception {
		signIn = new SignInPage(driver);
		driver = signIn.chromeConnectionDriver();
		signIn.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signIn.signInTest();
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", signIn.accountWelcomeText());
		assertEquals("Pepito Perez", signIn.userNameAccount());
	}

}
