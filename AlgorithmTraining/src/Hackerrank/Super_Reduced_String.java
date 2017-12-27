package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Super_Reduced_String {
    public static void main(String... args) {
        Scanner stdin = new Scanner(System.in);
        StringBuilder s = new StringBuilder(stdin.nextLine());
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                s.delete(i-1, i+1);
                if( i-1 > 0) i = i-2;
                else i = 0;
            }
        }
        if(s.length() == 0) System.out.println("Empty String");
        else System.out.println(s);
    }
}
