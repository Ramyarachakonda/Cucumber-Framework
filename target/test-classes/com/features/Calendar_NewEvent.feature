Feature: login page feature

  Scenario: Login with valid credentials
  
  
    Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "client08@yopmail.com" into email field
    And user enters password as "Password@123" into password field
    And user clicks on login button 
    Then user gets the family central page
    And page title should be "https://www.familycentral.com"
    
    #calendar
    
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
    Then the user should see the message "Your event has been created"