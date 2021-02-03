package LAB_2;

import java.util.Scanner;

public class BasicInputDATA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("The number is "+num);

    }
}