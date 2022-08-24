package com.datastructure.tree;

/*
 * A height balanced binary tree is a binary tree in which the height of the 
 * left subtree and right subtree of any node does not differ by more than 1 
 * and both the left and right subtree are also height balanced.
 */

public class CheckBalanacedBST {
	Node root;

	public boolean isBalanced(Node root) {
		if (root == null) {
			return true;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		if ((lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
			return true;
		}
		return false;
	}

	public int height(Node root) {
		if (root == null) {
			return -1;
		}
		int lh = height(root.left);
		int rh = height(root.right);

		return Math.max(lh, rh) + 1;
	}

	public static void main(String[] args) {

		CheckBalanacedBST tree = new CheckBalanacedBST();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(8);

		if (tree.isBalanced(tree.root))
			System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");
	}
}
