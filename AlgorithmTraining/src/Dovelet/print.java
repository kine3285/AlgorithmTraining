package Dovelet;
import java.util.*;
public class print {
	public static int[] printer(int[] arr){
		if(arr[0]==0){
			int[] temp = new int[arr.length-1];
			for(int i=1;i<arr.length;i++){
				temp[i-1]=arr[i];
			}
			return temp;
		}else{
			int temp = arr[0];
			for(int i=1;i<arr.length;i++){
				arr[i-1] = arr[i];
			}
			arr[arr.length-1] = temp;
		}
		return arr;
	}
	public static boolean checker(int[] arr){
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[0])return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int time=0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		while(true){
			if(checker(arr)){
				if(target == 0){
					System.out.println(time+1);
					break;
				}else{
					arr[0]=0;
					arr = printer(arr);
					target--;
					time++;
					if(target<0)target = arr.length-1;
				}
			}else{
				arr = printer(arr);
				target--;
				if(target<0)target=arr.length-1;
			}
		}
		
	}
}
