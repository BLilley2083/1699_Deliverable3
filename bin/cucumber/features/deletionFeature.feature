Feature: Test Deletion Functionality

  Scenario: Delete Last Node
    Given a populated linked list
    When the user tries to delete last node
    Then the last node should be deleted

  Scenario: Delete First Node
    Given a populated linked list
    When the user tries to delete first node
    Then the first node should be deleted

  Scenario: Delete Duplicates
    Given a populated linked list
    And linked list has duplicates
    When the user tries to delete duplicates
    Then the duplicates should be deleted

  Scenario: Delete Entire Linked List
    Given a populated linked list
    When the user tries to clear the linked list
    Then the linked list should be cleared

  Scenario: Delete a Specified Value
    Given a populated linked list
    When the user tries to delete a specific value
    Then the value should be removed from list
