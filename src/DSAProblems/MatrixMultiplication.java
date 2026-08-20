package DSAProblems;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}};
//                {7, 8, 9}


        int m1 = mat1.length;
        int n1 = mat1[0].length;

        int[][] mat2 = {
                {7, 8},
                {9, 10},
                {11, 12}
                };
        int m2 = mat2.length;
        int n2 = mat2[0].length;

        print(mat1);
        System.out.println();
        System.out.println();

        print(mat2);
        System.out.println();
        System.out.println();


        if(n1 == m2){
            print(matrixMul(m1, n1, mat1,m2, n2, mat2 ));
        }else{
            System.out.println("Invalid Matrix!!");
        }
    }

    private static void print(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] matrixMul(int m1, int n1, int[][] mat1, int m2, int n2, int[][] mat2) {
        int[][] res = new int[m1][n2];

        for(int i = 0; i < m1; i++){
            for(int j = 0 ; j < n2; j++){
                for(int k = 0; k < m2; k++){
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return res;

    }
}
