Feature: Personal Vault and Legacy Messages

Scenario: Personal Vault
  
  

    
    #Personal vault
     When user clicks on personal vault
     And user navigates to smstome website 
     Then user should Add the folder as "test" into folder field
     And user should edit the folder as "testing" into field
     And user delete the folder
  
  
  

 #Shared with me
    When user shares an email
    Then user goes to the appropriate email 
    Then user navigates to the yopmail and opens the website
    And user opens the email and sign in
    And user enters the authentication code
    And user uploads the file   
     
     
     
     
    
 # Scenario: General Legal upload PNG file upload 
    
  #General Legal Information
  When user clicks on general legal information 
  And user clicks on add option
  And user clicks on upload file
  Then User should see the "File Uploaded Successfully" Message
  
  

 
 #   Scenario: General Legal upload PDF file upload 
  
  #General Legal Information
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
  
  
 
  
  
  #  Scenario: General Legal upload JPG file upload 

  #General Legal Information
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
  
  
  
  
  #  Scenario: General Legal upload XLSX file upload 
   
  #General Legal Information
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
  

  #  Scenario: General Legal upload JPEG file upload 
  
  #General Legal Information
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
  

 #   Scenario: General Legal upload TXT file upload 
 
  #General Legal Information
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
  Then Go back to Personal vault
  
  
  
  #Estate planning
  And user clicks on add option
  And user clicks on upload file
  Then User should see the "File Uploaded Successfully" Message
  
  
   #   Scenario: General Legal upload PDF file upload 
  
  #Estate planning
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
  
  
   
  #  Scenario: General Legal upload JPG file upload 

  #estate planning
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
  
  
  
  
  #Medical records information
   When user clicks on medical records information
   Then check the state name is same as the pdf name
  
  
  #share option
  And user should able to share the pdf to family member
  And user should able to share the pdf to other individuals
  Then user should able to share the pdf to TPA
  
  
  
     #Financial Planning
     Given user should able to click on financial planning
     When user should click on invoice
     Then user clicks on the add 
     And user clicks on scan document
     Then user uploads the file in invoice
     Then user clicks on done
     
  
    
     #Secure Password Storage
     
     Given user clicks on secure password 
     When user clicks on the add button
     Then user enters the title
     And user eners the username
      And user enters the password
      And user enters the website name
      Then user clicks on the save option
      And user edits the secure password
      
      
      
        #Lists of Personal Assets
     Given user should click on lists of personal assets
     Then user clicks on add button in lists of personal assets
     And user clicks on upload file in lists of personal assets
     Then user uploads the file in the lists of personal assets   
     
     
     
       #After-Life Planning
     Given user clicks on the After life planning
     Then user clicks on the Burial
     And user clicks on the add button in after life planning 
     And user clicks on the upload file
     Then user uploads the file in burial
                                                                                                                     
            
     
  
   
     #Legacy messages
     Given the user is on the Legacy Messages page
     When the user clicks on Create your first message button
     When the user clicks on Next button
     When the user clicks on My Family
     When the user selects all checkboxes   
     When thes user clicks on Next button