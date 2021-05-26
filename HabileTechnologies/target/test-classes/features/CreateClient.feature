Feature: New Client creation

  Scenario: To verify whether user is able to create a new client
    Given The user is present on the list of clients page
    When The user selects client option from the Client drop down
    And The user clicks on Create Client button
    And The user enters office, Date of Birth, firstname, Lastname, gender, client type, client classification
    And under family members the users enters first name, relationship,
    And under Address users enter Address type, Street
    And User clicks on Submit button
    Then The user should be navigated to the View Client page with Client details
    When The user clicks on Activate button
    And The user enters Activate date and clicks on Submit button
    Then The created client should be activated
