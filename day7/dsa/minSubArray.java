package day7.dsa;

public class minSubArray {
    public static void main(String[] args) {
        int nums[] = {2,3,1,3,4,3};
        int target = 7;
        System.out.println(new minSubArray().minSubArrayLen(target, nums));
    }
    
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0,sumOfCurrWindow=0;
        int res = Integer.MAX_VALUE;

        for (right = 0; right < nums.length; right++) {
            sumOfCurrWindow += nums[right];
            while (sumOfCurrWindow >=target ) {
                res = Math.min(res,right-left+1);
                sumOfCurrWindow -= nums[left++];
                
            }
            
        }
        return res == Integer.MAX_VALUE ? 0 : res;

    }



    
}
