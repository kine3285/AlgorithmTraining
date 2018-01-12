package Dovelet;
import java.util.*;
public class dream_counting {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=n1;i<=n2;i++){
			sb.append(Integer.toString(i));
		}
		int[] arr = new int[10];
		for(char c : sb.toString().toCharArray()){
			if(c == '0')arr[0]++;
			else if(c=='1')arr[1]++;
			else if(c=='2')arr[2]++;
			else if(c=='3')arr[3]++;
			else if(c=='4')arr[4]++;
			else if(c=='5')arr[5]++;
			else if(c=='6')arr[6]++;
			else if(c=='7')arr[7]++;
			else if(c=='8')arr[8]++;
			else if(c=='9')arr[9]++;
		}
		for(int i=0;i<9;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[9]);
	}
}
