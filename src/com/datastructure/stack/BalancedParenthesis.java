package com.datastructure.stack;

import java.util.Stack;

public class BalancedParenthesis {

	public static String isBalanced(String s) {
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (char c : charArray) {
			switch (c) {
			case '(':
				stack.push(')');
				break;
			case '[':
				stack.push(']');
				break;
			case '{':
				stack.push('}');
				break;
			default:
				if (stack.isEmpty() || c != stack.peek())
					return "NO";
				stack.pop();
			}
		}
		return stack.isEmpty() ? "YES" : "NO";
	}

	public static void main(String[] args) {
		String s = "{[(])}";
		String res = isBalanced(s);
		System.out.println(res);

	}

}
