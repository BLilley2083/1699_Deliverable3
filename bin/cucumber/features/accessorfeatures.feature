Feature: Test accessor method functionality

  Scenario: Get the head Nodes data of a linked list
    Given a populated linked list
    When the user wants to view the data of the head of the linked list
    Then the head node of the linked list data should be returned

  Scenario: Get the head Node of a linked list
    Given a populated linked list
    When the user wants to get the head of the linked list
    Then the head node of the linked list should be returned

  Scenario: Get the next node of a linked list
    Given a populated linked list
    When the user wants to get the next node
    Then the next node after the head should be returned

  Scenario: Get the data of a node in a linked list
    Given a populated linked list
    When the user wants to view node data
    Then the node data should be returned

  Scenario: Get the kth to last node in a linked list data
    Given a populated linked list
    When the user wants to view node data
    And the user specifies how many nodes from the end of the list
    Then the node data should be returned

  Scenario: Test if two linked lists are equals
    Given two populated linked lists
    When the user wants to see if the two lists are equals
    Then the user should be told if the two lists are equal or not
