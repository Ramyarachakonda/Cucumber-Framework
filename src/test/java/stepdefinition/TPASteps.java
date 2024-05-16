package stepdefinition;

import com.pages.tpapage;
import com.qa.Utils.EmailGenerator;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TPASteps {
	
	String invitePersonEmail;
	
	private tpapage tpapage = new tpapage(DriverFactory.getDriver());

	@Given("user should click on the tpa")
	public void user_should_click_on_the_tpa() throws InterruptedException {
		tpapage.clickOnTPA();
	}
	@Then("user should click on invite advisor")
	public void user_should_click_on_invite_advisor() {
		tpapage.clickOnInviteadvisor();
	}
	@And("user should enter name and email")
	public void user_should_enter_name_and_email() {
		tpapage.name();
		 invitePersonEmail = EmailGenerator.generateRandomEmail();
		 tpapage.enterInvitePersonEmail(invitePersonEmail);
		
	}

	@Then("user should send the TPAinvite")
	public void user_should_send_the_TPAinvite() {
		tpapage.send();


}
}
