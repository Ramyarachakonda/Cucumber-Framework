Feature: Sign up And home page feature



  Scenario: Signup with Valid credentials
  
  
    Given user is on familycentral page 
    When user clicks on LandingPagesignup
    And user clicks on signup option of families
    When user enters the appropriate details
    And user clicks on continue button 
    
    
     
   #Scenario: Login with valid credentials
  
    #Given user is on login page 
    #When user clicks on LandingPageLogin
    #And user clicks on login option of families
    #Then user should navigate to login page
    #When user enters username as "client08@yopmail.com" into email field
    #And user enters password as "Password@123" into password field
    #And user clicks on login button 
    
    
    
    
    
    
    #Home Page
    
  Scenario: Home page functionality
  
    
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
    
    
    
    
    
   # file:src/test/resources/com/singlebrowser1/AboutHome.feature:5
    
   