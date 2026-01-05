Feature: Order product functionality

  Scenario: User adds product to cart and views cart
    Given user navigates to login page
    When user enters valid email and password
    And clicks on login button
    And user navigates to products page
    And user adds a product to cart
    Then cart page should be displayed