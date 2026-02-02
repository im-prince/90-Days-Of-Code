

import java.util.Arrays;
public class twoSum {

    public static void main(String[] args) {
        int nums[] ={3,4,1,5,7,9,2,5,3,6};
    int target = 8;
    System.out.println(Arrays.toString(Sum(nums, target)));
    }
    
    
    static int[] Sum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == target-nums[i]){
                    return new int[]{i,j};
                }

                
            }
            
        }
        return new int[]{};
    }
}
