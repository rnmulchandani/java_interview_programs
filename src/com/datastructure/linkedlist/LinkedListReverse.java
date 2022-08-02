package com.datastructure.linkedlist;

public class LinkedListReverse {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	void insert(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}

	void print() {
		Node h = head;
		while (h != null) {
			System.out.print(h.data + "-");
			h = h.next;
		}
		System.out.println(">null");
	}
	
	void reverse() {
		// Reverse LinkedList
		Node prev = null, curr = head, next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	void printReverse(Node head) {
		// Print Reverse LinkedList. Don't modify
		if(head == null)
			return;
		printReverse(head.next);
		System.out.print(head.data + "-");
		
	}
	

	public static void main(String[] args) {
		LinkedListReverse llist = new LinkedListReverse();

		llist.insert(1);
		llist.insert(2);
		llist.insert(3);
		llist.print();
		llist.reverse();
		llist.print();
		llist.printReverse(llist.head);
	}

}
