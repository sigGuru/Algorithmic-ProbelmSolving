package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RevereArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {5,6,7,1,9};
        reverse(0, arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int i ,int[] arr) {
        int n = arr.length;
        if(i >= n /2)
            return;
        
        swap(arr, i, n - i - 1);
        reverse(i+1, arr);
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
