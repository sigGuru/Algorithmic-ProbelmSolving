package DSAProblems;

import java.util.ArrayList;
import java.util.List;

public class SpiraMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                        };
        List<Integer> res = spiralMarix(arr);
        System.out.println(res);
    }

    public static List<Integer> spiralMarix(int[][] nums){

        int m = nums.length;
        int n = nums[0].length;

        List<Integer> res = new ArrayList<>();
        boolean[][] vis = new boolean[m][n];

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int r = 0;
        int c = 0;

        int idx = 0;

        for(int i = 0; i < m * n; i++){

            int num = nums[r][c];

            res.add(num);
            vis[r][c] = true;

            int newR = r + dr[idx];
            int newC = c + dc[idx];

            if(newR >= 0 && newR < m
                    && newC >= 0 && newC < n
                    && !vis[newR][newC]){

                r = newR;
                c = newC;

            }else{

                idx = (idx + 1) % 4;

                r += dr[idx];
                c += dc[idx];

            }
        }
        return res;
    }
}
