package cucumber;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConstructionStepDefinitions {
	static LinkedList<String> ll;
	static Node<String> node;
	@Given("^there are no objects initialized$")
	public void noObjectsInitialized() throws Throwable {
		System.out.println("Executed check no objects initialized method");
		ll = null;
		assertNull("Test 01: Test no objects are initialized", ll);
	}

	@When("^the user tries to create a linked list object$")
	public void userCreateLL() throws Throwable {
		System.out.println("Executed the user tries to create a ll object method");
		LinkedList<String> llTest = new LinkedList<String>();
		assertNotNull("Test 02: Test that a new linked list is declared", llTest);
	}

	@Then("^an empty linked list should be initialized$")
	public void emptyLLInitialized() throws Throwable {
		System.out.println("Executed the an empty ll should be initialized method");
		ll = new LinkedList<String>();
		assertNotNull("Test 03: Test that linked list is declared", ll);
	}

	@Given("^a populated linked list$")
	public void populatedLL() throws Throwable {
		System.out.println("Executed the populated linked list method");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test2"));
		ll.addToFront(new Node<String>("test3"));
		assertNotNull("Test 04: A populated LL is created", ll);
	}

	@When("^the user tries to add node to the front of the linked list$")
	public void userAddFront() throws Throwable {
		System.out.println("Executed the user adds to front of ll method");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		assertNotNull("Test 05: A new node is added to the front of the LL", ll);
	}

	@Then("^the new node should be at the front of the list$")
	public void newNodeAtFront() throws Throwable {
		System.out.println("Executed the new node added to front of list method");
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("test1"));
		ll.addToFront(new Node<String>("test2"));
		ll.addToFront(new Node<String>("test3"));
		assertEquals("Test 06: Test that the node was added to the front", ll.getFrontData(), "test3");
	}

	@When("^the user tries to add node to the end of the linked list$")
	public void userAddEnd() throws Throwable {
		System.out.println("Executed the user adds to end of ll method");
		ll = new LinkedList<String>();
		ll.addToEnd(new Node<String>("test1"));
		assertNotNull("Test 07: A new node is added to the end of the LL", ll);
	}

	@Then("^the new node should be at the end of the list$")
	public void newNodeAtEnd() throws Throwable {
		System.out.println("Executed the new node added to end of list method");
		ll = new LinkedList<String>();
		ll.addToEnd(new Node<String>("test1"));
		ll.addToEnd(new Node<String>("test2"));
		ll.addToEnd(new Node<String>("test3"));
		ll.deleteFront();
		ll.deleteFront();
		assertEquals("Test 08: Test that the node was added to the end", ll.getFrontData(), "test3");
	}

	@When("^the user tries to create a node object$")
	public void userCreateNode() throws Throwable {
		System.out.println("Executed the user tries to create a node object method");
		Node<String> nodeTest = new Node<String>("Test Node");
		assertNotNull("Test 09: Test a node was created", nodeTest);
	}

	@Given("^a node object to point to$")
	public void nodeNext() throws Throwable {
		System.out.println("Executed get next node to point to method");
		Node<String> nodeTest = new Node<String>("Test Node");
		assertNull("Test 10: Test a node for its next node", nodeTest.getNext());
	}

	@Given("^a node object to originate from$")
	public void nodeCurrent() throws Throwable {
		System.out.println("Executed get current node youre on method");
		Node<String> nodeTest = new Node<String>("Test Node");
		assertNotNull("Test 11: Test a current node exists", nodeTest);
	}

	@When("^the user tries to set the next node to point to$")
	public void userSetNextNode() throws Throwable {
		System.out.println("Executed user sets next node method");
		Node<String> nodeTest = new Node<String>("Test Node");
		Node<String> nodeTestNext = new Node<String>("Test Node 2");
		nodeTest.setNext(nodeTestNext);
		assertNotNull("Test 12: Test that next node is set correctly", nodeTest.getNext());
	}

	@Then("^then the selected node should point to the next node chosen$")
	public void nodePointToNext() throws Throwable {
		System.out.println("Executed node points to selected node method");
		Node<String> nodeTest = new Node<String>("Test Node");
		Node<String> nodeTestNext = new Node<String>("Test Node 2");
		nodeTest.setNext(nodeTestNext);
		assertEquals("Test 13: Test that next node is set correctly", nodeTest.getNext(), nodeTestNext);
	}

	@Given("^a node object is initialized$")
	public void initializeNode() throws Throwable {
		System.out.println("Executed the node object is initialization method");
		Node<String> nodeTest = new Node<String>(null);
		assertNotNull("Test 14: Test a current node is initialized", nodeTest);
		
	}

	@When("^the user tries to change the data in the node$")
	public void userSetData() throws Throwable {
		System.out.println("Executed the user sets the data in the node method");
		Node<String> nodeTest = new Node<String>(null);
		nodeTest.setData("Test Data");
		assertNotNull("Test 15: Test the setData method", nodeTest.getData());
	}

	@Then("^the node should contain the data user selected$")
	public void nodeChangedData() throws Throwable {
		System.out.println("Executed the node contains new data method");
		Node<String> nodeTest = new Node<String>(null);
		nodeTest.setData("Test Data");
		assertEquals("Test 16: Test the setData method added the correct data", nodeTest.getData(), "Test Data");
	}

}
