package day7.dsa;

import java.util.Arrays;

public class waveArray {
    public static void main(String[] args) {
        int arr[] ={2,3,4,1};
        System.out.println(Arrays.toString(wave(arr)));
    }

    static int[] wave(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
           int temp = arr[i];
           arr[i] =arr[i+1];
           arr[i+1] = temp;
        }
        return arr;

    }

}
