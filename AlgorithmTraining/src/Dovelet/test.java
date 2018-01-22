package Dovelet;

public class test {
	public static void main(String[] args){
		int a=2;
		for(int i=1;i<=a;i++){
			for(int j = 0; j < a-i; j++) { System.out.print(" "); } 
			for(int j = 0; j < 2*i-1; j++) {System.out.print("*"); }
			System.out.println();
		}
	}
}
