

Feature:As a doctor, they should be able to list data about inpatients from the IPD page and perform IPD patient procedures.
  Background: Common Steps
    Given Enters the "adminURL"
    And  Login as doctor




  Scenario: Verify that the patient list on the IPD page displayed


    Then As a doctor, click on the IPD menu in the dashboard.
    * As a doctor,verify that the IPD menu is enabled.
    * As a doctor, verify that the page displays the " IPD Patient".
    * As a doctor, verify that the data table headers are visible.
    * As a doctor, verify that the " Case ID / Patient ID" column is sorted in ascending order.
    * As a doctor, the number of patients displayed in the data table should be visible next to the record text below the table.
    * As a doctor, Verify that the patient's IPD number and name are enabled.
    * As a doctor, verify that the patient's details page is accessible.
    * As a doctor, Verify searching with full data of the 3 patient in the data table.
    * As a doctor, verify that the Add Patient button is accessible.
    * As a doctor, verify that the Discharged Patient button is accessible.
    * As a doctor, access the patient details page through the hamburger menu under the Credit Limit text.




@ac
    Scenario: Verify that clicking on a patient's IPD No navigates to the detailed patient page.
  Then As a doctor, click on the IPD menu in the dashboard.
  Given Clicking on the IPD No Column Nu 3 navigates to the patient's details page
  And As a doctor, verify that the page displays and click the " Nurse Notes".
  And The Medication page displays medication history correctly
  And The Medication page allows adding new medications (Bug exists)
  And The Prescription page displays patient prescriptions
  And The Prescription page allows writing new prescriptions
  And The Consultant Register page lists all consultant records
  And The Lab Investigation page lists all lab investigations
  And The Operations page lists all patient operations
  And The Operations page allows adding new operation records (Bug exists)
  And The Charges page displays detailed patient charges
  And The Charges page allows creating new charge records
  And The Payment page lists all payment records
  And The Payment page allows adding new payments
  And The Bed History page shows detailed bed history
  And The Timeline page displays future treatment plans
  And The Timeline page allows adding new treatment notes
  And The Treatment History page lists all past treatments accurately



















