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
    
    
    
    
    #My family
    Given userable to click on my family 
    When user should click on add member
    Then user should enter the name and email
    And user should send the invite 