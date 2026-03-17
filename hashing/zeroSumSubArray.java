package hashing;

import java.util.HashSet;
import java.util.Set;

public class zeroSumSubArray {
    public static void main(String[] args) {
        int[] a ={1,-1,4,-7};
        System.out.println(countSubArray(a));

    }

    static int countSubArray(int[] a){
        Set<Integer> set = new HashSet<>();
        int cs = 0;
        int count = 0;
        set.add(0);
        for(int e : a){
            cs +=e;
            if (set.contains(cs)){
                count++;
            }else {
                set.add(cs);
            }
        }
        return count;
    }
}
