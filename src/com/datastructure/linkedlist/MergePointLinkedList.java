package com.datastructure.linkedlist;

public class MergePointLinkedList {
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
		Node node = new Node(d);
		if (head == null) {
			head = node;
		} else {
			Node h = head;
			while (h.next != null) {
				h = h.next;
			}
			h.next = node;
		}
	}

	static void print(MergePointLinkedList ll) {
		Node h = ll.head;
		while (h != null) {
			System.out.print(h.data + "->");
			h = h.next;
		}
		System.out.println("null");
	}

	static Node mergePoint(MergePointLinkedList l1, MergePointLinkedList l2) {
		Node ptr1 = l1.head;
		Node ptr2 = l2.head;

		while (ptr1 != ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;

			if (ptr1 == ptr2) {
				return ptr1;
			}

			if (ptr1 == null) {
				ptr1 = l2.head;
			}
			if (ptr2 == null) {
				ptr2 = l1.head;
			}

		}
		return ptr1;

	}

	public static void main(String[] args) {
		MergePointLinkedList l1 = new MergePointLinkedList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);

		print(l1);

		MergePointLinkedList l2 = new MergePointLinkedList();
		l2.insert(1);
		l2.insert(2);
		l2.head.next.next = l1.head.next.next;

		print(l2);
		Node mergePoint = mergePoint(l1, l2);
		System.out.println(mergePoint != null ? mergePoint.data : "Not found.");
	}

}
