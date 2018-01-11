package LeetCode;

public class Sort_Colors {
	public void sortColors(int[] nums) {
		if(nums.length == 0 || nums == null) return;
		int red=0;
		int white=0;
		int blue=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i] == 0)red++;
			else if(nums[i] == 1)white++;
			else if(nums[i] == 2)blue++;
		}
		int i=0;
		while(i<nums.length){
			if(red>0){
				nums[i]=0;
				red--;
			}else if(white>0){
				nums[i]=1;
				white--;
			}else if(blue>0){
				nums[i]=2;
				blue--;
			}
			i++;
		}
	}
}
