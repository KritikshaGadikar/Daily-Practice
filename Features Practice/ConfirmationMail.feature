Feature: Users receive a confirmation email after completing a registration process

  Scenario: Ensure that users receive a confirmation email after completing the registration process
    Given the user is on the registration page
    When the user completes the registration form
    And clicks on Submit
    Then the user should receive a confirmation email
