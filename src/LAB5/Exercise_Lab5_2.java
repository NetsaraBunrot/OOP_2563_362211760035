package LAB5;

import java.util.Scanner;
// สร้างเมดธอทรับค่า 1 จำนวน และหารด้วย 3 และ5 ลงตัว และต้องน้อยกว่าค่าที่รับ 3 จำนวน
// เช่น รับค่า 80  ผลลัพธ์คือ  75 60 45
public class Exercise_Lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer :");
        int number = sc.nextInt();

        findValue(number);



    }//main

    private static void findValue(int number) {
        int count = 0;
        for (int i = number; i >=0; i--) {
            if (i%3==0 && i%5==0) {
                System.out.println(i + " ");
                count++;
            }
            if (count == 3) {
                break;
            }
        }
    }


} //class