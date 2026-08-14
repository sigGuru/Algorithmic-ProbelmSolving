package SotingAlgorithms;

import java.util.Arrays;

public class MatrixRotaion90Degree {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int[][] result = rotateMatixBy90(mat);

        for(int[] arr : mat){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
        for(int[] arr : result){
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int[][] rotateMatixBy90(int[][] mat) {
        int[][] res = transpose(mat);
        reverseEachRow(res);
        return res;
    }

    private static void reverseEachRow(int[][] res) {

        for(int[] arr: res){
            int n = arr.length;
            for(int i = 0; i < n / 2; i++){
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 -i] = temp;
            }
        }
    }

    private static int[][] transpose(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] newMat = new int[n][m];

        for(int i = 0; i < m; i++) {
            for (int j = 0 ; j < n; j++) {
                newMat[j][i] = mat[i][j];
            }
        }
        return newMat;
    }
}
