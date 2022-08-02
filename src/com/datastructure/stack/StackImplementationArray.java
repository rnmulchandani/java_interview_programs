package com.datastructure.stack;

public class StackImplementationArray {
	static final int capacity = 1000;
	int top;
	int arr[] = new int[capacity];

	StackImplementationArray() {
		top = -1;
	}

	boolean isEmpty() {
		if (top < 0)
			return true;
		return false;
	}

	boolean push(int d) {
		if (top == capacity - 1) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			arr[++top] = d;
			return true;
		}
	}

	int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			int d = arr[top--];
			return d;
		}
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			int d = arr[top];
			return d;
		}
	}

	void print() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
		} else {
			System.out.println("Elements in the stack are");
			for (int i = top; i >= 0; i--)
				System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		StackImplementationArray stack = new StackImplementationArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.print();

		System.out.println("\nTop element of the stack is " + stack.peek());
		System.out.println("Popped element of the stack is " + stack.pop());
		System.out.println("Top element of the stack after pop is " + stack.peek());

		stack.print();

	}

}
