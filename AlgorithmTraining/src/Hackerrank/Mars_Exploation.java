package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mars_Exploation {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder S = new StringBuilder(in.next());
        int cnt=0;
        while(S.length()>2){
            if(S.charAt(2) != 'S') cnt++;
                //System.out.println("S(2) = "+S.charAt(2));
            if(S.charAt(1) != 'O') cnt++;
            if(S.charAt(0) != 'S') cnt++;
            
            S.delete(0, 3);
        }
        System.out.println(cnt);
    }
}
