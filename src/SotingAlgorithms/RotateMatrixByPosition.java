package SotingAlgorithms;

import java.sql.SQLOutput;

public class RotateMatrixByPosition {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        printMatrix(mat);

        rotateMatByOnePos(mat);
        System.out.println();
        printMatrix(mat);

    }

    private static void printMatrix(int[][] mat) {

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateMatByOnePos(int[][] mat) {
        int n = mat.length;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while(top <= bottom && left <= right){
            int temp = mat[top][left];

            // Moving left Column one position up
            for(int i = top; i < bottom; i++){
                mat[i][left] = mat[i+1][left];
            }

            // Moving bottom row on  positon left
            for(int i = left; i < right; i++){
                mat[bottom][i] = mat[bottom][i + 1];
            }

            // Moving right column to one Positon down
            for(int i = bottom; i > top; i--){
                mat[i][right] = mat[i-1][right];
            }

            // Moving top row one position right
            for(int i = right; i > left + 1; i--){
                mat[top][i] = mat[top][i-1];
            }

            mat[top][left + 1] = temp;
            top++;
            bottom--;
            left++;
            right--;
        }
    }
}
