package linked_list;

public class LinkedListClass<Key> {

	public LinkedListFunction<Key> headNode;
	public LinkedListFunction<Key> tailNode;

	public LinkedListClass() {
		this.headNode = null;
		this.tailNode = null;
	}

	public void add(LinkedListFunction<Key> newNode) {

		if(this.tailNode==null) {
			this.tailNode=newNode;
		}

		if(this.headNode==null) {
			this.headNode=newNode;
		}else {
			//swap headnode and newnode
			LinkedListFunction<Key> tempNode=this.headNode;
			this.headNode=newNode;
			(this.headNode).setNextNode(tempNode);
		}
	}

	public void append(LinkedListFunction<Key> newNode) {

		if(this.headNode==null) {
			this.headNode=newNode;
		}

		if(this.tailNode==null) {
			this.tailNode=newNode;
		}else {
			//append entry here
			(this.tailNode).setNextNode(newNode);
			this.tailNode=newNode;
		}
	}
}
