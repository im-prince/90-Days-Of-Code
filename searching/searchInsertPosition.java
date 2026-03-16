package searching;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] nums ={2,3,4};
        System.out.println(searchInsert(nums,1));
    }
    public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while (s <= e){
            int m = s+(e-s)/2;
            if(target == nums[m]) return m;
            if (target > nums[m]){
                s = m+1;
            }else e = m-1;
        }
        return s;
    }
}
