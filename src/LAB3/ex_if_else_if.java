package LAB3;

import java.util.Scanner;

public class ex_if_else_if {
    public static void main(String[] args) {
        // ให้ผู้ใช้ใส่ค่าคะแนนเป็นจำนวนเต็ม แล้วแสดงผลลัพท์เป็นเกรด
        Scanner sc = new Scanner((System.in));

        System.out.println("Please, enter your score: ");
        int score = sc.nextInt();  //input as integer
        //int score2 = Integer.parseInt(sc.nextLine()); //input as string
        //0-49 == F
        //50-59 == D
        //60-69 == C
        //70-79 == B
        //80-100 == A
        if (score >=0 && score <= 49) {
            System.out.println("F");
        }else if (score >=50 && score <= 59) {
            System.out.println("D");
        }else if (score >=60 && score <= 69) {
            System.out.println("C");
        }else if (score >=70 && score <= 79) {
            System.out.println("B");
        }else if(score >=80 && score <= 100) {
            System.out.println("A");
        }else {
            System.out.println("Your input score is invalid.");
        }

    }//main
}//class