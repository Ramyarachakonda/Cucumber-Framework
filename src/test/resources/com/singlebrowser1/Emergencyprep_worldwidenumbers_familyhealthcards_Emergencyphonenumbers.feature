Feature: Emergency prep : world wide numbers , family health cards, emergency numbers feature
  
 
 
 Scenario:  Emergency prep : world wide numbers 
    

       #Emergency prep
  When user click on emergency prep
     
     
      #World Wide Emergency numbers
     When user clicks on the Emergency Prep
     Then user clicks on the Worldwide Emergency phone numbers
     Then user clicks on the Search option
 
 Scenario:  Emergency prep : family health cards     
     
      #Emergency prep
     When user click on emergency prep
    
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
     
    
    Scenario:  Emergency prep : Emergency phone numbers
     
       #Emergency prep
    When user click on emergency prep
    
    
      #Emergency phone numbers
     When user clicks on emergency phone numbers
     Then user clicks on add contact
     Then user enters the first name
     And user enters the last name
     Then user enters the phone number
     And user enters the email
     Then user clicks on save option
     