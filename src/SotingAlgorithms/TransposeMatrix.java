package SotingAlgorithms;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                    };

        int[][] trans = transpose(mat);

        for(int[] row : trans){
            System.out.println(Arrays.toString(row));
        }

    }

    private static int[][] transpose(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[][] transMat = new int[n][m];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                transMat[j][i] = mat[i][j];
            }
        }
        return transMat;
    }
}
