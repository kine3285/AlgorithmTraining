package LeetCode;

import java.util.*;

public class Integer_to_Roman {
	public static String intToRoman(int n) {
		StringBuilder sb = new StringBuilder();
		String M[] = {"", "M", "MM", "MMM"};
	    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	    sb.append(M[n/1000]);
	    n%=1000;
	    sb.append(C[n/100]);
	    n%=100;
	    sb.append(X[n/10]);
	    n%=10;
	    sb.append(I[n]);
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(intToRoman(n));
	}
}
