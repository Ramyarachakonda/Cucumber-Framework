package stepdefinition;


import com.pages.loginpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private loginpage loginPage = new loginpage(DriverFactory.getDriver());
		
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  DriverFactory.getDriver().get("https://www.familycentral.com/"); 
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		 String title = loginPage.getLoginPageTitle();
		  System.out.println("login page title is: "+title);	
	}
	
	@When("user clicks on LandingPageLogin")
	public void user_clicks_on_landing_page_login() {
		loginPage.landPageLoginOption();
	}
	@When("user clicks on login option of families")
	public void user_clicks_on_login_option_of_families() {
		loginPage.FamilyLoginOption();
	}
	
	@Then("user should navigate to login page")
	public void user_should_navigate_to_login_page() {
	   
	System.out.println("user navigate to login page");
		
	}
	
	@When("user enters username as {string} into email field")
	public void user_enters_username_as_into_email_field(String username) throws InterruptedException {
	   
		loginPage.enteremailaddress(username);
		
	}

	@When("user enters password as {string} into password field")
	public void user_enters_password_as_into_password_field(String password) {	   
		loginPage.enterpassword(password);		
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {	  
		loginPage.clickOnLogin();		
	}

	
	@Then("user gets the family central page")
	public void user_gets_the_family_central_page() {
		  System.out.println("Entered into Dashboad: ");
		
		
	} 
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedPageTitle) {
		
	
		System.out.println("feature Page Title is :"+expectedPageTitle);
		
//		Assert.assertEquals(title, expectedPageTitle);

	
	}


}
