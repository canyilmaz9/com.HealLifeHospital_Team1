Feature: Google Search Functionality
  @google
  Scenario: User searches for a keyword on Google
    Given User is on the Google homepage
    When User searches for "Java tutorials"
    Then Search results containing "Java" are displayed

