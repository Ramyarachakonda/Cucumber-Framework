Feature: Personal Vault and Legacy Messages

Scenario: Personal Vault
  
 
  
    #Given user is on login page 
    #When user clicks on LandingPageLogin
    #And user clicks on login option of families
    #Then user should navigate to login page
    #When user enters username as "client08@yopmail.com" into email field
    #And user enters password as "Password@123" into password field
    #And user clicks on login button 
    

    
    #Personal vault
     When user clicks on personal vault
     And user navigates to smstome website 
     Then user should Add the folder as "test" into folder field
     #And user should edit the folder as "testing" into field
     #And user delete the folder
  
  
  
  
     Scenario: Financial Planning
     
      When user goes back to personal vault
     Given user should able to click on financial planning
     When user should click on invoice
     Then user clicks on the add 
     And user clicks on scan document
     Then user uploads the file in invoice
     Then user clicks on done
     
  

 Scenario: Shared with me
 
   When user goes back to personal vault
    When user shares an email
    Then user goes to the appropriate email 
    Then user navigates to the yopmail and opens the website
    And user opens the email and sign in
    And user enters the authentication code
    And user uploads the file   
     
     

 
    Scenario: General Legal upload PDF file upload 
  
  #General Legal Information
  When user clicks on general legal information
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
  
  
    Scenario: General Legal upload JPG file upload 

  #General Legal Information
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
  
  
  
  
    Scenario: General Legal upload XLSX file upload 
   
  #General Legal Information
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
  

    Scenario: General Legal upload JPEG file upload 
  
  #General Legal Information
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
  

   Scenario: General Legal upload TXT file upload 
 
  #General Legal Information
  
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  

  
  

  
  
      Scenario: Estate Planning upload PDF file upload 
  
  #Estate planning
    Then Go back to Personal vault
     
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
  
  
   
    Scenario: Estate Planning upload JPG file upload 

  #estate planning
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
  
  
  
  
  Scenario: Medical records information
  
   When user clicks on medical records information
   Then check the state name is same as the pdf name
  

  
  
  
    
     Scenario: Secure Password Storage
     
     When user goes back to personal vault
      Given user clicks on secure password 
     When user clicks on the add button
     Then user enters the title
     And user eners the username
      And user enters the password
      And user enters the website name
      Then user clicks on the save option
      And user edits the secure password
      
      
      
       Scenario: Lists of Personal Assets
        When user goes back to personal vault
     Given user should click on lists of personal assets
     #Then user clicks on add button in lists of personal assets
     #And user clicks on upload file in lists of personal assets
     #Then user uploads the file in the lists of personal assets   
      And user clicks on add option
      And user clicks on upload file1
      Then User should see the "Uploaded Successfully" Message
  
     
     
        Scenario: After-Life Planning
        
     When user goes back to personal vault
     Given user clicks on the After life planning
     Then user clicks on the Burial
     #And user clicks on the add button in after life planning 
     #And user clicks on the upload file
     #Then user uploads the file in burial
     And user clicks on add option
     And user clicks on upload file1
     Then User should see the "Uploaded Successfully" Message
                                                     
                                                       
                                                       
                                                                                                                     
       Scenario: Legacy videos functionality
  
  
     Given the user is on the Legacy Messages page
     #When the user extracts OTP from smstome
     When the user clicks on Create your first message button
     When the user clicks on Next button
     When the user clicks on My Family
     #When the user selects all checkboxes
     When thes user clicks on Next button
    
 
    
    Scenario: Adding the other individuals
    
    
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
    

    
     