package stepdefinition;

import org.junit.Assert;

import com.pages.FileUpload_PhotosVideos;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FileUpload_PhotosVideosSteps {
	 
	private FileUpload_PhotosVideos fileUploadPhotosVideos = new FileUpload_PhotosVideos(DriverFactory.getDriver());
	    
	    
	    
	      private String filePath = "C:\\Users\\RAMYA\\Downloads\\MicrosoftTeams-image (13)	.png";
	 
	    @Given("User is on Home page")
	    public void user_is_on_home_page() {
	        // Assume the user is on the home page or implement navigation if needed
	        // DriverFactory.getDriver().get("https://your-website-url.com");
	    }
	 
	    @When("User clicks on Photos and Videos Section")
	    public void user_clicks_on_photos_and_videos_section() throws InterruptedException {
	        fileUploadPhotosVideos.clickOnPhotosAndVideos();
	    }
	    
	    @When("User clicks on Family Member")
	    public void User_clicks_on_Family_Member() {
	        fileUploadPhotosVideos.clickOnFamilyMember();
	    }
	 
//	    @When("User clicks on Add button")
//	    public void user_clicks_on_add_button() {
//        fileUploadPhotosVideos.clickOnAddButton();
//	    }
	    
	    @When("User clicks on Upload Icon")
	    public void User_clicks_on_Upload_Icon() {
	        System.out.println("Clickable Upload Icon");
	        
	        fileUploadPhotosVideos.clickOnUploadIcon();
	    }
	 
	    @When("User uploads a file from the device")
	    public void user_uploads_a_file_from_the_device() {
	        fileUploadPhotosVideos.uploadFile(filePath);
//	    	fileUploadPhotosVideos.uploadFile();
	    }
	 
	    @Then("User should see the Uploaded Successfully Toast Message")
	    public void user_should_see_the_uploaded_successfully_toast_message() throws InterruptedException {
	        Assert.assertTrue(fileUploadPhotosVideos.isUploadedSuccessfullyVisible());

	        Thread.sleep(5000);
	    }

}
