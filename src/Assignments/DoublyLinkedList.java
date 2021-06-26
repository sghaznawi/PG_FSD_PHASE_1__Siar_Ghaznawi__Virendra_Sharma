package Assignments;

import Assignments.linkedList.Node;

public class DoublyLinkedList {
	//assignment to remove a node in a linked list
		class Node{
			int data;
			Node previous;
			Node next;
			
			public Node(int data) {
				this.data = data;
				
			}
		}
		public Node head = null;
		public Node tail = null;
		
		public void addNode(int data) {
			Node newNode = new Node(data);
			if (head == null){
				head  = newNode;
				tail = newNode;
				head.previous=null;
				tail.next=null;
			}else {
				tail.next= newNode;
				newNode.previous=tail;
				tail=newNode;
				tail.next=null;
				
			}
		}
		
		public void display() {
			Node current= head;
			
			if (head==null) {
				System.out.println("list is empty");
				return;
			}
			System.out.println("Node of doubly linkedlist");
			while(current!=null) {
				System.out.println(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
public static void main(String[] args) {

	DoublyLinkedList slist = new DoublyLinkedList();
			slist.addNode(1);
			slist.addNode(2);
			slist.addNode(3);
			slist.addNode(4);
			slist.addNode(5);
			slist.display();

}}
