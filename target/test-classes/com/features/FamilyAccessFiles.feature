Feature: login page feature


Scenario: Signup with valid credentials

  
    Given user is on familycentral page 
    When user clicks on LandingPagesignup
    And user clicks on signup option of families
    When user enters the appropriate details
    And user clicks on continue button 
    
  #Scenario: FamilyAccessFiles 
    
    #Family Access Files
    Given user clicks on family access files
    When user clicks on add folder
    Then user enters the folder name
    And user clicks on add
    Then user clicks on close
    Then user clicks on the folder
  
 #Scenario: Upload the files in the Newly added folder
    
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
  
  
  #Scenario: important contacts
  #
   #important contact
    #Given user should able to Click on files
    #Then user should click on important contacts
    #And user should click on add contact
    #Then user should enter the first name, last name, phone number
    #And user should click on save button
  #
  #Scenario: Medicalmodule  
    #
    #Medical
    #When user clicks on files
    #Then user clicks on medical
    #Then user clicks on subscriber
    #When user clicks on add folder
    #Then user enters the folder name
    #And user clicks on add
    #Then user clicks on close
    #Then user clicks on the new folder
    #
    #
      #
    #file1
  #And user clicks on add option
  #And user clicks on upload file1
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #
  #file2
  #And user clicks on add option
  #And user clicks on upload file2
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file3
  #And user clicks on add option
  #And user clicks on upload file3
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file4
  #And user clicks on add option
  #And user clicks on upload file4
  #Then User should see the "Uploaded Successfully" Message
  #
  #
#file5
  #And user clicks on add option
  #And user clicks on upload file5
  #Then User should see the "Uploaded Successfully" Message
  #
     #Scenario: Medical: Vaccine cards
    #
     #Medical
   #Given user should able to Click on files
    #Then user clicks on medical
    #Then user clicks on subscriber
    #
    #vaccine cards
    #And user clicks on vaccine cards
    #
      #file1
  #And user clicks on add option
  #And user clicks on upload file1
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #
  #file2
  #And user clicks on add option
  #And user clicks on upload file2
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file3
  #And user clicks on add option
  #And user clicks on upload file3
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file4
  #And user clicks on add option
  #And user clicks on upload file4
  #Then User should see the "Uploaded Successfully" Message
  #
  #
#file5
  #And user clicks on add option
  #And user clicks on upload file5
  #Then User should see the "Uploaded Successfully" Message
 #
   #
        #Scenario: Medical: Immunizations
    #
     #Medical
    #Given user should able to Click on files
    #Then user clicks on medical
    #Then user clicks on subscriber
    #
    #
     #Immunizations
    #And user clicks on Immunizations
    #
      #file1
  #And user clicks on add option
  #And user clicks on upload file1
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #
  #file2
  #And user clicks on add option
  #And user clicks on upload file2
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file3
  #And user clicks on add option
  #And user clicks on upload file3
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file4
  #And user clicks on add option
  #And user clicks on upload file4
  #Then User should see the "Uploaded Successfully" Message
  #
  #
#file5
  #And user clicks on add option
  #And user clicks on upload file5
  #Then User should see the "Uploaded Successfully" Message
 #
    #
 #Scenario: Medical: Health insurance
 #
 #
  #Medical
    #Given user should able to Click on files
    #Then user clicks on medical
    #Then user clicks on subscriber
    #
  #Healthinsurance
    #And user clicks on Health insurance
   #
    #
      #file1
  #And user clicks on add option
  #And user clicks on upload file1
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #
  #file2
  #And user clicks on add option
  #And user clicks on upload file2
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file3
  #And user clicks on add option
  #And user clicks on upload file3
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file4
  #And user clicks on add option
  #And user clicks on upload file4
  #Then User should see the "Uploaded Successfully" Message
  #
  #
#file5
  #And user clicks on add option
  #And user clicks on upload file5
  #Then User should see the "Uploaded Successfully" Message
 #
    #
    #Scenario: Insurance
    #
    #
    #
  #Family Access Files
     #Given user clicks on family access files
  #
     #Insurance
     #When user clicks on Insurance
     #Then user clicks on subscriber
     #When user clicks on add folder
     #Then user enters the folder name
     #And user clicks on add
     #Then user clicks on close
     #Then user clicks on the Insurance new folder
    #
    #file1
  #And user clicks on add option
  #And user clicks on upload file1
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #
  #file2
  #And user clicks on add option
  #And user clicks on upload file2
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file3
  #And user clicks on add option
  #And user clicks on upload file3
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file4
  #And user clicks on add option
  #And user clicks on upload file4
  #Then User should see the "Uploaded Successfully" Message
  #
  #
#file5
  #And user clicks on add option
  #And user clicks on upload file5
  #Then User should see the "Uploaded Successfully" Message
  #
    #
  #Scenario: Insurance:Car insurance
    #
        #Family Access Files
     #Given user clicks on family access files
  #
     #Insurance
     #When user clicks on Insurance
     #Then user clicks on subscriber
     #And click on the Carinsurance
   #
    #
    #file1
  #And user clicks on add option
  #And user clicks on upload file1
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #
  #file2
  #And user clicks on add option
  #And user clicks on upload file2
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file3
  #And user clicks on add option
  #And user clicks on upload file3
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file4
  #And user clicks on add option
  #And user clicks on upload file4
  #Then User should see the "Uploaded Successfully" Message
  #
  #
#file5
  #And user clicks on add option
  #And user clicks on upload file5
  #Then User should see the "Uploaded Successfully" Message
  #
    #
    #Scenario: Insurance: Home insurance
    #
    #Family Access Files
     #Given user clicks on family access files
  #
     #Insurance
     #When user clicks on Insurance
     #Then user clicks on subscriber
     #And click on the home insurance
