package Dovelet;
import java.util.*;
public class bsearch {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int check=0;
		for(int i=0;i<n;i++){
			if(arr[i] == target){
				System.out.println(i+1);
				check=1;
				break;
			}
		}
		if(check==0)System.out.println("not found");
		
	}
}
