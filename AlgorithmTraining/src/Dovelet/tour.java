package Dovelet;
import java.util.*;
public class tour {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int front = sc.nextInt();
		int rear = sc.nextInt();
		double[] fgear = new double[front];
		double[] rgear = new double[rear];
		for(int i=0;i<front;i++){
			fgear[i] = sc.nextInt();
		}
		for(int i=0;i<rear;i++){
			rgear[i] = sc.nextInt();
		}
		double[] dd = new double[front*rear];
		int curr=0;
		for(int i=0;i<front;i++){
			for(int j=0;j<rear;j++){
				dd[curr] = rgear[j]/fgear[i];
				curr++;
			}
		}
		System.out.println();
		Arrays.sort(dd);
		double max=0;
		for(int i=0;i<dd.length-1;i++){
			max = Math.max(max, dd[i+1]/dd[i]);
		}
		System.out.printf("%.2f",max);
	}
}
