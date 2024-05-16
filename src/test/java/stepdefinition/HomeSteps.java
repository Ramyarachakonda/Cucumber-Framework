package stepdefinition;


import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.pages.Homepage;
import com.qa.Utils.EmailGenerator;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
	

	String invitePersonEmail;
	 
	WebDriver driver;
 
    
	private Homepage Homepage = new Homepage(DriverFactory.getDriver());
	String InvitepersonEmail = "FamilyMemberOne@yopmail.com";

	@Given("user clicks on the home")
	public void user_clicks_on_the_home() throws InterruptedException {
		Homepage.home();
		Homepage.addfamily();
		Homepage.addfamilymember();
	    
	}
	  
	@When("user clicks on the Add a family member")
	public void user_clicks_on_the_add_a_family_member() {
		Homepage.enterInvitePersonName();
		invitePersonEmail = EmailGenerator.generateRandomEmail();
		 Homepage.enterInvitePersonEmail(invitePersonEmail);
	   
	}
	@Then("user adds the family member")
	public void user_adds_the_family_member() throws InterruptedException {
		Homepage.send();
		
		
		
	}
	@Then("user clicks on the upload profile")
	public void user_clicks_on_the_upload_profile() throws InterruptedException {
		
		Homepage.upload();
	
		
	   
	}
	@Then("user uploads the picture")
	public void user_uploads_the_picture() throws InterruptedException, AWTException {
		
		Homepage.uploadfile();
	    
	}
	@Then("user clicks on the add emergency contact")
	public void user_clicks_on_the_add_emergency_contact() throws InterruptedException {
		Homepage.emergencycontact();
		
	 
	}
	@Then("user adds the emergency contact")
	public void user_adds_the_emergency_contact() {
		
	System.out.println("contact added");
	  
	}
	@Then("user clicks on the gather family documents")
	public void user_clicks_on_the_gather_family_documents() throws InterruptedException {
		
		Homepage.gather();
	   
	}
	@Then("user clicks on the download option")
	public void user_clicks_on_the_download_option() {
		
	System.out.println("checklist downloaded");
	   
	}
	
	  
	@Then("user clicks on the invite TPA")
	public void user_clicks_on_the_invite_tpa() throws InterruptedException {
		
		Homepage.TPA();
		Homepage.enterInviteTPAPersonName();
			invitePersonEmail = EmailGenerator.generateRandomEmail();
			 Homepage.enterInviteTPAPersonEmail(invitePersonEmail);
		
	    
	}

	@And("user invites the TPA")
	public void user_invites_the_tpa() {
		
		Homepage.sendinvite();
	    
	}


}
