package Recursion;

import java.util.Scanner;

public class FactorialWithFunctionalRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = fact(n);
        System.out.println(fact);
    }

    private static int fact(int n) {
        if(n == 1)
            return 1;

        return n * fact(n-1);
    }
}
