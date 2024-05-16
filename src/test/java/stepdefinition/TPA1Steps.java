package stepdefinition;

import java.awt.AWTException;

import com.pages.TPA1Page;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TPA1Steps {
	
	private TPA1Page TPA1Page = new TPA1Page(DriverFactory.getDriver());

	@When("user clicks on login option of Professional")
	public void user_clicks_on_login_option_of_professional() {
		TPA1Page.clickOntpaLogin();
	}
	
	

	
	@Given("user clicks on Dashboard")
	public void user_clicks_on_dashboard() throws InterruptedException {
		TPA1Page.Dashboard();
	}
	@Then("user clicks on add client")
	public void user_clicks_on_add_client() throws InterruptedException {
		TPA1Page.Addclient();

	}
	@Then("user adds the appropriate details")
	public void user_adds_the_appropriate_details() throws InterruptedException {
		TPA1Page.firstname();
		TPA1Page.lastname();
		TPA1Page.phone();
		TPA1Page.email();
		

	}
	@Then("user clicks on send invite")
	public void user_clicks_on_send_invite() throws InterruptedException {
		TPA1Page.invite();
		TPA1Page.close();

	}
	@Given("user should able to click on profile")
	public void user_should_able_to_click_on_profile() throws InterruptedException {
		TPA1Page.Profile();

	}
	@Then("user should click on edit option")
	public void user_should_click_on_edit_option() throws InterruptedException {

		TPA1Page.edit();
	}
	@Then("user adds the appropriate details in profile")
	public void user_adds_the_appropriate_details_in_profile() throws InterruptedException {

		TPA1Page.firstname1();
		TPA1Page.lastname1();
		TPA1Page.company();
		TPA1Page.typeofadvisor();
		TPA1Page.medical();
		TPA1Page.companyaddress();
	}
	@Then("user clicks on save option in profile")
	public void user_clicks_on_save_option_in_profile() throws InterruptedException {
		TPA1Page.savechanges();

	}
	@Given("user clicks on client list")
	public void user_clicks_on_client_list() throws InterruptedException {

		TPA1Page.clientlist();
	}
	@Then("user clicks on add client in client list")
	public void user_clicks_on_add_client_in_client_list() throws InterruptedException {

		TPA1Page.addclient();
	}
	@Then("user adds the details")
	public void user_adds_the_details() throws InterruptedException {
		TPA1Page.firstname2();
		TPA1Page.lastname2();
		TPA1Page.phone1();
		TPA1Page.email1();

	}
	@Then("user clicks on save and close")
	public void user_clicks_on_save_and_close() throws InterruptedException {

		TPA1Page.sendinvite();
		TPA1Page.close1();
	}
	@Given("the user is on the Calendar")
	public void the_user_is_on_the_calendar() throws InterruptedException {

		TPA1Page.clickOnCalendar();
	}
	@When("user clicks on new event")
	public void user_clicks_on_new_event() {
		TPA1Page.clickOnNewEvent();

	}
	@When("User enters {string} into Eventtitle")
	public void user_enters_into_eventtitle(String EventName) {

		TPA1Page.enterEventTitle(EventName);
	}
	@When("selects the Start date In the calendar")
	public void selects_the_start_date_in_the_calendar() {
		TPA1Page.selectStartDate();

	}
	@When("User sets Start time to {string}")
	public void user_sets_start_time_to(String string) {
		TPA1Page.clickOnStartTimeInput();

	}
	@When("User sets End time to {string}")
	public void user_sets_end_time_to(String string) {
	
		TPA1Page.selectEndDate();
		TPA1Page.clickOnEndTimeDropDown();
	}
	@When("User chooses to set a recurring event")
	public void user_chooses_to_set_a_recurring_event() {
		TPA1Page.clickOn_RECURRING_EVENT_DROPDOWN();

	}
	@When("User sets the recurrence to Monthly event")
	public void user_sets_the_recurrence_to_monthly_event() {
		System.out.println("This option selected in the :RecurringEvnetDropDown");
	}
	@When("selects end date on the calendar")
	public void selects_end_date_on_the_calendar() {
		System.out.println("This option selected in the :RecurringEvnetDropDown");
	}
	@When("assigns the event to client")
	public void assigns_the_event_to_client() {
		TPA1Page.addPeople();
	}
	@When("enters SomeText into description")
	public void enters_some_text_into_description() {
		TPA1Page.enterDescription();
	}
	@When("clicks on save in Calendar")
	public void clicks_on_save_in_calendar() {
		TPA1Page.clickOnSave();
	}
	@Given("user clicks on document repository")
	public void user_clicks_on_document_repository() {
		TPA1Page.repository();
	}
	@Then("user clicks on the click to upload")
	public void user_clicks_on_the_click_to_upload() throws InterruptedException, AWTException {
		TPA1Page.upload();
	}

	

	@Then("user uploads the file in repository")
	public void user_uploads_the_file_in_repository() {
	
	}





	
	
	
	
}
