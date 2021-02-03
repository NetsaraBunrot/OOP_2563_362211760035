package LAB3;

import java.util.Scanner;

public class ex_do_while {
    public static void main(String[] args) {
        // ให้้รับค่าจำนวนเต็มจากผู้ใช้ไปเรื่อยๆ หากผู้ใช้ป้อนค่าเลข 0 ให้หยุดการทำงานของLoop do while
        //  do while ทำก่อนแล้วค่อยตรวจสอบเงื่อนไข

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter integers:");
            num = sc.nextInt();
        }while (num != 0);
        System.out.println("Good bye.");





    } //main
} //class