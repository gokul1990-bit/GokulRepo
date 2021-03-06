Feature: Login functionality

  @Login
  Scenario Outline: User is able to Login to the application
    Given The user is present in the Login page of the application
    When The user enters the email <username> and the password <password>
    And The user clicks on the SignIn button
    Then user should be navigated to the CloudBankIn home page

    Examples: 
      | username         | password   |
      | qatest@habile.in | Qatest123$ |

  Scenario Outline: User is able to Login to the application
    Given The user is present in the Login page of the application
    When The user enters the email <username> and the password <password>
    And The user clicks on the SignIn button
    Then user should be navigated to the CloudBankIn home page
