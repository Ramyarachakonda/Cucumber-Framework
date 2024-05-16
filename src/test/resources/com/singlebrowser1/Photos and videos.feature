Feature: Photos and videos page feature



Scenario: Uploading a file in photos and videos
 

    
    
    #Photos and videos
    When User clicks on Photos and Videos Section
    Then user clicks on the subscriber
    And User clicks on Upload Icon
    When User uploads a file from the device
    Then User should see the Uploaded Successfully Toast Message
    
    
    
    
    
    Scenario: Logout Family Central
    
      When user clicks on the account memu
      Then user clicks on the Logout