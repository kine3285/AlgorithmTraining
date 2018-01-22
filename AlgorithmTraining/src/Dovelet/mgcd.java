package Dovelet;
import java.util.*;
public class mgcd {
	public static boolean checker(int n, int[] arr){
		int check=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%n != 0)check=-1;
		}
		return (check==1 ? true : false);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int result=0;
		for(int i=1;i<=arr[0];i++){
			if(checker(i,arr))result=i;
		}
		System.out.println(result);
	}
}
