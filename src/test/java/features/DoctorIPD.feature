

Feature:As a doctor, they should be able to list data about inpatients from the IPD page and perform IPD patient procedures.
  Background: Common Steps
    Given Enters the "adminURL"
    And  Login as doctor


  @ac

  Scenario: Verify that the patient list on the IPD page displayed


    Then As a doctor, click on the IPD menu in the dashboard.
    * As a doctor,verify that the IPD menu is enabled.
    * As a doctor, verify that the page displays the " IPD Patient".
    * As a doctor, verify that the data table headers are visible.
    * As a doctor, verify that the Case ID-Patient ID column is sorted in descending order.
    * As a doctor, the number of patients displayed in the data table should be visible next to the "Record" text below the table.
    * As a doctor, click on patient names or IPD numbers
    * As a doctor, verify that the patient's details page is accessible.
    * As a doctor, verify that the search box allows searching for any data present in the data table.
    * As a doctor, access the patient details page through the hamburger menu under the Credit Limit text.
    * As a doctor, verify that the Add Patient button is accessible.
    * As a doctor, verify that the Discharged Patient button is accessible.

