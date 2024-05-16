package stepdefinition;

import com.github.javafaker.Faker;
import com.pages.Familyaccessfilespage;
import com.qa.Utils.PersonNameGenerator;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FamilyAccessFilesSteps {
	
	private Familyaccessfilespage Familyaccessfilespage = new Familyaccessfilespage(DriverFactory.getDriver());
	@Given("user clicks on family access files")
	public void user_clicks_on_family_access_files() throws InterruptedException {
		
		Familyaccessfilespage.Familyfiles();
	}
	@When("user clicks on add folder")
	public void user_clicks_on_add_folder() {
		
		Familyaccessfilespage.addfolder();
	}
	
	
	  public static String generateRandomPersonName() {
	        Faker faker = new Faker();
	        return faker.name().fullName();
	    }
	 
	   
	@Then("user enters the folder name")
	public void user_enters_the_folder_name() {
		 String invitePersonName = PersonNameGenerator.generateRandomPersonName();
		Familyaccessfilespage.foldername(invitePersonName);
	}
	@Then("user clicks on add")
	public void user_clicks_on_add() {
		Familyaccessfilespage.add();
	}
	@Then("user clicks on close")
	public void user_clicks_on_close() throws InterruptedException {
		Familyaccessfilespage.close();
	} 
	@Then("user clicks on the folder")
	public void user_clicks_on_the_folder() throws InterruptedException {
		Familyaccessfilespage.newfoldername();
	    
	}
	@Then("user clicks on the new folder")
	public void user_clicks_on_the_new_folder() throws InterruptedException {
		Familyaccessfilespage.clickonfolder();
	    
	}



}
