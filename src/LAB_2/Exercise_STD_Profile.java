package LAB_2;

import java.util.Scanner;

public class Exercise_STD_Profile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;



        System.out.print("ชื่อ-สกุล  : ");

        String std_name = scanner.nextLine();


        System.out.print("รหัสนักศึกษา : ");
        String std_id = scanner.nextLine();


        System.out.print("อายุ : ");
        int std_age = Integer.parseInt(scanner.nextLine());

        System.out.print("เบอร์โทร : ");
        String std_tell = scanner.nextLine();

        System.out.print("อีเมล : ");
        String std_email = scanner.nextLine();


        System.out.println("-----------------" );
        System.out.println("ชื่อ-สกุลคือ" + std_name);
        System.out.println("รหัสนักศึกษา คือ" + std_id);
        System.out.println("อายุ คือ" + std_age);
        System.out.println("เบอร์โทร คือ" + std_tell);
        System.out.println("อีเมล คือ" + std_email);

    }
}