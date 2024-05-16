Feature: Personal vault feature
  
 
 
  Scenario: Login with valid credentials
  
    Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "helloramya@yopmail.com" into email field
    And user enters password as "Password@123" into password field
    And user clicks on login button 
    
    
    #Personal vault
     When user clicks on personal vault
     And user navigates to smstome website 
     
     
     
     #After-Life Planning
     Given user clicks on the After life planning
     Then user clicks on the Burial
     And user clicks on the add button in after life planning 
     And user clicks on the upload file
     Then user uploads the file in burial
     