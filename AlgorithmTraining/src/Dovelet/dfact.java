package Dovelet;

public class dfact {
	public static int fact(int n){
		if(n==0)return 1;
		else if(n==1)return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i=1;i<10;i++){
			arr[i] = fact(i);
		}
		arr[0]=1;
		
		for(int i=10;i<1000001;i++){
			int num=i;
			int currsum=0;
			while(num>0){
				currsum+=arr[num%10];
				num = num/10;
			}
			if(currsum == i){
				System.out.println(i);
			}
			currsum=0;
		}
	}
}
