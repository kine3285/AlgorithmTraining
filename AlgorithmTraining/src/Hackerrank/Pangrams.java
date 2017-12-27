package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {
	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int alp[] = new int[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum=0;
        
        for(char c : s.toCharArray()){
            
            if((int)c<123 && (int)c > 96){
                alp[(int)c - 97] = 1;
            }else if((int)c<91 && (int)c >64){
                alp[(int)c - 65] = 1;
            }
        }
        
        for(int i : alp){
            sum+=i;
        }
        if(sum==26) System.out.println("pangram");
        else System.out.println("not pangram");
    }
}
