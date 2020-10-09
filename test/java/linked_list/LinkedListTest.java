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
		LinkedList.makeOrderedList(Node1);
		LinkedList.makeOrderedList(Node2);
		LinkedList.makeOrderedList(Node3);
		LinkedList.makeOrderedList(Node4);
		
		//Display List
		LinkedList.showList();
	}
	
	//Checking for ordering
	@Test
	public void HeadNodeShouldBe30() {
		assertEquals(Node2,LinkedList.headNode);
	}
	
	@Test
	public void TailNodeShouldBe70() {
		assertEquals(Node4.getNextNode(),LinkedList.tailNode);
	}
}
