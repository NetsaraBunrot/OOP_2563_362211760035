package LAB4;

import java.util.Scanner;

public class EX_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,result;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer :");
            number = sc.nextInt();
            checkvalue(number);
        }
    } //main
    public  static  void  checkvalue(int number){
        if (number%2==0){ //
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    } // checkvalue
}