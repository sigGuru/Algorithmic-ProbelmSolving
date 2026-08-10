package SotingAlgorithms;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 5, 7, 6, 2};
        int n = arr.length;

        int i = 0;
        while(i < n){
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
