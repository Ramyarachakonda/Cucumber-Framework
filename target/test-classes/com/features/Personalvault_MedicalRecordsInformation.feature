Feature: Medical_Records_Information in Personal Vault


  Scenario: Login with valid credentials
  
  
    Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "helloramya@yopmail.com" into email field
    And user enters password as "Password@123" into password field
    And user clicks on login button 
    Then user gets the family central page
    And page title should be "https://www.familycentral.com"
    
    
      #Personal vault
     When user clicks on personal vault
     And user navigates to smstome website 
  
  
  
  #Medical records information
  
  
  When user clicks on medical records information
  Then check the state name is same as the pdf name
  
  
  #share option
  And user should able to share the pdf to family member
  And user should able to share the pdf to other individuals
  Then user should able to share the pdf to TPA
  
  
  
  