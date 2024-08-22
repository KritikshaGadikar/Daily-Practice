Feature: Search results are correctly displayed based on user queries

  Scenario: Verify that the search results are correctly displayed based on user queries
    Given the user is logged in
    And the user is on the search page
    When the user searches for a specific query
    Then the search results relevant to the query should be displayed
