package LAB3;

import java.util.Scanner;

public class ex_while {
    public static void main(String[] args) {

        // ให้้รับค่าจำนวนเต็มจากผู้ใช้ไปเรื่อยๆ หากผู้ใช้ป้อนค่าเลข 0 ให้หยุดการทำงานของLoop while
        //  while ตรวจสอบเงื่อนไขก่อนแล้วค่อยทำ
        Scanner sc = new Scanner(System.in);
        int num = 1;

        while (num !=0) {
            System.out.print("Enter integers:");
            num = sc.nextInt();

        }
        System.out.println("Good bye.");



    } //main
} //class