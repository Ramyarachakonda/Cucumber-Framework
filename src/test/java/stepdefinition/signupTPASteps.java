package stepdefinition;

import com.pages.signupforTPA;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class signupTPASteps {
	
	
	private signupforTPA signupforTPA = new signupforTPA(DriverFactory.getDriver());

	@Given("user should navigates to yopmail and takes random mail")
	public void user_should_navigates_to_yopmail_and_takes_random_mail() throws InterruptedException {
		signupforTPA.random1();
		signupforTPA.details();
	}
	@When("user enters all the appropriate details and get signed in")
	public void user_enters_all_the_appropriate_details_and_get_signed_in() throws Throwable {
		signupforTPA.otp();
		signupforTPA.password();
	}

}
