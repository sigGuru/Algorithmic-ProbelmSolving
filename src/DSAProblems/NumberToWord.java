package DSAProblems;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String res = numberToWords(num);
        System.out.println(res);
    }

    private static String numberToWords(int num) {
        int temp = num;


        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens ={"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if(num == 0){
            return "zero";
        }

        if(num >= 1000){
            return "Can't determined!!!";
        }

        String res = "";
        if(num >= 100){
            res += ones[num / 100] + " Hundred";
            num %= 100;
            if(num > 0) {
                res += " and ";
            }
        }

        if(num >= 20){
            res += tens[num / 10] + " ";
            num %= 10;
            if(num > 0){
                res += ones[num];
            }
        }else if(num >= 10){
            res += teens[num - 10];
        }else if(num > 0){
            res += ones[num];
        }

        return res;
    }
}
