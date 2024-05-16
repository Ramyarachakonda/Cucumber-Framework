package stepdefinition;

import com.pages.myfamilypage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyfamilySteps {
	
	
	private myfamilypage myfamilypage = new myfamilypage(DriverFactory.getDriver());


	@Given("userable to click on my family")
	public void userable_to_click_on_my_family() throws InterruptedException {	
		myfamilypage.clickOnMyFamily();
	  
	}
	@When("user should click on add member")
	public void user_should_click_on_add_member() {
		myfamilypage.clickOnaddmember();
	}
	@Then("user should enter the name and email")
	public void user_should_enter_the_name_and_email() {
		myfamilypage.name();
		myfamilypage.email();
		myfamilypage.checkbox();
	}
	@Then("user should send the invite")
	public void user_should_send_the_invite() {
		myfamilypage.sendinvite();
	}




}
