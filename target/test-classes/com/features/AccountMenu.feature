Feature: Account menu  page feature
  
 
Scenario: Account menu page

  
    #Given user is on familycentral page 
    #When user clicks on LandingPagesignup
    #And user clicks on signup option of families
    #When user enters the appropriate details
    #And user clicks on continue button 
    
    

 # Scenario: Login with valid credentials
  
    Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "client08@yopmail.com" into email field
    And user enters password as "Password@123" into password field
    And user clicks on login button 
    Then user gets the family central page
    And page title should be "https://www.familycentral.com"
    
    
    
        
    #Account menu
    When user clicks on the account memu
    Then user clicks on the my accounts
    Then user clicks on the edit option
    And user modify the data and clicks on save option
    Then user clicks on Password
    And user enters the current password
    And user enters the new password and confirm password
    Then user clicks on savechanges
    And user clicks on executor 
    Then user enters the first name and lastname
    And user enters the email and phone number
    Then user sends the invitation to the executor
    When user clicks on emergency contact
    Then user enters firstname and last name
    Then user enters the email and emergency phone number
    And user clicks on send
    
    
    
    
    
    
    