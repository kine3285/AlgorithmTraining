package Dovelet;
import java.util.*;
public class histogram {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] counter = new int[26];
		String[] s = new String[4];
		for(int i=0;i<4;i++){
			s[i] = sc.nextLine();
			char[] arr = s[i].toCharArray();
			for(char c : arr){
				if(c>64 && c<91){
					counter[c-65]++;
				}
			}
		}
		int max=0;
		for(int i : counter){
			if(i>max)max=i;
		}
		
		for(int i=max;i>0;i--){
			for(int j=0;j<26;j++){
				if(counter[j]>=i)System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=0;i<26;i++){
			System.out.print((char)(i+65)+" ");
		}
		
	}
}
