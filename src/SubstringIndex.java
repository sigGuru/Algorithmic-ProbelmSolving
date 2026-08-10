import javax.swing.*;
import java.util.Scanner;

public class SubstringIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int n1 = str1.length();
        int n2 = str2.length();
        for(int i = 0; i <= n1 - n2; i++){

//            String substr = str1.substring(i,i+3);
//            if(substr.equals(str2)){
//                System.out.println(i);
//                return;
//            }
            int j;
            for(j = 0; j < n2; j++){
                if(str1.charAt(i+j) != str2.charAt(j))
                    break;
            }
            if(j == n2){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
