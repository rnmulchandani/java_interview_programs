package com.datastructure.tree;

/*
 * Height of empty tree is -1, height of tree with one node is 0.
 */
class Node {
	int data;
	Node left;
	Node right;

	public Node(int d) {
		this.data = d;
		this.left = null;
		this.right = null;
	}
}

public class DepthOfTree {
	Node root;

	public int height(Node root) {
		if (root == null) {
			return -1;
		}
		int lh = height(root.left);
		int rh = height(root.right);

		return Math.max(lh, rh) + 1;
	}

	public static void main(String[] args) {
		DepthOfTree tree = new DepthOfTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(6);
		
		System.out.println("Height of the Tree:" + tree.height(tree.root));

	}

}
