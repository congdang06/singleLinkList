
public class SingleLinkList {
	public class Node{
		private int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	} //end of class Node;
	
	public Node head;
	
	//add to the front of the list
	public void AddFront(int data) {
		//check if head is empty
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
			return;
		}
		
		//set newNode point to current head
		newNode.next = head;
		
		//set head to newNode
		head = newNode;
	}
	
	//add data to the end of the list
	public void AddBack(int data) {
		
		Node newNode = new Node(data);
		Node current = head;
		
		//check if head is empty
		if (head == null) {
			return;
		}
		
		while (current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
	}
	
	//get firs data of the list
	public int getFirst() {
		if(head == null) {
			return 0;
		}
		
		return head.data;
	}
	
	//getlast data
	public int getLast() {
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		return current.data;
	}
	
	//find the linklist size
	public int size() {
		Node current = head;
		int count = 1;
		//check if empty list
		if (head == null) {
			return 0;
		}
		
		while(current.next != null) {
			current = current.next;
			count ++;
		}
		
		return count;
	}
	
	//delete the linklist value
	public void deleteValue(int data) {
		Node current = head;
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
			}
			current = current.next;
		}
		
		
	}
	
	//clear all linklist
	public void clear() {
		head = null;
	}
	
	public void printLinkList() {
		Node current = head;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
	
}
