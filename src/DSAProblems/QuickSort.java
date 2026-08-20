package DSAProblems;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int n = arr.length;
        quickSort(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int r) {

        if(l < r){

            int pi = partion(arr, l, r);

            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, r);
        }
    }

    private static int partion(int[] arr, int l, int r) {

        int pivot = arr[r];

        int i = l -1;

        for(int j = l; j < r; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[r];
        arr[r] = arr[i+1];
        arr[i+1] = temp;

        return i + 1;

    }
}
