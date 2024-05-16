Feature: Emergency prep and emergency numbers  feature
  
 
 
  Scenario: Signup with valid credentials
  
 # Sign up 
 
 
 
    Given user is on familycentral page 
    When user clicks on LandingPagesignup
    And user clicks on signup option of families
    When user enters the appropriate details
    And user clicks on continue button 
    
    
     

    
     #Emergency prep
     When user click on emergency prep and add the folder
    
    
      #Emergency phone numbers
     When user clicks on emergency phone numbers
     Then user clicks on add contact
     Then user enters the first name
     And user enters the last name
     Then user enters the phone number
     And user enters the email
     Then user clicks on save option
     