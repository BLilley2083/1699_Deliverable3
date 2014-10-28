package cucumber.features;

import classes.*;          //import linkedlist and node from classes package
import java.util.HashMap;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AccessorStepDefinitions {
	
	LinkedList<String> ll;
	Node<String> node;
	/*@Mock
	LinkedList<Node> ll = Mockito.mock(LinkedList.class);*/
	
	@Before
	public void setUp() throws Exception{
		
		//node = new Node<String>(null);
		MockitoAnnotations.initMocks(ll);
		//MockitoAnnotations.initMocks(node);
		
	}
	
	/*
	@Given("^a populated linked list$")
	public void populateLinkedList() throws Throwable {
		
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("node1"));
		ll.addToEnd(new Node<String>("node2"));
		ll.addToEnd(new Node<String>("node3"));
		
		assertNotNull(ll);
	 
	}*/

	@When("^the user wants to view the data of the head of the linked list$")
	public void setHeadNodeData() throws Throwable {
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("node1"));
	    assertNotNull(ll.getFront());
	}

	@Then("^the head node of the linked list data should be returned$")
	public void getHeadNodeData() throws Throwable {
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("node1"));
		Node<String> head = ll.getFront();
	    assertEquals(head.getData(), "node1");
	    
	}

	@When("^the user wants to get the head of the linked list$")
	public void setHeadNode() throws Throwable {
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("node1"));
		assertNotNull(ll.getFront());
	}

	@Then("^the head node of the linked list should be returned$")
	public void getHeadNode() throws Throwable {
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("node1"));
		ll.addToEnd(new Node<String>("node2"));
		ll.addToEnd(new Node<String>("node3"));
		ll.addToEnd(new Node<String>("node4"));
		ll.addToEnd(new Node<String>("node5"));
		
		Node<String> head = ll.getFront();
		
		assertNotNull(head);
	}

	@When("^the user wants to get the next node$")
	public void setNextNode() throws Throwable {
		Node<String> node = new Node<String>("node");
		assertNotNull(node);
	}

	@Then("^the next node after the head should be returned$")
	public void getNextNode() throws Throwable {
		Node<String> node = new Node<String>(null);
		node.setData("node");
		
		assertNotNull(node);
	}

	@When("^the user wants to view node data$")
	public void nodeGetData() throws Throwable {
		Node<String> node = new Node<String>(null);
		node.setData("node");
		
		assertNotNull(node.getData());
		assertEquals(node.getData(), "node");
	}

	@And("^the user specifies how many nodes from the end of the list$")
	public void nodeDistanceFromEnd() throws Throwable {
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("node1"));
		ll.addToEnd(new Node<String>("node2"));
		ll.addToEnd(new Node<String>("node3"));
		ll.addToEnd(new Node<String>("node4"));
		ll.addToEnd(new Node<String>("node5"));
		
		assertNotNull(ll);
	}

	@Then("^the node data should be returned$")
	public void getNodeData() throws Throwable {
		ll = new LinkedList<String>();
		ll.addToFront(new Node<String>("node1"));
		ll.addToEnd(new Node<String>("node2"));
		ll.addToEnd(new Node<String>("node3"));
		ll.addToEnd(new Node<String>("node4"));
		ll.addToEnd(new Node<String>("node5"));
		
		assertEquals(ll.kthToLast(2), "node3");
	}

	@Given("^two populated linked lists$")
	public void populateTwoLinkedLists() throws Throwable {
		ll = new LinkedList<String>();
		LinkedList<String> ll2 = new LinkedList<String>();
		ll.addToFront(new Node<String>("node1"));
		ll.addToEnd(new Node<String>("node2"));
		ll2.addToFront(new Node<String>("node1"));
		ll2.addToEnd(new Node<String>("node2"));
		
		assertNotNull(ll);
		assertNotNull(ll2);
	}

	@When("^the user wants to see if the two lists are equals$")
	public void setLinkedListsEqual() throws Throwable {
		ll = new LinkedList<String>();
		LinkedList<String> ll2 = new LinkedList<String>();
		ll.addToFront(new Node<String>("node1"));
		ll.addToEnd(new Node<String>("node2"));
		ll2.addToFront(new Node<String>("node1"));
		ll2.addToEnd(new Node<String>("node2"));
		
		assertNotNull(ll);
		assertNotNull(ll2);
		
	}

	@Then("^the user should be told if the two lists are equal or not$")
	public void getLinkedListsEqual() throws Throwable {
		ll = new LinkedList<String>();
		LinkedList<String> ll2 = new LinkedList<String>();
		ll.addToFront(new Node<String>("node1"));
		ll.addToEnd(new Node<String>("node2"));
		ll2.addToFront(new Node<String>("node1"));
		ll2.addToEnd(new Node<String>("node2"));
		
		assertEquals(ll, ll2);
	}
}
