package Dovelet;
import java.util.*;
public class order {
	static String[] combination;
	static int combicnt=0;
	static String[] permutation;
	static int permucnt=0;
	static int[] factorial = new int[100];
	public static long facto(int n){
		if(n==0||n==1)return 1;
		
	
		return n*facto(n-1);
	}
	public static void combi(char[] arr, int start, int end, int n, String s){
		s = s+arr[start];
		start++;
		if(s.length() == n){
			combination[combicnt++] = s;
			return;
		}else{
			for(int i=start;i<end;i++)
				combi(arr,i,end,n,s);
		}
	}
	public static void permu(char[] arr, int now, int end, int n, String s){
		
		s = s+arr[now];
		if(s.length() == n){
			permutation[permucnt++] = s;
			return;
		}else{
			for(int i=0;i<end;i++){
				if(checker(s.toCharArray(),arr[i]))
					permu(arr,i,end,n,s);
			}
		}
	}
	public static boolean checker(char[] arr, char c){
		for(char a : arr)
			if(a == c)return false;
		return true;
	}
	public static void main(String[] args){
		Arrays.fill(factorial, 0);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		char[] list = new char[26];
		long length=facto(n)/facto(n-r);
		permutation = new String[(int) length];
		length = facto(n)/(facto(r)*facto(n-r));
		combination = new String[(int) length];
		list[0]='A';
		for(int i=1;i<26;i++){
			list[i] = (char) (list[i-1]+1);
		}
		for(int i=0;i<n;i++){
			combi(list,i,n,r,"");
		}
		for(int i=0;i<n;i++){
			permu(list,i,n,r,"");
		}
		
		System.out.println(permutation[sc.nextInt()-1]);
		System.out.println(combination[sc.nextInt()-1]);
		
	}
}
