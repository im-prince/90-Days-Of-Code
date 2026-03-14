package searching;



public class upperAndLoweBond {
    public static void main(String[] args) {
        int[] a ={2,4,5,67,78,98};
        int target = 98;
        System.out.println(lowerBond(a,target));
    }

    static int upperBond(int[] a, int target){
        int s= 0;
        int e = a.length-1;
        int ans = -1;
        while (s <= e){
            int m = s+(e-s)/2;
            if (target < a[m]){
                ans = m;
                e = m-1;
            }if (target >= a[m]){
                s = m+1;
            }
        }
        return ans;
    }


    static int lowerBond(int[] a, int target){
        int s = 0;
        int e = a.length-1;
        int ans = -1;

        while (s <= e){
            int m = s+(e-s)/2;

            if (target > a[m]){
                ans = m;
                s = m+1;

            }else e = m-1;
        }
        return ans;
    }
}
