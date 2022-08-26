package com.datastructure.tree;

public class InOrderPredecessor {
	Node root;
	Node predecessor;

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + "->");
		inOrder(root.right);
	}

	public void inOrderPre(Node root, int p) {
		if (root == null) {
			return;
		}
		while (root != null) {
			if (root.data == p) {

				if (root.left != null) {
					this.predecessor = root.left;
					while (this.predecessor.left != null) {
						this.predecessor = this.predecessor.left;
					}
				}
				return;
			} else if (root.data < p) {
				this.predecessor = root;
				root = root.right;
			} else {
				root = root.left;
			}
		}
	}

	public static void main(String[] args) {
		int key = 3;
		InOrderPredecessor tree = new InOrderPredecessor();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		tree.root.right.right = new Node(7);
		tree.root.right.left = new Node(5);
		tree.inOrder(tree.root);
		System.out.println("null");
		tree.inOrderPre(tree.root, key);
		System.out.println("In order Predecessor of " + key + " is "+ tree.predecessor.data);

	}

}
