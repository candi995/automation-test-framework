Feature: Login functionality

  Scenario: Valid login with correct credentials
    Given user navigates to login page
    When user enters valid email and password
    And clicks on login button
    Then user should be logged in successfully

Feature: Order product functionality

  Scenario: User adds product to cart and views cart
    Given user navigates to login page
    When user enters valid email and password
    And clicks on login button
    And user navigates to products page
    And user adds a product to cart
    Then cart page should be displayed
