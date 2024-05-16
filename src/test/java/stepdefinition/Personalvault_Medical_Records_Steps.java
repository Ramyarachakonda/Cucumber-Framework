package stepdefinition;

import com.pages.Medical_Records_page;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Personalvault_Medical_Records_Steps {
	
	
	private Medical_Records_page Medical_Records_page = new Medical_Records_page(DriverFactory.getDriver());
	
	

	@When("user clicks on medical records information")
	public void user_clicks_on_medical_records_information() {
		Medical_Records_page.clickMedicalrecords();
	}
	
	
	
	
	@Then("check the state name is same as the pdf name")
	public void check_the_state_name_is_same_as_the_pdf_name() throws InterruptedException {
		Medical_Records_page.searchRandomStateAndVerify();
		Thread.sleep(2000);
	}
	
	
	
	@Then("user should able to share the pdf to family member")
	public void user_should_able_to_share_the_pdf_to_family_member() throws InterruptedException {
		Medical_Records_page.sharepdf();
		Medical_Records_page.back();
	}
	
	
	
	@Then("user should able to share the pdf to other individuals")
	public void user_should_able_to_share_the_pdf_to_other_individuals() {
	    
	}
	
	
	@Then("user should able to share the pdf to TPA")
	public void user_should_able_to_share_the_pdf_to_tpa() {
	   
	}




}
