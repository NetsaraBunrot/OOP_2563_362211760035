package LAB4;

import java.util.Scanner;

public class ex_checknumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integers:");
            int x = sc.nextInt();
            checxValue(x);
        }
    } //main

    private static void checxValue(int x) {
        System.out.println(x%2==0?"Even":"Odd");
    }
} //class