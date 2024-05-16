Feature: Personal vault feature
  
 
 
  Scenario: Login with valid credentials
  
    Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "ashokmarch12@yopmail.com" into email field
    And user enters password as "Password@123" into password field
    And user clicks on login button 
    
   
    
    #Personal vault
     When user clicks on personal vault
     And user navigates to smstome website 
     Then user should Add the folder as "test" into folder field
     #And user should edit the folder as "testing" into field
     #And user delete the folder
  
  
  

 #Shared with me
    When user shares an email
    Then user goes to the appropriate email 
    Then user navigates to the yopmail and opens the website
    And user opens the email and sign in
    And user enters the authentication code
    And user uploads the file   
     
     
     
     
    