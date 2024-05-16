Feature: Run all the modules



Scenario: Signup with valid credentials

  
    Given user is on familycentral page 
    When user clicks on LandingPagesignup
    And user clicks on signup option of families
    When user enters the appropriate details
    And user clicks on continue button 
    
    
    #Home Page
    
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
    
      #Family Access Files
      
      #important contacts
    Given user should able to Click on files
    Then user should click on important contacts
    And user should click on add contact
    Then user should enter the first name, last name, phone number
    And user should click on save button
    
    
    #Medical
    When user clicks on files
    Then user clicks on medical
    Then user clicks on subscriber
    And user clicks on vaccine cards
    
   And user clicks on add option
   And user clicks on upload file
   Then User should see the "File Uploaded Successfully" Message
   
   
        
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
    
     
        #IDs
     When user clicks on IDs
     Then user clicks on subscriber
     When user clicks on add folder
     Then user enters the folder name
     And user clicks on add
     Then user clicks on close
     Then user clicks on the ID new folder
     
	  
     #Passport
     When user clicks on IDs
     Then user clicks on subscriber
     Then user clicks on passport
     And user scan the passport 
     
     #Driving license
     When user clicks on IDs
     Then user clicks on subscriber
     And user clicks on the Driving license
     Then user scans the driving license
     
     
      #Social security cards
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Social security card
     Then user scans the social security card
     
     
     #Birth certificate
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Birth certificate
    Then user scans the Birth certificate
    
     #Military ID
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Military ID
     Then user scans the Military ID
  
  
   #Travelers ID
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Travellers ID
     Then user scans the Traveller ID
  
  
  
  
      #Pet wallet ID
     When user clicks on IDs
     Then user clicks on subscriber
     And clicks on the Pet wallet ID
     Then user scans the pet wallet ID
  
     
      #Insurance
     When user clicks on Insurance
     Then user clicks on subscriber
     When user clicks on add folder
    Then user enters the folder name
    And user clicks on add
    Then user clicks on close
   Then user clicks on the Insurance new folder
    
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
  
     
     
     
     
     
     
     
      #My family
    Given userable to click on my family 
    When user should click on add member
    Then user should enter the name and email
    And user should send the invite 
    
    
    
    #TPA Invite
    Given user should click on the tpa
    Then user should click on invite advisor
    And user should enter name and email
    Then user should send the TPAinvite
  
     #Calendar on New event
 
   Given the user is on the Calendar page
    When the user clicks on New Event
    And User enters "Event001" into EventTitle
    And selects the start date on the calendar
    And User sets the start time to "01:00"
    And User sets the end time to "14:00"
    And chooses to set a recurring event
    And User sets the recurrence to Monthly
     And selects the End date on the calendar
    #And User selects the specific day "28"
    #And User chooses the year "2025"
    #And User sets a reminder for "5 min before"
    And assigns the event to family member
    And enters someText into the description
    And clicks on save
    
    
     
      #calendar on Add milestone
    
     When user chooses the appropriate event
     Then user clicks on next
     And user enters the name
     Then user selects the date
     And user sets the reminder
     And user entersthe description
     Then user clicks on save milestone 
   
  
    #photos and videos
    When User clicks on Photos and Videos Section
    Then user clicks on the subscriber
    And User clicks on Upload Icon
    When User uploads a file from the device
    Then User should see the Uploaded Successfully Toast Message
    
    #Accountmenu
    When user clicks on the account memu
    Then user clicks on the my accounts
    Then user clicks on the edit option
    And user modify the data and clicks on save option
    Then user clicks on Password
    And user enters the current password
    And user enters the new password and confirm password
    Then user clicks on savechanges
    And user clicks on executor 
    Then user enters the first name and lastname
    And user enters the email and phone number
    Then user sends the invitation to the executor
    When user clicks on emergency contact
    Then user enters firstname and last name
    Then user enters the email and emergency phone number
    And user clicks on send
    
   
     
     
      #Emergency prep
     When user click on emergency prep and add the folder
    
     #Family health cards
     Then user clicks on family health cards
     And user clicks on add details
     Then user enters the height
     And user enters the weight
     And user enters the blood group
     And user enters the medical conditions
     And user enters the allergies
     And user enters the medications
     Then user clicks on save
     And user edits the familyhealthcard details
     
     
     #Emergency phone numbers
     When user clicks on emergency phone numbers
     Then user clicks on add contact
     Then user enters the first name
     And user enters the last name
     Then user enters the phone number
     And user enters the email
     Then user clicks on save option
     
     #World Wide Emergency numbers
     When user clicks on the Emergency Prep
     Then user clicks on the Worldwide Emergency phone numbers
     Then user clicks on the Search option
     
     
     
   
     
      
      
      #Disaster Planning
      When user click on emergency prep
      Then user clicks on the Disaster planning
      
      
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
  
     
     
     
     
     #Supplykit
      
      When user click on emergency prep
      Then user clicks on the Disaster planning
      
      
      #supply kit
      And user clicks on the supply kit
       And user clicks on add option
       And user clicks on upload file
       Then User should see the "File Uploaded Successfully" Message
  
  
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
  
  
  
  
  
     
   
   #Home evacuation
     When user click on emergency prep
      Then user clicks on the Disaster planning
      
      
      And user clicks on the HomeEvacuation
       And user clicks on add option
       And user clicks on upload file
       Then User should see the "File Uploaded Successfully" Message
  
  
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
  
  
  
  
  #Meeting places
    When user click on emergency prep
      Then user clicks on the Disaster planning
      
      And user clicks on the Meeting Places
       And user clicks on add option
       And user clicks on upload file
       Then User should see the "File Uploaded Successfully" Message
  
  
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
  
  
  
  
     #Commuter Plan
       When user click on emergency prep
      Then user clicks on the Disaster planning
      
      And user clicks on the Commuterplan
       And user clicks on add option
       And user clicks on upload file
       Then User should see the "File Uploaded Successfully" Message
  
  
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
  
  
     