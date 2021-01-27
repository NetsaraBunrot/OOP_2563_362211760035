package LAB4;

import java.util.Scanner;

public class ex_login_system {
    public static void main(String[] args) {
        // login 3 ครั้ง
        Scanner sc = new Scanner(System.in);
        int count = 0;
        do {
            System.out.print("Enter user name:");
            String u = sc.nextLine();
            System.out.print("Enter password:");
            String p = sc.nextLine();

            boolean x = checkLogin (u,p);
            if (x) {
                System.out.print("Welcome to RUTS SAIYAI.");
                break;
            }else {
                count++;
                System.out.println("Username ro Password is not corrected.");
                if (count ==3){
                    System.out.println("Please, contact admin.");
                }
            }
        } while (count!=3);


    } // main
    public  static  boolean checkLogin(String u,String p){
        String user = "admin";
        String pass= "1234";
        if (u.equals(user)&& pass.equals(p))  {
            return  true;
        }else {
            return false;
        }
    }
} //class