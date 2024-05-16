package com.pages;



import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Utils.ScrollUtils;
import com.qa.Utils.WebDriverWaits;

public class Familymemberpage {
	
	 
	    private WebDriver driver;
	    private WebDriverWaits wait;
	    private ScrollUtils scroll;
	    private WebDriverWait wait1;

		private By MYFAMILY = By.xpath("(//span[normalize-space()='My Family'])[1]");
		private By ADDMEMBER_BTN = By.xpath("//button[normalize-space()='Add member']");
		private By INVITE_NAME_FIELD = By.xpath("//input[@id='name']");
		private By INVITE_EMAIL_FIELD = By.xpath("//input[@id='inviteEmail']");
		private By SENDINVITE_BTN = By.xpath("//button[@class='primary_btn' and text()=' Send invite ']");
		private By INVITE_SENT_MESSAGE = By.xpath("//div[@aria-label='Invite has been sent to email']");
		// For email text, you can customize the locator as needed
		private By INVITE_SENT_MESSAGE_CUSTOM = By.xpath("//p[normalize-space()='InviteEmail']");
	 
		// Yopmail locators
		private By YOPMAIL_LOGIN_FIELD = By.xpath("//input[@id='login']");
		private By YOPMAIL_ARROW_ICON = By.xpath("//i[@class='material-icons-outlined f36']");
		private By YOPMAIL_REFRESH_BTN = By.xpath("//button[@id='refresh']");
		private By RECEIVED_INVITE_EMAIL = By.xpath("//span[text()='Family Central']/following::div[contains(text(),'You an Invitation to Family Central')]");
		private By IFRAME_OF_EMAIL = By.xpath("//*[@id='ifmail']");
		private By CREATE_ACCOUNT_BTN = By.xpath("//*[@id=\"mail\"]/div/center/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[10]/td/table/tbody/tr/td/div/a/span");
//		private By JOIN_YOUR_FAMILY_BTN = By.xpath("//a[text()='Join your family']");
		private By CONTINUE_BTN_YOPMAIL = By.xpath("//button[@class='primary_btn w-100']");
		private By PASSWORD_FIELD_YOPMAIL = By.xpath("//input[@id='password']");
		private By CONFIRM_PWD_FIELD_YOPMAIL = By.xpath("//input[@id='confirmPassword']");
		private By CONTINUE_BTN_YOPMAIL2 = By.xpath("//button[@class='primary_btn w-100 apitrigger']");
		private By COUNTRY_DROPDOWN_YOPMAIL = By.xpath("//div[@class='iti__selected-flag dropdown-toggle']");
		private By PHONE_NO_FIELD_YOPMAIL = By.xpath("//input[@id='phone']");
		private By TERMS_CHECKBOX_YOPMAIL = By.xpath("//input[@id='termsCheckbox']");
		private By SEND_CODE_BTN_YOPMAIL = By.xpath("//button[@class='primary_btn w-100 apitrigger']");
		private By OTP_ELEMENT_PRESENT = By.xpath("//tbody/tr[1]/td[3]");
		// Or you can use this locator for OTP field
		private By OTP_FIELD = By.xpath("(//input[@autocomplete='one-time-code'])[1]");
	 
		// Additional Yopmail actions
		private By ENTER_OTP_FIELD = By.xpath("//input[@id='otp_0_2xstfmu5egeltbp9h0s']");
		private By ENTER_FIRST_NAME_FIELD = By.xpath("//input[@id='name_fields']");
		private By ENTER_LAST_NAME_FIELD = By.xpath("//input[@id='lastname']");
		private By MONTH_DROPDOWN_YOPMAIL = By.xpath("//select[@id='Month']");
		private By ENTER_DAY_FIELD = By.xpath("//input[@name='day']");
		private By ENTER_YEAR_FIELD = By.xpath("//input[@name='year']");
		private By ENTER_ZIPCODE_FIELD = By.xpath("//input[@name='zipCode']");
		private By CONTINUE_BTN_YOPMAIL_2 = By.xpath("//button[@class='primary_btn w-100 apitrigger']");
		private By VERIFY_HOME_SPAN = By.xpath("(//span[text()='Home'])[1]");
	 
	 
		   
	 
		    public Familymemberpage(WebDriver driver) {
		        this.driver = driver;
		        this.wait = new WebDriverWaits(driver, Duration.ofSeconds(20));
		        this.scroll = new ScrollUtils(driver);
		        this.wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		    }
	 
		    // ... (existing methods) ...
	 
		    // New methods for the feature file
		    public void navigateToMyFamilyModule() {
		    	wait.waitForElementToBeClickable(MYFAMILY).click();
		    }
		     public void clickOnAddMember() {
		    	wait.waitForElementToBeClickable(ADDMEMBER_BTN).click();
		    }
		      public boolean verifyPopUpWindow() {
			    	return driver.findElement(ADDMEMBER_BTN).isDisplayed();
			    }

	 
		    public void enterInvitePersonName(String personName) {
		        wait.waitForElementToBeClickable(INVITE_NAME_FIELD).sendKeys(personName);
		    }
		    public void enterInvitePersonEmail(String emailAdd) {
		    	driver.findElement(INVITE_EMAIL_FIELD).sendKeys(emailAdd);
		    }
	 
		    public void clickOnSendInvite() {
		        wait.waitForElementToBeClickable(SENDINVITE_BTN).click();
		    }
	 
