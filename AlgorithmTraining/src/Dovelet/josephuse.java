package Dovelet;
import java.util.*;
public class josephuse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		LinkedList list = new LinkedList();
		
		int listsize = n-1;
		int cnt=0;
		for(int i=1;i<=n;i++){
			list.add(i);
		}
		
		int start = list.indexOf(m);
		System.out.print(list.get(m-1)+" ");
		list.remove(m-1);
		
		while(!list.isEmpty()){
			int index = (start+k-1)%list.size();
			System.out.print(list.get(index)+" ");
			start = list.indexOf(list.get(index));
			list.remove(index);
			
		}
	}
}
