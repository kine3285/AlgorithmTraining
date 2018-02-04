package Dovelet;
import java.util.*;
public class bouncy {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			if(s.equals("0"))break;
			char[] arr = s.toCharArray();
			int state = (arr[1]-arr[0] >0 ? 1:-1);
			for(int i=0;i<arr.length-1;i++){
				if(state>0 && arr[i] >= arr[i+1]){
					System.out.println("no bouncy");
					break;
				}else if(state<0 && arr[i] <= arr[i+1]){
					System.out.println("no bouncy");
					break;
				}
				if(i==arr.length-2){
					System.out.println("bouncy");
					break;
				}
			}
		}
	}
}
