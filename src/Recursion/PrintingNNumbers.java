package Recursion;

import java.util.Scanner;

public class PrintingNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        print(1, n);

    }

    private static void print(int num, int n) {
        if(num > n){
            return;
        }
        System.out.println(num);
        print(num+1, n);
    }
}
