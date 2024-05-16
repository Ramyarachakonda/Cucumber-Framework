package stepdefinition;

import com.pages.Afterlifeplanningpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Personalvault_AfterlifeplanningSteps {

	private Afterlifeplanningpage Afterlifeplanningpage = new Afterlifeplanningpage(DriverFactory.getDriver());
	
	@Given("user clicks on the After life planning")
	public void user_clicks_on_the_after_life_planning() {
		Afterlifeplanningpage.clickonafterlifeplanning();
	}
	@Then("user clicks on the Burial")
	public void user_clicks_on_the_burial() {
		Afterlifeplanningpage.Burial();
	}
	@Then("user clicks on the add button in after life planning")
	public void user_clicks_on_the_add_button_in_after_life_planning() {
		Afterlifeplanningpage.addfile();
	}
	@Then("user clicks on the upload file")
	public void user_clicks_on_the_upload_file() throws InterruptedException {
		String filePath = "C:\\Users\\RAMYA\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-26 162743.png";
		Afterlifeplanningpage.uploadfile(filePath);
		 Thread.sleep(1000);
	
	   
	}
	@Then("user uploads the file in burial")
	public void user_uploads_the_file_in_burial() {
		Afterlifeplanningpage.verify();
		Afterlifeplanningpage.Back();
	 
	}



	
}
