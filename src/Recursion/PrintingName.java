package Recursion;

public class PrintingName {
    public static void main(String[] args) {
        print(1, 5);
    }

    private static void print(int n1, int n2) {
        if(n1 > n2)
            return;

        System.out.println("My Name is Guru");
        print(n1 + 1, n2);
    }

}
