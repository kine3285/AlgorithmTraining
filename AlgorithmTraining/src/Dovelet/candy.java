package Dovelet;
import java.util.*;
public class candy {
	public static void share(int[] arr){
		int[] temp = new int[arr.length];
		temp[0] = arr[0]/2+arr[arr.length-1]/2;
		if(temp[0]%2 == 1)temp[0]++;
		for(int i=1;i<arr.length;i++){
			temp[i] = arr[i]/2+arr[i-1]/2;
			if(temp[i]%2 == 1)temp[i]++;
		}
		for(int i=0;i<arr.length;i++){
			arr[i] = temp[i];
		}
	}
	public static boolean checker(int[] arr){
		for(int i=0;i<arr.length-2;i++){
			if(arr[i] != arr[i+1]) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int cnt=0;
		while(true){
			cnt++;
			share(arr);
			if(checker(arr))break;
		}
		System.out.println(cnt+" "+arr[0]);
		
	}
}
