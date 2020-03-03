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
	
	public void insertAtBeginning(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		
		if(head == null) {
			head = node;
		}
		else {
			node.setNext(head);
			head = node;
		}
	}
	
	public void insertAtEnd(int data) {
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
	
	public int insertAtPosition(int data, int pos) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		
		if(head == null) {
			if(pos != 0) {
				return -1;
			}
			else {
				head = node;
				return 1;
			}
		}
		else {
			int i = 1;
			Node temp = null;
			Node n = head;
			while(n.getNext() != null) {
				if(pos == i) {
					//node.setNext(temp);
				}
				else if((pos-1) == i) {
					temp = n.getNext();
					n.setNext(node);
					node.setNext(temp);
				}
				i++;
				n = n.getNext();
			}
			if(i<pos) {
				return -1;
			}
			return 1;
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
	
	public void deleteAt(int pos) {
		if(pos == 0) {
			head = head.getNext();
		}
		else {
			int i = 1;
			Node temp;
			Node n = head;
			while(n.getNext() != null) {
				if(pos-1 == i) {
					temp = n.getNext();
					n.setNext(temp.getNext());
				}
				i++;
				n = n.getNext();
			}
		}
	}
}
