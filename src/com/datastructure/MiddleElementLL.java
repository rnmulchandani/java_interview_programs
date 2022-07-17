package com.datastructure;

public class MiddleElementLL {
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
		System.out.println(">null");
	}

	void middleElement() {
		Node fastP = head;
		Node slowP = head;

		while (fastP != null && fastP.next != null) {
			fastP = fastP.next.next;
			slowP = slowP.next;
		}

		System.out.println("Middle Element of the LinkedList: " + slowP.data);
	}

	void middleElementBasic() {
		Node h = head;
		int count = 0;

		while (h != null) {
			count++;
			h = h.next;
		}
		h = head;
		for (int i = 1; i <= count / 2; i++) {
			h = h.next;
		}
		System.out.println("Middle Element of the LinkedList: " + h.data);
	}

	public static void main(String[] args) {
		MiddleElementLL lList = new MiddleElementLL();
		lList.push(1);
		lList.push(2);
		lList.push(3);
		lList.push(4);
		lList.push(5);
		lList.push(6);
		lList.push(7);
		lList.print();
		lList.middleElementBasic();
		lList.middleElement();
	}

}
