package stepdefinition;

import com.pages.estateplanningpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Personalvault_EstatePlanning {
	
	private estateplanningpage estateplanningpage = new estateplanningpage(DriverFactory.getDriver());
	

	@When("user should able to click on estate planning")
	public void user_should_able_to_click_on_estate_planning() {
		estateplanningpage.Clickonestateplanning();
	}

	@Then("user should able to click on add button")
	public void user_should_able_to_click_on_add_button() {
		estateplanningpage.addfile();
	}

	@Then("user should able to click on upload a file")
	public void user_should_able_to_click_on_upload_a_file() throws InterruptedException {
		
		 String filePath = "C:\\Users\\RAMYA\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-26 162743.png";
		 estateplanningpage.uploadfile(filePath);
		 Thread.sleep(1000);
	}

	@Then("user should upload the file")
	public void user_should_upload_the_file() throws InterruptedException {
		
		 estateplanningpage.verify();
		 Thread.sleep(2000);
		 estateplanningpage.Back();
		 
		 
	}

}
