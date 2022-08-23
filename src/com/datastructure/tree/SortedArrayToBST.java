package com.datastructure.tree;

public class SortedArrayToBST {

	class Node {
		int data;
		Node left;
		Node right;

		Node(int d) {
			this.data = d;
			this.right = null;
			this.left = null;
		}
	}

	public Node convertArrayToBST(int arr[], int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		Node root = new Node(arr[mid]);
		root.left = convertArrayToBST(arr, start, mid - 1);
		root.right = convertArrayToBST(arr, mid + 1, end);
		return root;

	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + "->");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		SortedArrayToBST bst = new SortedArrayToBST();
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		Node root = bst.convertArrayToBST(arr, 0, arr.length - 1);
		System.out.println("Inorder Traversal of the Tree:");
		bst.inOrder(root);
		System.out.println("null");
	}

}
