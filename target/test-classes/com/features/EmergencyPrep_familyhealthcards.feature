Feature: Personal vault feature
  
 
 
  Scenario: Signup with valid credentials
  
 # Sign up 
 
 
 
    Given user is on familycentral page 
    When user clicks on LandingPagesignup
    And user clicks on signup option of families
    When user enters the appropriate details
    And user clicks on continue button 
    
    
     

    
     #Emergency prep
     When user click on emergency prep and add the folder
    
     #Family health cards
     Then user clicks on family health cards
     And user clicks on add details
     Then user enters the height
     And user enters the weight
     And user enters the blood group
     And user enters the medical conditions
     And user enters the allergies
     And user enters the medications
     Then user clicks on save
     And user edits the familyhealthcard details
     
     
   
    
     
     
    