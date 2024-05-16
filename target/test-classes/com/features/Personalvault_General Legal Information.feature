Feature: Personal vault feature
  
 
 
 
  
  Background:
    Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "helloramya@yopmail.com" into email field
    And user enters password as "Password@123" into password field
    And user clicks on login button 
    
    #Personal vault
    
    
   @tag0
     Scenario: General Legal upload PNG file upload 
    When user clicks on personal vault
    And user navigates to smstome website 
  
  #General Legal Information
  When user clicks on general legal information 
  And user clicks on add option
  And user clicks on upload file
  Then User should see the "File Uploaded Successfully" Message
  
  
  @tag1
 
    Scenario: General Legal upload PDF file upload 
    When user clicks on personal vault
    And user navigates to smstome website 
  
  #General Legal Information
  When user clicks on general legal information 
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
  
  
  @tag2
  
  
    Scenario: General Legal upload JPG file upload 
    When user clicks on personal vault
    And user navigates to smstome website 
  
  #General Legal Information
  When user clicks on general legal information 
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
  
  @tag3
  
  
    Scenario: General Legal upload XLSX file upload 
    When user clicks on personal vault
    And user navigates to smstome website 
  
  #General Legal Information
  When user clicks on general legal information 
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
  @tag4

    Scenario: General Legal upload JPEG file upload 
    When user clicks on personal vault
    And user navigates to smstome website 
  
  #General Legal Information
  When user clicks on general legal information 
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
  
  @tag5
    Scenario: General Legal upload TXT file upload 
    When user clicks on personal vault
    And user navigates to smstome website 
  
  #General Legal Information
  When user clicks on general legal information 
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
  
  
  
 