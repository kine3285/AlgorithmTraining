package LeetCode;

public class ZigZag_Conversion {
	public String convert(String s, int row) {
		StringBuilder[] sb = new StringBuilder[row];
		char[] arr = s.toCharArray();
		for (int j = 0; j < row; j++)
			sb[j] = new StringBuilder();
		int i = 0;

		while (i < arr.length) {
			for (int j = 0; j < row && i < arr.length; j++) {
				sb[j].append(arr[i++]);
			}
			for (int j = row - 2; j >= 1 && i < arr.length; j--) {
				sb[j].append(arr[i++]);
			}
		}
		for (int j = 1; j < row; j++) {
			sb[0].append(sb[j]);
		}
		return sb[0].toString();
	}
}
