package DSAProblems;


import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,7,2,5,8,10};

        for(int i = 0; i < 6-1; i++){
            int first = i;
            int min = getMin(arr,i, 6);
            swap(arr, first, min);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int getMin(int[] arr,int ind, int n) {
        int min = ind;
        for(int i = ind; i < n; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }

    private  static void swap(int[] arr, int i, int j){

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
