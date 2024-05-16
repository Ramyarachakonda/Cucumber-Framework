package stepdefinition;


import java.awt.AWTException;

import com.pages.sharedwithmepage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Personalvault_SharedwithmeSteps {
	
	
	private sharedwithmepage sharedwithmepage = new sharedwithmepage(DriverFactory.getDriver());

	
	@When("user shares an email")
	public void user_shares_an_email() throws InterruptedException {
		
		sharedwithmepage.sharefile();
		
	    
	}
	@Then("user goes to the appropriate email")
	public void user_goes_to_the_appropriate_email() {
		sharedwithmepage.firstname();
		sharedwithmepage.lastname();
		sharedwithmepage.email();
		sharedwithmepage.flag();
		sharedwithmepage.searchcountry();
		sharedwithmepage.us();
		sharedwithmepage.phone();
		sharedwithmepage.validuntil();
		sharedwithmepage.validTill();
		sharedwithmepage.share();
	    
	}
	
	
	

	@Then("user navigates to the yopmail and opens the website")
	public void user_navigates_to_the_yopmail_and_opens_the_website() throws InterruptedException {
		sharedwithmepage.yopmail();
		
		
		
	}
	@Then("user opens the email and sign in")
	public void user_opens_the_email_and_sign_in() throws Throwable {
		sharedwithmepage.enteremail();
		sharedwithmepage.click();
		sharedwithmepage.frame();
		sharedwithmepage.signin();
		
	}
	@Then("user enters the authentication code")
	public void user_enters_the_authentication_code() throws Throwable {
		sharedwithmepage.code();
		
		
		
	}
	
	@And("user uploads the file")
	public void user_uploads_the_file() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		sharedwithmepage.uploadFile();
		sharedwithmepage.previouswindow();
	}


	}





	
	
	
	
	
	
	
	
	
	

