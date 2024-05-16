package stepdefinition;

import com.pages.Disasterplanningpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Emergencyprep_DisasterPlanningSteps {
	
	
	private Disasterplanningpage Disasterplanningpage = new Disasterplanningpage(DriverFactory.getDriver());

	
	@When("user click on emergency prep")
	public void user_click_on_emergency_prep() throws InterruptedException {
		Disasterplanningpage.Emergencyprepback();
		
	}
	@Then("user clicks on the Disaster planning")
	public void user_clicks_on_the_disaster_planning() {
		Disasterplanningpage.disasterplanning();
	} 
	@Then("user clicks on the supply kit")
	public void user_clicks_on_the_supply_kit() {
		Disasterplanningpage.supplykit();
	}


	@Then("user clicks on the HomeEvacuation")
	public void user_clicks_on_the_home_evacuation() {
		Disasterplanningpage.homeevacuation();
	}

	

	@Then("user clicks on the Meeting Places")
	public void user_clicks_on_the_meeting_places() {
		Disasterplanningpage.Meetingplace();
	}

	
	@Then("user clicks on the Commuterplan")
	public void user_clicks_on_the_commuterplan() {
		Disasterplanningpage.Commuterplan();
	}


	@Then("user clicks on the Disaster planning back")
	public void user_clicks_on_the_disaster_planning_back() throws InterruptedException {
		Disasterplanningpage.Disasterplanning();
	} 




}
