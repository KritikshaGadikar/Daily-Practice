Feature: Application displays a proper error message when the server is down

  Scenario: Check that the application displays a proper error message when the server is down
    Given the user is on the application
    When the server goes down or becomes unavailable
    Then the user should see an error message indicating that the server is down
