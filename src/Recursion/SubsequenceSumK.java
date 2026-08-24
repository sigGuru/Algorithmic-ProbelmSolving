package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumK {
    public static void main(String[] args) {
        int k = 9;
        int[] arr = {8, 2, 4, 7, 11, 5};
        List<Integer> list = new ArrayList<>();
        System.out.println("K = "+k);
        findSubSeqSum(0, list, arr, arr.length, 0, k);

//        System.out.println("Total subsequence = "+count);
    }

    private static void findSubSeqSum(int i, List<Integer> list, int[] arr,int n, int sum, int k) {
        if(i == n){
            if(sum == k){
                System.out.println(list.toString());
            }
            return;
        }

        list.add(arr[i]);
        sum += arr[i];
        findSubSeqSum(i+1, list, arr, n, sum, k);

        list.remove(Integer.valueOf(arr[i]));
        sum -= arr[i];

        findSubSeqSum(i+1, list, arr, n, sum, k);
    }
}
