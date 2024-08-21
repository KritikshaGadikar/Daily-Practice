Feature: Password Reset and Login

  Scenario: User successfully resets their password and logs in with the new password
    Given the user is on the login page
    And the user has forgotten their password
    When the user initiates a password reset process
    And the user follows the instructions in the password reset email
    And the user sets a new password
    And the user logs in using the new password
    Then the user should be successfully logged in
    And the user should see their dashboard or home page
