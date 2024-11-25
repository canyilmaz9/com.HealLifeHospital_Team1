
Feature: US_017: User Dashboard page test
  Background: Common Steps
    Given User goes to the User Login Page
    And   Enters the valid username and password in the User Login Page
    Then  Clicks on the Login Button in the User Login Page
    And   Verifies that it is User Dashboard Page

  @deneme
  Scenario: US_017 > TC_MY006: User Dashboard page Dashboard button visibility and accuracy test

    Then  Verifies that User Dashboard button is visible
    Then  Clicks on the User Dashboard Button
    And   Verifies that it is User Dashboard Page


  Scenario: US_017 > TC_MY007: User Dashboard page My Appointments, OPD, IPD links visibility and accuracy test

    When  Verifies that User Dashboard My Appointments button is visible
    Then  Clicks on the User Dashboard My Appointments button
    And   Verifies that it is User Dashboard My Appointments Page
    Then  Clicks on the User Dashboard Button
    When  Verifies that User Dashboard OPD button is visible
    Then  Clicks on the User Dashboard OPD button
    And   Verifies that it is User Dashboard OPD Page
    Then  Clicks on the User Dashboard Button
    When  Verifies that User Dashboard IPD button is visible
    Then  Clicks on the User Dashboard IPD button
    And   Verifies that it is User Dashboard IPD Page


  Scenario: US_017 > TC_MY008: User Dashboard page Pharmacy, Pathology, Radiology links visibility and accuracy test

    When  Verifies that User Dashboard Pharmacy button is visible
    Then  Clicks on the User Dashboard Pharmacy button
    And   Verifies that it is User Dashboard Pharmacy Page
    Then  Clicks on the User Dashboard Button
    When  Verifies that User Dashboard Pathology button is visible
    Then  Clicks on the User Dashboard Pathology button
    And   Verifies that it is User Dashboard Pathology Page
    Then  Clicks on the User Dashboard Button
    When  Verifies that User Dashboard Radiology button is visible
    Then  Clicks on the User Dashboard Radiology button
    And   Verifies that it is User Dashboard Radiology Page


  Scenario: US_017 > TC_MY009: User Dashboard page Ambulance, Blood Bank, Live Consultation links visibility and accuracy test

    When  Verifies that User Dashboard Ambulance button is visible
    Then  Clicks on the User Dashboard Ambulance button
    And   Verifies that it is User Dashboard Ambulance Page
    Then  Clicks on the User Dashboard Button
    When  Verifies that User Dashboard Blood Bank button is visible
    Then  Clicks on the User Dashboard Blood Bank button
    And   Verifies that it is User Dashboard Blood Bank Page
    Then  Clicks on the User Dashboard Button
    When  Verifies that User Dashboard Live Consultation button is visible
    Then  Clicks on the User Dashboard Live Consultation button
    And   Verifies that it is User Dashboard Live Consultation Page