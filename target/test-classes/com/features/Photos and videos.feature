Feature: Photos and videos page feature




Scenario: Uploading a file in photos and videos
 
   Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "smstome2@yopmail.com" into email field
    And user enters password as "Password@123" into password field
    And user clicks on login button 
    Then user gets the family central page
    And page title should be "https://www.familycentral.com"
    
    
    
    
    
    #Photos and videos
    When User clicks on Photos and Videos Section
    Then user clicks on the subscriber
    And User clicks on Upload Icon
    When User uploads a file from the device
    Then User should see the Uploaded Successfully Toast Message