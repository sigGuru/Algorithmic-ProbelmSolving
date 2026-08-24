package Recursion;

import java.util.Scanner;

public class SummationWithFunctionalRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = sum(n);
        System.out.println(sum);
    }

    private static int sum(int n) {
        if(n == 0)
            return 0;

        return n + sum(n-1);
    }
}
