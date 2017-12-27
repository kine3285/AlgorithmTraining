package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Funny_String {

    static String funnyString(String s){
        // Complete this function
        int n = s.length();
        char arr[] = s.toCharArray();
        boolean check = true;
        for(int i=1 ; i<n ; i++){
            int temp;

            if(Math.abs((int)arr[i]-(int)arr[i-1]) != Math.abs((int)arr[n-1-i] - (int)arr[n-i])){
                check = false;
                
            }
        }
        if(check == true)
            return "Funny";
        
        return "Not Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}

