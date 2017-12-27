package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Hackerrank_in_a_String {
	private static String checkIfIsHacker(String s) {

        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int cnt=0;
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            System.out.println(checkIfIsHacker(s));
                
            }
    }
}
