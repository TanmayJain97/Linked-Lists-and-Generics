package linked_list;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListTest {

	static LinkedListClass<Integer> LinkedList;
	static private LinkedListNode<Integer> Node1;
	static private LinkedListNode<Integer> Node2;
	static private LinkedListNode<Integer> Node3;
	
	@BeforeClass
	public static void init() {
		//Passing key value
		Node1 = new LinkedListNode<Integer>(56);
		Node2 = new LinkedListNode<Integer>(30);
		Node3 = new LinkedListNode<Integer>(70);
		LinkedList = new LinkedListClass<Integer>();
		
		//Appending
		LinkedList.add(Node1);
		LinkedList.append(Node2);
		LinkedList.append(Node3);
		
		//Display Original List
		System.out.println("Original List ->");
		LinkedList.showList();
		
		//pop out from head
		LinkedList.pop();
		
		//Display new List
		System.out.println("New List ->");
		LinkedList.showList();
	}
	
	//Checking for removal of head

	@Test
	public void WhenNode1poppedNode2ShouldBecomeHead() {
		assertTrue((LinkedList.headNode).equals(Node2));
	}
	
	@Test
	public void WhenNode1poppedNode3ShouldBecomeSecondNode() {
		assertTrue(((LinkedList.headNode).getNextNode()).equals(Node3));
	}
}
