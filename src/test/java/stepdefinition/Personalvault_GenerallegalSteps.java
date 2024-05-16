package stepdefinition;

import com.pages.generallegalpages;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Personalvault_GenerallegalSteps {
	
	
	private generallegalpages generallegalpages = new generallegalpages(DriverFactory.getDriver());
  
	@When("user clicks on general legal information")
	public void user_clicks_on_general_legal_information() {
		generallegalpages.clickgenerallegal();
	}
	@And("user clicks on add option")
	public void user_clicks_on_add_option() {
		generallegalpages.addfile();
	}
	@And("user clicks on upload file")
	public void user_clicks_on_upload_file() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-26 162743.png";
		generallegalpages.uploadfile(filePath);
}	
	
	
	
	@When("user clicks on upload file1")
	public void user_clicks_on_upload_file1() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\Jason Passport.pdf";
		 generallegalpages.uploadfile(filePath);
}
	
	
          @When("user clicks on upload file2")
	public void user_clicks_on_upload_file2() throws InterruptedException {
		
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\jpgfile.jpg";
		 generallegalpages.uploadfile(filePath);
	}


	@When("user clicks on upload file3")
	public void user_clicks_on_upload_file3() throws InterruptedException {
		 String filePath = "C:\\Users\\RAMYA\\Downloads\\Android defects.xlsx";
		 generallegalpages.uploadfile(filePath);
	}


	@When("user clicks on upload file4")
	public void user_clicks_on_upload_file4() throws InterruptedException {
	 String filePath = "C:\\Users\\RAMYA\\Downloads\\jpgcat.jpeg";
		 generallegalpages.uploadfile(filePath);
	}


	@When("user clicks on upload file5")
	public void user_clicks_on_upload_file5() throws InterruptedException {
	    String filePath="C:\\Users\\RAMYA\\OneDrive\\Desktop\\xpath.txt";
	    generallegalpages.uploadfile(filePath);
	    
	}




	
	 @Then("User should see the {string} Message")
	 public void User_should_see_the_Message(String Filename) throws InterruptedException {
		 System.out.print(generallegalpages.verify());
		 
		 
	 }
	 
	 
	 
	 
	
	 @Then("Go back to Personal vault")
	 public void go_back_to_personal_vault() throws InterruptedException {
		 generallegalpages.Back();
		 generallegalpages.Clickonestateplanning();
		 
	 }





} 




