package stepdefinition;

import java.awt.AWTException;

import com.pages.Financialplanningpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Personalvault_FinancialPlanningSteps {
	
	private Financialplanningpage Financialplanningpage = new Financialplanningpage(DriverFactory.getDriver());

	@Given("user should able to click on financial planning")
	public void user_should_able_to_click_on_financial_planning() {
		Financialplanningpage.ClickonFinancialplanning();
	
	}
	@When("user should click on invoice")
	public void user_should_click_on_invoice() {
		Financialplanningpage.invoice();
	   
	}
	@Then("user clicks on the add")
	public void user_clicks_on_the_add() {
		Financialplanningpage.Addfile();
	    
	}
	@And("user clicks on scan document")
	public void user_clicks_on_scan_document() {
		Financialplanningpage.scandocument();
	 
	}
	@Then("user uploads the file in invoice")
	public void user_uploads_the_file_in_invoice() throws InterruptedException, AWTException {
		
	
		Financialplanningpage.uploadfile();
		 Thread.sleep(1000);

	}
	@Then("user clicks on done")
	public void user_clicks_on_done() throws InterruptedException {
		Financialplanningpage.done();
	    
	}




}
