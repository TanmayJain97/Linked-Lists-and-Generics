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
		System.out.print("Original List=");
		LinkedList.showList();
		
		//Inserting 40 after 30
		LinkedList.insertAfter(30, 40);
		
		//Display New List
		System.out.print("Original List=");
		LinkedList.showList();
	}
	
	//Checking for position of 40
	@Test
	public void When40SearchedItShouldLieBefore70() {
		assertEquals(Node3,LinkedList.search(40).getNextNode());
	}
	
	@Test
	public void When40SearchedItShouldLieAfter30() {
		assertEquals(40,(int)Node2.getNextNode().getKey());
	}
}
