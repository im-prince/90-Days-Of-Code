import java.util.Arrays;

public class containsDuplicate_217 {

    public static void main(String[] args) {
        int[] nums = {2,4,5,3,4,1,2};

        System.out.println(new containsDuplicate_217().containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {

                return true;
            }
        }
        return false;
    }
}