		    public void verifyInviteSentMessage() {
		       WebElement message = wait.waitForPresenceOfElement(INVITE_SENT_MESSAGE);
		       System.out.println(message);
		        // You may want to assert the message content or do additional verification
		       wait.waitForElementToBeClickable(By.xpath("//span[@class='account_menu d-none d-md-inline-block']")).click();
		       wait.waitForElementToBeClickable(By.xpath("//span[text()='Log Out']")).click();
		    }
	 
		    public void navigateToYopmail() {
		        // Implement steps to navigate to Yopmail...
		    	((JavascriptExecutor) driver).executeScript("window.open('', '_blank');");
				
			    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		    	   driver.switchTo().window(tabs.get(1));
		    	driver.get("https://yopmail.com");
		    }
	 
		    public void checkReceivedInviteEmail(String emailAdd) {
		        // Implement steps to check for the received invite email...
		    	wait.waitForElementToBeClickable(YOPMAIL_LOGIN_FIELD).sendKeys(emailAdd);
		    	wait.waitForElementToBeClickable(YOPMAIL_ARROW_ICON).click();
		    }
	 
		    public void switchToEmailIframe() {
		        // Implement steps to switch to the email iframe...
		    	   driver.switchTo().frame(2);
//		    	WebElement iframeElement = wait.waitForElementToBeVisible(IFRAME_OF_EMAIL);
//		    	driver.switchTo().frame(iframeElement);
//		    	wait.waitForElementToBeClickable(YOPMAIL_REFRESH_BTN).click();
		    }
	 
		    public void clickOnCreateAccount() throws InterruptedException {
		    	Thread.sleep(2000);
		    
		    	WebElement AccountCreate = wait.waitForVisibilityOfElement(CREATE_ACCOUNT_BTN);
		        AccountCreate.click();
		    			    	
		    			    	
		    }
	 
		    public void joinYourFamily() throws InterruptedException, TimeoutException {
		        
		    	
		 	            driver.findElement(By.xpath("//form[@id='msform']//div[@class='card_container']//div//a")).click();
		 	        

		            
		            // Continue with other actions on the page
		        }
		    
		    public void continueOnYopmail() throws InterruptedException {
		        // Implement steps to continue on Yopmail...
//		    	wait.waitForElementToBeClickable(CONTINUE_BTN_YOPMAIL).click();
		    	Thread.sleep(3000);
		    	 wait.waitForElementToBeClickable(By.xpath("//button[@class='primary_btn w-100']")).click();
		    }
	 
		    public void enterPasswordAndConfirm(String passWord) throws InterruptedException {
		    	Thread.sleep(2000);
		        // Implement steps to enter password and confirm...
		    	wait.waitForElementToBeClickable(PASSWORD_FIELD_YOPMAIL).sendKeys(passWord);
		    	wait.waitForElementToBeClickable(CONFIRM_PWD_FIELD_YOPMAIL).sendKeys(passWord);
		    	wait.waitForElementToBeClickable(CONTINUE_BTN_YOPMAIL2).click();
		    }
		    public void ContinueNextPage(String passWord) {
		        // Implement steps to enter password and confirm...
		    	wait.waitForElementToBeClickable(CONTINUE_BTN_YOPMAIL2).click();
		    	
		    	
		    } 
		    public void selectCountryEnterPhoneAndSendCode(String email) {
		        // Implement steps to select country, enter phone, and send code...
		    	wait.waitForElementToBeClickable(COUNTRY_DROPDOWN_YOPMAIL).click();
		    	wait.waitForElementToBeClickable(PHONE_NO_FIELD_YOPMAIL).sendKeys(email);
		    	wait.waitForElementToBeClickable(TERMS_CHECKBOX_YOPMAIL).click();
		    	wait.waitForElementToBeClickable(SEND_CODE_BTN_YOPMAIL).click();
		    	// Or you can use this locator for OTP field
		    }
	
		    public void verifyOtpElementPresence() {
		        // Implement steps to verify OTP element presence...
		    }
	 
		    public void enterOtp(String otp) {
		        // Implement steps to enter OTP...
		    	wait.waitForElementToBeClickable(ENTER_OTP_FIELD).sendKeys(otp);
		    }
	 
		    public void completeRegistration(String firstName, String lastName) throws InterruptedException {
		        // Implement steps to complete registration...
		    	wait.waitForElementToBeClickable(ENTER_FIRST_NAME_FIELD).sendKeys(firstName);
		    	wait.waitForElementToBeClickable(ENTER_LAST_NAME_FIELD).sendKeys(lastName);
		    	WebElement monthDropDown = wait.waitForElementToBeClickable(MONTH_DROPDOWN_YOPMAIL);
		    	Select Month = new Select(monthDropDown);	
		    	Month.selectByIndex(3);
		    	wait.waitForElementToBeClickable(ENTER_DAY_FIELD).sendKeys("09");
		    	wait.waitForElementToBeClickable(ENTER_YEAR_FIELD).sendKeys("1994");
		    	wait.waitForElementToBeClickable(ENTER_ZIPCODE_FIELD).sendKeys("98065");
		    	wait.waitForElementToBeClickable(CONTINUE_BTN_YOPMAIL_2).click();
		    	Thread.sleep(4000);
		    }	 
		    public boolean verifyHome() {
		        // Implement steps to verify the home page...
		    	return wait.waitForElementToBeClickable(VERIFY_HOME_SPAN).isDisplayed();
		    
		    }	 		    
		    // ... (Any additional methods if needed)	 
}


