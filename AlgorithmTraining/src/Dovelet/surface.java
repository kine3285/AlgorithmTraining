package Dovelet;
import java.util.*;
public class surface {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			String s = sc.nextLine();
			for(char c : s.toCharArray()){
				if(c=='X')arr[i]++;
			}
		}
		int max=0;
		for(int i: arr){
			if(i>max)max=i;
		}
		int sum=0;
		for(int i : arr){
			sum+= max-i;
		}
		System.out.println(sum);
	}
}
