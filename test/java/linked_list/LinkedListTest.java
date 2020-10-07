package linked_list;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	LinkedListClass<Integer> LinkedList;
	private LinkedListNode<Integer> Node1;
	private LinkedListNode<Integer> Node2;
	private LinkedListNode<Integer> Node3;
	
	@Before
	public void init() {
		//Passing key value
		Node1 = new LinkedListNode<Integer>(70);
		Node2 = new LinkedListNode<Integer>(30);
		Node3 = new LinkedListNode<Integer>(56);
		LinkedList = new LinkedListClass<Integer>();
		
		//Appending
		LinkedList.add(Node1);
		LinkedList.append(Node2);
		LinkedList.append(Node3);
	}
	
	//Checking for append of all 3 values
	@Test
	public void WhenNode1appendedShouldReturnTrue() {
		assertTrue((LinkedList.headNode).equals(Node1));
	}

	@Test
	public void WhenNode2appendedShouldReturnTrue() {
		assertTrue(((LinkedList.headNode).getNextNode()).equals(Node2));
	}
	
	@Test
	public void WhenNode3appendedShouldReturnTrue() {
		assertTrue((LinkedList.tailNode).equals(Node3));
	}
}
