package stepdefinition;


import com.pages.personalvaultpage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalvaultSteps {
	
	
	private personalvaultpage personalvaultpage = new personalvaultpage(DriverFactory.getDriver());
	
	    @When("user clicks on personal vault")
	    public void user_clicks_on_personal_vault() throws InterruptedException {
		personalvaultpage.clickonPersonalvault();
	    
	    }


	    @Then("user navigates to smstome website")
	    public void user_navigates_to_smstome_website() throws InterruptedException {
		personalvaultpage.smstome();
	    
	    }
	    
	    
	    @Then("user should Add the folder as {string} into folder field")
	    public void user_should_add_the_folder_as_into_folder_field(String foldername) throws InterruptedException {
	    personalvaultpage.addfolder();
	    personalvaultpage.foldernames(foldername);
	    personalvaultpage.add();
	    personalvaultpage.close();
	   
	           
	    }

		
	    @Then("user should edit the folder as {string} into field")
	    public void user_should_edit_the_folder_as_into_field(String editoption) throws InterruptedException {
	    	  personalvaultpage.edit();
	    	  personalvaultpage.rename();
	    	  personalvaultpage.folder(editoption);
	    	  personalvaultpage.save();
		}
	    
	    
	    @And ("user delete the folder")
		public void user_delete_the_folder() throws InterruptedException {
	    	 personalvaultpage.edit();
	    	 personalvaultpage.delete();
	    	 personalvaultpage.confirm();
	    	 
	
		}



	    @When("user goes back to personal vault")
	    public void user_goes_back_to_personal_vault() throws InterruptedException {
	    	Thread.sleep(2000);
	    	personalvaultpage.back();
	 

	    }




}
