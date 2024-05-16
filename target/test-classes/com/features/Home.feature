Feature: Run all the modules



Scenario: Signup with valid credentials

  
    Given user is on familycentral page 
    When user clicks on LandingPagesignup
    And user clicks on signup option of families
    When user enters the appropriate details
    And user clicks on continue button 
    

    
    Given user clicks on the home
    When user clicks on the Add a family member
    Then user adds the family member
    Then user clicks on the upload profile
    Then user uploads the picture
    And user clicks on the add emergency contact
    Then user adds the emergency contact
    Then user clicks on the gather family documents
    And user clicks on the download option
    Then user clicks on the invite TPA
    And user invites the TPA