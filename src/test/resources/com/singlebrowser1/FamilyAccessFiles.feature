Feature: Family Access Files Page feature
    
  Scenario: FamilyAccessFiles 
    
    #Family Access Files
    Given user clicks on family access files
    When user clicks on add folder
    Then user enters the folder name
    And user clicks on add
    Then user clicks on close
    Then user clicks on the folder
  
 Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
 Scenario: Upload the JPG files in the Newly added folder
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
  
  Scenario: important contacts
  
   #important contact
     When user clicks on files
    Then user should click on important contacts
    And user should click on add contact
    Then user should enter the first name, last name, phone number
    And user should click on save button
  
  Scenario: Medical module  
    
    #Medical
    When user clicks on files
    Then user clicks on medical
    Then user clicks on subscriber
    When user clicks on add folder
    Then user enters the folder name
    And user clicks on add
    Then user clicks on close
    Then user clicks on the new folder
    
    
      
   Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the JPG files in the Newly added folder
  
  #file2
   And user clicks on add option
   And user clicks on upload file2
   Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
   #file3
    And user clicks on add option
    And user clicks on upload file3
    Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
  
    #file4
   And user clicks on add option
   And user clicks on upload file4
   Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
    #file5
    And user clicks on add option
    And user clicks on upload file5
    Then User should see the "Uploaded Successfully" Message
  
     Scenario: Medical: Vaccine cards
    
     #Medical
    When user clicks on files
    Then user clicks on medical
    Then user clicks on subscriber
    
    #vaccine cards
    And user clicks on vaccine cards
    
    Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the JPG files in the Newly added folder
  
   #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
  #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
   #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
  #file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
 
   
   Scenario: Medical: Immunizations
    
     #Medical
   When user clicks on files
    Then user clicks on medical
    Then user clicks on subscriber
    
    
     #Immunizations
    And user clicks on Immunizations
    
    Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the JPG files in the Newly added folder
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
    
 Scenario: Medical: Health insurance
 
 
  #Medical
When user clicks on files
    Then user clicks on medical
    Then user clicks on subscriber
    
  #Healthinsurance
    And user clicks on Health insurance
   
    
     Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the JPG files in the Newly added folder
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
    
    Scenario: Insurance
    
    
    
  #Family Access Files
     Given user clicks on family access files
  
     #Insurance
     When user clicks on Insurance
     Then user clicks on subscriber
     When user clicks on add folder
     Then user enters the folder name
     And user clicks on add
     Then user clicks on close
     Then user clicks on the Insurance new folder
    
   Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the JPG files in the Newly added folder
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
    
  Scenario: Insurance:Car insurance
    
        #Family Access Files
     Given user clicks on family access files
  
     #Insurance
     When user clicks on Insurance
     Then user clicks on subscriber
     And click on the Carinsurance
   
   Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the JPG files in the Newly added folder
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
    
    Scenario: Insurance: Home insurance
    
    #Family Access Files
     Given user clicks on family access files
  
     #Insurance
     When user clicks on Insurance
     Then user clicks on subscriber
     And click on the home insurance

    
  Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the JPG files in the Newly added folder
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
  
  Scenario: Insurance: Life insurance
  
  #Family Access Files
     Given user clicks on family access files
  
     #Insurance
     When user clicks on Insurance
     Then user clicks on subscriber
     And click on the life insurance
    
   Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the JPG files in the Newly added folder
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
  
  Scenario: Insurance: Pet Insurance
  
     #Family Access Files
     Given user clicks on family access files
  
     #Insurance
     When user clicks on Insurance
     Then user clicks on subscriber
     And click on the pet insurance

    
   Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the JPG files in the Newly added folder
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
  
  
  Scenario: Insurance: UmbrellaPolicy
  
     #Family Access Files
     Given user clicks on family access files
  
     #Insurance
     When user clicks on Insurance
     Then user clicks on subscriber
     And click on the umbrella policy
    
    Scenario: Upload the PDF files in the Newly added folder
    
    #file1
  And user clicks on add option
  And user clicks on upload file1
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the JPG files in the Newly added folder
  
  #file2
  And user clicks on add option
  And user clicks on upload file2
  Then User should see the "Uploaded Successfully" Message
  
   Scenario: Upload the XLSX files in the Newly added folder
  
 #file3
  And user clicks on add option
  And user clicks on upload file3
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the JPEG files in the Newly added folder
  
  
 #file4
  And user clicks on add option
  And user clicks on upload file4
  Then User should see the "Uploaded Successfully" Message
  
  
   Scenario: Upload the TXT files in the Newly added folder
  
#file5
  And user clicks on add option
  And user clicks on upload file5
  Then User should see the "Uploaded Successfully" Message
  
  
  
  Scenario: Finance
  
  
   #Family Access Files
     When user clicks on files
  
     #Finance
     When user clicks on Finance
     Then user clicks on finance subscriber
     And user clicks on the invoice
     And user clicks on the Finance add button
     Then user clicks on the scan document
     And user scans the invoice

   
   Scenario: IDs
   
     #Family Access Files
     Given user clicks on family access files
  
     #IDs
     When user clicks on IDs
     Then user clicks on subscriber
     When user clicks on add folder
     Then user enters the folder name
     And user clicks on add
     Then user clicks on close
     
	  
	Scenario: IDs: uploading Birth certificate
	
	  #Family Access Files
     Given user clicks on family access files
  
     #IDs
     #Birth certificate
     
     
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Birth certificate
    Then user scans the Birth certificate
  
	
	
	Scenario: IDs: uploading Driving license
	
	
	
     #Family Access Files
     Given user clicks on family access files
  
     #Driving license
     When user clicks on IDs
     Then user clicks on subscriber
     And user clicks on the Driving license
     Then user scans the driving license
	
  Scenario: IDs: uploading MilitiaryID
  
    #Family Access Files
     Given user clicks on family access files
  
     #IDs
     
     #Military ID
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Military ID
     Then user scans the Military ID
  
	Scenario: IDs: uploading Passport
	 
	
     #Family Access Files
     Given user clicks on family access files
  
     #Passport
     When user clicks on IDs
     Then user clicks on subscriber
     Then user clicks on passport
     And user scan the passport 
     
  Scenario: IDs: uploading PetWalletID
  
  
  #Family Access Files
     Given user clicks on family access files
  
     #IDs
     
     #Pet wallet ID
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Pet wallet ID
     Then user scans the pet wallet ID
     
	Scenario: IDs: uploading Socialsecuritycard
	
	
     #Family Access Files
     Given user clicks on family access files
  
     #Social security cards
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Social security card
     Then user scans the social security card
	
  Scenario: IDs: uploading TravelersID
  
  
  
     #Family Access Files
     Given user clicks on family access files
  
     #IDs
     
     #Travelers ID
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Travellers ID
     Then user scans the Traveller ID
  
  