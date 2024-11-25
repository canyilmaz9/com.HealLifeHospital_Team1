
Feature: US_002: User Home Page Header test
  Background: Common Steps
    Given User goes to the Home Page
    And   Verifies that it is Heal Life HomePage


  Scenario: US_002 > TC_MY001: User Home Page "Latest News" visibility test

    Then  Verifies that LatestNews button is visible
    And   Tests that the LatestNews information is visible as scrolling text


  Scenario: US_002 > TC_MY002: User Home Page Header links visibility test

    Then  Verifies that HealLife Logo is visible
    Then  Verifies that Header Home Button is visible
    Then  Verifies that Header Appointment Button is visible
    Then  Verifies that Header About Us Button is visible
    Then  Verifies that Header Gallery Button is visible
    Then  Verifies that Header Contact Us Button is visible


  Scenario: US_002 > TC_MY003: User Home Page site logo visibility and accuracy test

    Then  Verifies that HealLife Logo is visible
    Then  Clicks on the HealLife Logo
    And   Verifies that it is Heal Life HomePage


  Scenario: US_002 > TC_MY004: User Home Page Header links accuracy test

    Then  Clicks on the Header Home Button
    And   Verifies that Heal Life HomePage opens
    Then  Clicks on the Appointment Button
    And   Verifies that it is Appointment Page
    Then  Clicks on the HealLife Logo
    Then  Clicks on the About Us Button
    And   Verifies that the dropdown menu opens
    Then  Clicks on the HealLife Logo
    Then  Clicks on the Gallery Button
    And   Verifies that it is Gallery Page
    Then  Clicks on the HealLife Logo
    Then  Clicks on the Contact Us Button
    And   Verifies that it is Contact Us Page
    Then  Clicks on the HealLife Logo


  Scenario: US_002 > TC_MY005: User Home Page Header About Us links accuracy test

    When  Navigates to the About Us Button
    Then  Verifies that the dropdown menu opens
    And   Clicks on the About Us Button
    Then  Clicks on the About Hospitals Button
    And   Verifies that it is About Hospitals Page
    Then  Clicks on the HealLife Logo
    And   Clicks on the About Us Button
    Then  Clicks on the Meet Our Doctors Button
    And   Verifies that it is Meet Our Doctors Page
    Then  Clicks on the HealLife Logo
    And   Clicks on the About Us Button
    Then  Clicks on the FAQs Button
    And   Verifies that it is FAQs Page
    Then  Clicks on the HealLife Logo
    And   Clicks on the About Us Button
    Then  Clicks on the Departments Button
    And   Verifies that it is Departments Page
    Then  Clicks on the HealLife Logo
    And   Clicks on the About Us Button
    Then  Clicks on the Testimonials Button
    And   Verifies that it is Testimonials Page
