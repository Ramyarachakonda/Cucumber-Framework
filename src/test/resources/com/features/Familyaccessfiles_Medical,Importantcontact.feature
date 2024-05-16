Feature: login page feature

  Scenario: Login with valid credentials
  
  
    Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "user10@yopmail.com" into email field
    And user enters password as "Password@123" into password field
    And user clicks on login button 
    Then user gets the family central page
    And page title should be "https://www.familycentral.com"
    
    
    #Family Access Files
    
    #important contact
    Given user should able to Click on files
    Then user should click on important contacts
    And user should click on add contact
    Then user should enter the first name, last name, phone number
    And user should click on save button
    
    
    #Medical
    When user clicks on files
    Then user clicks on medical
    Then user clicks on subscriber
    When user clicks on add folder
    Then user enters the folder name
    And user clicks on add
    Then user clicks on close
    Then user clicks on the new folder
    
    
      
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
  
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
     
    
    
    
    