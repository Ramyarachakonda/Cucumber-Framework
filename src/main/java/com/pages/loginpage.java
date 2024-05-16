package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {

	private WebDriver driver;
	 private WebDriverWait wait;
	 
	private By landPageLogin = By.xpath("//a[text()='Log In']");
	private By FamilyLogin = By.xpath("//button[@class='primary_btn mb-3']");
	// input[@id='login-email']
  
	private By username = By.xpath("//input[@id='login-email']");
	private By Password = By.xpath("//input[@id='login-password']");
	private By signInButton = By.xpath("(//button[text()='Login'])[1]");
//	private By forgotPwdLink = By.linkText("Forgot Password?");

	public loginpage(WebDriver driver) {
		this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getLoginPageTitle() {
		return driver.getCurrentUrl();
	}
	
	
	
	public void landPageLoginOption() {
		WebElement LandPageLogin = wait.until(ExpectedConditions.elementToBeClickable(landPageLogin));
		LandPageLogin.click();
	}
	
	
	public void FamilyLoginOption() {
		WebElement familyLogin = wait.until(ExpectedConditions.elementToBeClickable(FamilyLogin));
		familyLogin.click();
		
	}
	
	

	public void enteremailaddress(String emailaddress) throws InterruptedException {
		Thread.sleep(3000);
		WebElement Username = wait.until(ExpectedConditions.elementToBeClickable(username));
		Username.sendKeys(emailaddress);
		
	}

	public void enterpassword(String password) {
		WebElement Passwords = wait.until(ExpectedConditions.elementToBeClickable(Password));
		Passwords.sendKeys(password);
	

	}

	public void clickOnLogin() {
		WebElement SignInButton = wait.until(ExpectedConditions.elementToBeClickable(signInButton));
		SignInButton.click();
		
	}

	
	
}
