package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fibo = fibonacci(n);
        System.out.println(fibo);
    }

    private static int fibonacci(int n) {
        if(n <= 1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
