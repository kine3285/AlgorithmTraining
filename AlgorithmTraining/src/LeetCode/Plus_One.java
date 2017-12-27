package LeetCode;

public class Plus_One {
	public int[] plusOne(int[] digits) {
		int carry = 0;
		if (digits[digits.length - 1] == 9) {
			carry = 1;
			digits[digits.length - 1] = 0;
		} else {
			digits[digits.length - 1]++;
		}
		for (int i = digits.length - 2; i >= 0; i--) {
			digits[i] += carry;
			carry = 0;
			if (digits[i] == 10) {
				carry = 1;
				digits[i] = 0;
			}
		}
		if (carry == 1) {
			int[] newdigits = new int[digits.length + 1];
			newdigits[0] = 1;
			for (int i = 1; i < newdigits.length; i++) {
				newdigits[i] = digits[i - 1];
			}
			return newdigits;
		}
		return digits;
	}
}
