package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumProblem {
    public static void main(String[] args) {
        int[] nums ={1, 3, 3, 11, 2, 2};
        int target = 5;
        int ans[] = twoSum(nums, target);
        System.out.println(ans[0] +" "+ans[1]);

    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
                return ans;

            }else {
                map.putIfAbsent(nums[i],i);
            }

        }
        return ans;
    }
}
