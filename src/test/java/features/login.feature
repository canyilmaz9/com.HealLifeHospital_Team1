Feature: Login Functionality

  Scenario: Valid Login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should see the home page
