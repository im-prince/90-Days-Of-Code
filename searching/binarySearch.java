package searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] a ={2,4,5,67,78,98};
        int target = 2;
        System.out.println(search(a,target));

    }
    static int search(int[] a, int target){
        int s = 0;
        int e = a.length;
        while (s <= e){
            int m = s+(e-s)/2;
            if (a[m] == target){
                return m;
            }
            if (target > a[m]){
                s = m+1;
            }else {
                e = m-1;
            }
        }
        return -1;
    }
}
