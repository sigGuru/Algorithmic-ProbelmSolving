package SotingAlgorithms;

public class ColumWiseSum {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
                };

        int[] res = findColumnSum(arr);

        for(int sum : res){
            System.out.print(sum + " ");
        }
    }

    private static int[] findColumnSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += arr[j][i];
            }
            res[i] = sum;
        }
        return res;
    }
}
