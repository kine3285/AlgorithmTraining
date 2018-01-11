package Dovelet;


public class mask {
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				for(int k=1;k<10;k++){
					if(i*100+j*10+k + k*110+i == 1000+i*100+j*10+2){
						System.out.println(i+""+j+""+k);
					}
				}
			}
		}
		
	}
}
