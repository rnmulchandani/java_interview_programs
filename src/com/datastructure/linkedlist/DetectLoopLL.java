package com.datastructure.linkedlist;

import java.util.HashSet;

public class DetectLoopLL {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			next = null;
		}
	}

	void push(int d) {
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
		System.out.println(">" + null);
	}
	
	boolean detectLoop() {
		HashSet<Node> set = new HashSet<Node>();
		Node h = head;
		while(h != null) {
			if(set.contains(h)) {
				return true;
			}
			set.add(h);
			h = h.next;
		}
		return false;		
	}

	public static void main(String[] args) {
		DetectLoopLL lList = new DetectLoopLL();
		for (int i = 7; i > 0; i--) {
			lList.push(i);
		}
		lList.print();
		lList.head.next.next.next.next = lList.head;
		if(lList.detectLoop()) {
			System.out.println("Loop found.");
		} else {
			System.out.println("No loop found.");
		}

	}

}
