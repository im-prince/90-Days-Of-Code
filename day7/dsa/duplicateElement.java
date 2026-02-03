package day7.dsa;

import java.util.Arrays;

public class duplicateElement {

    public static void main(String[] args) {
        int[] arr ={2,5,4,3,1};
        System.out.println(duplicate(arr));
    }

    static boolean duplicate(int arr[]){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                return true;
            }

        }
        return false;

    }
}
