package SotingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,1,4,7,9,0};
        boolean swapped;
        for(int i = 0; i < 6; i++){
            swapped = false;
            for(int j = 1; j < 6 - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }

        System.out.println(Arrays.toString(arr));
    }
}
