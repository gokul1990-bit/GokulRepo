Feature: Flipkart Login functionality

  @Flipkart
  Scenario Outline: To verify whether user is able to login to the flipkart application
    Given The user is present in the login of the application
    When The user enters <username> and <password>
    And Clicks on Login button
    Then The user should be nvigated to the home page of the application

    Examples: 
      | username                   | password     |
      | gokul.shankar101@gmail.com | abashed13705 |

      
      
      @Flipkart
      Scenario: To verify whether user is able to add products in the Cart
      
      
      Given The user is on the Flipkart home page 
      When The users searches for the product and navigates to the product details page 
      And The user adds the product to the Cart section 
      Then The product should be added in the My Cart section 
      
      
      