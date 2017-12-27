package LeetCode;

public class Implement_strStr {
	public int strStr(String haystack, String needle) {
		if (haystack.length() < needle.length())
			return -1;
		else if (needle.length() == 0)
			return 0;
		int length = needle.length();
		for (int i = 0; i <= haystack.length() - length; i++) {
			// System.out.println("S is = "+haystack.substring(i,i+length)+",
			// needle is "+needle);
			if (haystack.substring(i, i + length).equals(needle)) {
				// System.out.println("YES");
				return i;
			}
		}
		return -1;
	}
}
