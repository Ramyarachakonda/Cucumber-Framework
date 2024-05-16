package stepdefinition;

import com.pages.ListsofPersonalAssetsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Personalvault_ListsofPersonalAssetsSteps {
	
	
	private ListsofPersonalAssetsPage ListsofPersonalAssetsPage = new ListsofPersonalAssetsPage(DriverFactory.getDriver());

	@Given("user should click on lists of personal assets")
	public void user_should_click_on_lists_of_personal_assets() {
		ListsofPersonalAssetsPage.ClickonListsofpersonalassets();
	}
	@Then("user clicks on add button in lists of personal assets")
	public void user_clicks_on_add_button_in_lists_of_personal_assets() {
		ListsofPersonalAssetsPage.addfile();
	}
	@Then("user clicks on upload file in lists of personal assets")
	public void user_clicks_on_upload_file_in_lists_of_personal_assets() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-26 162743.png";
		 ListsofPersonalAssetsPage.uploadfile(filePath);
		 Thread.sleep(1000);
	
	}
	@Then("user uploads the file in the lists of personal assets")
	public void user_uploads_the_file_in_the_lists_of_personal_assets() throws InterruptedException {
		ListsofPersonalAssetsPage.verify();
		 Thread.sleep(2000);
		 ListsofPersonalAssetsPage.Back();
		 
	}



	
	
	
	
	

}
