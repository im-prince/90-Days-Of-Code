package day7.dsa;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int arr[] ={1,4,2,3,7,8};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }


    static int[] BubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    
                }
                
            }
            
        }
        return arr;
    }
    
}
