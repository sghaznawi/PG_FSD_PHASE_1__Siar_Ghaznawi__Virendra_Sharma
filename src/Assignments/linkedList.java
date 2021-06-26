package Assignments;
//assignment to remove a node in a linked list
public class linkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
			
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null){
			head  = newNode;
			tail = newNode;
		}else {
			tail.next= newNode;
			tail = newNode; 
		}
	}
	
    void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
 
        // If key was not present in linked list
        if (temp == null)
            return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }	
	public void display() {
		Node current= head;
		
		if (head==null) {
			System.out.println("list is empty");
			return;
		}
		while(current!=null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {

		linkedList slist = new linkedList();
		slist.addNode(1);
		slist.addNode(2);
		slist.addNode(3);
		slist.addNode(4);
		slist.addNode(5);
		slist.display();
		System.out.println("After deletion\n");
		slist.deleteNode(4);
		slist.display();

	}

}
