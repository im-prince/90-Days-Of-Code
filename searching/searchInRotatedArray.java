package searching;

public class searchInRotatedArray {
    public static void main(String[] args) {
        int[] a = {10,11,13,14,1,2,4,6,7,9};
        System.out.println(rotatedArray(a,6));
    }
    static int rotatedArray(int[] a, int target){
        int l = 0;
        int r = a.length -1;
        while(l <= r){
            int m = l+(r-l)/2;
            if(a[m] == target) return m;
            if (a[m] == a[l] || a[m] == a[r]){
                l++;
                r--;
            } else if (a[l] <= a[m]) {
                if (a[l] <= target && target < a[m]){
                    r = m-1;
                }else {
                    l= m+1;
                }
            }else{
                if (a[m] < target && target <= a[r]){
                    l= m+1;
                }else {
                    r= m-1;
                }
            }
        }
        return -1;
    }
}
