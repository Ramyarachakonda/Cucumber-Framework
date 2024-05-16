
Feature: IDs page feature

 Scenario: Signup with valid credentials
  
    Given user is on familycentral page 
    When user clicks on LandingPagesignup
    And user clicks on signup option of families
    When user enters the appropriate details
    And user clicks on continue button 
    
  
  
     #Family Access Files
     Given user clicks on family access files
  
     #Finance
     When user clicks on Finance
     Then user clicks on finance subscriber
     And user clicks on the invoice
     And user clicks on the Finance add button
     Then user clicks on the scan document
     And user scans the invoice

   
   