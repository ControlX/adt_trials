package io.github.controlx.adt_lists.linked_list;

public class LinkedList {

	private Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}
	}
	
	public void print(){
		Node n = head;
		while(n != null) {
			System.out.print(n.getData() + " ");
			n = n.getNext();
		}
		System.out.println("\n");
	}
	
	public void reverse() {
		Node previous = null;
		Node current = head;
		Node next;
		
		while(current != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		
		head = previous;
	}
}
