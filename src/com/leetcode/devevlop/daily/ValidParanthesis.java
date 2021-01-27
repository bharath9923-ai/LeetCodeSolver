package com.leetcode.devevlop.daily;

import java.util.Stack;

public class ValidParanthesis {

	public static boolean isValid(String s) {

		Stack stack = new Stack();
		s.trim();
		for (int i = 0; i < s.length(); i++) {

			String character = String.valueOf(s.charAt(i));
			try {
				if (stack.isEmpty()) {
					stack.push(character);
				} else if (character.equalsIgnoreCase("}") && stack.peek().toString().equalsIgnoreCase("{")
						|| character.equalsIgnoreCase("]") && stack.peek().toString().equalsIgnoreCase("[")
						|| character.equalsIgnoreCase(")") && stack.peek().toString().equalsIgnoreCase("(")) {
					stack.pop();
				} else {
					stack.push(character);
				}
			} catch (Exception e) {
<<<<<<< HEAD
				System.out.println("MASTER BRANCH CODE" + e);
=======
				System.out.println("THIS IS LEET 27 JAN :" + e);
				System.out.println("LEET 2nd change");
>>>>>>> leet-27jan
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String input = "{{}[][[[]]]}";
//		String input = "(])";
		boolean result = isValid(input);

		System.out.println(result);
	}

}