#
    #
    #file1
  #And user clicks on add option
  #And user clicks on upload file1
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #
  #file2
  #And user clicks on add option
  #And user clicks on upload file2
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file3
  #And user clicks on add option
  #And user clicks on upload file3
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file4
  #And user clicks on add option
  #And user clicks on upload file4
  #Then User should see the "Uploaded Successfully" Message
  #
  #
#file5
  #And user clicks on add option
  #And user clicks on upload file5
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #Scenario: Insurance: Life insurance
  #
  #Family Access Files
     #Given user clicks on family access files
  #
     #Insurance
     #When user clicks on Insurance
     #Then user clicks on subscriber
     #And click on the life insurance
    #
    #file1
  #And user clicks on add option
  #And user clicks on upload file1
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #
  #file2
  #And user clicks on add option
  #And user clicks on upload file2
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file3
  #And user clicks on add option
  #And user clicks on upload file3
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file4
  #And user clicks on add option
  #And user clicks on upload file4
  #Then User should see the "Uploaded Successfully" Message
  #
  #
#file5
  #And user clicks on add option
  #And user clicks on upload file5
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #Scenario: Insurance: Pet Insurance
  #
     #Family Access Files
     #Given user clicks on family access files
  #
     #Insurance
     #When user clicks on Insurance
     #Then user clicks on subscriber
     #And click on the pet insurance
#
    #
    #file1
  #And user clicks on add option
  #And user clicks on upload file1
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #
  #file2
  #And user clicks on add option
  #And user clicks on upload file2
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file3
  #And user clicks on add option
  #And user clicks on upload file3
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file4
  #And user clicks on add option
  #And user clicks on upload file4
  #Then User should see the "Uploaded Successfully" Message
  #
  #
#file5
  #And user clicks on add option
  #And user clicks on upload file5
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #Scenario: Insurance: UmbrellaPolicy
  #
     #Family Access Files
     #Given user clicks on family access files
  #
     #Insurance
     #When user clicks on Insurance
     #Then user clicks on subscriber
     #And click on the umbrella policy
    #
    #file1
  #And user clicks on add option
  #And user clicks on upload file1
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #
  #file2
  #And user clicks on add option
  #And user clicks on upload file2
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file3
  #And user clicks on add option
  #And user clicks on upload file3
  #Then User should see the "Uploaded Successfully" Message
  #
  #
 #file4
  #And user clicks on add option
  #And user clicks on upload file4
  #Then User should see the "Uploaded Successfully" Message
  #
  #
#file5
  #And user clicks on add option
  #And user clicks on upload file5
  #Then User should see the "Uploaded Successfully" Message
  #
  #
  #Scenario: Finance
  #
  #
   #Family Access Files
     #Given user clicks on family access files
  #
     #Finance
     #When user clicks on Finance
     #Then user clicks on finance subscriber
     #And user clicks on the invoice
     #And user clicks on the Finance add button
     #Then user clicks on the scan document
     #And user scans the invoice
#
   #
   #Scenario: IDs
   #
     #Family Access Files
     #Given user clicks on family access files
  #
     #IDs
     #When user clicks on IDs
     #Then user clicks on subscriber
     #When user clicks on add folder
     #Then user enters the folder name
     #And user clicks on add
     #Then user clicks on close
     #Then user clicks on the ID new folder
     #
#	  
#	Scenario: IDs: Birthcertificate
#	
#	  #Family Access Files
     #Given user clicks on family access files
  #
     #IDs
     #Birth certificate
     #When user clicks on IDs
     #Then user clicks on subscriber
     #And clicks on the Birth certificate
    #Then user scans the Birth certificate
  #
#	
#	
#	Scenario: IDs: Driving license
#	
#	
#	
     #Family Access Files
     #Given user clicks on family access files
  #
     #Driving license
     #When user clicks on IDs
     #Then user clicks on subscriber
     #And user clicks on the Driving license
     #Then user scans the driving license
#	
  #Scenario: IDs: MilitiaryID
  #
    #Family Access Files
     #Given user clicks on family access files
  #
     #IDs
     #
     #Military ID
     #When user clicks on IDs
     #Then user clicks on subscriber
     #And clicks on the Military ID
     #Then user scans the Military ID
  #
#	Scenario: IDs: Passport
#	
#	
     #Family Access Files
     #Given user clicks on family access files
  #
     #Passport
     #When user clicks on IDs
     #Then user clicks on subscriber
     #Then user clicks on passport
     #And user scan the passport 
     #
  #Scenario: IDs: PetWalletID
  #
  #
  #Family Access Files
     #Given user clicks on family access files
  #
     #IDs
     #
     #Pet wallet ID
     #When user clicks on IDs
     #Then user clicks on subscriber
     #And clicks on the Pet wallet ID
     #Then user scans the pet wallet ID
     #
#	Scenario: IDs: Socialsecuritycard
#	
#	
     #Family Access Files
     #Given user clicks on family access files
  #
     #Social security cards
     #When user clicks on IDs
     #Then user clicks on subscriber
     #And clicks on the Social security card
     #Then user scans the social security card
#	
  #Scenario: IDs: TravelersID
  #
  #
  #
     #Family Access Files
     #Given user clicks on family access files
  #
     #IDs
     #
     #Travelers ID
     #When user clicks on IDs
     #Then user clicks on subscriber
     #And clicks on the Travellers ID
     #Then user scans the Traveller ID
  #
  