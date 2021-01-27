package LAB5;

import java.util.Scanner;

// เขียนโปรแรมรับค่าข้อมูลจากผู้ใช้ 5 จำนวน
// ผล ค่าเฉลี่ย ค่ามากที่สุด  ค่าน้อยที่สุด
public class ex_array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new  int[5];

        num = inputData(num);
        // display data
        displayArray(num);
        // total value in array
        int total = totalValue(num);
        System.out.println("Total value in array:"+total);
        //aver value in array == total/value_count
        System.out.println("Average value in array:"+(total/num.length)); // ค่าเฉลี่ย

        // find maximum value in array
        findMax(num);
        // find minimum value in array
        findMin(num);

    }

    private static void findMin(int[] num) {  //ค่าน้อยที่สุด
        int min = num[0];
        for (int v:num) {
            if (min>v)
                min = v;

        }
        System.out.println("The minimum value :"+min);
    }

    private static void findMax(int[] num) { //ค่ามากที่สุด
        int max = num[0];
        for (int v:num) {
            if (max<v)
                max = v;

        }
        System.out.println("The maximum value :"+max);
    }

    private static int totalValue(int[] num) {  //การหาผลรวม
        int total = 0;
        for (int v:num){
            total+=v;
            System.out.println();
        }
        return total;


    }

    private static void displayArray(int[] num) {
        System.out.print("Data in Array:");
        for (int v:num) {
            System.out.print(v+" ");

        }
    }

    private static int[] inputData(int[] num) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) { // ใช้ Fori
            System.out.print("Enter integer:");
            num[i] = sc.nextInt();
        }
        return num;
    }
}