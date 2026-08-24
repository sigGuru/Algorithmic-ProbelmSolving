package Recursion;

import java.util.Scanner;

public class PrintingNNumbersWithBackTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        print(n, n);

    }

    private static void print(int num, int n) {
        if(num < 1){
            return;
        }

        print(num-1, n);
        System.out.println(num);
    }
}
