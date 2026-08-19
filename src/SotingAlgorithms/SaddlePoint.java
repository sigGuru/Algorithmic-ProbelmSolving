package SotingAlgorithms;

public class SaddlePoint {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
                };

        int element = findSaddlePoint(mat);
        System.out.println(element);
    }

    private static int findSaddlePoint(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        for(int i = 0; i < m; i++){
            int minRow = mat[i][0];
            int minIndexOfRow = 0;

            for(int idx = 1; idx < n; idx++){
                if(mat[i][idx] < minRow){
                    minRow = mat[i][idx];
                    minIndexOfRow = idx;
                }
            }

            boolean isSaddlePoint = true;
            for(int j = 0; j < m; j++){
                if(mat[j][minIndexOfRow] > minRow){
                    isSaddlePoint = false;
                    break;
                }
            }

            if(isSaddlePoint){
                return minRow;
            }
        }
        return -1;
    }
}
