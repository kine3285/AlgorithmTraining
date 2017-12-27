package LeetCode;
import java.util.*;
public class Valid_Parentheses {
	public boolean isValid(String s) {
		char arr[] = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char c : arr) {
			if (c == '(') {
				stack.push(')');
			} else if (c == '[') {
				stack.push(']');
			} else if (c == '{') {
				stack.push('}');
			} else if (stack.isEmpty() || stack.pop() != c) {
				return false;
			}
		}

		return stack.isEmpty();
	}
}
