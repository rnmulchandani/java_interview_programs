package com.datastructure.tree;

public class InOrderSuccessor {
	Node root;
	Node successor;

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + "->");
		inOrder(root.right);
	}

	public void inOrderSucc(Node root, int p) {
		if (root == null) {
			return;
		}
		while (root != null) {
			if (root.data == p) {

				if (root.right != null) {
					this.successor = root.right;
					while (this.successor.left != null) {
						this.successor = this.successor.left;
					}
				}
				return;
			} else if (root.data < p) {
				root = root.right;
			} else {
				this.successor = root;
				root = root.left;
			}
		}
	}

	public static void main(String[] args) {
		int key = 3;
		InOrderSuccessor tree = new InOrderSuccessor();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		tree.root.right.right = new Node(7);
		tree.root.right.left = new Node(5);
		tree.inOrder(tree.root);
		System.out.println("null");
		tree.inOrderSucc(tree.root, key);
		System.out.println("In order Successor of " + key + " is "+ tree.successor.data);

	}

}
