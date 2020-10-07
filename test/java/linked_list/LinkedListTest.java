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
		
		//Display List
		LinkedList.showList();
	}
	
	//Checking for position of elements
	@Test
	public void When56SearchedPosition1isReturned() {
		assertEquals(1,LinkedList.search(56));
	}
	
	@Test
	public void When30SearchedPosition2isReturned() {
		assertEquals(2,LinkedList.search(30));
	}
	
	public void When70SearchedPosition3isReturned() {
		assertEquals(3,LinkedList.search(70));
	}
	
	@Test
	public void When99SearchedNotFoundMessageisPrinted() {
		assertEquals((-1),LinkedList.search(99));
	}
}
