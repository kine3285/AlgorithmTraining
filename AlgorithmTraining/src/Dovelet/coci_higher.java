package Dovelet;
import java.util.*;
public class coci_higher {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] stoc = s.toCharArray();
		int[] arr = new int[stoc.length];
		for(int i=0;i<arr.length;i++){
			arr[i] = stoc[i]-48;
		}
		for(int i=arr.length-1;i>0;i--){
			for(int j=i-1;j>=0;j--){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					break;
				}
			}
			if(arr[i]>arr[i-1]){
				int temp=arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
				break;
			}
			int temp=arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		
	}
}
