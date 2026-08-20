package DSAProblems;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixWithoutExtraSpace {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        List<Integer> res = spiralMatrix(mat);
        System.out.println(res);
    }

    public static List<Integer> spiralMatrix(int[][] nums){

        int m = nums.length;
        int n = nums[0].length;

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        List<Integer> res = new ArrayList<>();

        while(top <= bottom && left <= right){

            for(int i = left; i <= right; i++){
                res.add(nums[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                res.add(nums[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    res.add(nums[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res.add(nums[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
