package Dovelet;
import java.util.*;
public class choice {
	public static int[] check;
	public static int[] arr;
	public static void dfs(int i){
		if(check[i] == 2)return;
		check[i]++;
		dfs(arr[i]);
	}
	public static void setter(){
		for(int i=0;i<check.length;i++){
			if(check[i]<2)check[i]=0;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		check = new int[n];
		int cnt=0;
		for(int i=0;i<n;i++){
			dfs(i);
			setter();
		}
		for(int i=0;i<n;i++){
			System.out.println(check[i]+" ");
		}
		System.out.println();
		System.out.println(cnt);
		for(int i=0;i<n;i++){
			if(check[i]==2)System.out.println(i);
		}
	}
}
