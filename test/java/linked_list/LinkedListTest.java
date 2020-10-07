package linked_list;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListTest {

	static LinkedListClass<Integer> LinkedList;
	static private LinkedListNode<Integer> Node1;
	static private LinkedListNode<Integer> Node2;
	static private LinkedListNode<Integer> Node3;
	static private LinkedListNode<Integer> Node4;
	
	@BeforeClass
	public static void init() {
		//Passing key value
		Node1 = new LinkedListNode<Integer>(56);
		Node2 = new LinkedListNode<Integer>(30);
		Node3 = new LinkedListNode<Integer>(40);
		Node4 = new LinkedListNode<Integer>(70);
		LinkedList = new LinkedListClass<Integer>();
		
		//Appending
		LinkedList.add(Node1);
		LinkedList.append(Node2);
		LinkedList.append(Node3);
		LinkedList.append(Node4);
		
		//Display Original List
		System.out.print("Original List=");
		LinkedList.showList();
		
		//Deleting node 40
		LinkedList.removeNode(40);
		
		//Display New List
		System.out.print("Original List=");
		LinkedList.showList();
	}
	
	//Checking for removal of 40
	@Test
	public void When40SearchedItShouldReturnNotFoundMessage() {
		assertEquals(LinkedList.tailNode,LinkedList.search(40));
	}
	
	@Test
	public void NodeWith70ShouldComeAfter30() {
		assertEquals(Node4,Node2.getNextNode());
	}
	
	@Test
	public void SizeOfListShouldReturn3() {
		assertEquals(3,LinkedList.removeNode(40));
	}
}
