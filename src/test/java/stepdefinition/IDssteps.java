package stepdefinition;

import java.awt.AWTException;

import com.pages.IDspage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IDssteps {

	
	private IDspage IDspage = new IDspage(DriverFactory.getDriver());

	@When("user clicks on IDs")
	public void user_clicks_on_i_ds() throws InterruptedException {
		IDspage.IDs();
	}
	@Then("user clicks on the ID new folder")
	public void user_clicks_on_the_id_new_folder() throws InterruptedException, AWTException {
		IDspage.IDsnewfolder();
		IDspage.Scandoc();
		IDspage.dropdown();
		IDspage.dropfromnewfolder();
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\Jason Passport.pdf";
		 IDspage.uploadfile(filePath);
		IDspage.done();
	}
	@Then("user clicks on passport") 
	public void user_clicks_on_passport() throws InterruptedException {
		IDspage.gobacksubscriber();
		IDspage.passport();
		IDspage.Scandoc();
		IDspage.dropfrompassport();
		
	}
	
	@Then("user scan the passport")
	public void user_scan_the_passport() throws InterruptedException {
		
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\Jason Passport.pdf";
		 IDspage.uploadfile(filePath);
		IDspage.done();
	    
	}


	
	@Then("user clicks on the Driving license")
	public void user_clicks_on_the_driving_license() throws InterruptedException {
		IDspage.gobacksubscriber();
		IDspage.drivinglicense();
		IDspage.Scandoc();
		IDspage.dropfromdrivinglicense();
	}
	
	

	@Then("user scans the driving license")
	public void user_scans_the_driving_license() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\Drivinglicense1.png";
		 IDspage.uploadfile(filePath);
		IDspage.done();
	}



	@Then("clicks on the Social security card")
	public void clicks_on_the_social_security_card() throws InterruptedException {
		IDspage.gobacksubscriber();
		IDspage.securitycard();
		IDspage.Scandoc();
		IDspage.dropfromsocialsecuritycard();
	}
	
	
	@Then("user scans the social security card")
	public void user_scans_the_social_security_card() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\Jason Passport.pdf";
		 IDspage.uploadfile(filePath);
		IDspage.done();
	}
	@Then("clicks on the Birth certificate")
	public void clicks_on_the_birth_certificate() throws InterruptedException {
		IDspage.gobacksubscriber();
		IDspage.Birthcertificate();
		IDspage.Scandoc();
		IDspage.dropfrombirthcertificate();
	}
	
	
	@Then("user scans the Birth certificate")
	public void user_scans_the_birth_certificate() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\Birthcertificate1.png";
		 IDspage.uploadfile(filePath);
		IDspage.done();
	}
	
	@Then("clicks on the Military ID")
	public void clicks_on_the_military_id() throws InterruptedException {
		IDspage.gobacksubscriber();
		IDspage.MilitaryID();
		IDspage.Scandoc();
		IDspage.dropfromMilitaryID();
	}
	
	
	@Then("user scans the Military ID")
	public void user_scans_the_military_id() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\Jason Passport.pdf";
		 IDspage.uploadfile(filePath);
		IDspage.done();
	}
	
	
	@Then("clicks on the Pet wallet ID")
	public void clicks_on_the_pet_wallet_id() throws InterruptedException {
		IDspage.gobacksubscriber();
		IDspage.PetwalletID();
		IDspage.Scandoc();
		IDspage.dropfromPetwallet();
	}
	
	
	@Then("user scans the pet wallet ID")
	public void user_scans_the_pet_wallet_id() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\Jason Passport.pdf";
		 IDspage.uploadfile(filePath);
		IDspage.done();
	    
	}
	
	
	@Then("clicks on the Travellers ID")
	public void clicks_on_the_travellers_id() throws InterruptedException {
		IDspage.gobacksubscriber();
		IDspage.TravelersID();
		IDspage.Scandoc();
		IDspage.dropfromTravellersID();
	}
	
	
	
	
	@Then("user scans the Traveller ID")
	public void user_scans_the_traveller_id() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\Jason Passport.pdf";
		 IDspage.uploadfile(filePath);
		IDspage.done();
	   
	}



}
