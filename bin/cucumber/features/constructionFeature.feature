Feature: Test Construction Functionality

Scenario: Initialize linked list correctly
Given initial program execution
And there is no linked list built
When the user tries to create a linked list object
Then an empty linked list should be initialized

Scenario: Add to front
Given a populated linked list
When the user tries to add node to the front of the linked list
Then the new node should be at the front of the list

Scenario: Add to end
Given a populated linked list
When the user tries to add node to the end of the linked list
Then the new node should be at the end of the list

Scenario: Initialize a new node
Given initial program execution
And there are no nodes or linked lists initialized
When the user tries to create a node object
Then a new node should be created

Scenario: Set the next node
Given a node object to point to
And a node object to originate from
When the user tries to set the next node to point to
Then then the selected node should point to the next node chosen

Scenario: Set the data in the node
Given a node object is initialized
When the user tries to change the data in the node
Then the node should contain the data user selected