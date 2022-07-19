package com.datastructure;

public class QueueImplementationArray {
	static final int capacity = 1000;
	int front, rear, size;
	int arr[] = new int[capacity];

	QueueImplementationArray() {
		front = 0;
		size = 0;
		rear = capacity - 1;
	}

	boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	boolean isFull() {
		if (size == capacity)
			return true;
		return false;
	}

	boolean enqueue(int d) {
		if (isFull()) {
			System.out.println("Queue is full.");
			return false;
		} else {
			rear = (rear + 1) % capacity;
			arr[rear] = d;
			size++;
			return true;
		}
	}

	int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		} else {
			int d = arr[front];
			front = front + 1 % capacity;
			size--;
			return d;
		}
	}

	int getFront() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		} else {
			return arr[front];
		}
	}

	int getRear() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		} else {
			return arr[rear];
		}
	}

	void print() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
		} else {
			System.out.println("Elements in the queue are: ");
			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		QueueImplementationArray queue = new QueueImplementationArray();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println("Size of the queue is: " + queue.size);
		queue.print();
		
		System.out.println("\nElement removed from the queue is: " + queue.deQueue());
		System.out.println("Size of the queue is: " + queue.size);
		queue.print();
		
		queue.enqueue(60);
		
		System.out.println("\nFront element of the queue is: " + queue.getFront());
		System.out.println("Rear element of the queue is: " + queue.getRear());

	}

}
