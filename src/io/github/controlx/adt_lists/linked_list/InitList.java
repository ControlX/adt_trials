package io.github.controlx.adt_lists.linked_list;

public class InitList {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(5);
		linkedList.insert(6);
		linkedList.insert(7);
		linkedList.insert(8);
		linkedList.insert(9);
		linkedList.print();
		linkedList.reverse();
		linkedList.print();
	}

	
}
