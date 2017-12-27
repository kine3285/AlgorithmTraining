package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Two_Strings {

    static String twoStrings(String s1, String s2){
        // Complete this function
        
        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
            if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1)
                return "YES";
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}

