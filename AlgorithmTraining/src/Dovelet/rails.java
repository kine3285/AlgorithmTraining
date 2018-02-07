package Dovelet;
import java.util.*;
public class rails {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(true){
			Stack<Integer> st = new Stack<Integer>();
			int first = sc.nextInt();
			if(first==0)break;
			int[] arr = new int[n];
			arr[0]=first;
			for(int i=1;i<n;i++){
				arr[i]=sc.nextInt();
			}
			
			int num=1;
			int pointer=0;
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
			if(!st.isEmpty())System.out.println("No");
			else System.out.println("Yes");
		}
	}
}
