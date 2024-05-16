 Feature: Invite Family Member and Verify Invitation
 
 Scenario: Inviting a Family Member and Verifying Invitation Email
  
    Given user is on login page 
    When user clicks on LandingPageLogin
    And user clicks on login option of families
    Then user should navigate to login page
    When user enters username as "client08@yopmail.com" into email field
    And user enters password as "Password@123" into password field
    And user clicks on login button 
    Then user gets the family central page
    And page title should be "https://www.familycentral.com"
    
  
 
 
  # Adding the Family Member 
    
    Given User is on My Family Module
    When User clicks on AddMember
    Then User should see the PopUpWindow
    And User Enters the Invite Person Name
    And User Enters Invite Email Address
    And User Clicks on Send Invite
    Then User Should see the "Invite has been sent to email" Message
    When User Navigates to Yopmail
     
    And Check for Received Invite Email
    And User Switch to Email Iframe
    And User Click on Create Account
    And User Join Your Family
    And User Continue on NextPage1
    And User Enter Password and Confirm Password
    And User Continue on NextPage2
    And User Select Country, Enter Phone Number, and Send Code
    And User Verify OTP Element Presence
    And User Enter OTP
    And User Complete Registration
    And User Verify Home