package day7.dsa;

import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr){
        int left =0;
        int n = arr.length;
        int right = n-1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        return arr;
    }
}
