Feature: Login functionality

  Scenario: Valid login with correct credentials
    Given user navigates to login page
    When user enters valid email and password
    And clicks on login button
    Then user should be logged in successfully