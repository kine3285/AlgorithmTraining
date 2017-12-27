package LeetCode;

public class Length_of_Last_Word {
	public int lengthOfLastWord(String s) {
		int len = 0, tail = s.length() - 1;
		while (tail >= 0 && s.charAt(tail) == ' ')
			tail--;
		while (tail >= 0 && s.charAt(tail) != ' ') {
			len++;
			tail--;
		}
		return len;
	}
}
