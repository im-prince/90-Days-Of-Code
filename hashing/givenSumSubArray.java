package hashing;

import java.util.HashSet;
import java.util.Set;

public class givenSumSubArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,2,4,1,2};
        int target = 5;
        System.out.println(countSubArray(a,target));
    }

    static int countSubArray(int[] a, int target) {
        Set<Integer> set = new HashSet<>();
        int cs = 0;
        int count = 0;
        set.add(0);
        for(int e : a){
            cs +=e;
            if (set.contains(cs-target)){
                count++;
            }else {
                set.add(cs);
            }
        }
        return count;
    }
}
