package linked_list;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LinkedListNodeTest {

	private LinkedListNode<Integer> Node1;
	private LinkedListNode<Integer> Node2;
	private LinkedListNode<Integer> Node3;
	
	@Before
	public void init() {
		//Passing key value
		Node1 = new LinkedListNode<Integer>(56);
		Node2 = new LinkedListNode<Integer>(30);
		Node3 = new LinkedListNode<Integer>(70);
		
		//Linking the nodes
		Node1.setNextNode(Node2);
		Node2.setNextNode(Node3);
	}
	
	//Checking for linking of nodes
	@Test
	public void WhenNode1LinkedToNode2ShouldReturnTrue() {
		assertTrue((Node1.getNextNode()).equals(Node2));
	}

	@Test
	public void WhenNode2LinkedToNode3ShouldReturnTrue() {
		assertTrue((Node2.getNextNode()).equals(Node3));
	}
}
