Feature: TPA page feature

  Scenario: sign up with valid credentials
  
 Given user should navigates to yopmail and takes random mail
 When user enters all the appropriate details and get signed in
    
    
    # Adding client from Dashboard
    
    Given user clicks on Dashboard
    Then user clicks on add client
    And user adds the appropriate details
    Then user clicks on send invite


    # Editing Profile
    
    Given user should able to click on profile
    Then user should click on edit option
    And user adds the appropriate details in profile
    And user clicks on save option in profile
    
    
   # Client List
    Given user clicks on client list
    Then user clicks on add client in client list
     And user adds the details
     Then user clicks on save and close
     
       # Document Repository
    
    Given user clicks on document repository
    Then user clicks on the click to upload
      Then user uploads the file in repository 
     
     
     # Calendar
     
       Given the user is on the Calendar 
    When  user clicks on new event
    And User enters "Event002" into Eventtitle
    And selects the Start date In the calendar
    #And User sets Start time to "02:00"
    #And User sets End time to "13:00"
    #And User chooses to set a recurring event
    #And User sets the recurrence to Monthly event
     #And selects end date on the calendar
    And assigns the event to client
    And enters SomeText into description
    And clicks on save in Calendar

  
    
    
    
    
    
    
    
    
    