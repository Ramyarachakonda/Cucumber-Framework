
package stepdefinition;




import com.pages.LegacyMessageVideoRecord;
import com.qa.Utils.EmailGenerator;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LegacyVideoRecordSteps {
  


	String invitePersonEmail;
    
    private LegacyMessageVideoRecord legacyMessagePage = new LegacyMessageVideoRecord(DriverFactory.getDriver());
 
    @Given("the user is on the Legacy Messages page")
    public void givenTheUserIsOnLegacyMessagesPage() throws InterruptedException {
        legacyMessagePage.clickLegacyMessages();
    }
 
    @When("the user extracts OTP from smstome")
    public void whenTheUserExtractsOTPFromSmstome() throws InterruptedException {
        legacyMessagePage.extractOtpFromSmstome();
    }
 
    @When("the user clicks on Create your first message button")
    public void whenTheUserClicksOnCreateYourFirstMessageButton() throws InterruptedException {
        
        String filePath = "C:\\Users\\RAMYA\\Downloads\\WhatsApp Video 2024-01-03 at 4.48.36 PM.mp4";
        legacyMessagePage.clickCreateFirstMessage(filePath);
    }

    @When("the user clicks on Next button")
    public void whenTheUserClicksOnNextButton() throws InterruptedException {
        legacyMessagePage.clickNext();
    }
// 
//    @When("the user enters message title")
//    public void whenTheUserEntersMessageTitle() throws InterruptedException {
//        legacyMessagePage.enterRandomMessageTitle();
//    }
// 
//    @When("the user clicks on Next button after entering message title")
//    public void whenTheUserClicksOnNextButtonAfterEnteringMessageTitle() {
//        legacyMessagePage.nextButtonMessageTitle();
//    }
// 
    @When("the user clicks on My Family")
    public void whenTheUserClicksOnMyFamily() {
        legacyMessagePage.otherindividuals();
        legacyMessagePage.detailsofotherindividuals();
   	 invitePersonEmail = EmailGenerator.generateRandomEmail();
   	 legacyMessagePage.enterInvitePersonEmail(invitePersonEmail);
    }
 
    @When("the user selects all checkboxes")
    public void whenTheUserSelectsAllCheckboxes() {
        legacyMessagePage.SelectAll_CheckBox();
    }

 
    	@When("thes user clicks on Next button")
    	public void thes_user_clicks_on_next_button() throws InterruptedException {
//    	legacyMessagePage.clickNextAfterSelectAll();
    	legacyMessagePage.Specificdate();
    	}
    	@When("the user clicks on the Specific date label")
    	public void whenTheUserClicksOnSpecificDateLabel() throws InterruptedException {
    		legacyMessagePage.Specificdate();
    	    
    	}
 
 
//        @When("the user selects specific date {string}, {string}, {string}")
//        public void whenTheUserSelectsSpecificDate(String year, String month, String day) {
//         legacyMessagePage.selectYear(year);
//         legacyMessagePage.selectMonth(month);
//         legacyMessagePage.selectDay(day);
//            
//        }
        @Then("User should see the Updated Successfully message")
        public void thenUserShouldSeeUpdatedSuccessfullyMessage() {
//    Assert.assertTrue("Update success message is not displayed.", legacyMessagePage.isUpdateSuccessMessageDisplayed());
        }
 
 
    @When("the user clicks on the selected video")
    public void whenTheUserClicksOnSelectedVideo() throws InterruptedException {
//        legacyMessagePage.clickSelectedVideo();
    }
 
 
    	
        @When("the user selects random year")
    	public void the_user_selects_random_year() {
//    	legacyMessagePage.selectRandomYear();
    	}
 
    	@When("the user selects random month")
    	public void the_user_selects_random_month() throws InterruptedException {
//    		legacyMessagePage.selectRandomMonth();
    	}
    	@When("the user selects random day")
    	public void the_user_selects_random_day() {
//    		legacyMessagePage.selectRandomYear();
    	}
 
 
    @When("the user clicks on Close button")
    public void whenTheUserClicksOnCloseButton() {
//        legacyMessagePage.clickClose();
    }
 
    @Then("the user should see the Legacy Message title")
    public void thenTheUserShouldSeeTheLegacyMessageTitle() {
      //  String title = legacyMessagePage.getLegacyMessageTitle();
        // Add your assertion logic here
        // Example: Assert.assertEquals(expectedTitle, title);
    }
 
   
    @Then("user clicks on {int} dots option")
    public void user_clicks_on_dots_option(Integer int1) throws InterruptedException {
    	legacyMessagePage.dots();
    }
    @Then("user edits the title")
    public void user_edits_the_title() throws InterruptedException {
    	legacyMessagePage.title();
        
    }
    @Then("user changes the delivery date")
    public void user_changes_the_delivery_date() {
    	legacyMessagePage.deliverydate();
       
    }
    @Then("user adds the family member in legacy")
    public void user_adds_the_family_member_in_legacy() {
     System.out.println("no family");
    }
    @Then("user adds the other individuals")
    public void user_adds_the_other_individuals() throws InterruptedException {
    	legacyMessagePage.add();
    	legacyMessagePage.otherindividuals();
    	legacyMessagePage.detailsofotherindividuals();
    	 invitePersonEmail = EmailGenerator.generateRandomEmail();
    	 legacyMessagePage.enterInvitePersonEmail(invitePersonEmail);
    	legacyMessagePage.savechanges();
    }
    @Then("user deletes the legacy video")
    public void user_deletes_the_legacy_video() throws InterruptedException {
    	legacyMessagePage.delete();
    }


 

    @When("user navigates to the yopmail")
    public void user_navigates_to_the_yopmail() {
    	legacyMessagePage.navigateToYopmail();
    }
    @Then("user enters the email in yopmail")
    public void user_enters_the_email_in_yopmail() throws InterruptedException {
    	legacyMessagePage.checkReceivedInviteEmail(invitePersonEmail);
    }
    @Then("user clicks on the enter")
    public void user_clicks_on_the_enter() throws InterruptedException {
    	legacyMessagePage.enter();
    }
    @Then("user clicks on shared link")
    public void user_clicks_on_shared_link() throws InterruptedException {
    	legacyMessagePage.sharedlink();
    }
    @Then("user enters the otp")
    public void user_enters_the_otp() throws Throwable {
    	legacyMessagePage.authenticationcode();
    }
    @Then("again navigates to the family central")
    public void again_navigates_to_the_family_central() {
    	
    	legacyMessagePage.navigatetofamilycentral();
    }



    
    
    
    
    
    
    
 
}

