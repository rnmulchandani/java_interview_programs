package com.datastructure.linkedlist;

public class LinkedListComparision {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	void push(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}

	static void printList(LinkedListComparision l) {
		Node h = l.head;
		while (h != null) {
			System.out.print(h.data + "-");
			h = h.next;
		}
		System.out.println(">null");
	}
	
	boolean areIdentical(LinkedListComparision llist2) {
		Node head1 = this.head;
		Node head2 = llist2.head;
		
		while(head1 != null &&  head2 != null) {
			if(head1.data == head2.data) {
				head1 = head1.next;
				head2 = head2.next;
			}else {
				return false;
			}
		}
		return (head1 == null && head2 == null);
	}

	public static void main(String[] args) {
		LinkedListComparision llist1 = new LinkedListComparision();
		LinkedListComparision llist2 = new LinkedListComparision();

		llist1.push(1);
		llist1.push(2);
		llist1.push(3);
		printList(llist1);

		llist2.push(1);
		llist2.push(2);
		llist2.push(3);
		printList(llist2);

		if(llist1.areIdentical(llist2)) {
			System.out.println("Lists are identical.");
		}else {
			System.out.println("Lists are not identical");
		}
		
		llist2.push(4);
		printList(llist2);
		if(llist1.areIdentical(llist2)) {
			System.out.println("Lists are identical.");
		}else {
			System.out.println("Lists are not identical");
		}
		

	}

}
