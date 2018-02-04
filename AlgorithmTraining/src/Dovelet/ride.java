package Dovelet;
import java.util.*;
public class ride {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		int num1=1;
		int num2=1;
		for(char c:arr1){
			num1*=c-64;
		}
		num1 = num1%47;
		for(char c : arr2){
			num2*=c-64;
		}
		num2 = num2%47;
		if(num1==num2){
			System.out.println("GO");
		}else System.out.println("STAY");
	}
}
