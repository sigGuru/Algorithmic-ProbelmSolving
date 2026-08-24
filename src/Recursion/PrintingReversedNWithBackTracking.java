package Recursion;

import java.util.Scanner;

public class PrintingReversedNWithBackTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        print(1, n);
    }

    private static void print(int n1, int n2) {
        if(n1 > n2){
            return;
        }

        print(n1+1, n2);
        System.out.println(n1);
    }
}
