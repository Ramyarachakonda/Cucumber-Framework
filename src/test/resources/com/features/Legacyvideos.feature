Feature: Legacy messages page feature
  
 
 
  Scenario: Login with valid credentials
  
    Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "clientramya@yopmail.com" into email field
    And user enters password as "Password123@" into password field
    And user clicks on login button 
    
     
      #Legacy messages
     Given the user is on the Legacy Messages page
     When the user extracts OTP from smstome
     When the user clicks on Create your first message button
     When the user clicks on Next button
     When the user clicks on My Family
     #When the user selects all checkboxes
     When thes user clicks on Next button
    
 
    
    
    
    
    Then user clicks on 3 dots option
    And user edits the title
    #And user changes the delivery date 
    And user adds the family member in legacy
    Then user adds the other individuals 
     
   
   
   When user navigates to the yopmail
   Then user enters the email in yopmail
   And user clicks on the enter 
   Then user clicks on shared link
   And user enters the otp
  
   And again navigates to the family central
   
   
   
    Then user deletes the legacy video
    
    
    
    
    
    