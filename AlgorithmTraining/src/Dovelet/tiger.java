package Dovelet;
import java.util.*;
public class tiger {
	public static boolean chase(int n, int start, int start2, int target){
		int[] arr = new int[n];
		arr[0]=start;
		arr[1]=start2;
		for(int i=2;i<arr.length;i++){
			arr[i] = arr[i-1]+arr[i-2];
		}
		if(arr[n-1] == target)return true;
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		boolean check = false;
		for(int i=1;i<k;i++){
			for(int j=i;j<k;j++){
				if(chase(n,i,j,k)){
					System.out.println(i);
					System.out.println(j);
					check = true;
					break;
				}
			}
			if(check)break;
		}
	}
}
