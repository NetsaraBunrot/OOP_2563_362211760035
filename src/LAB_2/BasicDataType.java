package LAB_2;

public class BasicDataType {
    public static void main(String[] args) {

        //boolean => T,F (1,0)
        boolean myboo = true;
        System.out.println(myboo);
        myboo = false;
        System.out.println(myboo);

        // character => only 1 character such as 'a', 'x', '$'
        char c ='a';
        System.out.println(c);

        //integer => -2 -1 0 1 2 3.....10000
        int number;
        number = 100;
        System.out.println(number); // 100
        System.out.println(number*5); //500
        // number = ? 100 จะเท่ากับ 100 ที่ประกาศตัวแปรไว้

        //real number => float, double => 10.11, -22.1
        float a = 10.10f;
        double b = 20.20;
        System.out.println(a+b); // ผลลัพธ์ 30.30

        //String => message => "......" => "Hello"
        //String คือ ข้อมูลชนิดแบบข้อความ  ที่มีอักษรเรียงต่อกัน
        String msg = "Hello RUTS Saiyai 2020";
        System.out.println(msg);
        System.out.println(msg.toUpperCase()); // toUpperCase เป็นคำสั่งการทำตัวอักษรพิมพ์ใหญ่ทั้งหมด
        System.out.println(msg.length()); // length เป็นคำสั่งนับตัวอักษร

        //constant variable

        final int num = 100; // final เป็นคำสั่งที่ไม่สามารถแก้ไขค่าได้


    } //main
} //class