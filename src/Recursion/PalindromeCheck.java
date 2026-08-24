package Recursion;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean isPali = isPalindrome(0, str, str.length());
        System.out.println(isPali);
    }

    private static boolean isPalindrome(int l, String str, int n) {
        if(l >= n / 2)
            return true;

        if(str.charAt(l) != str.charAt(n - l -1)){
            return false;
        }

        return isPalindrome(l+1, str, n);
    }
}
