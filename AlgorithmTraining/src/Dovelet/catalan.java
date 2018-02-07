package Dovelet;
import java.util.*;
public class catalan {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Stack<Integer> st = new Stack<Integer>();
		int pointer=0;
		int num=1;
		while(pointer<n){
			if(num > n && st.peek() != arr[pointer]){
				break;
			}
			if(!st.isEmpty() && st.peek() == arr[pointer]){
				st.pop();
				pointer++;
			}else{
				st.push(num);
				num++;
			}
		}
		if(!st.isEmpty())System.out.println("NO");
		else System.out.println("YES");
	}
}
