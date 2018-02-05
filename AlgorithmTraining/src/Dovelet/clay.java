package Dovelet;
import java.util.*;
public class clay {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] clays = new int[n];
		String[] students = new String[n];
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			clays[i] = a*b*c;
			students[i] = sc.next();
		}
		int min = Integer.MAX_VALUE;
		String minstudent = new String();
		int max = Integer.MIN_VALUE;
		String maxstudent = new String();
		for(int i=0;i<n;i++){
			if(clays[i]<min){
				min = clays[i];
				minstudent = students[i];
			}
			if(clays[i]>max){
				max = clays[i];
				maxstudent = students[i];
			}
		}
		System.out.println(maxstudent+" took clay from "+minstudent+".");
	}
}
