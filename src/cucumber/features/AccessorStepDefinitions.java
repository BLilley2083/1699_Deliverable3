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
	
	LinkedList ll = null;
	
	@Mock
	HashMap<Integer, String> mockMap = Mockito.mock(HashMap.class);
	
	@Before
	public void setUp() throws Exception{
		ll = new ArrayList<String>();
		MockitoAnnotations.initMocks(mockMap);
	}
	
	@Given("^a populated linked list$")
	public void populateLinkedList() throws Throwable {
	    
	}

	@When("^the user wants to view the data of the head of the linked list$")
	public void setHeadNodeData() throws Throwable {
	    
	}

	@Then("^the head node of the linked list data should be returned$")
	public void getHeadNodeData() throws Throwable {
	    
	}

	@When("^the user wants to get the head of the linked list$")
	public void setHeadNode() throws Throwable {
	    
	}

	@Then("^the head node of the linked list should be returned$")
	public void getHeadNode() throws Throwable {
	    
	}

	@When("^the user wants to get the next node$")
	public void setNextNode() throws Throwable {
	    
	}

	@Then("^the next node after the head should be returned$")
	public void getNextNode() throws Throwable {
	    
	}

	@When("^the user wants to view node data$")
	public void nodeGetData() throws Throwable {
	    
	}

	@And("^the user specifies how many nodes from the end of the list$")
	public void nodeDistanceFromEnd() throws Throwable {
	    
	}

	@Then("^the node data should be returned$")
	public void getNodeData() throws Throwable {
		
	}

	@Given("^two populated linked lists$")
	public void populateTwoLinkedLists() throws Throwable {
	    
	}

	@When("^the user wants to see if the two lists are equals$")
	public void setLinkedListsEqual() throws Throwable {
	    
	}

	@Then("^the user should be told if the two lists are equal or not$")
	public void getLinkedListsEqual() throws Throwable {
		
	}
}
