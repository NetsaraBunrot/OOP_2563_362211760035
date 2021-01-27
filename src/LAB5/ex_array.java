package LAB5;

public class ex_array {
    public static void main(String[] args) {
        //array คือ ตัวแปรที่สามารถเก็บข้อมูลได้หลายค่าที่เป็นชนิดเดียวกัน
        // เก็บจำนวนข้อมูลตามขนาดของ array
        // แต่ขนาดของ array ต้องระบุขนาด ตอนสร้าง array และไม่สามารถเปลี่ยนแปลงได้
        int x = 10;
        x = 20;

        int num[] = new int[5]; //เป็นการประกาศของ array และเลข 5 คือขนาดของ array

        // add value to array
        num[2] = 20; //ตำแหน่งที่ 2 มีค่าเป็น 20
        num[4] = 100; //ตำแหน่งที่ 4 มีค่าเป็น 100
        num[1] = num [4]*2; // นำตำแหน่งที่ 4*2 == num 1


        for (int val:num) { // ใช้ foreach
            System.out.println(val);

        }
        // size array
        System.out.println(num.length); //บอกขนาดของไซต์ คือ 5  int[5];

    } //main
} //class