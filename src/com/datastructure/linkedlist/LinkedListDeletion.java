package com.datastructure.linkedlist;

public class LinkedListDeletion {

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

		if (head == null) {
			head = newNode;
		} else {
			Node h = head;
			while (h.next != null) {
				h = h.next;
			}
			h.next = newNode;
		}
	}

	int delete(int d) {
		Node h = head, p = null;
		if (h != null && h.data == d) {
			head = head.next;
			return 1;
		}
		while (h != null && h.data != d) {
			p = h;
			h = h.next;
		}
		if (h != null) {
			p.next = h.next;
			return 1;
		} 
		System.out.println("Key Not Found.");
		return 0;
	}

	void print() {
		Node h = head;
		while (h != null) {
			System.out.print(h.data + "-");
			h = h.next;
		}
		System.out.println(">null");

	}

	public static void main(String[] args) {
		LinkedListDeletion lList = new LinkedListDeletion();
		for (int i = 1; i <= 7; i++) {
			lList.insert(i);
		}
		lList.print();
		lList.delete(1);
		lList.print();
		lList.delete(6);
		lList.print();
		lList.delete(6);
		lList.print();
	}

}
