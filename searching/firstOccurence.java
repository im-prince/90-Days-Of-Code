package searching;

import static searching.binarySearch.search;

public class firstOccurence {

    public static void main(String[] args) {
        int[] a ={2,2,4,4,56,56,78,89,89,89,98,98};
        int target = 4;
        System.out.println(indexOfFirstOcc(a,target));

    }
    static int indexOfFirstOcc(int[] a, int target){
        int s = 0;
        int e = a.length-1;
        int ans = -1;
        while (s <= e){
            int m = s+(e-s)/2;

            if (target< a[m]){
                e = m-1;
            }
            if (target > a[m]){
                s = m+1;
            }else {
                e = m-1;
//                s = m+1;
                ans = m;
            }
        }
        return -1;
    }
}
