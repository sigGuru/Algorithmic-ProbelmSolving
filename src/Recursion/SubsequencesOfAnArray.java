package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesOfAnArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 7, 11};
        List<Integer> list = new ArrayList<>();
        int count = findSqubSeq(0, list, arr, arr.length);

        System.out.println("Total subsequence = "+count);
    }

    private static int findSqubSeq(int i, List<Integer> list, int[] arr, int n) {

        if(i >= n){
            System.out.println(list.toString());
            return 1;
        }

        list.add(arr[i]);
        int left = findSqubSeq(i+1, list, arr, n);
        list.remove(Integer.valueOf(arr[i]));
        int right = findSqubSeq(i+1, list, arr, n);

        return left + right;
    }
}
