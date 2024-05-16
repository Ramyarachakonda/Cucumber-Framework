Feature: login page feature

  Scenario: Login with valid credentials
  
  
    Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "smstome2@yopmail.com" into email field
    And user enters password as "Password123@" into password field
    And user clicks on login button 
    Then user gets the family central page
    And page title should be "https://www.familycentral.com"
    
  
  
     #Family Access Files
     Given user clicks on family access files
  
     #IDs
     #Birth certificate
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Birth certificate
    Then user scans the Birth certificate
  
  
  
  