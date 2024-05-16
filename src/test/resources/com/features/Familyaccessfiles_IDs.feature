
Feature: IDs page feature

 Scenario: Signup with valid credentials
  
    Given user is on familycentral page 
    When user clicks on LandingPagesignup
    And user clicks on signup option of families
    When user enters the appropriate details
    And user clicks on continue button 
    
  
  
     #Family Access Files
     Given user clicks on family access files
  
     #IDs
     When user clicks on IDs
     Then user clicks on subscriber
     When user clicks on add folder
     Then user enters the folder name
     And user clicks on add
     Then user clicks on close
     Then user clicks on the ID new folder
     
	  
	
  
  
  