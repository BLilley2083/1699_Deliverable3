package cucumber.features;

import classes.*;          //import linkedlist and node from classes package
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeletionStepDefinitions {
	static LinkedList<String> ll;
	static Node<String> node;
	@When("^the user tries to delete last node$")
	public void userDeleteLastNode() throws Throwable {
		System.out.println("User wants to delete last node");
		ll = new LinkedList<String>();
		ll.addToEnd(new Node<String>("test1"));
		ll.addToEnd(new Node<String>("test2"));
		ll.addToEnd(new Node<String>("test3"));
		ll.deleteLast();
		assertNotNull("Test 01: last node is deleted", ll);
	}

	@Then("^the last node should be deleted$")
	public void deleteLast() throws Throwable {
		System.out.println("Last node should be deleted");
		ll = new LinkedList<String>();
		ll.addToEnd(new Node<String>("test1"));
		ll.deleteLast();
		assertNull("Test 02: last node is deleted", ll.getFront());
	}

	@When("^the user tries to delete first node$")
	public void userDeleteFirstNode() throws Throwable {
		System.out.println("User wants to delete first node");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test2"));
		ll.addToFront(new Node<String>("test3"));
		ll.deleteFront();
		assertEquals("Test 03: user deletes first node", ll.getFrontData(), "test2");
	}

	@Then("^the first node should be deleted$")
	public void deleteFirst() throws Throwable {
		System.out.println("First node should be deleted");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.deleteFront();
		assertNull("Test 04: first node is deleted", ll.getFront());
	}

	@Given("^linked list has duplicates$")
	public void llWithDuplicates() throws Throwable {
		System.out.println("Linked list has duplicates");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test1"));
		assertNotNull("Test 05: Linked list contains duplicates", ll);
	}

	@When("^the user tries to delete duplicates$")
	public void userDeleteDuplicates() throws Throwable {
		System.out.println("Linked list has duplicates");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test1"));
		ll.deleteDupes();
		assertNotNull("Test 06: User deletes duplicate nodes", ll);
	}

	@Then("^the duplicates should be deleted$")
	public void deleteDuplicates() throws Throwable {
		System.out.println("Linked list has duplicates");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test1"));
		ll.deleteDupes();
		ll.deleteFront();
		assertNull("Test 07: duplicate nodes are deleted", ll.getFront());
	}

	@When("^the user tries to clear the linked list$")
	public void userClearList() throws Throwable {
		System.out.println("Linked list is cleared");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test2"));
		ll.addToFront(new Node<String>("test3"));
		ll.clear();
		assertNull("Test 08: linked list is cleared", ll.getFront());
	}

	@Then("^the linked list should be cleared$")
	public void clearList() throws Throwable {
		System.out.println("Linked list is cleared");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test2"));
		ll.addToFront(new Node<String>("test3"));
		ll.clear();
		assertNull("Test 09: linked list is cleared", ll.getFront());
	}

	@When("^the user tries to delete a specific value$")
	public void userDeleteSpecific() throws Throwable {
		System.out.println("Linked list is cleared");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test2"));
		ll.addToFront(new Node<String>("test3"));
		ll.deleteByVal("test3");
		assertEquals("Test 10: test3 is deleted from linked list", ll.getFrontData(), "test2");
	}

	@Then("^the value should be removed from list$")
	public void specificDeleted() throws Throwable {
		System.out.println("Linked list is cleared");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.deleteByVal("test1");
		assertNull("Test 11: test3 is deleted from linked list", ll.getFront());
	}


}
