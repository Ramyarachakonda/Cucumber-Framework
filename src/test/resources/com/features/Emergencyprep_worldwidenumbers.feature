Feature:Emergency prep and world wide numbers feature
  
 
 
  Scenario: Signup with valid credentials
  
 # Sign up 
 

    Given user is on familycentral page 
    When user clicks on LandingPagesignup
    And user clicks on signup option of families
    When user enters the appropriate details
    And user clicks on continue button 
    
    
     

    
     #Emergency prep
     When user click on emergency prep and add the folder
     
     
      #World Wide Emergency numbers
     When user clicks on the Emergency Prep
     Then user clicks on the Worldwide Emergency phone numbers
     Then user clicks on the Search option
     