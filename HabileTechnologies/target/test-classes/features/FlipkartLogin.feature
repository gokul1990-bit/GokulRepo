Feature: Flipkart Login functionality

  @FlipkartLogin
  Scenario Outline: To verify whether user is able to login to the flipkart application
    Given The user is present in the login of the application
    When The user enters <username> and <password>
    And Clicks on Login button
    Then The user should be nvigated to the home page of the application

    Examples: 
      | username                   | password     |
      | gokul.shankar101@gmail.com | abashed13705 |
