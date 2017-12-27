package LeetCode;

public class Two_Sum {
	public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[1];
        for(int i=0;i<nums.length-1; i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    int[] result = new int[] {i,j};
                    return result;
                }
            }
        }
        return arr;
    }
}
