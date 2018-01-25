package Dovelet;
import java.util.*;
public class secure {
	public static boolean checker(String s){
		for(char c : s.toCharArray()){
			if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u')
				return true;
		}
		return false;
	}
	public static void builder(char[] arr, int start, int n, String s){
		
		
		s = s+arr[start];
		start++;
		if(s.length() == n){
			if(checker(s))
				System.out.println(s);
			return;
		}
		for(int i=start;i<arr.length;i++){
			builder(arr,i,n,s);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[] arr = new char[k];
		for(int i=0;i<k;i++){
			arr[i] = sc.next().charAt(0);
		}
		Arrays.sort(arr);
		for(int i=0;i<=k-n;i++){
			builder(arr,i,n,"");
		}
		
	}
}
