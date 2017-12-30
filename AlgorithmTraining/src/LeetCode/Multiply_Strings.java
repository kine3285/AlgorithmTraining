package LeetCode;
import java.util.*;
import java.io.*;
public class Multiply_Strings {
	public static String multiply(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		int i = num1.length()-1;
		int j = num2.length()-1;
		int carry=0;
		while(i>=0 || j>=0){
			int curr = 1;
			if(i>=0) curr*=num1.charAt(i)-48;
			System.out.println("curr is "+curr);
			if(j>=0) curr*=num2.charAt(j)-48;
			System.out.println("curr is "+curr);
			if(curr>9){
				carry = curr/10;
				curr = curr % 10;
			}
			if(carry > 0){
				curr+=carry;
				carry = 1;
			}
			sb.insert(0, curr);
			System.out.println("sb is "+sb);
			i--;
			j--;
		}
		
		return sb.toString();
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		System.out.println(multiply(num1,num2));
	}
}
