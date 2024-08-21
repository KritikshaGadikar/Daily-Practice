Feature: Email Notification on Device Activation

  Scenario: Send an email notification when a user activates their account on a new device
    Given a user is registered and has an active account
    When the user activates their account on a new device
    Then an email notification should be sent to the user's registered email address
    And the email should contain information about the new device activation
    And the user should be able to view the email notification in their inbox












