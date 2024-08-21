Feature: Cart updates correctly when a user adds or removes items

  Scenario: Check that the cart updates correctly when a user adds an item to the cart
    Given a user is logged in
    When the user adds an item to the cart
    Then the item should be present in the cart

  Scenario: Check that the cart updates correctly when a user removes an item from the cart
    Given a user is logged in
    And an item is already in the cart
    When the user removes the item from the cart
    Then the item should no longer be in the cart
