package stepdefinition;

import com.pages.securepasswordpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Personalvault_SecurePasswordSteps {
	
	
	
	private securepasswordpage securepasswordpage = new securepasswordpage(DriverFactory.getDriver());
	


	@Given("user clicks on secure password")
	public void user_clicks_on_secure_password() {
		securepasswordpage.clickonsecurepassword();
	}
	@When("user clicks on the add button")
	public void user_clicks_on_the_add_button() {
		securepasswordpage.Clickonadd();
	}
	@Then("user enters the title")
	public void user_enters_the_title() {
		securepasswordpage.Title();
	}
	@Then("user eners the username")
	public void user_eners_the_username() {
		securepasswordpage.username();
	}
	@Then("user enters the password")
	public void user_enters_the_password() {
		securepasswordpage.password();
	}
	@Then("user enters the website name")
	public void user_enters_the_website_name() {
		securepasswordpage.Webaddress();
	}
	
	
	
	@Then("user clicks on the save option")
	public void user_clicks_on_the_save_option() {
		
		securepasswordpage.save();
	    
	}
	@Then("user edits the secure password")
	public void user_edits_the_secure_password() throws InterruptedException {
		Thread.sleep(3000);
		securepasswordpage.option();
		securepasswordpage.edit();
		securepasswordpage.Title1();
		
		
	   
	}







}
