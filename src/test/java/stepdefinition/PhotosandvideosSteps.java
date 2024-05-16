package stepdefinition;

import com.pages.photosandvideospage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhotosandvideosSteps {
	
	private photosandvideospage photosandvideospage = new photosandvideospage(DriverFactory.getDriver());
	

	@When("user clicks on the photos and videos")
	public void user_clicks_on_the_photos_and_videos() {
		photosandvideospage.clickphotos();
		
	}
	@Then("user clicks on the subscriber")
	public void user_clicks_on_the_subscriber() {
		photosandvideospage.subscriber();
	}
	
	
	@Then("user clicks on add button")
	public void user_clicks_on_add_button() {
		photosandvideospage.add();
	}
	
	
	@Then("user add the new file")
	public void user_add_the_new_file() {
		photosandvideospage.upload();
	}
	




}
