package Dovelet;
import java.util.*;
public class coci_modulo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<10;i++){
			arr[i] = sc.nextInt()%42;
		}
		Arrays.sort(arr);
		int cnt=0;
		for(int i=0;i<9;i++){
			if(arr[i] == arr[i+1]){
				cnt++;
			}
		}
		System.out.println(10-cnt);
		
	}
}
