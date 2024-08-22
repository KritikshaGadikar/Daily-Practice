Feature: Handles invalid input gracefully

  Scenario: Ensure that the application handles invalid input gracefully
    Given the user is on the login page
    When the user enters an invalid password
    Then the user should see an error message indicating that the password is invalid
