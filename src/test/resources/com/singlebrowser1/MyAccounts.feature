Feature: Account menu  page feature
  
 
    
       #Account menu

    Scenario: Account menu with personal info functionality
        
 
    When user clicks on the account memu
    Then user clicks on the my accounts
    Then user clicks on the edit option
    And user modify the data and clicks on save option
    
    Scenario: Account menu with password functionality
    
    Then user clicks on Password
    And user enters the current password
    And user enters the new password and confirm password
    Then user clicks on savechanges
    
    
    Scenario: Account menu with executor functionality
    
    And user clicks on executor 
    Then user enters the first name and lastname
    And user enters the email and phone number
    Then user sends the invitation to the executor
    
    Scenario: Account menu with emergency contact functionality
    
    When user clicks on emergency contact
    Then user enters firstname and last name
    Then user enters the email and emergency phone number
    And user clicks on send
    
    
    
    
    
    
    