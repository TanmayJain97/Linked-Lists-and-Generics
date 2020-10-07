package linked_list;

public class LinkedListNode<Key> {

	public Key key;
	public LinkedListNode<Key> nextNode;
	
	@Override
	public String toString() {
		return "LinkedListNode []";
	}

	public LinkedListNode(Key key) {
		super();
		this.key = key;
		this.nextNode = null;
	}

	public LinkedListNode<Key> getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkedListNode<Key> nextNode) {
		this.nextNode = nextNode;
	}
}